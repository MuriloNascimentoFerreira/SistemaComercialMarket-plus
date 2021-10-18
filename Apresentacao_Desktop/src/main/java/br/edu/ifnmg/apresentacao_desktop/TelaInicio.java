/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao_desktop;

import Util.Util;
import br.edu.ifnmg.apresentacao_desktop.TelaCaixa.CaixaTela;
import br.edu.ifnmg.apresentacao_desktop.TelaPessoas.TelaPessoas;
import br.edu.ifnmg.apresentacao_desktop.TelaProduto.ProdutoTela;

/**
 *
 * @author gabriel
 */
public class TelaInicio extends javax.swing.JInternalFrame {
    private TelaPrincipal telaPrincipal;
    private  Util util;
    /**
     * Creates new form telaPrincipal
     * @param tela
     */
    public TelaInicio(TelaPrincipal tela) {
        initComponents();
        this.util = new Util();
        this.telaPrincipal = tela;
        this.labelUsuario.setText(telaPrincipal.getUsuario().getNome());
        this.labelCargoUsuario.setText("[ "+telaPrincipal.getUsuario().getUsuarioTipo().toString()+" ]");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelCargoUsuario = new javax.swing.JLabel();
        btnEncerrarSessao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelVender = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblVender = new javax.swing.JLabel();
        imgVender = new javax.swing.JLabel();
        panelEstoque = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblEstoque = new javax.swing.JLabel();
        imgEstoque = new javax.swing.JLabel();
        panelComprar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lblComprar = new javax.swing.JLabel();
        imgComprar = new javax.swing.JLabel();
        panelCrediario = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lblCrediario = new javax.swing.JLabel();
        imgCrediario = new javax.swing.JLabel();
        panelFinanceiro = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblFinanceiro = new javax.swing.JLabel();
        imgFinanceiro = new javax.swing.JLabel();
        panelPessoas = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lblPessoas = new javax.swing.JLabel();
        imgPessoas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 230, 230));

        jPanel18.setBackground(new java.awt.Color(101, 58, 58));

        jPanel19.setBackground(new java.awt.Color(120, 80, 80));
        jPanel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel20.setBackground(new java.awt.Color(107, 70, 70));

        imgUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(imgUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelUsuario.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(222, 209, 209));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("Username");

        labelCargoUsuario.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        labelCargoUsuario.setForeground(new java.awt.Color(204, 168, 168));
        labelCargoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCargoUsuario.setText("[UserType]");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(labelCargoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCargoUsuario)
                .addContainerGap())
        );

        btnEncerrarSessao.setBackground(new java.awt.Color(142, 54, 54));
        btnEncerrarSessao.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnEncerrarSessao.setForeground(new java.awt.Color(255, 255, 255));
        btnEncerrarSessao.setText("Encerrar Sessão");
        btnEncerrarSessao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEncerrarSessao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarSessaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEncerrarSessao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)
                .addComponent(btnEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(243, 230, 230));

        panelVender.setBackground(new java.awt.Color(224, 191, 191));
        panelVender.setForeground(new java.awt.Color(224, 191, 191));
        panelVender.setToolTipText("Abrir módulo de caixa");
        panelVender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelVender.setPreferredSize(new java.awt.Dimension(120, 140));
        panelVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelVenderMouseClicked(evt);
            }
        });
        panelVender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(98, 57, 57));

        lblVender.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblVender.setForeground(new java.awt.Color(255, 255, 255));
        lblVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVender.setText("VENDER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVender, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelVender.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 140, 40));

        imgVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sell.png"))); // NOI18N
        imgVender.setToolTipText("Abrir módulo de caixa");
        imgVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgVenderMouseClicked(evt);
            }
        });
        panelVender.add(imgVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 100));

        panelEstoque.setBackground(new java.awt.Color(224, 191, 191));
        panelEstoque.setForeground(new java.awt.Color(224, 191, 191));
        panelEstoque.setToolTipText("Gerir produtos, lotes e estoque");
        panelEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEstoque.setPreferredSize(new java.awt.Dimension(120, 140));
        panelEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEstoqueMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(98, 57, 57));

        lblEstoque.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lblEstoque.setText("ESTOQUE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblEstoque)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/product.png"))); // NOI18N
        imgEstoque.setToolTipText("Gerir produtos, lotes e estoque");
        imgEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgEstoqueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEstoqueLayout = new javax.swing.GroupLayout(panelEstoque);
        panelEstoque.setLayout(panelEstoqueLayout);
        panelEstoqueLayout.setHorizontalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelEstoqueLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(imgEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstoqueLayout.setVerticalGroup(
            panelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComprar.setBackground(new java.awt.Color(224, 191, 191));
        panelComprar.setForeground(new java.awt.Color(224, 191, 191));
        panelComprar.setToolTipText("Transação financeira de compra com fornecedores");
        panelComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelComprar.setPreferredSize(new java.awt.Dimension(120, 140));

        jPanel9.setBackground(new java.awt.Color(98, 57, 57));

        lblComprar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblComprar.setForeground(new java.awt.Color(255, 255, 255));
        lblComprar.setText("COMPRAR");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblComprar)
                .addGap(23, 23, 23))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier.png"))); // NOI18N
        imgComprar.setToolTipText("Transação financeira de compra com fornecedores");

        javax.swing.GroupLayout panelComprarLayout = new javax.swing.GroupLayout(panelComprar);
        panelComprar.setLayout(panelComprarLayout);
        panelComprarLayout.setHorizontalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgComprar)
                .addGap(37, 37, 37))
        );
        panelComprarLayout.setVerticalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCrediario.setBackground(new java.awt.Color(224, 191, 191));
        panelCrediario.setForeground(new java.awt.Color(224, 191, 191));
        panelCrediario.setToolTipText("Gerir crediário de clientes");
        panelCrediario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCrediario.setPreferredSize(new java.awt.Dimension(120, 140));

        jPanel15.setBackground(new java.awt.Color(98, 57, 57));

        lblCrediario.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblCrediario.setForeground(new java.awt.Color(255, 255, 255));
        lblCrediario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrediario.setText("CREDIÁRIO");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrediario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCrediario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgCrediario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crediario.png"))); // NOI18N
        imgCrediario.setToolTipText("Gerir crediário de clientes");

        javax.swing.GroupLayout panelCrediarioLayout = new javax.swing.GroupLayout(panelCrediario);
        panelCrediario.setLayout(panelCrediarioLayout);
        panelCrediarioLayout.setHorizontalGroup(
            panelCrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrediarioLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(imgCrediario)
                .addGap(26, 26, 26))
        );
        panelCrediarioLayout.setVerticalGroup(
            panelCrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrediarioLayout.createSequentialGroup()
                .addComponent(imgCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFinanceiro.setBackground(new java.awt.Color(224, 191, 191));
        panelFinanceiro.setForeground(new java.awt.Color(224, 191, 191));
        panelFinanceiro.setToolTipText("Gerir fluxo monetário");
        panelFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelFinanceiro.setPreferredSize(new java.awt.Dimension(120, 140));

        jPanel17.setBackground(new java.awt.Color(98, 57, 57));

        lblFinanceiro.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        lblFinanceiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinanceiro.setText("FINANCEIRO");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFinanceiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFinanceiro)
                .addContainerGap())
        );

        imgFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finance.png"))); // NOI18N
        imgFinanceiro.setToolTipText("Gerir fluxo monetário");

        javax.swing.GroupLayout panelFinanceiroLayout = new javax.swing.GroupLayout(panelFinanceiro);
        panelFinanceiro.setLayout(panelFinanceiroLayout);
        panelFinanceiroLayout.setHorizontalGroup(
            panelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFinanceiroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(imgFinanceiro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFinanceiroLayout.setVerticalGroup(
            panelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFinanceiroLayout.createSequentialGroup()
                .addComponent(imgFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPessoas.setBackground(new java.awt.Color(224, 191, 191));
        panelPessoas.setForeground(new java.awt.Color(224, 191, 191));
        panelPessoas.setToolTipText("Gestão de todos os indivíduos envolvidos no negócio");
        panelPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPessoas.setPreferredSize(new java.awt.Dimension(120, 140));
        panelPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPessoasMouseClicked(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(98, 57, 57));

        lblPessoas.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblPessoas.setForeground(new java.awt.Color(255, 255, 255));
        lblPessoas.setText("PESSOAS");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblPessoas)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPessoas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people.png"))); // NOI18N
        imgPessoas.setToolTipText("Gestão de todos os indivíduos envolvidos no negócio");
        imgPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPessoasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPessoasLayout = new javax.swing.GroupLayout(panelPessoas);
        panelPessoas.setLayout(panelPessoasLayout);
        panelPessoasLayout.setHorizontalGroup(
            panelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPessoasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(imgPessoas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPessoasLayout.setVerticalGroup(
            panelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPessoasLayout.createSequentialGroup()
                .addComponent(imgPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(panelVender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPessoasMouseClicked
        TelaPessoas pessoas = new TelaPessoas(this.telaPrincipal);
        if(telaPrincipal.temPermissao("TELA_PESSOAS")){
            this.telaPrincipal.renderJInternalFrame(pessoas);
        }else{
            util.abrirJOptionPane("permissao", "",this);
        }
    }//GEN-LAST:event_panelPessoasMouseClicked

    private void btnEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarSessaoActionPerformed
        this.telaPrincipal.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnEncerrarSessaoActionPerformed

    private void panelEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEstoqueMouseClicked
        if(this.telaPrincipal.temPermissao("TELA_PRODUTO")){
            ProdutoTela produtoEditar = new ProdutoTela();
            this.telaPrincipal.renderJInternalFrame(produtoEditar);
        }else{
            util.abrirJOptionPane("permissao", "",null);
        }
    }//GEN-LAST:event_panelEstoqueMouseClicked

    private void imgVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgVenderMouseClicked
        if(this.telaPrincipal.temPermissao("TELA_CAIXA")){
            CaixaTela caixaTela = new CaixaTela();
            this.telaPrincipal.renderJInternalFrame(caixaTela);
        }else{
            util.abrirJOptionPane("permissao", "",null);
        }
    }//GEN-LAST:event_imgVenderMouseClicked

    private void imgEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgEstoqueMouseClicked
        if(this.telaPrincipal.temPermissao("TELA_PRODUTO")){
            ProdutoTela produtoEditar = new ProdutoTela();
            this.telaPrincipal.renderJInternalFrame(produtoEditar);
        }else{
            util.abrirJOptionPane("permissao", "",null);
        }
    }//GEN-LAST:event_imgEstoqueMouseClicked

    private void imgPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPessoasMouseClicked
        TelaPessoas pessoas = new TelaPessoas(this.telaPrincipal);
        if(telaPrincipal.temPermissao("TELA_PESSOAS")){
            this.telaPrincipal.renderJInternalFrame(pessoas);
        }else{
            util.abrirJOptionPane("permissao", "",this);
        }
    }//GEN-LAST:event_imgPessoasMouseClicked

    private void panelVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVenderMouseClicked
        if(this.telaPrincipal.temPermissao("TELA_CAIXA")){
            CaixaTela caixaTela = new CaixaTela();
            this.telaPrincipal.renderJInternalFrame(caixaTela);
        }else{
            util.abrirJOptionPane("permissao", "",null);
        }
    }//GEN-LAST:event_panelVenderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncerrarSessao;
    private javax.swing.JLabel imgComprar;
    private javax.swing.JLabel imgCrediario;
    private javax.swing.JLabel imgEstoque;
    private javax.swing.JLabel imgFinanceiro;
    private javax.swing.JLabel imgPessoas;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel imgVender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCargoUsuario;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel lblComprar;
    private javax.swing.JLabel lblCrediario;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblFinanceiro;
    private javax.swing.JLabel lblPessoas;
    private javax.swing.JLabel lblVender;
    private javax.swing.JPanel panelComprar;
    private javax.swing.JPanel panelCrediario;
    private javax.swing.JPanel panelEstoque;
    private javax.swing.JPanel panelFinanceiro;
    private javax.swing.JPanel panelPessoas;
    private javax.swing.JPanel panelVender;
    // End of variables declaration//GEN-END:variables

    void setMaximun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
