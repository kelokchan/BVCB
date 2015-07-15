/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import Classes.Connect;
import Classes.EnumItems;
import Classes.ITableUpdate;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Kelok
 */
public class Register extends javax.swing.JFrame implements ITableUpdate {

    Statement stmt = null;
    Connection con = null;
    ResultSet rs = null;


    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
        updateJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regID = new javax.swing.JTextField();
        regPwd = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        regName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regPos = new javax.swing.JComboBox();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        regEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regGender = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        regPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        regExp = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        regExp2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Password:");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("Position:");

        regPos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Receptionist", "BoardingStaff", "Vet", "Manager" }));
        regPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPosActionPerformed(evt);
            }
        });

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

        userJTable.setAutoCreateRowSorter(true);
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fullname","ID","Password","Position","Gender","Email","PhoneNo"
            }
        ));
        userJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userJTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(userJTable);

        jLabel7.setText("Phone no:");

        jLabel8.setText("Expertise:");

        regExp.setEnabled(false);

        jLabel9.setText("Second expertise:");

        regExp2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(createBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addGap(17, 17, 17)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regPos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(regPwd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(regID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(regName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(regGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(regExp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regPhone)
                            .addComponent(regExp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(regExp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public final void updateJTable() {

        String position = regPos.getSelectedItem().toString();
        String query = "SELECT * FROM " + position + "";
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            userJTable.setModel(DbUtils.resultSetToTableModel(rs));
            userJTable.getRowSorter().toggleSortOrder(1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        try {
            String position = regPos.getSelectedItem().toString();
            String Query = "INSERT INTO " + position + " (Fullname, ID, Password, Position, Gender, Email, PhoneNo) VALUES ('" + regName.getText() + "','" + regID.getText() + "','"
                    + regPwd.getText() + "', '" + regPos.getSelectedItem() + "','" + regGender.getSelectedItem() + "', '" + regEmail.getText() + "', '" + regPhone.getText() + "' )";
            String userQuery = "INSERT INTO USERS VALUES ('" + regID.getText() + "','" + regPwd.getText() + "','" + regPos.getSelectedItem() + "', '" + regName.getText() + "')";

            con = Connect.ConnectDB();
            stmt = con.createStatement();
            stmt.execute(Query);
            stmt.execute(userQuery);
            if (position.equals("Vet")) {
                String additionalQuery = "UPDATE Vet SET Expertise = '" + regExp.getSelectedItem() + "', Expertise_2 = '" + regExp2.getSelectedItem() + "' WHERE ID = '" + regID.getText() + "'";
                stmt.execute(additionalQuery);
            }

            regName.setText(null);
            regID.setText(null);
            regPwd.setText(null);

            JOptionPane.showMessageDialog(null, "User added to database");
            updateJTable();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_createBtnActionPerformed


    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            String position = regPos.getSelectedItem().toString();
            String Query = "DELETE FROM " + position + " WHERE Fullname = '" + regName.getText() + "' ; DELETE FROM USERS WHERE ID = '" + regID.getText() + "'";
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "User deleted from database");
            updateJTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        try {
            String selection = userJTable.getModel().getValueAt(userJTable.getSelectedRow(), 0).toString();
            String position = regPos.getSelectedItem().toString();
            String query = "UPDATE " + position + " SET Fullname = '" + regName.getText() + "',ID = '" + regID.getText() + "', Password = '" + regPwd.getText()
                    + "', Position = '" + regPos.getSelectedItem() + "', Gender = '" + regGender.getSelectedItem() + "', Email = '" + regEmail.getText() + "', PhoneNo = '" + regPhone.getText() + "' WHERE Fullname = '" + selection + "'";
            String vetQuery = "UPDATE " + position + " SET Fullname = '" + regName.getText() + "',ID = '" + regID.getText() + "', Password = '" + regPwd.getText()
                    + "', Position = '" + regPos.getSelectedItem() + "', Gender = '" + regGender.getSelectedItem() + "', Email = '" + regEmail.getText() + "', PhoneNo = '" + regPhone.getText() + "', Expertise = '" + regExp.getSelectedItem() + "' WHERE Fullname = '" + selection + "'";
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            if (position.equals("Vet")) {
                stmt.execute(vetQuery);
            } else {
                stmt.execute(query);
            }
            JOptionPane.showMessageDialog(null, "User info updated in database");
            updateJTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void userJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJTableMouseClicked
        // TODO add your handling code here:
        int row = userJTable.getSelectedRow();
        regName.setText(userJTable.getModel().getValueAt(row, 0).toString());
        regID.setText(userJTable.getModel().getValueAt(row, 1).toString());
        regPwd.setText(userJTable.getModel().getValueAt(row, 2).toString());
        regPos.setSelectedItem(userJTable.getModel().getValueAt(row, 3).toString());
        regGender.setSelectedItem(userJTable.getModel().getValueAt(row, 4).toString());
        regEmail.setText(userJTable.getModel().getValueAt(row, 5).toString());
        regPhone.setText(userJTable.getModel().getValueAt(row, 6).toString());
        try {
            regExp.setSelectedItem(userJTable.getModel().getValueAt(row, 7).toString());
        } catch (Exception ex) {
            regExp.setSelectedIndex(0);
        }
    }//GEN-LAST:event_userJTableMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        regPos.setModel(new DefaultComboBoxModel(EnumItems.Positions.values()));
        regExp.setModel(new DefaultComboBoxModel(EnumItems.Animals.values()));
        regExp2.setModel(new DefaultComboBoxModel(EnumItems.Animals.values()));
    }//GEN-LAST:event_formWindowOpened

    private void regPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPosActionPerformed
        // TODO add your handling code here:
        if (regPos.getSelectedIndex() == 2) {
            regExp.setEnabled(true);
        } else {
            regExp.setEnabled(false);
        }
        updateJTable();
    }//GEN-LAST:event_regPosActionPerformed

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
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField regEmail;
    private javax.swing.JComboBox regExp;
    private javax.swing.JComboBox regExp2;
    private javax.swing.JComboBox regGender;
    private javax.swing.JTextField regID;
    private javax.swing.JTextField regName;
    private javax.swing.JTextField regPhone;
    private javax.swing.JComboBox regPos;
    private javax.swing.JTextField regPwd;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
