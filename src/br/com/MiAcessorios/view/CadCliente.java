
package br.com.MiAcessorios.view;

import br.com.MiAcessorios.dao.ClienteDAO;
import br.com.MiAcessorios.model.Cliente;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class CadCliente extends javax.swing.JFrame {

    static void setSelectedIdenx(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public CadCliente() {
        initComponents();
       
        txtID.setBackground(new java.awt.Color( 0,0,0,1));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        imgFundo = new javax.swing.JLabel();
        imgFundo2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        bntCadastrar = new javax.swing.JButton();
        lblCadastrarCliente = new javax.swing.JLabel();
        bntHomr = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        txtCell = new javax.swing.JFormattedTextField();
        lblID = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        bntExcluir = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");
        setBackground(new java.awt.Color(102, 0, 204));
        setResizable(false);

        jpFundo.setBackground(new java.awt.Color(102, 0, 204));

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/Montanha2.png"))); // NOI18N

        imgFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/MiAcessorios/img/Montanha.png"))); // NOI18N

        lblNome.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        lblSobrenome.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        lblSobrenome.setText("Sobrenome:");

        txtSobrenome.setBackground(new java.awt.Color(153, 153, 255));
        txtSobrenome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEmail.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail:");

        txtEmail.setBackground(new java.awt.Color(153, 153, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCelular.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("Celular:");

        bntCadastrar.setBackground(new java.awt.Color(153, 153, 255));
        bntCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        bntCadastrar.setText("Cadastrar");
        bntCadastrar.setBorder(null);
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });

        lblCadastrarCliente.setFont(new java.awt.Font("Monospaced", 2, 36)); // NOI18N
        lblCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrarCliente.setText("Cadastrar Cliente");

        bntHomr.setBackground(new java.awt.Color(153, 153, 255));
        bntHomr.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntHomr.setForeground(new java.awt.Color(0, 0, 0));
        bntHomr.setText("Home");
        bntHomr.setBorder(null);
        bntHomr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntHomrActionPerformed(evt);
            }
        });

        lblAviso.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(0, 0, 0));
        lblAviso.setText("*Todos os campos são obrigatórios");

        txtCell.setBackground(new java.awt.Color(153, 153, 255));
        txtCell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCell.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblID.setFont(new java.awt.Font("Mongolian Baiti", 3, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID:");

        txtNome.setBackground(new java.awt.Color(153, 153, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntExcluir.setBackground(new java.awt.Color(153, 153, 255));
        bntExcluir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntExcluir.setForeground(new java.awt.Color(0, 0, 0));
        bntExcluir.setText("Excluir");
        bntExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpFundoLayout = new javax.swing.GroupLayout(jpFundo);
        jpFundo.setLayout(jpFundoLayout);
        jpFundoLayout.setHorizontalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addComponent(imgFundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSobrenome)
                    .addComponent(lblNome)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAviso)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadastrarCliente))
                .addGap(27, 27, 27)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntHomr, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblID)
                    .addComponent(lblCelular)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jpFundoLayout.setVerticalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSobrenome))
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtCell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntHomr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntHomrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntHomrActionPerformed
        // TODO add your handling code here:
        MiAcessorios tela = new MiAcessorios();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bntHomrActionPerformed

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        // TODO add your handling code here:
        
        
            Cliente cli = new Cliente();
            
            
            cli.setNome(txtID.getText());
            cli.setSobrenome(txtSobrenome.getText());
            cli.setEmail(txtEmail.getText());
            cli.setCelular(txtCell.getText());
        
            ClienteDAO dao = new ClienteDAO();
            dao.salvarCliente(cli);
        
        
        
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void bntExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntExcluirMouseClicked
        // TODO add your handling code here:
        Cliente cli = new Cliente();
        
        cli.setId(parseInt(txtID.getText()));
        ClienteDAO dao = new ClienteDAO();
        dao.deletarCliente(cli.getId());
    }//GEN-LAST:event_bntExcluirMouseClicked

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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    public javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntHomr;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel imgFundo2;
    private javax.swing.JPanel jpFundo;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblCadastrarCliente;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    public javax.swing.JFormattedTextField txtCell;
    public javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNome;
    public javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables

    void setSelectIdex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
