/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javacadastro;

import DAO.fornecedoreDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import entidade.fornecedores;
import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class listaFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form listaFornecedor
     */
    public listaFornecedor() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        listaBnt = new javax.swing.JButton();
        SairBnt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nome", "telefone", "empresa", "produto"
            }
        ));
        tabelaFornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaFornecedorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabelaFornecedorMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedor);

        listaBnt.setText("Listar");
        listaBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaBntActionPerformed(evt);
            }
        });

        SairBnt.setText("Sair");
        SairBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairBntActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tabela Fornecedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(listaBnt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(SairBnt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaBnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SairBnt)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaBntActionPerformed
        // TODO add your handling code here:
        listaFornecedor();
    }//GEN-LAST:event_listaBntActionPerformed

    private void tabelaFornecedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaFornecedorMouseExited

    private void SairBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairBntActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SairBntActionPerformed

    private void tabelaFornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaFornecedorAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaFornecedorAncestorAdded

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
            java.util.logging.Logger.getLogger(listaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                listaFornecedor lista = new listaFornecedor();
                lista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SairBnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaBnt;
    private javax.swing.JTable tabelaFornecedor;
    // End of variables declaration//GEN-END:variables

    private void listaFornecedor() {
        fornecedoreDAO fornecedor = new fornecedoreDAO();
        DefaultTableModel model = (DefaultTableModel) tabelaFornecedor.getModel();
        model.setNumRows(0);

        ArrayList<fornecedores> lista = fornecedor.listarFornecedores();

        for (int num = 0; num < lista.size(); num++) {
            model.addRow(new Object[]{
                lista.get(num).getIdfornecedor(),
                lista.get(num).getNome(),
                lista.get(num).getTelefone(),
                lista.get(num).getEmpresa(),
                lista.get(num).getProduto()
            });
        }
    }

}