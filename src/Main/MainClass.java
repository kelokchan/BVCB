/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import javax.swing.JOptionPane;
import Classes.*;
import UI.AboutUsWindow;
import UI.BoardingWindow;
import UI.ManMenu;
import UI.Register;
import UI.RepMenu;
import UI.VetMenu;

/**
 *
 * @author Kelok
 */
public class MainClass extends javax.swing.JFrame {

    Statement stmt = null;
    Connection con = null;
    ResultSet results = null;
    public static String passed_VetID = null;
    public static String passed_VetName = null;

    /**
     * Creates new form Login
     */
    public MainClass() {
        initComponents();
        setLocationRelativeTo(null);
        rootPane.setDefaultButton(loginBtn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        regBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animal Center");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                MainClass.this.windowOpened(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Password:");

        passwordText.setName(""); // NOI18N

        loginBtn.setLabel("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        regBtn.setLabel("Register");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(idText))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regBtn))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regBtn)
                    .addComponent(loginBtn)))
        );

        idText.getAccessibleContext().setAccessibleName("usernameText");
        passwordText.getAccessibleContext().setAccessibleName("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WELCOME ");

        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("About us");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String id = idText.getText();
        String password = passwordText.getText();
        try {
            checkLogin(id, password);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        Register register = new Register();
        register.setVisible(true);
    }//GEN-LAST:event_regBtnActionPerformed

    private void windowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowOpened

    }//GEN-LAST:event_windowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        AboutUsWindow au = new AboutUsWindow();
        au.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    public void checkLogin(String id, String password) throws SQLException {
        String category = null;
        try {
            String queryString = "SELECT * FROM USERS WHERE ID = '" + id + "' AND Password = '" + password + "' ";

            con = Connect.ConnectDB();
            stmt = con.createStatement();
            results = stmt.executeQuery(queryString);
            if (results.next()) {

                category = results.getString("Position");
                JOptionPane.showMessageDialog(null, "Welcome, " + results.getString("Fullname") + "");

                switch (category) {
                    case "Receptionist":
                        RepMenu ms = new RepMenu();
                        ms.setVisible(true);
                        break;

                    case "BoardingStaff":
                        BoardingWindow bw = new BoardingWindow();
                        BoardingWindow.parentPanel.removeAll();
                        BoardingWindow.parentPanel.add(BoardingWindow.boardstaffPanel);
                        bw.setVisible(true);
                        break;

                    case "Vet":
                        VetMenu vm = new VetMenu();
                        passed_VetName = results.getString("Fullname");
                        passed_VetID = id;
                        vm.setVisible(true);
                        break;

                    case "Manager":
                        ManMenu mm = new ManMenu();
                        mm.setVisible(true);
                        break;
                    default:
                        System.out.println("Done");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username/password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton regBtn;
    // End of variables declaration//GEN-END:variables
}
