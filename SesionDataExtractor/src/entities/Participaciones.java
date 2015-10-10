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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jalvaren
 */
@Entity
@Table(name = "participaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participaciones.findAll", query = "SELECT p FROM Participaciones p"),
    @NamedQuery(name = "Participaciones.findByParticipacionesId", query = "SELECT p FROM Participaciones p WHERE p.participacionesId = :participacionesId"),
    @NamedQuery(name = "Participaciones.findByParticipacionDescripcion", query = "SELECT p FROM Participaciones p WHERE p.participacionDescripcion = :participacionDescripcion")})
public class Participaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "participaciones_id")
    private Integer participacionesId;
    @Column(name = "participacion_descripcion")
    private String participacionDescripcion;
    @JoinColumns({
        @JoinColumn(name = "sesion_id", referencedColumnName = "sesion_id"),
        @JoinColumn(name = "senador_id", referencedColumnName = "senador_id")})
    @ManyToOne(optional = false)
    private Presencias presencias;

    public Participaciones() {
    }

    public Participaciones(Integer participacionesId) {
        this.participacionesId = participacionesId;
    }

    public Integer getParticipacionesId() {
        return participacionesId;
    }

    public void setParticipacionesId(Integer participacionesId) {
        this.participacionesId = participacionesId;
    }

    public String getParticipacionDescripcion() {
        return participacionDescripcion;
    }

    public void setParticipacionDescripcion(String participacionDescripcion) {
        this.participacionDescripcion = participacionDescripcion;
    }

    public Presencias getPresencias() {
        return presencias;
    }

    public void setPresencias(Presencias presencias) {
        this.presencias = presencias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (participacionesId != null ? participacionesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participaciones)) {
            return false;
        }
        Participaciones other = (Participaciones) object;
        if ((this.participacionesId == null && other.participacionesId != null) || (this.participacionesId != null && !this.participacionesId.equals(other.participacionesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Participaciones[ participacionesId=" + participacionesId + " ]";
    }
    
}
