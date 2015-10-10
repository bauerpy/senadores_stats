/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jalvaren
 */
@Entity
@Table(name = "senadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Senador.findAll", query = "SELECT s FROM Senador s"),
    @NamedQuery(name = "Senador.findBySenadorId", query = "SELECT s FROM Senador s WHERE s.senadorId = :senadorId"),
    @NamedQuery(name = "Senador.findBySenadorNombre", query = "SELECT s FROM Senador s WHERE s.senadorNombre = :senadorNombre"),
    @NamedQuery(name = "Senador.findBySenadorApellido", query = "SELECT s FROM Senador s WHERE s.senadorApellido = :senadorApellido"),
    @NamedQuery(name = "Senador.findBySenadorCodigo", query = "SELECT s FROM Senador s WHERE s.senadorCodigo = :senadorCodigo")})
public class Senador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "senador_id")
    private Integer senadorId;
    @Column(name = "senador_nombre")
    private String senadorNombre;
    @Column(name = "senador_apellido")
    private String senadorApellido;
    @Column(name = "senador_codigo")
    private String senadorCodigo;

    public Senador() {
    }

    public Senador(Integer senadorId) {
        this.senadorId = senadorId;
    }

    public Integer getSenadorId() {
        return senadorId;
    }

    public void setSenadorId(Integer senadorId) {
        this.senadorId = senadorId;
    }

    public String getSenadorNombre() {
        return senadorNombre;
    }

    public void setSenadorNombre(String senadorNombre) {
        this.senadorNombre = senadorNombre;
    }

    public String getSenadorApellido() {
        return senadorApellido;
    }

    public void setSenadorApellido(String senadorApellido) {
        this.senadorApellido = senadorApellido;
    }

    public String getSenadorCodigo() {
        return senadorCodigo;
    }

    public void setSenadorCodigo(String senadorCodigo) {
        this.senadorCodigo = senadorCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (senadorId != null ? senadorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Senador)) {
            return false;
        }
        Senador other = (Senador) object;
        if ((this.senadorId == null && other.senadorId != null) || (this.senadorId != null && !this.senadorId.equals(other.senadorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Senador[ senadorId=" + senadorId + " ]";
    }
    
}
