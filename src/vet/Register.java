/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kelok
 */
public class Register extends javax.swing.JFrame {

    Statement stmt = null;
    Connection con = null;
    ResultSet rs = null;

    private void UpdateJTable() {
        String query = "SELECT * FROM USERS";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setAutoCreateRowSorter(true);
            jTable1.getRowSorter().toggleSortOrder(3);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
        FillList();
        UpdateJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regUser = new javax.swing.JTextField();
        regPwd = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        regName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regPos = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        regEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regGender = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("Position:");

        regPos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Receptionist", "Boarding Staff", "Vet", "Manager" }));

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Email:");

        jLabel6.setText("Gender:");

        regGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Password", "Position", "Gender", "Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(createBtn)
                            .addGap(18, 18, 18)
                            .addComponent(updateBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                            .addComponent(deleteBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGap(27, 27, 27)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(regPos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regEmail)
                                .addComponent(regGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(regPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(regUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(regPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(regGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(regPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createBtn)
                            .addComponent(deleteBtn)
                            .addComponent(updateBtn)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    final void FillList() {
        try {

            String query = "SELECT * FROM USERS";
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            DefaultListModel DLM = new DefaultListModel();

            while (rs.next()) {

                DLM.addElement(rs.getString(1));
            }

            List1.setModel(DLM);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        try {
            String Query = "INSERT INTO USERS (NAME, ID, PASSWORD, POSITION, GENDER, EMAIL) VALUES ('" + regName.getText() + "','" + regUser.getText() + "','"
                    + regPwd.getText() + "', '" + regPos.getSelectedItem() + "','" + regGender.getSelectedItem() + "', '" + regEmail.getText() + "')";

            regName.setText(null);
            regUser.setText(null);
            regPwd.setText(null);

            con = Connect.ConnectDB();
            stmt = con.createStatement();
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "User added to database");
            FillList();
            UpdateJTable();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_createBtnActionPerformed


    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        try {

            String Query = "SELECT * FROM USERS WHERE NAME = '" + List1.getSelectedValue() + "'";

            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(Query);

            while (rs.next()) {
                regName.setText(rs.getString(1));
                regUser.setText(rs.getString(2));
                regPwd.setText(rs.getString(3));
                regPos.setSelectedItem(rs.getString(4));
                regGender.setSelectedItem(rs.getString(5));
                regEmail.setText(rs.getString(6));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            String Query = "DELETE FROM USERS WHERE NAME = '" + regName.getText() + "'";
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "User deleted from database");
            FillList();
            UpdateJTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        String selection = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString();
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            String Query = "UPDATE USERS SET NAME = '" + regName.getText() + "',ID = '" + regUser.getText() + "', PASSWORD = '" + regPwd.getText()
                    + "', POSITION = '" + regPos.getSelectedItem() + "', GENDER = '" + regGender.getSelectedItem() + "', EMAIL = '" + regEmail.getText() + "' WHERE NAME = '" + selection + "'";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "User info updated in database");
            FillList();
            UpdateJTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        regName.setText(jTable1.getModel().getValueAt(row, 0).toString());
        regUser.setText(jTable1.getModel().getValueAt(row, 1).toString());
        regPwd.setText(jTable1.getModel().getValueAt(row, 2).toString());
        regPos.setSelectedItem(jTable1.getModel().getValueAt(row, 3).toString());
        regGender.setSelectedItem(jTable1.getModel().getValueAt(row, 4).toString());
        regEmail.setText(jTable1.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List1;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField regEmail;
    private javax.swing.JComboBox regGender;
    private javax.swing.JTextField regName;
    private javax.swing.JComboBox regPos;
    private javax.swing.JTextField regPwd;
    private javax.swing.JTextField regUser;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
