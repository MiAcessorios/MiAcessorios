
package br.com.MiAcessorios.view;

import br.com.MiAcessorios.dao.ProdutoDAO;
import br.com.MiAcessorios.model.Produto;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class CadProduto extends javax.swing.JFrame {

   
    public CadProduto() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        imgMontanha1 = new javax.swing.JLabel();
        imgMontanha2 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblProd = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblCadastrarProd = new javax.swing.JLabel();
        lblQTD = new javax.swing.JLabel();
        jspQTD = new javax.swing.JSpinner();
        lblPreco = new javax.swing.JLabel();
        bntExcluir = new javax.swing.JButton();
        bntCadastar = new javax.swing.JButton();
        bntHome = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        bntEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Produto");
        setResizable(false);

        jpFundo.setBackground(new java.awt.Color(102, 0, 204));

        imgMontanha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/Montanha2.png"))); // NOI18N

        imgMontanha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/Montanha.png"))); // NOI18N

        lblID.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID:");

        txtID.setBackground(new java.awt.Color(153, 153, 255));
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProd.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblProd.setForeground(new java.awt.Color(255, 255, 255));
        lblProd.setText("Produto:");

        txtProduto.setBackground(new java.awt.Color(153, 153, 255));
        txtProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCadastrarProd.setFont(new java.awt.Font("Mongolian Baiti", 2, 36)); // NOI18N
        lblCadastrarProd.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrarProd.setText("Cadastrar Produto");

        lblQTD.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblQTD.setForeground(new java.awt.Color(255, 255, 255));
        lblQTD.setText("QTD:");

        jspQTD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jspQTD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblPreco.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Preço:");

        bntExcluir.setBackground(new java.awt.Color(153, 153, 255));
        bntExcluir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntExcluir.setForeground(new java.awt.Color(0, 0, 0));
        bntExcluir.setText("Excluir");

        bntCadastar.setBackground(new java.awt.Color(153, 153, 255));
        bntCadastar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntCadastar.setForeground(new java.awt.Color(0, 0, 0));
        bntCadastar.setText("Cadastrar");
        bntCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastarActionPerformed(evt);
            }
        });

        bntHome.setBackground(new java.awt.Color(153, 153, 255));
        bntHome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntHome.setForeground(new java.awt.Color(0, 0, 0));
        bntHome.setText("Home");
        bntHome.setBorder(null);
        bntHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntHomeActionPerformed(evt);
            }
        });

        txtPreco.setBackground(new java.awt.Color(153, 153, 255));
        txtPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntEditar.setBackground(new java.awt.Color(153, 153, 255));
        bntEditar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntEditar.setForeground(new java.awt.Color(0, 0, 0));
        bntEditar.setText("Editar");
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFundoLayout = new javax.swing.GroupLayout(jpFundo);
        jpFundo.setLayout(jpFundoLayout);
        jpFundoLayout.setHorizontalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addComponent(imgMontanha1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgMontanha2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProd)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco)
                    .addComponent(jspQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQTD)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addComponent(bntCadastar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntHome, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jpFundoLayout.setVerticalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblQTD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProd)
                    .addComponent(lblPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bntEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgMontanha2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgMontanha1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntHomeActionPerformed
        // TODO add your handling code here:
        MiAcessorios tela = new MiAcessorios();
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_bntHomeActionPerformed

    private void bntCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastarActionPerformed
        // TODO add your handling code here:
        Produto prod = new Produto();
        prod.setProduto(txtProduto.getText());
        prod.setQuantidade((int) jspQTD.getValue());
        prod.setPreco(parseDouble(txtPreco.getText()));
        
        
        ProdutoDAO dao = new ProdutoDAO(prod);
        dao.cadastrar(prod);
        
    }//GEN-LAST:event_bntCadastarActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
        // TODO add your handling code here:
        Produto prod = new Produto();
        
        
        prod.setProduto(txtProduto.getText());
        prod.setQuantidade((int)(jspQTD.getValue()));
        prod.setPreco(parseDouble(txtPreco.getText()));
       
        
        ProdutoDAO dao = new ProdutoDAO(prod);
        dao.editarProduto(prod);
        
    }//GEN-LAST:event_bntEditarActionPerformed

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
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntCadastar;
    public javax.swing.JButton bntEditar;
    public javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntHome;
    private javax.swing.JLabel imgMontanha1;
    private javax.swing.JLabel imgMontanha2;
    private javax.swing.JPanel jpFundo;
    public javax.swing.JSpinner jspQTD;
    private javax.swing.JLabel lblCadastrarProd;
    private javax.swing.JLabel lblID;
    public javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblQTD;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtPreco;
    public javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
