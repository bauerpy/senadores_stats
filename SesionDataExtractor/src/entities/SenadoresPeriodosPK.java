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
public class SenadoresPeriodosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "senador_id")
    private int senadorId;
    @Basic(optional = false)
    @Column(name = "periodo_id")
    private int periodoId;

    public SenadoresPeriodosPK() {
    }

    public SenadoresPeriodosPK(int senadorId, int periodoId) {
        this.senadorId = senadorId;
        this.periodoId = periodoId;
    }

    public int getSenadorId() {
        return senadorId;
    }

    public void setSenadorId(int senadorId) {
        this.senadorId = senadorId;
    }

    public int getPeriodoId() {
        return periodoId;
    }

    public void setPeriodoId(int periodoId) {
        this.periodoId = periodoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) senadorId;
        hash += (int) periodoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SenadoresPeriodosPK)) {
            return false;
        }
        SenadoresPeriodosPK other = (SenadoresPeriodosPK) object;
        if (this.senadorId != other.senadorId) {
            return false;
        }
        if (this.periodoId != other.periodoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.SenadoresPeriodosPK[ senadorId=" + senadorId + ", periodoId=" + periodoId + " ]";
    }
    
}
