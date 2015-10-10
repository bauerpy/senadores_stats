/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "partidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partidos.findAll", query = "SELECT p FROM Partidos p"),
    @NamedQuery(name = "Partidos.findByPartidoId", query = "SELECT p FROM Partidos p WHERE p.partidoId = :partidoId"),
    @NamedQuery(name = "Partidos.findByPartidoIniciales", query = "SELECT p FROM Partidos p WHERE p.partidoIniciales = :partidoIniciales"),
    @NamedQuery(name = "Partidos.findByPartidoDescripcion", query = "SELECT p FROM Partidos p WHERE p.partidoDescripcion = :partidoDescripcion")})
public class Partidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "partido_id")
    private Integer partidoId;
    @Column(name = "partido_iniciales")
    private String partidoIniciales;
    @Column(name = "partido_descripcion")
    private String partidoDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partidoId")
    private Collection<Bancadas> bancadasCollection;

    public Partidos() {
    }

    public Partidos(Integer partidoId) {
        this.partidoId = partidoId;
    }

    public Integer getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(Integer partidoId) {
        this.partidoId = partidoId;
    }

    public String getPartidoIniciales() {
        return partidoIniciales;
    }

    public void setPartidoIniciales(String partidoIniciales) {
        this.partidoIniciales = partidoIniciales;
    }

    public String getPartidoDescripcion() {
        return partidoDescripcion;
    }

    public void setPartidoDescripcion(String partidoDescripcion) {
        this.partidoDescripcion = partidoDescripcion;
    }

    @XmlTransient
    public Collection<Bancadas> getBancadasCollection() {
        return bancadasCollection;
    }

    public void setBancadasCollection(Collection<Bancadas> bancadasCollection) {
        this.bancadasCollection = bancadasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partidoId != null ? partidoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partidos)) {
            return false;
        }
        Partidos other = (Partidos) object;
        if ((this.partidoId == null && other.partidoId != null) || (this.partidoId != null && !this.partidoId.equals(other.partidoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Partidos[ partidoId=" + partidoId + " ]";
    }
    
}
