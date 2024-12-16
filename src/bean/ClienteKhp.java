package bean;
// Generated 16/12/2024 11:49:20 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClienteKhp generated by hbm2java
 */
@Entity
@Table(name="cliente_khp"
    ,catalog="db_kender_gomes"
)
public class ClienteKhp  implements java.io.Serializable {


     private int idClienteKhp;
     private String nomeKhp;
     private String telefoneKhp;
     private String emailKhp;
     private Date dataCadastroKhp;
     private Date datanascimentoKhp;
     private String ufKhp;
     private String bairroKhp;
     private String logradouroKhp;
     private String numeroKhp;
     private String sexoKhp;
     private String cpfKhp;
     private String cepKhp;
     private String complementoKhp;
     private String enderecoKhp;
     private String cidadeKhp;
     private String identidadeKhp;

    public ClienteKhp() {
    }

	
    public ClienteKhp(int idClienteKhp) {
        this.idClienteKhp = idClienteKhp;
    }
    public ClienteKhp(int idClienteKhp, String nomeKhp, String telefoneKhp, String emailKhp, Date dataCadastroKhp, Date datanascimentoKhp, String ufKhp, String bairroKhp, String logradouroKhp, String numeroKhp, String sexoKhp, String cpfKhp, String cepKhp, String complementoKhp, String enderecoKhp, String cidadeKhp, String identidadeKhp, Set vendasKhps) {
       this.idClienteKhp = idClienteKhp;
       this.nomeKhp = nomeKhp;
       this.telefoneKhp = telefoneKhp;
       this.emailKhp = emailKhp;
       this.dataCadastroKhp = dataCadastroKhp;
       this.datanascimentoKhp = datanascimentoKhp;
       this.ufKhp = ufKhp;
       this.bairroKhp = bairroKhp;
       this.logradouroKhp = logradouroKhp;
       this.numeroKhp = numeroKhp;
       this.sexoKhp = sexoKhp;
       this.cpfKhp = cpfKhp;
       this.cepKhp = cepKhp;
       this.complementoKhp = complementoKhp;
       this.enderecoKhp = enderecoKhp;
       this.cidadeKhp = cidadeKhp;
       this.identidadeKhp = identidadeKhp;

    }
   
     @Id 

    
    @Column(name="id_cliente_khp", unique=true, nullable=false)
    public int getIdClienteKhp() {
        return this.idClienteKhp;
    }
    
    public void setIdClienteKhp(int idClienteKhp) {
        this.idClienteKhp = idClienteKhp;
    }

    
    @Column(name="nome_khp", length=50)
    public String getNomeKhp() {
        return this.nomeKhp;
    }
    
    public void setNomeKhp(String nomeKhp) {
        this.nomeKhp = nomeKhp;
    }

    
    @Column(name="telefone_khp", length=15)
    public String getTelefoneKhp() {
        return this.telefoneKhp;
    }
    
    public void setTelefoneKhp(String telefoneKhp) {
        this.telefoneKhp = telefoneKhp;
    }

    
    @Column(name="email_khp", length=60)
    public String getEmailKhp() {
        return this.emailKhp;
    }
    
    public void setEmailKhp(String emailKhp) {
        this.emailKhp = emailKhp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_cadastro_khp", length=19)
    public Date getDataCadastroKhp() {
        return this.dataCadastroKhp;
    }
    
    public void setDataCadastroKhp(Date dataCadastroKhp) {
        this.dataCadastroKhp = dataCadastroKhp;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datanascimento_khp", length=10)
    public Date getDatanascimentoKhp() {
        return this.datanascimentoKhp;
    }
    
    public void setDatanascimentoKhp(Date datanascimentoKhp) {
        this.datanascimentoKhp = datanascimentoKhp;
    }

    
    @Column(name="uf_khp", length=2)
    public String getUfKhp() {
        return this.ufKhp;
    }
    
    public void setUfKhp(String ufKhp) {
        this.ufKhp = ufKhp;
    }

    
    @Column(name="bairro_khp", length=50)
    public String getBairroKhp() {
        return this.bairroKhp;
    }
    
    public void setBairroKhp(String bairroKhp) {
        this.bairroKhp = bairroKhp;
    }

    
    @Column(name="logradouro_khp", length=20)
    public String getLogradouroKhp() {
        return this.logradouroKhp;
    }
    
    public void setLogradouroKhp(String logradouroKhp) {
        this.logradouroKhp = logradouroKhp;
    }

    
    @Column(name="numero_khp", length=5)
    public String getNumeroKhp() {
        return this.numeroKhp;
    }
    
    public void setNumeroKhp(String numeroKhp) {
        this.numeroKhp = numeroKhp;
    }

    
    @Column(name="sexo_khp", length=1)
    public String getSexoKhp() {
        return this.sexoKhp;
    }
    
    public void setSexoKhp(String sexoKhp) {
        this.sexoKhp = sexoKhp;
    }

    
    @Column(name="cpf_khp", length=14)
    public String getCpfKhp() {
        return this.cpfKhp;
    }
    
    public void setCpfKhp(String cpfKhp) {
        this.cpfKhp = cpfKhp;
    }

    
    @Column(name="cep_khp", length=10)
    public String getCepKhp() {
        return this.cepKhp;
    }
    
    public void setCepKhp(String cepKhp) {
        this.cepKhp = cepKhp;
    }

    
    @Column(name="complemento_khp", length=50)
    public String getComplementoKhp() {
        return this.complementoKhp;
    }
    
    public void setComplementoKhp(String complementoKhp) {
        this.complementoKhp = complementoKhp;
    }

    
    @Column(name="endereco_khp", length=30)
    public String getEnderecoKhp() {
        return this.enderecoKhp;
    }
    
    public void setEnderecoKhp(String enderecoKhp) {
        this.enderecoKhp = enderecoKhp;
    }

    
    @Column(name="cidade_khp", length=20)
    public String getCidadeKhp() {
        return this.cidadeKhp;
    }
    
    public void setCidadeKhp(String cidadeKhp) {
        this.cidadeKhp = cidadeKhp;
    }

    
    @Column(name="identidade_khp", length=12)
    public String getIdentidadeKhp() {
        return this.identidadeKhp;
    }
    
    public void setIdentidadeKhp(String identidadeKhp) {
        this.identidadeKhp = identidadeKhp;
    }


}


