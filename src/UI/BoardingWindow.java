/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.BoardingRoom;
import Classes.BoardingStaff;
import javax.swing.*;
import Classes.Connect;
import Classes.ITableUpdate;
import Classes.Receptionist;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import net.proteanit.sql.DbUtils;

public class BoardingWindow extends javax.swing.JFrame implements ITableUpdate {

    Statement stmt = null;
    Connection con = null;
    ResultSet rs = null;
    String petQuery = "SELECT * FROM Pet";
    BoardingRoom boardingRoom = new BoardingRoom();
    Receptionist receptionist = new Receptionist();
    BoardingStaff boardingStaff = new BoardingStaff();

    public BoardingWindow() {
        initComponents();
        setLocationRelativeTo(null);
        Connect.populateComboBox(petComboBox, petQuery, "ID");
        updateJTable();
        Date date = new Date();

    }

    @Override
    public final void updateJTable() {

        String query = "SELECT b.Pet_ID, b.Date, b.Duration, b.RoomNo, p.Status, p.Last_Fed FROM BoardingList b, Pet p WHERE b.Pet_ID = p.ID";
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            boardJTable.setModel(DbUtils.resultSetToTableModel(rs));
            boardJTable.getRowSorter().toggleSortOrder(3);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boardJTable = new javax.swing.JTable();
        parentPanel = new javax.swing.JPanel();
        repPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        petComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boardDurationSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        roomComboBox = new javax.swing.JComboBox();
        updateButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        boardDatePicker = new com.toedter.calendar.JDateChooser();
        vetPanel = new javax.swing.JPanel();
        doneButton = new javax.swing.JButton();
        boardstaffPanel = new javax.swing.JPanel();
        lastfedSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        petIDLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Boarding Service");

        jLabel7.setText("Boarding Details: ");

        boardJTable.setAutoCreateRowSorter(true);
        boardJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        boardJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boardJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(boardJTable);

        parentPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Select pet ID:");

        jLabel3.setText("Boarding date:");

        jLabel4.setText("Duration (Days):");

        boardDurationSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        Date date = new Date();
        boardDatePicker.setDate(date);
        boardDurationSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                boardDurationSpinnerStateChanged(evt);
            }
        });

        jLabel2.setText("Room no:");

        roomComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        checkoutButton.setText("Check-out");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        createButton.setText("Check-in");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Price:");

        priceLabel.setText("RM50");

        boardDatePicker.setDateFormatString("dd/MM/yyyy");
        boardDatePicker.setEnabled(false);

        javax.swing.GroupLayout repPanelLayout = new javax.swing.GroupLayout(repPanel);
        repPanel.setLayout(repPanelLayout);
        repPanelLayout.setHorizontalGroup(
            repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repPanelLayout.createSequentialGroup()
                        .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boardDurationSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(petComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roomComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(boardDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(repPanelLayout.createSequentialGroup()
                        .addComponent(createButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(updateButton)
                        .addGap(87, 87, 87)
                        .addComponent(checkoutButton))
                    .addGroup(repPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        repPanelLayout.setVerticalGroup(
            repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(boardDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boardDurationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(priceLabel))
                .addGap(31, 31, 31)
                .addGroup(repPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(updateButton)
                    .addComponent(checkoutButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        parentPanel.add(repPanel, "card3");

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vetPanelLayout = new javax.swing.GroupLayout(vetPanel);
        vetPanel.setLayout(vetPanelLayout);
        vetPanelLayout.setHorizontalGroup(
            vetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vetPanelLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        vetPanelLayout.setVerticalGroup(
            vetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vetPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        parentPanel.add(vetPanel, "card2");

        lastfedSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));

        jLabel5.setText("Last fed: ");

        jLabel6.setText("ID: ");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Under treatment", "Critical" }));

        jLabel8.setText("Status: ");

        petIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        petIDLabel.setText("-");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boardstaffPanelLayout = new javax.swing.GroupLayout(boardstaffPanel);
        boardstaffPanel.setLayout(boardstaffPanelLayout);
        boardstaffPanelLayout.setHorizontalGroup(
            boardstaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardstaffPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(boardstaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(boardstaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastfedSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(boardstaffPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boardstaffPanelLayout.setVerticalGroup(
            boardstaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardstaffPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(boardstaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(petIDLabel))
                .addGap(18, 18, 18)
                .addGroup(boardstaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(boardstaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lastfedSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(31, 31, 31))
        );

        parentPanel.add(boardstaffPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 116, Short.MAX_VALUE)
                        .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        String pet_ID = petComboBox.getSelectedItem().toString();
        String date = new SimpleDateFormat("dd/MM/yyyy").format(boardDatePicker.getDate());
        int days = Integer.parseInt(boardDurationSpinner.getValue().toString());
        int roomNo = Integer.parseInt(roomComboBox.getSelectedItem().toString());
        if (!boardingRoom.checkOccupied(roomComboBox.getSelectedIndex() + 1, boardJTable)) {
            receptionist.checkIn(pet_ID, date, days, roomNo);
            updateJTable();
            Connect.populateComboBox(petComboBox, petQuery, "ID");
        } else {
            JOptionPane.showMessageDialog(null, "Selected room is occupied.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_createButtonActionPerformed


    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String pet_ID = petComboBox.getSelectedItem().toString();
        String date = new SimpleDateFormat("dd/MM/yyyy").format(boardDatePicker.getDate());
        int days = Integer.parseInt(boardDurationSpinner.getValue().toString());
        int roomNo = Integer.parseInt(roomComboBox.getSelectedItem().toString());
        if (!boardingRoom.checkOccupied(roomComboBox.getSelectedIndex() + 1, boardJTable)) {
            receptionist.updateBoarding(boardJTable, pet_ID, date, days, roomNo);
            updateJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selected room is occupied.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
        String pet_ID = petComboBox.getSelectedItem().toString();
        receptionist.checkOut(pet_ID);
        updateJTable();
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void boardJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardJTableMouseClicked

        try {
            int row = boardJTable.getSelectedRow();
            String petID = boardJTable.getModel().getValueAt(row, 0).toString();
            String dateString = boardJTable.getModel().getValueAt(row, 1).toString();
            int duration = (Integer) boardJTable.getModel().getValueAt(row, 2);
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            petComboBox.setSelectedItem(petID);
            boardDatePicker.setEnabled(true);
            boardDatePicker.setDate(date);
            boardDurationSpinner.setValue(duration);
            roomComboBox.setSelectedItem(boardJTable.getModel().getValueAt(row, 3).toString());

            //BoardingStaffPanel
            petIDLabel.setText(petID);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_boardJTableMouseClicked

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String status = statusComboBox.getSelectedItem().toString();
        String last_fed = lastfedSpinner.getValue().toString();
        boardingStaff.submitStatus(boardJTable, status, last_fed);
        updateJTable();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void boardDurationSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_boardDurationSpinnerStateChanged
        // TODO add your handling code here:
        int duration = Integer.parseInt(boardDurationSpinner.getValue().toString());
        int price = boardingRoom.calculatePrice(duration);
        priceLabel.setText("RM" + price);
    }//GEN-LAST:event_boardDurationSpinnerStateChanged

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new BoardingWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser boardDatePicker;
    private javax.swing.JSpinner boardDurationSpinner;
    private javax.swing.JTable boardJTable;
    public static javax.swing.JPanel boardstaffPanel;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner lastfedSpinner;
    public static javax.swing.JPanel parentPanel;
    private javax.swing.JComboBox petComboBox;
    private javax.swing.JLabel petIDLabel;
    private javax.swing.JLabel priceLabel;
    public static javax.swing.JPanel repPanel;
    private javax.swing.JComboBox roomComboBox;
    private javax.swing.JComboBox statusComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    public static javax.swing.JPanel vetPanel;
    // End of variables declaration//GEN-END:variables

}
