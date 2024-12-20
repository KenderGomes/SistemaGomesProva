/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.VendedoresKhp;
import dao.VendedoresDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter; 
import tools.Util;

/**
 *
 * @author Cosme
 */
public class JDlgVendedores extends javax.swing.JDialog {

    /**
     * Creates new form JDlgVendedores
     */
    private VendedoresKhp vendedoresKhp;
    boolean inserir;

    private MaskFormatter identidade;
    private MaskFormatter cpf;
    
    public JDlgVendedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Vendedores");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
        this.inserir = true;
        try {
            identidade = new MaskFormatter("##.###.###-#");
            cpf = new MaskFormatter("###.###.###-##");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgVendedores.class.getName()).log(Level.SEVERE, null, ex);
        }

        jFmtIdentidade.setFormatterFactory(new DefaultFormatterFactory(identidade));
        jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(cpf));
   }
    
    private VendedoresKhp viewBean() {
        VendedoresKhp vendedoresKhp = new VendedoresKhp();
        vendedoresKhp.setIdVendedoresKhp(Util.strToInt(jTxtCodigoVendedor.getText()));
        vendedoresKhp.setNomeKhp(jTxtNome.getText());
        vendedoresKhp.setTelefoneKhp(jTxtTelefone.getText());
        vendedoresKhp.setEmailKhp(jTxtEmail.getText());
        vendedoresKhp.setEnderecoKhp(jTxtEndereco.getText());
        vendedoresKhp.setUfKhp(jTxtUF.getText());
        vendedoresKhp.setBairroKhp(jTxtBairro.getText());
        vendedoresKhp.setLogradouroKhp(jTxtLogradouro.getText());
        vendedoresKhp.setNumeroKhp(jTxtNumero.getText());
        vendedoresKhp.setSexoKhp((String) jCboSexo.getSelectedItem());
        vendedoresKhp.setCidadeKhp(jTxtCidade.getText());
        vendedoresKhp.setIdentidadeKhp(jFmtIdentidade.getText());
        vendedoresKhp.setCepKhp(jTxtCep.getText());
        vendedoresKhp.setComplementoKhp(jTxtComplemento.getText());
        vendedoresKhp.setCpfKhp(jFmtCpf.getText());
        return vendedoresKhp;
    }
    
    void beanView(VendedoresKhp vendedoresKhp) {
    jTxtCodigoVendedor.setText(String.valueOf(vendedoresKhp.getIdVendedoresKhp()));
    jTxtNome.setText(vendedoresKhp.getNomeKhp());
    jTxtTelefone.setText(vendedoresKhp.getTelefoneKhp());
    jTxtEmail.setText(vendedoresKhp.getEmailKhp());
    jTxtEndereco.setText(vendedoresKhp.getEnderecoKhp());
    jTxtUF.setText(vendedoresKhp.getUfKhp());
    jTxtBairro.setText(vendedoresKhp.getBairroKhp());
    jTxtLogradouro.setText(vendedoresKhp.getLogradouroKhp());
    jTxtNumero.setText(vendedoresKhp.getNumeroKhp());
    jCboSexo.setSelectedItem(vendedoresKhp.getSexoKhp());
    jTxtCidade.setText(vendedoresKhp.getCidadeKhp());
    jFmtIdentidade.setText(vendedoresKhp.getIdentidadeKhp());
    jTxtCep.setText(vendedoresKhp.getCepKhp());
    jTxtComplemento.setText(vendedoresKhp.getComplementoKhp());
    jFmtCpf.setText(vendedoresKhp.getCpfKhp());
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTxtCodigoVendedor = new javax.swing.JTextField();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jTxtBairro = new javax.swing.JTextField();
        jTxtUF = new javax.swing.JTextField();
        jTxtLogradouro = new javax.swing.JTextField();
        jTxtComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jFmtDatadeNascimento = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFmtIdentidade = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTxtNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCboSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtCep = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setText("Logradouro");

        jLabel18.setText("Código");

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jTxtUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUFActionPerformed(evt);
            }
        });

        jLabel9.setText("Complemento");

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel5.setText("Data de Nascimento");

        jFmtDatadeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDatadeNascimentoActionPerformed(evt);
            }
        });

        jLabel14.setText("CPF");

        jLabel2.setText("Nome");

        jLabel15.setText("Identidade");

        jLabel16.setText("Endereço");

        jLabel17.setText("Número");

        jLabel6.setText("Sexo");

        jLabel3.setText("Telefone");

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jCboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboSexoActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        jLabel11.setText("CEP");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Cidade");

        jLabel7.setText("Bairro");

        jLabel8.setText("UF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jTxtCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jTxtCidade)
                                        .addComponent(jTxtLogradouro))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jFmtIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(140, 140, 140)
                                            .addComponent(jLabel15))
                                        .addComponent(jLabel6)
                                        .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFmtDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGap(4, 4, 4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel17))
                                        .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jTxtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jBtnIncluir)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnConfirmar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnPesquisar)))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jFmtDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(jTxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        Util.habilitar(true, jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        this.inserir = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if(Util.perguntar("Você quer excluir?")== true){
        VendedoresKhp vendedoresKhp = viewBean();
        VendedoresDAO vendedoresDAO = new VendedoresDAO();
        vendedoresDAO.delete(vendedoresKhp);
        Util.mostrar("Exclusão efetuada com Sucesso");
            Util.limpar(jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);   
        } else {
            Util.mostrar("Exclusão cancelada");
        }
        

    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        VendedoresKhp vendedoresKhp = viewBean();
        VendedoresDAO vendedoresDAO = new VendedoresDAO();
        viewBean();
        if(this.inserir == true){
        vendedoresDAO.insert(vendedoresKhp);
        }else{
        vendedoresDAO.update(vendedoresKhp);
        }
        
        Util.habilitar(false, jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.habilitar(false, jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgVendedoresPesquisar jDlgVendedoresPesquisar = new JDlgVendedoresPesquisar(null, true);
        jDlgVendedoresPesquisar.setTelaAnterior(this);
        jDlgVendedoresPesquisar.setVisible(true);
        
        Util.habilitar(true, jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        Util.habilitar(true, jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        this.inserir = true;
        Util.limpar(jTxtBairro, jTxtCep, jTxtCidade, jTxtCodigoVendedor, jTxtComplemento, jTxtEmail, jTxtEndereco, jTxtLogradouro, jTxtNome, jTxtNumero, 
                jTxtTelefone, jTxtUF, jFmtCpf, jFmtDatadeNascimento, jFmtIdentidade, jCboSexo, jBtnConfirmar, jBtnCancelar);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jFmtDatadeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDatadeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDatadeNascimentoActionPerformed

    private void jCboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboSexoActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUFActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedores dialog = new JDlgVendedores(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtDatadeNascimento;
    private javax.swing.JFormattedTextField jFmtIdentidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigoVendedor;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtLogradouro;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtTelefone;
    private javax.swing.JTextField jTxtUF;
    // End of variables declaration//GEN-END:variables
}
