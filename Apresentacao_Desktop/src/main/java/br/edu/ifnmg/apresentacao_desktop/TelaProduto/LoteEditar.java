/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao_desktop.TelaProduto;

import br.edu.ifnmg.auxiliares.Lote;
import Util.Util;
import br.edu.ifnmg.auxiliares.Estoque;
import br.edu.ifnmg.auxiliares.LoteRepositorio;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;

/**
 *
 * @author gabriel
 */
public class LoteEditar extends javax.swing.JInternalFrame {
    private Estoque estoque;
    private LoteRepositorio loteRepositorio;
    private Lote lote;
    private Lote toEdit;
    private Util util;
    
    /**
     * Creates new form LoteEditar
     */
    public LoteEditar(Estoque estoque, Lote lote, String title) {
        this.loteRepositorio = RepositorioFactory.getLoteRepositorio();
        this.estoque = estoque;
        this.lote = lote;
        this.toEdit = lote;
        this.util = new Util();
        initComponents();
        this.setComponentes();
        
        this.labelTitle.setText(title);
        if(title.equalsIgnoreCase("novo lote")){
            this.btnRemove.setVisible(false);
        }
    }

    private boolean setComponentes(){
        this.txtCodigo.setText(this.lote.getCodigo());
        this.txtValidade.setText(
            this.lote.getDataValidade() != null?
            Util.getStringDateFromCalendar(this.lote.getDataValidade()):
            null
        );
        this.txtFabricacao.setText(
            this.lote.getDataFabricacao() != null?
            Util.getStringDateFromCalendar(this.lote.getDataFabricacao()):
            null
        );
        this.txtEmEstoque.setText(
            this.lote.getEmEstoque()>= 0?
            String.valueOf(this.lote.getEmEstoque()):
            null
        );
        
        this.txtNasPrateleiras.setText(
            this.lote.getNasPrateleiras()>= 0?
            String.valueOf(this.lote.getNasPrateleiras()):
            null
        );
        
        return true;
    }
    
    private boolean getComponentes(){
        if(
            this.txtCodigo.getText().isEmpty() ||
            this.txtValidade.getText().isEmpty() ||
            this.txtFabricacao.getText().isEmpty()||
            this.txtEmEstoque.getText().isEmpty()
          ){
            return false;
        }
        
        this.lote.setCodigo(this.txtCodigo.getText());
        this.lote.setDataValidade(Util.getCalendarDateFromString(this.txtValidade.getText()));
        this.lote.setDataFabricacao(Util.getCalendarDateFromString(this.txtFabricacao.getText()));
        this.lote.setEmEstoque(Integer.parseInt(this.txtEmEstoque.getText()));
        this.lote.setNasPrateleiras(Integer.parseInt(this.txtNasPrateleiras.getText()));
        
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        txtFabricacao = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmEstoque = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtNasPrateleiras = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(208, 208, 208));

        jPanel2.setBackground(new java.awt.Color(140, 71, 71));

        labelTitle.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Editar Lote");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitle)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 54, 54));
        jLabel2.setText("Código de Lote");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 54, 54));
        jLabel3.setText("Data de Validade");

        txtValidade.setBackground(new java.awt.Color(255, 255, 255));
        txtValidade.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtValidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValidade.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        txtFabricacao.setBackground(new java.awt.Color(255, 255, 255));
        txtFabricacao.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFabricacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFabricacao.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 54, 54));
        jLabel4.setText("Data de Fabricação");

        txtEmEstoque.setBackground(new java.awt.Color(255, 255, 255));
        txtEmEstoque.setForeground(new java.awt.Color(0, 0, 0));
        txtEmEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtEmEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmEstoque.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 54, 54));
        jLabel5.setText("Em Estoque");

        jPanel3.setBackground(new java.awt.Color(208, 208, 208));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemove.setBackground(new java.awt.Color(208, 208, 208));
        btnRemove.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(8, 8, 8));
        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel3.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 100, 40));

        btnSave.setBackground(new java.awt.Color(109, 46, 46));
        btnSave.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 100, 40));

        btnCancel.setBackground(new java.awt.Color(181, 181, 181));
        btnCancel.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(8, 8, 8));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        txtNasPrateleiras.setBackground(new java.awt.Color(255, 255, 255));
        txtNasPrateleiras.setForeground(new java.awt.Color(0, 0, 0));
        txtNasPrateleiras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNasPrateleiras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNasPrateleiras.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(54, 54, 54));
        jLabel6.setText("Nas Prateleiras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(txtValidade)
                    .addComponent(txtFabricacao)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNasPrateleiras, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNasPrateleiras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(this.getComponentes()){
            if(this.labelTitle.getText().equalsIgnoreCase("novo lote")){
                this.lote.setEstoque(this.estoque);
                this.estoque.getLotes().add(this.lote);
            }else if(this.labelTitle.getText().equalsIgnoreCase("editar lote")){
                this.estoque.getLotes().set(
                    this.estoque.getLotes().indexOf(toEdit), 
                    this.lote
                );
            }
            util.abrirJOptionPane("sucesso", "Lote vinculado ao produto!", this);
            this.dispose();
        }else{
            util.abrirJOptionPane("erro", "Preencha todos os campos.", this);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(util.abrirJOptionPane("confirma", "Deseja realmente remover este lote?", this)){
            if(this.estoque.getLotes().remove(this.lote)){
                util.abrirJOptionPane("sucesso", "Removido com sucesso!", this);
                this.dispose();
            }else{
                util.abrirJOptionPane("erro", "Erro ao remover lote", this);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtEmEstoque;
    private javax.swing.JFormattedTextField txtFabricacao;
    private javax.swing.JFormattedTextField txtNasPrateleiras;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}