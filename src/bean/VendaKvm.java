package bean;
// Generated 28/08/2024 10:07:57 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendaKvm generated by hbm2java
 */
@Entity
@Table(name="venda_kvm"
    ,catalog="db_kelvin_morel"
)
public class VendaKvm  implements java.io.Serializable {


     private int idvendaKvm;
     private ClienteKvm clienteKvm;
     private FuncionarioKvm funcionarioKvm;
     private Date dataKvm;
     private String totalKvm;
     private String formaPagamentoKvm;
    

    public VendaKvm() {
    }

	
    public VendaKvm(int idvendaKvm, ClienteKvm clienteKvm, FuncionarioKvm funcionarioKvm, Date dataKvm, String totalKvm, String formaPagamentoKvm) {
        this.idvendaKvm = idvendaKvm;
        this.clienteKvm = clienteKvm;
        this.funcionarioKvm = funcionarioKvm;
        this.dataKvm = dataKvm;
        this.totalKvm = totalKvm;
        this.formaPagamentoKvm = formaPagamentoKvm;
    }
    
   
     @Id 

    
    @Column(name="idvenda_kvm", unique=true, nullable=false)
    public int getIdvendaKvm() {
        return this.idvendaKvm;
    }
    
    public void setIdvendaKvm(int idvendaKvm) {
        this.idvendaKvm = idvendaKvm;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkcliente_kvm", nullable=false)
    public ClienteKvm getClienteKvm() {
        return this.clienteKvm;
    }
    
    public void setClienteKvm(ClienteKvm clienteKvm) {
        this.clienteKvm = clienteKvm;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkfuncionario_kvm", nullable=false)
    public FuncionarioKvm getFuncionarioKvm() {
        return this.funcionarioKvm;
    }
    
    public void setFuncionarioKvm(FuncionarioKvm funcionarioKvm) {
        this.funcionarioKvm = funcionarioKvm;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_kvm", nullable=false, length=10)
    public Date getDataKvm() {
        return this.dataKvm;
    }
    
    public void setDataKvm(Date dataKvm) {
        this.dataKvm = dataKvm;
    }

    
    @Column(name="total_kvm", nullable=false, length=10)
    public String getTotalKvm() {
        return this.totalKvm;
    }
    
    public void setTotalKvm(String totalKvm) {
        this.totalKvm = totalKvm;
    }

    
    @Column(name="formaPagamento_kvm", nullable=false, length=20)
    public String getFormaPagamentoKvm() {
        return this.formaPagamentoKvm;
    }
    
    public void setFormaPagamentoKvm(String formaPagamentoKvm) {
        this.formaPagamentoKvm = formaPagamentoKvm;
    }

    public void setTotalKvm(double total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}

