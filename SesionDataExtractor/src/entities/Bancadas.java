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
@Table(name = "bancadas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bancadas.findAll", query = "SELECT b FROM Bancadas b"),
    @NamedQuery(name = "Bancadas.findByBancadaId", query = "SELECT b FROM Bancadas b WHERE b.bancadaId = :bancadaId"),
    @NamedQuery(name = "Bancadas.findByBancadaDescripcion", query = "SELECT b FROM Bancadas b WHERE b.bancadaDescripcion = :bancadaDescripcion")})
public class Bancadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bancada_id")
    private Integer bancadaId;
    @Column(name = "bancada_descripcion")
    private String bancadaDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bancadaId")
    private Collection<SenadoresPeriodos> senadoresPeriodosCollection;
    @JoinColumn(name = "partido_id", referencedColumnName = "partido_id")
    @ManyToOne(optional = false)
    private Partidos partidoId;

    public Bancadas() {
    }

    public Bancadas(Integer bancadaId) {
        this.bancadaId = bancadaId;
    }

    public Integer getBancadaId() {
        return bancadaId;
    }

    public void setBancadaId(Integer bancadaId) {
        this.bancadaId = bancadaId;
    }

    public String getBancadaDescripcion() {
        return bancadaDescripcion;
    }

    public void setBancadaDescripcion(String bancadaDescripcion) {
        this.bancadaDescripcion = bancadaDescripcion;
    }

    @XmlTransient
    public Collection<SenadoresPeriodos> getSenadoresPeriodosCollection() {
        return senadoresPeriodosCollection;
    }

    public void setSenadoresPeriodosCollection(Collection<SenadoresPeriodos> senadoresPeriodosCollection) {
        this.senadoresPeriodosCollection = senadoresPeriodosCollection;
    }

    public Partidos getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(Partidos partidoId) {
        this.partidoId = partidoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bancadaId != null ? bancadaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bancadas)) {
            return false;
        }
        Bancadas other = (Bancadas) object;
        if ((this.bancadaId == null && other.bancadaId != null) || (this.bancadaId != null && !this.bancadaId.equals(other.bancadaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bancadas[ bancadaId=" + bancadaId + " ]";
    }
    
}
