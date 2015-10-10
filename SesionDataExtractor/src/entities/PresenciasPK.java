/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jalvaren
 */
@Embeddable
public class PresenciasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "senador_id")
    private int senadorId;
    @Basic(optional = false)
    @Column(name = "sesion_id")
    private int sesionId;

    public PresenciasPK() {
    }

    public PresenciasPK(int senadorId, int sesionId) {
        this.senadorId = senadorId;
        this.sesionId = sesionId;
    }

    public int getSenadorId() {
        return senadorId;
    }

    public void setSenadorId(int senadorId) {
        this.senadorId = senadorId;
    }

    public int getSesionId() {
        return sesionId;
    }

    public void setSesionId(int sesionId) {
        this.sesionId = sesionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) senadorId;
        hash += (int) sesionId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresenciasPK)) {
            return false;
        }
        PresenciasPK other = (PresenciasPK) object;
        if (this.senadorId != other.senadorId) {
            return false;
        }
        if (this.sesionId != other.sesionId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PresenciasPK[ senadorId=" + senadorId + ", sesionId=" + sesionId + " ]";
    }
    
}
