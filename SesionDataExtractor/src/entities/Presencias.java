/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jalvaren
 */
@Entity
@Table(name = "presencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Presencias.findAll", query = "SELECT p FROM Presencias p"),
    @NamedQuery(name = "Presencias.findBySenadorId", query = "SELECT p FROM Presencias p WHERE p.presenciasPK.senadorId = :senadorId"),
    @NamedQuery(name = "Presencias.findBySesionId", query = "SELECT p FROM Presencias p WHERE p.presenciasPK.sesionId = :sesionId"),
    @NamedQuery(name = "Presencias.findByHastaFinal", query = "SELECT p FROM Presencias p WHERE p.hastaFinal = :hastaFinal")})
public class Presencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PresenciasPK presenciasPK;
    @Column(name = "hasta_final")
    private String hastaFinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "presencias")
    private Collection<Participaciones> participacionesCollection;
    @JoinColumn(name = "senador_id", referencedColumnName = "senador_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Senador senadores;
    @JoinColumn(name = "sesion_id", referencedColumnName = "sesion_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sesiones sesiones;

    public Presencias() {
    }

    public Presencias(PresenciasPK presenciasPK) {
        this.presenciasPK = presenciasPK;
    }

    public Presencias(int senadorId, int sesionId) {
        this.presenciasPK = new PresenciasPK(senadorId, sesionId);
    }

    public PresenciasPK getPresenciasPK() {
        return presenciasPK;
    }

    public void setPresenciasPK(PresenciasPK presenciasPK) {
        this.presenciasPK = presenciasPK;
    }

    public String getHastaFinal() {
        return hastaFinal;
    }

    public void setHastaFinal(String hastaFinal) {
        this.hastaFinal = hastaFinal;
    }

    @XmlTransient
    public Collection<Participaciones> getParticipacionesCollection() {
        return participacionesCollection;
    }

    public void setParticipacionesCollection(Collection<Participaciones> participacionesCollection) {
        this.participacionesCollection = participacionesCollection;
    }

    public Senador getSenadores() {
        return senadores;
    }

    public void setSenadores(Senador senadores) {
        this.senadores = senadores;
    }

    public Sesiones getSesiones() {
        return sesiones;
    }

    public void setSesiones(Sesiones sesiones) {
        this.sesiones = sesiones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (presenciasPK != null ? presenciasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presencias)) {
            return false;
        }
        Presencias other = (Presencias) object;
        if ((this.presenciasPK == null && other.presenciasPK != null) || (this.presenciasPK != null && !this.presenciasPK.equals(other.presenciasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Presencias[ presenciasPK=" + presenciasPK + " ]";
    }
    
}
