/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static java.lang.System.exit;
import javax.swing.JPanel;

/**
 *
 * @author dener
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        cadastrarProduto = new javax.swing.JMenuItem();
        cadastrarVenda = new javax.swing.JMenuItem();
        cadastrarTipoDeProduto = new javax.swing.JMenuItem();
        cadastrarCategoriaDeProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        listarCliente = new javax.swing.JMenuItem();
        listarProdutos = new javax.swing.JMenuItem();
        listarVenda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");

        cadastrarCliente.setText("Cliente");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarCliente);

        cadastrarProduto.setText("Produto");
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarProduto);

        cadastrarVenda.setText("Venda");
        cadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarVendaActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarVenda);

        cadastrarTipoDeProduto.setText("Tipo de Produto");
        cadastrarTipoDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTipoDeProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarTipoDeProduto);

        cadastrarCategoriaDeProduto.setText("Categoria De Produto");
        cadastrarCategoriaDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCategoriaDeProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarCategoriaDeProduto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listar");

        listarCliente.setText("Clientes");
        listarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(listarCliente);

        listarProdutos.setText("Produtos");
        listarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(listarProdutos);

        listarVenda.setText("Vendas");
        listarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarVendaActionPerformed(evt);
            }
        });
        jMenu2.add(listarVenda);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Janela");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        this.updateView(new CadastrarCliente(this));
    }//GEN-LAST:event_cadastrarClienteActionPerformed
    
    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        this.updateView(new CadastrarProdutoView(this));
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void cadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarVendaActionPerformed
        this.updateView(new CadastrarVendaView(this));
    }//GEN-LAST:event_cadastrarVendaActionPerformed

    private void cadastrarTipoDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTipoDeProdutoActionPerformed
        this.updateView(new CadastrarTipoDeProdutoView(this));
    }//GEN-LAST:event_cadastrarTipoDeProdutoActionPerformed

    private void listarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClienteActionPerformed
        this.updateView(new ListarClientesView(this));
    }//GEN-LAST:event_listarClienteActionPerformed

    private void listarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosActionPerformed
        this.updateView(new ListarProdutosView(this));
    }//GEN-LAST:event_listarProdutosActionPerformed

    private void listarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarVendaActionPerformed
        this.updateView(new ListarVendasView(this));
    }//GEN-LAST:event_listarVendaActionPerformed

    private void cadastrarCategoriaDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCategoriaDeProdutoActionPerformed
        this.updateView(new CadastrarCategoriaDeProdutoView(this));
    }//GEN-LAST:event_cadastrarCategoriaDeProdutoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void updateView(JPanel viewPanel) {
        this.setContentPane(viewPanel);
        this.invalidate();
        this.validate();
    }
    
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarCategoriaDeProduto;
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarProduto;
    private javax.swing.JMenuItem cadastrarTipoDeProduto;
    private javax.swing.JMenuItem cadastrarVenda;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem listarCliente;
    private javax.swing.JMenuItem listarProdutos;
    private javax.swing.JMenuItem listarVenda;
    // End of variables declaration//GEN-END:variables
}
