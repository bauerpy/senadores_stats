/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "senadores_periodos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SenadoresPeriodos.findAll", query = "SELECT s FROM SenadoresPeriodos s"),
    @NamedQuery(name = "SenadoresPeriodos.findBySenadorId", query = "SELECT s FROM SenadoresPeriodos s WHERE s.senadoresPeriodosPK.senadorId = :senadorId"),
    @NamedQuery(name = "SenadoresPeriodos.findByPeriodoId", query = "SELECT s FROM SenadoresPeriodos s WHERE s.senadoresPeriodosPK.periodoId = :periodoId")})
public class SenadoresPeriodos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SenadoresPeriodosPK senadoresPeriodosPK;
    @JoinColumn(name = "senador_id", referencedColumnName = "senador_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Senador senadores;
    @JoinColumn(name = "periodo_id", referencedColumnName = "periodo_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Periodos periodos;
    @JoinColumn(name = "bancada_id", referencedColumnName = "bancada_id")
    @ManyToOne(optional = false)
    private Bancadas bancadaId;

    public SenadoresPeriodos() {
    }

    public SenadoresPeriodos(SenadoresPeriodosPK senadoresPeriodosPK) {
        this.senadoresPeriodosPK = senadoresPeriodosPK;
    }

    public SenadoresPeriodos(int senadorId, int periodoId) {
        this.senadoresPeriodosPK = new SenadoresPeriodosPK(senadorId, periodoId);
    }

    public SenadoresPeriodosPK getSenadoresPeriodosPK() {
        return senadoresPeriodosPK;
    }

    public void setSenadoresPeriodosPK(SenadoresPeriodosPK senadoresPeriodosPK) {
        this.senadoresPeriodosPK = senadoresPeriodosPK;
    }

    public Senador getSenadores() {
        return senadores;
    }

    public void setSenadores(Senador senadores) {
        this.senadores = senadores;
    }

    public Periodos getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Periodos periodos) {
        this.periodos = periodos;
    }

    public Bancadas getBancadaId() {
        return bancadaId;
    }

    public void setBancadaId(Bancadas bancadaId) {
        this.bancadaId = bancadaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (senadoresPeriodosPK != null ? senadoresPeriodosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SenadoresPeriodos)) {
            return false;
        }
        SenadoresPeriodos other = (SenadoresPeriodos) object;
        if ((this.senadoresPeriodosPK == null && other.senadoresPeriodosPK != null) || (this.senadoresPeriodosPK != null && !this.senadoresPeriodosPK.equals(other.senadoresPeriodosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.SenadoresPeriodos[ senadoresPeriodosPK=" + senadoresPeriodosPK + " ]";
    }
    
}
