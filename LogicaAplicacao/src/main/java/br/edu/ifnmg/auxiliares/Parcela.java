/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.auxiliares;

import br.edu.ifnmg.enums.ParcelaStatus;
import br.edu.ifnmg.logicaAplicacao.PagamentoPorCrediario;
import br.edu.ifnmg.logicaAplicacao.PagamentoPorCrediarioRepositorio;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author murilo
 */
@Entity
@Table(name = "parcela")
public class Parcela implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar data;
    
    @Column(precision=8, scale=2, nullable = false)
    private BigDecimal valor;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable=false)
    private ParcelaStatus status;
    
    @ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pagamento_crediario_id", nullable= false)
    private PagamentoPorCrediario pagamentoPorCrediario;
    
    @Version
    private int versao;

    public Parcela() {
        this.id = 0L;
        this.data = Calendar.getInstance();
        this.valor = null;
        this.status = null;
        this.versao = 1;
        this.pagamentoPorCrediario = new PagamentoPorCrediario();
    }

    public Calendar getData() {return data; }
    public void setData(Calendar data) { this.data = data; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public ParcelaStatus getStatus() { return status; }
    public void setStatus(ParcelaStatus status) { this.status = status; }

    public int getVersao() { return versao; }
    public void setVersao(int versao) { this.versao = versao; }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public PagamentoPorCrediario getPagamentoPorCrediario() { return pagamentoPorCrediario; }
    public void setPagamentoPorCrediario(PagamentoPorCrediario pagamentoPorCrediario) { this.pagamentoPorCrediario = pagamentoPorCrediario; }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcela)) {
            return false;
        }
        Parcela other = (Parcela) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return status.toString();
    }
    
}
