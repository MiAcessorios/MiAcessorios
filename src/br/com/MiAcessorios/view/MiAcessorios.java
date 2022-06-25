
package br.com.MiAcessorios.view;

import java.awt.Color;


public class MiAcessorios extends javax.swing.JFrame {

    
    public MiAcessorios() {
        initComponents();
       
        jpMenu.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTabs = new javax.swing.JPanel();
        jpMenuTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgMenu = new javax.swing.JLabel();
        lblMiAcessorios = new javax.swing.JLabel();
        jpFundoPrinci = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        tabCadCliente = new javax.swing.JPanel();
        lblCadCliente = new javax.swing.JLabel();
        tabCadProd = new javax.swing.JPanel();
        lblCadProduto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBuscarCli = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBuscarProd = new javax.swing.JLabel();
        jpMainProdutos = new javax.swing.JPanel();
        jpProdutos = new javax.swing.JPanel();
        jpProdutos1 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        jpImgProd = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 255));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 565));
        setResizable(false);

        jpTabs.setBackground(new java.awt.Color(153, 0, 255));
        jpTabs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpMenuTab.setBackground(new java.awt.Color(153, 0, 255));
        jpMenuTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpMenuTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMenuTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMenuTabMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menu");

        imgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/menu-3x.png"))); // NOI18N

        javax.swing.GroupLayout jpMenuTabLayout = new javax.swing.GroupLayout(jpMenuTab);
        jpMenuTab.setLayout(jpMenuTabLayout);
        jpMenuTabLayout.setHorizontalGroup(
            jpMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        jpMenuTabLayout.setVerticalGroup(
            jpMenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(imgMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblMiAcessorios.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 48)); // NOI18N
        lblMiAcessorios.setForeground(new java.awt.Color(255, 255, 255));
        lblMiAcessorios.setText("Mi Acessórios");
        lblMiAcessorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMiAcessorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiAcessoriosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpTabsLayout = new javax.swing.GroupLayout(jpTabs);
        jpTabs.setLayout(jpTabsLayout);
        jpTabsLayout.setHorizontalGroup(
            jpTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMenuTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMiAcessorios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTabsLayout.setVerticalGroup(
            jpTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jpMenuTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jpTabsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMiAcessorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpFundoPrinci.setBackground(new java.awt.Color(153, 0, 255));
        jpFundoPrinci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpMenu.setBackground(new java.awt.Color(153, 0, 255));
        jpMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabCadCliente.setBackground(new java.awt.Color(153, 0, 255));
        tabCadCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabCadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCadClienteMouseClicked(evt);
            }
        });

        lblCadCliente.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCadCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCadCliente.setText("Cadastro Cliente");

        javax.swing.GroupLayout tabCadClienteLayout = new javax.swing.GroupLayout(tabCadCliente);
        tabCadCliente.setLayout(tabCadClienteLayout);
        tabCadClienteLayout.setHorizontalGroup(
            tabCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadClienteLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblCadCliente)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        tabCadClienteLayout.setVerticalGroup(
            tabCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        tabCadProd.setBackground(new java.awt.Color(153, 0, 255));
        tabCadProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabCadProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCadProdMouseClicked(evt);
            }
        });

        lblCadProduto.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCadProduto.setForeground(new java.awt.Color(0, 0, 0));
        lblCadProduto.setText("Cadastro Produto");

        javax.swing.GroupLayout tabCadProdLayout = new javax.swing.GroupLayout(tabCadProd);
        tabCadProd.setLayout(tabCadProdLayout);
        tabCadProdLayout.setHorizontalGroup(
            tabCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabCadProdLayout.setVerticalGroup(
            tabCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        lblBuscarCli.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblBuscarCli.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarCli.setText("Buscar Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBuscarCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        lblBuscarProd.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblBuscarProd.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarProd.setText("Buscar Produto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBuscarProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tabCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tabCadProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMainProdutos.setBackground(new java.awt.Color(153, 0, 255));
        jpMainProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpProdutos.setBackground(new java.awt.Color(153, 0, 255));
        jpProdutos.setLayout(new javax.swing.OverlayLayout(jpProdutos));

        jpProdutos1.setBackground(new java.awt.Color(153, 0, 255));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/6ca8edb8-01d6-44b9-b76f-e8e5f5a85b8b.jpg"))); // NOI18N

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/9f933f1d-c35c-413b-8264-f0b44b9f1be1.jpg"))); // NOI18N

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/69f5dbe5-9a4d-486b-96ce-c142eaa83763.jpg"))); // NOI18N

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/197902ef-aeb2-4589-a8c2-5a75df4a3da2.jpg"))); // NOI18N

        javax.swing.GroupLayout jpProdutos1Layout = new javax.swing.GroupLayout(jpProdutos1);
        jpProdutos1.setLayout(jpProdutos1Layout);
        jpProdutos1Layout.setHorizontalGroup(
            jpProdutos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProdutos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jpProdutos1Layout.setVerticalGroup(
            jpProdutos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProdutos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpProdutos1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpProdutos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img4)
                    .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpProdutos.add(jpProdutos1);

        javax.swing.GroupLayout jpMainProdutosLayout = new javax.swing.GroupLayout(jpMainProdutos);
        jpMainProdutos.setLayout(jpMainProdutosLayout);
        jpMainProdutosLayout.setHorizontalGroup(
            jpMainProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainProdutosLayout.createSequentialGroup()
                .addComponent(jpProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpMainProdutosLayout.setVerticalGroup(
            jpMainProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpImgProd.setBackground(new java.awt.Color(255, 255, 255));
        jpImgProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpImgProdLayout = new javax.swing.GroupLayout(jpImgProd);
        jpImgProd.setLayout(jpImgProdLayout);
        jpImgProdLayout.setHorizontalGroup(
            jpImgProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpImgProdLayout.setVerticalGroup(
            jpImgProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpFundoPrinciLayout = new javax.swing.GroupLayout(jpFundoPrinci);
        jpFundoPrinci.setLayout(jpFundoPrinciLayout);
        jpFundoPrinciLayout.setHorizontalGroup(
            jpFundoPrinciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoPrinciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFundoPrinciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpImgProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpFundoPrinciLayout.createSequentialGroup()
                        .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpMainProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpFundoPrinciLayout.setVerticalGroup(
            jpFundoPrinciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoPrinciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFundoPrinciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpMainProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpImgProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpFundoPrinci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFundoPrinci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpMenuTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenuTabMouseClicked
        // TODO add your handling code here:
        jpMenuTab.setBackground(Color.white);
        
        jpMenu.setVisible(true);
        
    }//GEN-LAST:event_jpMenuTabMouseClicked

    private void lblMiAcessoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiAcessoriosMouseClicked
        // TODO add your handling code here:
         jpMenuTab.setBackground(new Color(153,0,255));
        
        jpMenu.setVisible(false);
    }//GEN-LAST:event_lblMiAcessoriosMouseClicked

    private void tabCadClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCadClienteMouseClicked
        // TODO add your handling code here:
        CadCliente tela = new CadCliente();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_tabCadClienteMouseClicked

    private void tabCadProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCadProdMouseClicked
        // TODO add your handling code here:
        CadProduto tela = new CadProduto();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_tabCadProdMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        BuscarCli tela = new BuscarCli();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        BuscarProd tela = new BuscarProd();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jPanel2MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MiAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiAcessorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel imgMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpFundoPrinci;
    private javax.swing.JPanel jpImgProd;
    private javax.swing.JPanel jpMainProdutos;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpMenuTab;
    private javax.swing.JPanel jpProdutos;
    private javax.swing.JPanel jpProdutos1;
    private javax.swing.JPanel jpTabs;
    private javax.swing.JLabel lblBuscarCli;
    private javax.swing.JLabel lblBuscarProd;
    private javax.swing.JLabel lblCadCliente;
    private javax.swing.JLabel lblCadProduto;
    private javax.swing.JLabel lblMiAcessorios;
    private javax.swing.JPanel tabCadCliente;
    private javax.swing.JPanel tabCadProd;
    // End of variables declaration//GEN-END:variables
}
