/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteKvm;
import bean.FuncionarioKvm;
import bean.VendaProdutoKvm;
import bean.VendaKvm;
import dao.Cliente_DAO;
import dao.Funcionario_DAO;
import dao.Vendaproduto_DAO;
import dao.Venda_DAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import controle.ProdutoControle;
import controle.VendaProdutoControle;
import controle.VendaControle;
import viewPesquisa.JDlgVendaPesquisa;
//import viewPesquisa.JDlgProdutoNovo;
//import viewPesquisa.JDlgVendaPesquisa;

/**
 *
 * @author Sebas
 */
public class JDlgVenda extends javax.swing.JDialog {
    
    JDlgVendaPesquisa jDlgVendaPesquisa; // Declaração de uma variável 
    private boolean incl; // Declaração de uma variável booleana para verificar se a operação é de inclusão

  
    MaskFormatter maskdata; // Declaração de uma variável, usada para formatar campos de entrada como datas

    
    JDlgVendaProduto jDlgVendaProduto; // Declaração de uma variável 
    VendaControle vendaControle; // Declaração de uma variável 
    public VendaProdutoControle vendaProdutoControle; // Declaração de uma variável 
    ProdutoControle produtoControle; // Declaração de uma variável 
    JDlgVenda jDlgVenda; // Declaração de uma variável 
    VendaKvm strykeKvm; // Classe representando as vendas 
    Vendaproduto_DAO vendaproduto_DAO; // Acesso a dados de produtos
    Venda_DAO venda_DAO; // Acesso a dados de vendas
    
    /**
     * Creates new form JDlgPedidos
     */
    
    
    // Construtor da classe JDlgVendas que herda de JDialog
    public JDlgVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal); // Chama o construtor da classe mãe (JDialog)
        initComponents();    // Inicializa os componentes da interface gráfica
        setLocationRelativeTo(null);  // Centraliza a janela na tela
        
     // Criação de lista de vendas e instância de DAOs
        List lista = new ArrayList();    
        Venda_DAO venda_DAO = new Venda_DAO(); // Objeto para acessar o banco de dados de vendas
        Vendaproduto_DAO  vendaproduto_DAO = new Vendaproduto_DAO();  // Objeto para acessar o banco de dados de produtos

        System.out.println("estouchegand"); // Teste de depuração (obcional)

     // Criação de diálogo de vendas e controle
        jDlgVendaProduto = new JDlgVendaProduto(null, true);
        vendaControle = new VendaControle(); // Controle das operações de venda
        vendaProdutoControle = new VendaProdutoControle(); // Controle de produtovendida
        vendaProdutoControle.setList(lista);  // Define a lista de produtos no controle

        
     // Carrega todos os produtos da base de dados e define o modelo da tabela
        List listProduto = vendaproduto_DAO.listAll();
        jTable1.setModel(vendaProdutoControle); // Configura o controle como modelo da tabela
   

        Util.habilitar(false,jBtnCancelar,jBtnConfirmar, jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir);
        Util.habilitar(true, jBtnIncluir,jBtnExcluir, jBtnAlterar);
        
        
        
        
      // Formatação de máscara para o campo de data
        try{
             maskdata = new MaskFormatter("##/##/####");
        }catch (ParseException ex) {
            Logger.getLogger(JDlgVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtDataKvm.setFormatterFactory(new DefaultFormatterFactory(maskdata));
     
    
     // Preenche a lista de clientes no ComboBox
   
        Cliente_DAO cliente_DAO = new Cliente_DAO() ;
        List listaa = cliente_DAO.listAll();
        for (int i = 0; i < listaa.size(); i++) {
           jCboClienteKvm.addItem((ClienteKvm) listaa.get(i));  // Adiciona cada cliente à lista
        }
        
     // Preenche a lista de funcionários no ComboBox

        Funcionario_DAO funcionario_DAO = new Funcionario_DAO() ;
        List lista1 = funcionario_DAO.listAll();
        for (int j = 0; j < lista1.size(); j++) {
           jCboFuncionarioKvm.addItem((FuncionarioKvm) lista1.get(j)); 
        }
        
    
    }
    
    
   
     public VendaKvm viewBean() {
         /*SetarID*/
        VendaKvm vendaKvm = new VendaKvm();
        int id = Util.strInt(jTxtNumPed.getText());
        vendaKvm.setIdvendaKvm(id);
        /*SetarDouble*/
        double total = Util.strDouble(jTxtTotal.getText());
        vendaKvm.setTotalKvm(total);
        /*SetarDatas*/
        Date data = Util.strDate(jFmtDataKvm.getText());
        vendaKvm.setDataKvm(data);
        /*SetarCombo*/
        vendaKvm.setClienteKvm((ClienteKvm) jCboClienteKvm.getSelectedItem());
        vendaKvm.setFuncionarioKvm((FuncionarioKvm) jCboFuncionarioKvm.getSelectedItem());
        return vendaKvm;
     }
     
     
   
     public void beanView(VendaKvm vendaKvm) {
         strykeKvm = vendaKvm;
         /*SetarID*/
        String intStr = Util.intStr(vendaKvm.getIdvendaKvm());
        jTxtNumPed.setText(intStr);
        /*SetarDouble*/
        String total = Util.doubleStr(vendaKvm.getTotalKvm());
        jTxtTotal.setText(total);
        /*SetarDatas*/
        jFmtDataKvm.setText(Util.dateStr(vendaKvm.getDataKvm()));
        /*SetarCombo*/
        jCboFuncionarioKvm.setSelectedItem(vendaKvm.getFuncionarioKvm());
        jCboClienteKvm.setSelectedItem(vendaKvm.getClienteKvm());
        
//        vendaproduto_DAO = new Vendaproduto_DAO();
//        List listaProd = (List) vendaproduto_DAO.listProduto(strykeKvm);
//        vendaProdutoControle.setList(listaProd);   


     }
     
      public  void  setTelaAnterior(JDlgVenda jDlgVenda){
            this.jDlgVenda  = jDlgVenda;
    }
    public int getSelectedRowProd(){
        return jTable1.getSelectedRow();
    }
    
    
   /**
  1   * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtNumPed = new javax.swing.JTextField();
        jCboClienteKvm = new javax.swing.JComboBox<>();
        jCboFuncionarioKvm = new javax.swing.JComboBox<>();
        jTxtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnAlterarTable = new javax.swing.JButton();
        jBtnExcluirTable = new javax.swing.JButton();
        jbtnIncluirTable = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jFmtDataKvm = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Num. Pedido");

        jLabel2.setText("Data");

        jLabel3.setText("Clientes");

        jLabel4.setText("Vendedor");

        jLabel5.setText("Total");

        jTxtNumPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumPedActionPerformed(evt);
            }
        });

        jCboClienteKvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClienteKvmActionPerformed(evt);
            }
        });

        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBtnAlterarTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Alterar.png"))); // NOI18N
        jBtnAlterarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarTableActionPerformed(evt);
            }
        });

        jBtnExcluirTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Excluir (1).png"))); // NOI18N
        jBtnExcluirTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirTableActionPerformed(evt);
            }
        });

        jbtnIncluirTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Incluir.png"))); // NOI18N
        jbtnIncluirTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIncluirTableActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Ok .png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Excluir (1).png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Cancelar .png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Pesquisa (1).png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAlterar)
                .addGap(18, 18, 18)
                .addComponent(jBtnExcluir)
                .addGap(12, 12, 12)
                .addComponent(jBtnConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBtnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir)
                        .addComponent(jBtnAlterar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnConfirmar)
                        .addComponent(jBtnExcluir)
                        .addComponent(jBtnCancelar)
                        .addComponent(jBtnPesquisar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtNumPed, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFmtDataKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboClienteKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jCboFuncionarioKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAlterarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluirTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnIncluirTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtNumPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFmtDataKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCboClienteKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboFuncionarioKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnIncluirTable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAlterarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluirTable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNumPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumPedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumPedActionPerformed

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        incl = true;
        
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
      //  vendaControle.setList(new ArrayList());
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        incl = false;
        jDlgVendaProduto.setVisible(true);
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
    if(strykeKvm != null){
       if (Util.perguntar("Excluir?") == true) {
       Vendaproduto_DAO vendaproduto_DAO = new Vendaproduto_DAO();
        VendaProdutoKvm produtoVendaKvm;
        for(int linha = 0; linha< jTable1.getRowCount(); linha++){
            produtoVendaKvm = vendaProdutoControle.getBean(linha);
            vendaproduto_DAO.delete(produtoVendaKvm);
        }
        venda_DAO.delete(strykeKvm);
    }
      else{
             Util.mensagem("Pesquisa");
               }
    Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
    }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        VendaKvm vendaKvm = viewBean();
        Venda_DAO vendaDAO = new Venda_DAO();

         if (incl == true) {
                vendaDAO.insert(vendaKvm);
                 Util.mensagem("Registro incluido com sucesso.");
             } else {
                vendaDAO.upedate(vendaKvm);
                 Util.mensagem("Registro alterado com sucesso.");

                 }
           vendaProdutoControle.limparTabela();
           
    Util.habilitar(false,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
    Util.habilitar(true, jBtnIncluir,jBtnPesquisar);
    Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.mensagem("Operação Cancelada!");
    Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jBtnAlterar, jBtnExcluir,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
    Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
    Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataKvm, jCboClienteKvm, jCboFuncionarioKvm, jTxtTotal, jBtnAlterarTable, jBtnExcluirTable, jbtnIncluirTable);
  
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
    jDlgVendaPesquisa = new JDlgVendaPesquisa(null, true);
    jDlgVendaPesquisa.setTitle("Pesquisar");
    jDlgVendaPesquisa.setTelaAnterior(this);
    jDlgVendaPesquisa.setVisible(true);
//    vendaControle.setList(new ArrayList());
    Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir);
    Util.habilitar(false, jBtnCancelar, jBtnConfirmar);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jbtnIncluirTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIncluirTableActionPerformed
    jDlgVendaProduto.setTitle("Incluir");
    jDlgVendaProduto.setTelaAnterior(this);
    jDlgVendaProduto.setVisible(true);
    }//GEN-LAST:event_jbtnIncluirTableActionPerformed

    private void jCboClienteKvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClienteKvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClienteKvmActionPerformed

    private void jBtnAlterarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarTableActionPerformed
    JDlgVendaProduto jDlgVendaProduto = new JDlgVendaProduto(null, true);
    jDlgVendaProduto.setTitle("Alteração de Produto");
    jDlgVendaProduto.setTelaAnterior(this);
    int linSel = jTable1.getSelectedRow();
    VendaProdutoKvm produtoVendaKvm = (VendaProdutoKvm) vendaProdutoControle.getBean(linSel);
    jDlgVendaProduto.beanView(produtoVendaKvm);
    jDlgVendaProduto.setVisible(true);
    Util.mensagem("Produto Alterado.");
    }//GEN-LAST:event_jBtnAlterarTableActionPerformed

    private void jBtnExcluirTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirTableActionPerformed
        VendaProdutoControle vendaProdutoControle = new  VendaProdutoControle ();
        int linha = jTable1.getSelectedRow();
        if (linha == -1) {
            Util.mensagem("Nenhuma linha selecionada");
            
        } else {
            if (Util.perguntar("Confirma exclusão do produto?") == true) {
                vendaProdutoControle.removeBean(linha);
                    Util.mensagem("Produto Excluido.");
        ((VendaProdutoControle) jTable1.getModel()).removeBean(linha);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirTableActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVenda dialog = new JDlgVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterarTable;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluirTable;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<ClienteMsl> jCboClienteKvm;
    private javax.swing.JComboBox<FuncionarioMsl> jCboFuncionarioKvm;
    private javax.swing.JFormattedTextField jFmtDataKvm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtNumPed;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JButton jbtnIncluirTable;
    // End of variables declaration//GEN-END:variables
}