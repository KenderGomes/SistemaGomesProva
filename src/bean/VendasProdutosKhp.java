package bean;
// Generated 16/12/2024 11:49:20 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VendasProdutosKhp generated by hbm2java
 */
@Entity
@Table(name="vendas_produtos_khp"
    ,catalog="db_kender_gomes"
)
public class VendasProdutosKhp  implements java.io.Serializable {


     private int idVendasProdutosKhp;
     private ProdutosKhp produtosKhp;
     private VendasKhp vendasKhp;
     private int quantidadeKhp;
     private int valorUnitarioKhp;

    public VendasProdutosKhp() {
    }

	
    public VendasProdutosKhp(int idVendasProdutosKhp, ProdutosKhp produtosKhp, VendasKhp vendasKhp) {
        this.idVendasProdutosKhp = idVendasProdutosKhp;
        this.produtosKhp = produtosKhp;
        this.vendasKhp = vendasKhp;
    }
    public VendasProdutosKhp(int idVendasProdutosKhp, ProdutosKhp produtosKhp, VendasKhp vendasKhp, int quantidadeKhp, int valorUnitarioKhp) {
       this.idVendasProdutosKhp = idVendasProdutosKhp;
       this.produtosKhp = produtosKhp;
       this.vendasKhp = vendasKhp;
       this.quantidadeKhp = quantidadeKhp;
       this.valorUnitarioKhp = valorUnitarioKhp;
    }
   
     @Id 

    
    @Column(name="id_vendas_produtos_khp", unique=true, nullable=false)
    public int getIdVendasProdutosKhp() {
        return this.idVendasProdutosKhp;
    }
    
    public void setIdVendasProdutosKhp(int idVendasProdutosKhp) {
        this.idVendasProdutosKhp = idVendasProdutosKhp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_produtos_khp", nullable=false)
    public ProdutosKhp getProdutosKhp() {
        return this.produtosKhp;
    }
    
    public void setProdutosKhp(ProdutosKhp produtosKhp) {
        this.produtosKhp = produtosKhp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_vendas_khp", nullable=false)
    public VendasKhp getVendasKhp() {
        return this.vendasKhp;
    }
    
    public void setVendasKhp(VendasKhp vendasKhp) {
        this.vendasKhp = vendasKhp;
    }

    
    @Column(name="quantidade_khp")
    public int getQuantidadeKhp() {
        return this.quantidadeKhp;
    }
    
    public void setQuantidadeKhp(int quantidadeKhp) {
        this.quantidadeKhp = quantidadeKhp;
    }

    
    @Column(name="valor_unitario_khp")
    public int getValorUnitarioKhp() {
        return this.valorUnitarioKhp;
    }
    
    public void setValorUnitarioKhp(int valorUnitarioKhp) {
        this.valorUnitarioKhp = valorUnitarioKhp;
    }




}

