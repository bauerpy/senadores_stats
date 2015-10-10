/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jalvaren
 */
@Entity
@Table(name = "sesiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sesiones.findAll", query = "SELECT s FROM Sesiones s"),
    @NamedQuery(name = "Sesiones.findBySesionId", query = "SELECT s FROM Sesiones s WHERE s.sesionId = :sesionId"),
    @NamedQuery(name = "Sesiones.findBySesionFecha", query = "SELECT s FROM Sesiones s WHERE s.sesionFecha = :sesionFecha")})
public class Sesiones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sesion_id")
    private Integer sesionId;
    @Column(name = "sesion_fecha")
    @Temporal(TemporalType.DATE)
    private Date sesionFecha;
    @JoinColumn(name = "periodo_id", referencedColumnName = "periodo_id")
    @ManyToOne(optional = false)
    private Periodos periodoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sesiones")
    private Collection<Presencias> presenciasCollection;

    public Sesiones() {
    }

    public Sesiones(Integer sesionId) {
        this.sesionId = sesionId;
    }

    public Integer getSesionId() {
        return sesionId;
    }

    public void setSesionId(Integer sesionId) {
        this.sesionId = sesionId;
    }

    public Date getSesionFecha() {
        return sesionFecha;
    }

    public void setSesionFecha(Date sesionFecha) {
        this.sesionFecha = sesionFecha;
    }

    public Periodos getPeriodoId() {
        return periodoId;
    }

    public void setPeriodoId(Periodos periodoId) {
        this.periodoId = periodoId;
    }

    @XmlTransient
    public Collection<Presencias> getPresenciasCollection() {
        return presenciasCollection;
    }

    public void setPresenciasCollection(Collection<Presencias> presenciasCollection) {
        this.presenciasCollection = presenciasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sesionId != null ? sesionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sesiones)) {
            return false;
        }
        Sesiones other = (Sesiones) object;
        if ((this.sesionId == null && other.sesionId != null) || (this.sesionId != null && !this.sesionId.equals(other.sesionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sesiones[ sesionId=" + sesionId + " ]";
    }
    
}
