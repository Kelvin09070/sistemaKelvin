/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.ClienteKvm;
import dao.Cliente_DAO;
import tools.Util;
import viewPesquisa.JDlgClientePesquisa;


/**
 *
 * @author Sebas0
 */
public class JDlgCliente extends javax.swing.JDialog {
 
    
        boolean incl;
    public boolean pesquisado;
    /**
     * Creates new form JDlgUsuariosNovoIA
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cliente");
        setLocationRelativeTo(null);



        
        
        Util.habilitar(false, jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
        jBtnIncluir.setEnabled(true);
        
        
    
    }
     public ClienteKvm viewBean() {
        ClienteKvm cliente = new ClienteKvm();
        
        cliente.setIdclienteKvm(Util.strInt(jTxtCodigoMsl.getText()));
        
        cliente.setNomeKvm(jTxtNomeKvm.getText());
        cliente.setSobrenomeKvm(JTxtSobrenomeKvm.getText());
        cliente.setSexoKvm(JTxtSexoKvm.getText());
        cliente.setCpfKvm(jFmtCpfKvm.getText());
        cliente.setDataNascimentoKvm(null);//jFmtDataNascimento.getText();
        cliente.setTelefoneKvm(jFmtTelefoneKvm.getText());
        cliente.setCelularKvm(jFmtCelularKvm.getText());
        cliente.setCepKvm(jFmtCepKvm.getText());
        
        
        
        cliente.setCidadeKvm(JTxtCidadeKvm.getText());
        cliente.setEstadoKvm(JTxtEstadoKvm.getText());
        cliente.setEnderecoKvm(JTxtEnderecoKvm.getText());
        cliente.setEstadoCivilKvm(jJtxtEstadoCivilKvm.getText());
        cliente.setIdadeKvm(JTxtIdadeKvm.getText());
        cliente.setEmailKvm(jTxtEmailKvm.getText());
       
        

        return cliente;
    }
    
    
        public ClienteKvm beanView(ClienteKvm cliente){
            
        jTxtCodigoMsl.setText(Util.intStr(cliente.getIdclienteKvm()));
        
        jTxtNomeKvm.setText(cliente.getNomeKvm());
        JTxtSobrenomeKvm.setText(cliente.getSobrenomeKvm());
        jFmtTelefoneKvm.setText(cliente.getTelefoneKvm());
        jJtxtEstadoCivilKvm.setText(cliente.getEstadoCivilKvm());
        JTxtEnderecoKvm.setText(cliente.getEnderecoKvm());
        jTxtEmailKvm.setText(cliente.getEmailKvm());
        jFmtCpfKvm.setText(cliente.getCpfKvm());
        
        
        jFmtDataMsl.setText(null);//cliente.getDataNascimento());
        
        JTxtIdadeKvm.setText(cliente.getEnderecoKvm());
        JTxtEstadoKvm.setText(cliente.getEstadoKvm());
        JTxtCidadeKvm.setText(cliente.getCidadeKvm());
        jFmtCepKvm.setText(cliente.getCepKvm());
        JTxtIdadeKvm.setText(cliente.getIdadeKvm());

        
        
        
        jBtnAlterar.setEnabled(true);
        return cliente;
        }        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigoMsl = new javax.swing.JTextField();
        jTxtNomeKvm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTxtSobrenomeKvm = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFmtTelefoneKvm = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtCpfKvm = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTxtEnderecoKvm = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JTxtIdadeKvm = new javax.swing.JTextField();
        JTxtCidadeKvm = new javax.swing.JTextField();
        JTxtEstadoKvm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jFmtCepKvm = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFmtDataMsl = new javax.swing.JFormattedTextField();
        jJtxtEstadoCivilKvm = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFmtCelularKvm = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        JTxtSexoKvm = new javax.swing.JFormattedTextField();
        jTxtEmailKvm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel14.setFont(new java.awt.Font("Blackadder ITC", 1, 36)); // NOI18N
        jLabel14.setText("Cadastro de Cliente");

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

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Excluir (1).png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Ok .png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Pesquisa (1).png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Cancelar .png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jTxtCodigoMsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoMslActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        JTxtSobrenomeKvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtSobrenomeKvmActionPerformed(evt);
            }
        });

        jLabel7.setText("Sobrenome");

        jFmtTelefoneKvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtTelefoneKvmActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefone");

        jLabel5.setText("Endereço");

        jLabel6.setText("Sexo");

        jLabel8.setText("CPF");

        jLabel11.setText("Estado");

        jLabel12.setText("Cidade");

        jLabel10.setText("Idade");

        jFmtCepKvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCepKvmActionPerformed(evt);
            }
        });

        jLabel13.setText("Cep");

        jLabel15.setText("Data de Nascimento");

        jFmtDataMsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataMslActionPerformed(evt);
            }
        });

        jJtxtEstadoCivilKvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJtxtEstadoCivilKvmActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado Civil");

        jFmtCelularKvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCelularKvmActionPerformed(evt);
            }
        });

        jLabel9.setText("Celular");

        JTxtSexoKvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtSexoKvmActionPerformed(evt);
            }
        });

        jLabel16.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnIncluir)
                        .addGap(6, 6, 6)
                        .addComponent(jBtnAlterar)
                        .addGap(6, 6, 6)
                        .addComponent(jBtnExcluir)
                        .addGap(10, 10, 10)
                        .addComponent(jBtnConfirmar)
                        .addGap(6, 6, 6)
                        .addComponent(jBtnCancelar)
                        .addGap(6, 6, 6)
                        .addComponent(jBtnPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jTxtEmailKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(JTxtIdadeKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addGap(203, 203, 203)
                                                    .addComponent(jLabel12))
                                                .addComponent(JTxtEstadoKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(183, 183, 183))
                                        .addComponent(JTxtCidadeKvm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtCodigoMsl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTxtNomeKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(JTxtSobrenomeKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jFmtTelefoneKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jFmtCelularKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFmtCepKvm)
                                        .addComponent(jFmtDataMsl)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(JTxtSexoKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jFmtCpfKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(JTxtEnderecoKvm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jJtxtEstadoCivilKvm)))))))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCodigoMsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNomeKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(5, 5, 5)
                                .addComponent(JTxtSobrenomeKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25))
                            .addComponent(jFmtTelefoneKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(jFmtDataMsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFmtCepKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(25, 25, 25))
                                .addComponent(jFmtCelularKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtCpfKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtEnderecoKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTxtSexoKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jJtxtEstadoCivilKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtIdadeKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTxtCidadeKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTxtEstadoKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(6, 6, 6)
                .addComponent(jTxtEmailKvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        incl = true;
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        incl = false;
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
        Util.habilitar(false, jBtnIncluir,jBtnAlterar, jBtnExcluir, jBtnPesquisar, jTxtCodigoMsl);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
            
        
         if (Util.perguntar("Deseja excluir o registro") == true) {

            ClienteKvm cliente = viewBean();
            Cliente_DAO clienteDAO = new Cliente_DAO();//executa o dao
            clienteDAO.delete(cliente);

        } else {

            Util.mensagem("Exclusão cancelada.");
        }
        
        
        
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed

               
        ClienteKvm cliente = viewBean();
        Cliente_DAO clienteDAO = new Cliente_DAO();//executa o dao
        //boolean pra incluir ou alterar
        if(incl == true){
        clienteDAO.insert(cliente);
        
        }else{
        clienteDAO.upedate(cliente);
        }



        Util.habilitar(false,  jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
        Util.habilitar(true, jBtnIncluir,jBtnPesquisar);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed

        
        JDlgClientePesquisa jDlgClientePesquisa = new JDlgClientePesquisa(null, true);
        jDlgClientePesquisa.setTelaAnterior(this);
        jDlgClientePesquisa.setVisible(true);
        
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir);
        Util.habilitar(false, jBtnCancelar, jBtnConfirmar);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.mensagem("Operação Cancelada!");
        Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jBtnAlterar, jBtnExcluir, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir, jTxtCodigoMsl, jTxtNomeKvm, jFmtDataMsl, JTxtSobrenomeKvm, jJtxtEstadoCivilKvm, jFmtCepKvm, JTxtEnderecoKvm, JTxtIdadeKvm, JTxtEstadoKvm, JTxtCidadeKvm, jFmtTelefoneKvm, jFmtCpfKvm,JTxtIdadeKvm,jTxtEmailKvm);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtCodigoMslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoMslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoMslActionPerformed

    private void JTxtSobrenomeKvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtSobrenomeKvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtSobrenomeKvmActionPerformed

    private void jFmtTelefoneKvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtTelefoneKvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtTelefoneKvmActionPerformed

    private void jFmtCepKvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCepKvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCepKvmActionPerformed

    private void jFmtDataMslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataMslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataMslActionPerformed

    private void jJtxtEstadoCivilKvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJtxtEstadoCivilKvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jJtxtEstadoCivilKvmActionPerformed

    private void jFmtCelularKvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCelularKvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCelularKvmActionPerformed

    private void JTxtSexoKvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtSexoKvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtSexoKvmActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField JTxtCidadeKvm;
    private javax.swing.JTextField JTxtEnderecoKvm;
    private javax.swing.JTextField JTxtEstadoKvm;
    private javax.swing.JTextField JTxtIdadeKvm;
    private javax.swing.JFormattedTextField JTxtSexoKvm;
    private javax.swing.JFormattedTextField JTxtSobrenomeKvm;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JFormattedTextField jFmtCelularKvm;
    private javax.swing.JFormattedTextField jFmtCepKvm;
    private javax.swing.JFormattedTextField jFmtCpfKvm;
    private javax.swing.JFormattedTextField jFmtDataMsl;
    private javax.swing.JFormattedTextField jFmtTelefoneKvm;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jJtxtEstadoCivilKvm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtCodigoMsl;
    private javax.swing.JTextField jTxtEmailKvm;
    private javax.swing.JTextField jTxtNomeKvm;
    // End of variables declaration//GEN-END:variables
}
