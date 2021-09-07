/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao_desktop.TelaProduto;

import Util.Util;
import br.edu.ifnmg.auxiliares.Estoque;
import br.edu.ifnmg.auxiliares.Lote;
import br.edu.ifnmg.enums.LocalizacaoProduto;
import br.edu.ifnmg.enums.UnidadeMedida;
import br.edu.ifnmg.logicaAplicacao.Produto;
import br.edu.ifnmg.logicaAplicacao.ProdutoRepositorio;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel
 */
public class ProdutoEditar extends javax.swing.JInternalFrame {

    private Produto produto;
    private Estoque estoque;
    private Lote lote;
    private ProdutoRepositorio produtoRepositorio;
    private Util util;
    
    /**
     * Creates new form ProdutoEditar
     */
    public ProdutoEditar() {
        initComponents();
        this.lote = new Lote();
        this.estoque = new Estoque(lote);
        this.produto = new Produto(estoque);
        this.produtoRepositorio = RepositorioFactory.getProdutoRepositorio();
        this.util = new Util();
        this.buscarProduto();
        setComponentes();
    }

    private void setComponentes(){
        for(LocalizacaoProduto segmento: LocalizacaoProduto.values()){
            this.comboLocalizacaoProduto.addItem(segmento.toString());
        }
        
        for(UnidadeMedida unidadeMedida: UnidadeMedida.values()){
            this.comboUnidadeVenda.addItem(unidadeMedida.toString());
        }
    }
    
    private void buscarProduto(){
        
        this.produto.setNome(this.txtNome.getText());    
        
        LocalizacaoProduto filter = null;
        for(LocalizacaoProduto local: LocalizacaoProduto.values()){
            if(this.comboLocalizacaoProduto.getSelectedItem().equals(local.toString())){
                filter = local;
                break;
            }
        }
        estoque.setLocalizacaoProduto(filter);
        
        UnidadeMedida filter2 = null;
        for(UnidadeMedida unidade: UnidadeMedida.values()){
            if(this.comboUnidadeVenda.getSelectedItem().equals(unidade.toString())){
                filter2 = unidade;
                break;
            }
        }
        produto.setUnidadeMedidaVenda(filter2);
        
        List<Produto> resultado = this.produtoRepositorio.Buscar(produto);
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("#");
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Descrição");
        modelo.addColumn("QTDE. nas Prateleiras");
        modelo.addColumn("QTDE. Mínima para Atacado");
        modelo.addColumn("UND. de Compra");
        modelo.addColumn("UND. de Venda");
        modelo.addColumn("VAL. para Verejo");
        modelo.addColumn("VAL. para Atacado");
        modelo.addColumn("VAL. de Compra");
        modelo.addColumn("Localização");
        modelo.addColumn("QTDE. em Estoque");
        modelo.addColumn("QTDE. MÍN. em Estoque");
        modelo.addColumn("Data de Vencimento");
        
        for(int i=0;i<resultado.size(); i++){
            Vector linha = new Vector();
            
            linha.add((i+1));
            linha.add(resultado.get(i).getId());
            linha.add(resultado.get(i).getNome());
            linha.add(resultado.get(i).getDescricao());
            linha.add(resultado.get(i).getQuantidadePrateleira());
            linha.add(resultado.get(i).getMinimoParaAtacado());
            linha.add(resultado.get(i).getUnidadeMedidaCusto());
            linha.add(resultado.get(i).getUnidadeMedidaVenda());
            linha.add(resultado.get(i).getValorVarejo());
            linha.add(resultado.get(i).getValorAtacado());
            linha.add(resultado.get(i).getValorCusto());
            linha.add(resultado.get(i).getEstoque().getLocalizacaoProduto());
            linha.add(resultado.get(i).getEstoque().getLote().getQuantidade());
            linha.add(resultado.get(i).getEstoque().getQuantidadeMinimaDesejada());
            linha.add(Util.getStringDateFromCalendar(resultado.get(i).getEstoque().getLote().getDataValidade()));
            modelo.addRow(linha);
        }
        tblResultadoProdutos.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultadoProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboLocalizacaoProduto = new javax.swing.JComboBox<>();
        comboUnidadeVenda = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(208, 208, 208));
        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(208, 208, 208));

        jPanel3.setBackground(new java.awt.Color(140, 71, 71));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestão de Produtos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(208, 208, 208));

        tblResultadoProdutos.setBackground(new java.awt.Color(255, 255, 255));
        tblResultadoProdutos.setForeground(new java.awt.Color(0, 0, 0));
        tblResultadoProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null", "null", "null", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultadoProdutos);

        jButton1.setBackground(new java.awt.Color(109, 46, 46));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(208, 208, 208));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(8, 8, 8));
        jButton2.setText("Busca Avançada");

        jButton3.setBackground(new java.awt.Color(181, 181, 181));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(8, 8, 8));
        jButton3.setText("Novo Produto");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(8, 8, 8));
        jLabel2.setText("Nome:");

        comboLocalizacaoProduto.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        comboLocalizacaoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        comboUnidadeVenda.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        comboUnidadeVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(8, 8, 8));
        jLabel3.setText("Unidade de Venda:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(8, 8, 8));
        jLabel4.setText("Local:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(comboUnidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboLocalizacaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboLocalizacaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUnidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.buscarProduto();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboLocalizacaoProduto;
    private javax.swing.JComboBox<String> comboUnidadeVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultadoProdutos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}