/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Main.MainClass;
import Classes.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kelok
 */
public class CheckAppointment extends javax.swing.JFrame implements ITableUpdate {

    Statement stmt = null;
    Connection con = null;
    ResultSet rs = null;
    Vet vet = new Vet();

    public CheckAppointment() {
        initComponents();
        setLocationRelativeTo(null);
        updateJTable();
        vetLabel.setText("Hello " + MainClass.passed_VetName + ", here are your appointments: ");
    }

    @Override
    public final void updateJTable() {
        String query = "SELECT Appointment.Customer, Appointment.Pet, Appointment.Date, Appointment.Time, Pet.Diagnosis FROM Appointment INNER JOIN Pet ON Appointment.Pet = Pet.ID WHERE Vet = '" + MainClass.passed_VetID + "'";
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            vetAppJTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        vetAppJTable = new javax.swing.JTable();
        vetLabel = new javax.swing.JLabel();
        vetNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagTextArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        petNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Appointments");

        vetAppJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        vetAppJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vetAppJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vetAppJTable);

        vetLabel.setText("Hello Vet, here are your appointments: ");

        vetNameLabel.setText(" ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter pet diagnosis/prognosis "));

        diagTextArea.setColumns(20);
        diagTextArea.setRows(5);
        jScrollPane2.setViewportView(diagTextArea);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Customer name:");

        custNameLabel.setText(" ");

        jLabel3.setText("Pet name:");

        petNameLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vetNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(custNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(petNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vetNameLabel)
                    .addComponent(vetLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(custNameLabel)
                    .addComponent(jLabel3)
                    .addComponent(petNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vetAppJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vetAppJTableMouseClicked
        // TODO add your handling code here:
        int row = vetAppJTable.getSelectedRow();
        String cust_id = vetAppJTable.getModel().getValueAt(row, 0).toString();
        String query = "SELECT Pet.OwnerID, Pet.Fullname, Pet.Diagnosis, Customer.ID, Customer.Fullname FROM Pet INNER JOIN Customer ON Pet.OwnerID = Customer.ID WHERE Pet.OwnerID = '" + cust_id + "'";
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                custNameLabel.setText(rs.getString("Customer.Fullname"));
                petNameLabel.setText(rs.getString("Pet.Fullname"));
                diagTextArea.setText(rs.getString("Pet.Diagnosis"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_vetAppJTableMouseClicked

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String diagnosis = diagTextArea.getText();
        vet.submitDiagnosis(vetAppJTable, diagnosis);
        updateJTable();
    }//GEN-LAST:event_submitButtonActionPerformed


//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CheckAppointment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JTextArea diagTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel petNameLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable vetAppJTable;
    private javax.swing.JLabel vetLabel;
    public static javax.swing.JLabel vetNameLabel;
    // End of variables declaration//GEN-END:variables
}
