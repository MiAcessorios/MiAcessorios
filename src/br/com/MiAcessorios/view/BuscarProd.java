
package br.com.MiAcessorios.view;

import br.com.MiAcessorios.dao.ProdutoDAO;
import br.com.MiAcessorios.model.Produto;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class BuscarProd extends javax.swing.JFrame {

   
    public BuscarProd() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
    }

        public void buscar(){
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produto = dao.listarProduto(parseInt(txtBuscarProd.getText()));
        DefaultTableModel dados = (DefaultTableModel) tbProduto.getModel();
        dados.setNumRows(0);
        
        for (Produto produtos : produto) {
            dados.addRow(new Object[]{
                produtos.getId(),
                produtos.getProduto(),
                produtos.getQuantidade(),
                produtos.getPreco()
            });
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBuscarProd = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBuscarProd = new javax.swing.JLabel();
        txtBuscarProd = new javax.swing.JTextField();
        bntPesquisar = new javax.swing.JButton();
        bntLimparP = new javax.swing.JButton();
        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jpBotoes = new javax.swing.JPanel();
        bntExcluirProd = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        tabHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Produto");
        setResizable(false);

        jpBuscarProd.setBackground(new java.awt.Color(153, 0, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lblBuscarProd.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBuscarProd.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarProd.setText("Buscar Produto:");

        txtBuscarProd.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntPesquisar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bntPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        bntPesquisar.setText("Pesquisar");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });

        bntLimparP.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bntLimparP.setForeground(new java.awt.Color(0, 0, 0));
        bntLimparP.setText("Limpar");
        bntLimparP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(lblBuscarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntLimparP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarProd)
                    .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntLimparP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        javax.swing.GroupLayout jpTabelaLayout = new javax.swing.GroupLayout(jpTabela);
        jpTabela.setLayout(jpTabelaLayout);
        jpTabelaLayout.setHorizontalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpTabelaLayout.setVerticalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        jpBotoes.setBackground(new java.awt.Color(153, 0, 255));
        jpBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bntExcluirProd.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntExcluirProd.setForeground(new java.awt.Color(0, 0, 0));
        bntExcluirProd.setText("Excluir");

        bntExcluir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntExcluir.setForeground(new java.awt.Color(0, 0, 0));
        bntExcluir.setText("Editar");

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntExcluirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpBotoesLayout.setVerticalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(bntExcluirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabHome.setBackground(new java.awt.Color(153, 0, 255));
        tabHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHomeMouseClicked(evt);
            }
        });

        lblHome.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(0, 0, 0));
        lblHome.setText("Home");

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblHome)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBuscarProdLayout = new javax.swing.GroupLayout(jpBuscarProd);
        jpBuscarProd.setLayout(jpBuscarProdLayout);
        jpBuscarProdLayout.setHorizontalGroup(
            jpBuscarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBuscarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBuscarProdLayout.createSequentialGroup()
                        .addComponent(tabHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpBuscarProdLayout.setVerticalGroup(
            jpBuscarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntLimparPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparPActionPerformed
        // TODO add your handling code here:
        txtBuscarProd.setText(" ");
        
    }//GEN-LAST:event_bntLimparPActionPerformed

    private void tabHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHomeMouseClicked
        // TODO add your handling code here:
        MiAcessorios tela = new MiAcessorios();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_tabHomeMouseClicked

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        // TODO add your handling code here:
        buscar();
        
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbProdutoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
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
            java.util.logging.Logger.getLogger(BuscarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntExcluir;
    public javax.swing.JButton bntExcluirProd;
    public javax.swing.JButton bntLimparP;
    public javax.swing.JButton bntPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpBuscarProd;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JLabel lblBuscarProd;
    private javax.swing.JLabel lblHome;
    private javax.swing.JPanel tabHome;
    private javax.swing.JTable tbProduto;
    public javax.swing.JTextField txtBuscarProd;
    // End of variables declaration//GEN-END:variables
}
