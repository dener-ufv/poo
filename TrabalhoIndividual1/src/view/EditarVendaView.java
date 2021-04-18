/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.VendaController;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import model.entities.QuantidadeDeProduto;
import model.entities.StatusDaVenda;
import model.entities.Venda;
import persistence.dao.EstoqueDAO;
import persistence.dao.VendaDAO;

/**
 *
 * @author dener
 */
public class EditarVendaView extends javax.swing.JPanel {

    private final DefaultListModel<String> modelProdutos;
    private final MainView context;
    private final Venda venda;
    private final VendaController vendaController;
    
    /**
     * Creates new form EditarVendaView
     */
    public EditarVendaView(MainView context, Venda venda) {
        initComponents();
        
        this.context = context;
        this.venda = venda;
        
        modelProdutos = new DefaultListModel<>();
        this.produtos.setModel(modelProdutos);
        
        for(QuantidadeDeProduto q : venda.getItems()) {
            this.modelProdutos.addElement(q.getQuantidade() + "x - " + q.getProduto().getNome());
        }
        
        this.vendaController = new VendaController(new VendaDAO(), new EstoqueDAO());
        
        this.status.removeAllItems();
        this.status.addItem("PENDENTE");
        this.status.addItem("EM ANDAMENTO");
        this.status.addItem("ENTREGUE");
        
        if(this.venda.getStatus() == StatusDaVenda.PENDENTE) this.status.setSelectedIndex(0);
        else if(this.venda.getStatus() == StatusDaVenda.EM_ANDAMENTO) this.status.setSelectedIndex(1);
        else this.status.setSelectedIndex(2);
        
        this.nome.setText(this.venda.getCliente().getNome());
        this.endereco.setText(this.venda.getEndereco().getRua() + " - " + this.venda.getEndereco().getNumero());
        this.data.setText(this.venda.getData().getDate() + "/" + (this.venda.getData().getMonth()+1) + "/" + (this.venda.getData().getYear()+1900));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        salvar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Venda");

        jLabel2.setText("Nome do cliente:");

        nome.setText("jLabel3");

        jLabel4.setText("Endereço do cliente:");

        endereco.setText("jLabel5");

        produtos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(produtos);

        jLabel6.setText("Produtos:");

        jLabel7.setText("Data:");

        data.setText("jLabel8");

        jLabel9.setText("Status:");

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salvar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(status, 0, 159, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(salvar)
                .addGap(0, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(this.status.getSelectedIndex() == 0) {
            this.vendaController.editarStatusVenda(venda, StatusDaVenda.PENDENTE);
        } else if(this.status.getSelectedIndex() == 1) {
            this.vendaController.editarStatusVenda(venda, StatusDaVenda.EM_ANDAMENTO);
        } else {
            this.vendaController.editarStatusVenda(venda, StatusDaVenda.ENTREGUE);
        }
        
        new AlertMessage("Editar Venda", "Venda Editada");
        this.context.updateView(new JPanel());
    }//GEN-LAST:event_salvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JList<String> produtos;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
