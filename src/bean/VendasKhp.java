package bean;
// Generated 16/12/2024 11:49:20 by Hibernate Tools 4.3.1


import java.lang.Double;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendasKhp generated by hbm2java
 */
@Entity
@Table(name="vendas_khp"
    ,catalog="db_kender_gomes"
)
public class VendasKhp  implements java.io.Serializable {


     private int idVendasKhp;
     private ClienteKhp clienteKhp;
     private Date dataVendaKhp;
     private Double valorTotalKhp;
     private int formaDePagamentoKhp;

    public VendasKhp() {
    }

    public VendasKhp(ClienteKhp clienteKhp, Date dataVendaKhp, Double valorTotalKhp, int formaDePagamentoKhp, Set vendasProdutosKhps) {
       this.clienteKhp = clienteKhp;
       this.dataVendaKhp = dataVendaKhp;
       this.valorTotalKhp = valorTotalKhp;
       this.formaDePagamentoKhp = formaDePagamentoKhp;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_vendas_khp", unique=true, nullable=false)
    public int getIdVendasKhp() {
        return this.idVendasKhp;
    }
    
    public void setIdVendasKhp(int idVendasKhp) {
        this.idVendasKhp = idVendasKhp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_cliente_khp")
    public ClienteKhp getClienteKhp() {
        return this.clienteKhp;
    }
    
    public void setClienteKhp(ClienteKhp clienteKhp) {
        this.clienteKhp = clienteKhp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_venda_khp", length=19)
    public Date getDataVendaKhp() {
        return this.dataVendaKhp;
    }
    
    public void setDataVendaKhp(Date dataVendaKhp) {
        this.dataVendaKhp = dataVendaKhp;
    }

    
    @Column(name="valor_total_khp", precision=10)
    public Double getValorTotalKhp() {
        return this.valorTotalKhp;
    }
    
    public void setValorTotalKhp(Double valorTotalKhp) {
        this.valorTotalKhp = valorTotalKhp;
    }

    
    @Column(name="forma_de_pagamento_khp")
    public int getFormaDePagamentoKhp() {
        return this.formaDePagamentoKhp;
    }
    
    public void setFormaDePagamentoKhp(int formaDePagamentoKhp) {
        this.formaDePagamentoKhp = formaDePagamentoKhp;
    }

}

