/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiondataextractor;
	
import entities.Senador;
import entities.Sesiones;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;


    
public class SesionDataExtractor {

  static EntityManager em = Persistence.createEntityManagerFactory("SesionDataExtractorPU").createEntityManager();
  final static String PRESIDENT_STRING = "SEÑOR PRESIDENTE";
  final static String SECRETARY_STRING="SECRETARIO GENERAL";
  final static String SENADOR_PREFIX = "SEÑOR SENADOR";
  final static String SENADORA_PREFIX = "SEÑORA SENADORA";
    public static void main(String[] args) {
       
       LinkedList senadores = getSenadoresList();
       
        getParticipaciones(senadores);
                
    }

    private static void getParticipaciones(List senadores) {
        File file = null;
        WordExtractor extractor = null;
        try
        {

            file = new File("testdata/S 30.doc");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] paragraphList = extractor.getParagraphText();
            String senadorName="";
            String senadorSpeech="";
            for (int i = 0; i < paragraphList.length; i++)
            {
                String paragraph =paragraphList[i];
                if ( paragraph!= null){
                    //looks like the start of a new participation
                    if (paragraph.indexOf(":")!=-1){
                        //firstt persist the previous participation
                        System.out.println("SENADOR:"+senadorName);
                       // System.out.println("SPEECH"+senadorSpeech);
                        Sesiones s=null;
                        
                        {
                        TypedQuery<Sesiones> q;
                         q = em.createNamedQuery("Sesiones.findBySesionId",Sesiones.class);
                         q.setParameter("sesionId", 1);
                         
                         
                        s = q.getSingleResult();
                        }
                        
                       
                         Participaciones p = new Participaciones();
                         
                         
                        //now process the new paragraph
                         
                         
                        senadorName="";
                        senadorSpeech="";
                        
                        String speakerName = paragraph.substring(0, paragraph.indexOf(":"));
                        
                        if (speakerName.length()<SENADORA_PREFIX.length()){
                            //its a speech still 
                           senadorSpeech=senadorSpeech+paragraph;
                        }else if (speakerName.equals(PRESIDENT_STRING)){
                        
                           senadorName = PRESIDENT_STRING;
                        }else if (speakerName.substring(0,SENADOR_PREFIX.length()).equals(SENADOR_PREFIX)){
                            //get the name
                            int prefixLength =0;
                             if (speakerName.substring(0,SENADORA_PREFIX.length()).equals(SENADORA_PREFIX)){
                                prefixLength = SENADORA_PREFIX.length();
                             }else{
                                prefixLength = SENADOR_PREFIX.length();
                             }
                             
                            senadorName= speakerName.substring(prefixLength);
                            

                        }else{
                         // System.out.println("*****UNRECOGNIZED "+speakerName);
                        }
                          senadorSpeech = paragraph.substring(speakerName.length());
                          
                    }else{
                      //it is the continuation of a speech
                        
                     senadorSpeech = senadorSpeech+paragraph;   
                    
                    }
                
                
                }
                     
            }
        }
        catch (Exception exep)
        {
            exep.printStackTrace();
        }
    }

    private static LinkedList<Senador> getSenadoresList() {
        LinkedList<Senador> results;
        TypedQuery<Senador> q;
        
        q = em.createNamedQuery("Senador.findAll",Senador.class);
        results = new LinkedList<>(q.getResultList());
        for (Senador s:results){
            
          //  System.out.println(s.getSenadorNombre()+" "+s.getSenadorApellido());
        }
        
        
        //check for dummy president and secretary senator items
        q = em.createNamedQuery("Senador.findBySenadorNombre",Senador.class);
        q.setParameter("senadorNombre", PRESIDENT_STRING);
        
        if (q.getResultList().size()<1){
           //dont exist, create one
           Senador mrPresident = new Senador();
           mrPresident.setSenadorNombre(PRESIDENT_STRING);
           em.getTransaction().begin();
           em.persist(mrPresident);
           em.getTransaction().commit();
        
        }
        
        Senador president = q.getSingleResult();
        return results;
    }
  
}
