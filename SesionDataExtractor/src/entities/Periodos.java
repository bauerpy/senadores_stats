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
@Table(name = "periodos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periodos.findAll", query = "SELECT p FROM Periodos p"),
    @NamedQuery(name = "Periodos.findByPeriodoId", query = "SELECT p FROM Periodos p WHERE p.periodoId = :periodoId"),
    @NamedQuery(name = "Periodos.findByPeriodoInicio", query = "SELECT p FROM Periodos p WHERE p.periodoInicio = :periodoInicio"),
    @NamedQuery(name = "Periodos.findByPeriodoFin", query = "SELECT p FROM Periodos p WHERE p.periodoFin = :periodoFin")})
public class Periodos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "periodo_id")
    private Integer periodoId;
    @Column(name = "periodo_inicio")
    private Integer periodoInicio;
    @Column(name = "periodo_fin")
    private Integer periodoFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodoId")
    private Collection<Sesiones> sesionesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodos")
    private Collection<SenadoresPeriodos> senadoresPeriodosCollection;

    public Periodos() {
    }

    public Periodos(Integer periodoId) {
        this.periodoId = periodoId;
    }

    public Integer getPeriodoId() {
        return periodoId;
    }

    public void setPeriodoId(Integer periodoId) {
        this.periodoId = periodoId;
    }

    public Integer getPeriodoInicio() {
        return periodoInicio;
    }

    public void setPeriodoInicio(Integer periodoInicio) {
        this.periodoInicio = periodoInicio;
    }

    public Integer getPeriodoFin() {
        return periodoFin;
    }

    public void setPeriodoFin(Integer periodoFin) {
        this.periodoFin = periodoFin;
    }

    @XmlTransient
    public Collection<Sesiones> getSesionesCollection() {
        return sesionesCollection;
    }

    public void setSesionesCollection(Collection<Sesiones> sesionesCollection) {
        this.sesionesCollection = sesionesCollection;
    }

    @XmlTransient
    public Collection<SenadoresPeriodos> getSenadoresPeriodosCollection() {
        return senadoresPeriodosCollection;
    }

    public void setSenadoresPeriodosCollection(Collection<SenadoresPeriodos> senadoresPeriodosCollection) {
        this.senadoresPeriodosCollection = senadoresPeriodosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (periodoId != null ? periodoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodos)) {
            return false;
        }
        Periodos other = (Periodos) object;
        if ((this.periodoId == null && other.periodoId != null) || (this.periodoId != null && !this.periodoId.equals(other.periodoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Periodos[ periodoId=" + periodoId + " ]";
    }
    
}
