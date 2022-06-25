
package br.com.MiAcessorios.view;

import br.com.MiAcessorios.dao.ClienteDAO;
import br.com.MiAcessorios.model.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class BuscarCli extends javax.swing.JFrame {

    
    public BuscarCli() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
        
    }
    
    public void listar(){
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel)tbClientes.getModel();
        dados.setNumRows(0);
        
        for (Cliente cliente : clientes) {
            dados.addRow(new Object[]{
               cliente.getId(),
               cliente.getNome(),
               cliente.getSobrenome(),
               cliente.getEmail(),
               cliente.getCelular()
            });
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundoBuscarCli = new javax.swing.JPanel();
        jpBuscarCli = new javax.swing.JPanel();
        lblBuscarCli = new javax.swing.JLabel();
        txtBuscarCli = new javax.swing.JTextField();
        bntPesquisarCli = new javax.swing.JButton();
        bntLimparCli = new javax.swing.JButton();
        jpTabelaCli = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jpBotoes = new javax.swing.JPanel();
        bntExcluirCli = new javax.swing.JButton();
        bntEditarCli = new javax.swing.JButton();
        tabHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpFundoBuscarCli.setBackground(new java.awt.Color(153, 0, 255));

        jpBuscarCli.setBackground(new java.awt.Color(153, 0, 255));
        jpBuscarCli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblBuscarCli.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBuscarCli.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarCli.setText("Buscar Cliente:");

        txtBuscarCli.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarCli.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntPesquisarCli.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bntPesquisarCli.setForeground(new java.awt.Color(0, 0, 0));
        bntPesquisarCli.setText("Pesquisar");

        bntLimparCli.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bntLimparCli.setForeground(new java.awt.Color(0, 0, 0));
        bntLimparCli.setText("Limpar");
        bntLimparCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBuscarCliLayout = new javax.swing.GroupLayout(jpBuscarCli);
        jpBuscarCli.setLayout(jpBuscarCliLayout);
        jpBuscarCliLayout.setHorizontalGroup(
            jpBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarCliLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(lblBuscarCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntPesquisarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntLimparCli, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jpBuscarCliLayout.setVerticalGroup(
            jpBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarCliLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarCli)
                    .addComponent(bntPesquisarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntLimparCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome", "E-mail", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        javax.swing.GroupLayout jpTabelaCliLayout = new javax.swing.GroupLayout(jpTabelaCli);
        jpTabelaCli.setLayout(jpTabelaCliLayout);
        jpTabelaCliLayout.setHorizontalGroup(
            jpTabelaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpTabelaCliLayout.setVerticalGroup(
            jpTabelaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        jpBotoes.setBackground(new java.awt.Color(153, 0, 255));
        jpBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bntExcluirCli.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntExcluirCli.setForeground(new java.awt.Color(0, 0, 0));
        bntExcluirCli.setText("Excluir");

        bntEditarCli.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntEditarCli.setForeground(new java.awt.Color(0, 0, 0));
        bntEditarCli.setText("Editar");

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntExcluirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEditarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jpBotoesLayout.setVerticalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntEditarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(bntExcluirCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblHome)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpFundoBuscarCliLayout = new javax.swing.GroupLayout(jpFundoBuscarCli);
        jpFundoBuscarCli.setLayout(jpFundoBuscarCliLayout);
        jpFundoBuscarCliLayout.setHorizontalGroup(
            jpFundoBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoBuscarCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFundoBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTabelaCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpFundoBuscarCliLayout.createSequentialGroup()
                        .addComponent(tabHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpFundoBuscarCliLayout.setVerticalGroup(
            jpFundoBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoBuscarCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jpTabelaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundoBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundoBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntLimparCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparCliActionPerformed
        // TODO add your handling code here:
        txtBuscarCli.setText(" ");
        
    }//GEN-LAST:event_bntLimparCliActionPerformed

    private void tabHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHomeMouseClicked
        // TODO add your handling code here:
        MiAcessorios tela = new MiAcessorios();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_tabHomeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listar();
     
    }//GEN-LAST:event_formWindowActivated

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        // TODO add your handling code here:
        CadCliente tela = new CadCliente();
        tela.setVisible(true);
        tela.txtID.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 0).toString());
        tela.txtNome.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 1).toString());
        tela.txtSobrenome.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 2).toString());
        tela.txtEmail.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 3).toString());
        tela.txtCell.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 4).toString());
       
     

    }//GEN-LAST:event_tbClientesMouseClicked

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
            java.util.logging.Logger.getLogger(BuscarCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEditarCli;
    private javax.swing.JButton bntExcluirCli;
    private javax.swing.JButton bntLimparCli;
    private javax.swing.JButton bntPesquisarCli;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpBuscarCli;
    private javax.swing.JPanel jpFundoBuscarCli;
    private javax.swing.JPanel jpTabelaCli;
    private javax.swing.JLabel lblBuscarCli;
    private javax.swing.JLabel lblHome;
    private javax.swing.JPanel tabHome;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBuscarCli;
    // End of variables declaration//GEN-END:variables
}
