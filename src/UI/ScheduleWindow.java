/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Connect;
import Enum.EnumItems;
import Classes.ITableUpdate;
import Classes.Manager;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kelok
 */
public class ScheduleWindow extends javax.swing.JFrame implements ITableUpdate {

    Statement stmt = null;
    Connection con = null;
    ResultSet rs = null;
    Manager manager = new Manager();

    public ScheduleWindow() {
        initComponents();
        setLocationRelativeTo(null);
        updateJTable();
    }

    @Override
    public final void updateJTable() {
        String query = "SELECT * FROM Schedule";
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            scheduleTable.setModel(DbUtils.resultSetToTableModel(rs));
            scheduleTable.getRowSorter().toggleSortOrder(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public final void updateJTable(String query) {
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            scheduleTable.setModel(DbUtils.resultSetToTableModel(rs));
            scheduleTable.getRowSorter().toggleSortOrder(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        vetComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dogBox = new javax.swing.JCheckBox();
        catBox = new javax.swing.JCheckBox();
        hamsterBox = new javax.swing.JCheckBox();
        rabbitBox = new javax.swing.JCheckBox();
        reptileBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        vetComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        vetComboBox3 = new javax.swing.JComboBox();
        autoButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create weekly schedule");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        scheduleTable.setAutoCreateRowSorter(true);
        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
            }
        ));
        scheduleTable.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(scheduleTable);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        vetComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vetComboBox1.setSelectedIndex(-1);
        vetComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select vet 1:");
        jLabel1.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Checklist"));

        dogBox.setText("Dog");

        catBox.setText("Cat");

        hamsterBox.setText("Hamster");

        rabbitBox.setText("Rabbit");

        reptileBox.setText("Reptile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dogBox)
                    .addComponent(catBox)
                    .addComponent(hamsterBox)
                    .addComponent(rabbitBox)
                    .addComponent(reptileBox))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dogBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(catBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hamsterBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rabbitBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reptileBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Select a day:");
        jLabel2.setToolTipText("");

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Select vet 2:");
        jLabel8.setToolTipText("");

        vetComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vetComboBox2.setSelectedIndex(-1);
        vetComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetComboBox2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Select vet 3:");
        jLabel9.setToolTipText("");

        vetComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vetComboBox3.setSelectedIndex(-1);
        vetComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetComboBox3ActionPerformed(evt);
            }
        });

        autoButton.setText("Auto-assign");
        autoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(vetComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(vetComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(vetComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(autoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vetComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vetComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vetComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(autoButton))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (dogBox.isSelected() && catBox.isSelected() && hamsterBox.isSelected() && rabbitBox.isSelected() && reptileBox.isSelected()) {
            String day = dayComboBox.getSelectedItem().toString();
            String vet = vetComboBox1.getSelectedItem().toString();
            try {
                manager.addSchedule(day, vet);
                updateJTable();
                dogBox.setSelected(false);
                catBox.setSelected(false);
                hamsterBox.setSelected(false);
                rabbitBox.setSelected(false);
                reptileBox.setSelected(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Please select a vet / duplicate vet allocation", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Not enough expertise!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        vetComboBox1.setModel(new DefaultComboBoxModel(EnumItems.Vet.values()));
        vetComboBox2.setModel(new DefaultComboBoxModel(EnumItems.Vet.values()));
        vetComboBox3.setModel(new DefaultComboBoxModel(EnumItems.Vet.values()));
        dayComboBox.setModel(new DefaultComboBoxModel(EnumItems.Weekdays.values()));
    }//GEN-LAST:event_formWindowOpened

    private void vetComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetComboBox1ActionPerformed
        // TODO add your handling code here:
        String vet_id = vetComboBox1.getSelectedItem().toString();
        manager.checkExp(vet_id);
    }//GEN-LAST:event_vetComboBox1ActionPerformed

    private void vetComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetComboBox2ActionPerformed
        // TODO add your handling code here:
        String vet_id = vetComboBox2.getSelectedItem().toString();
        manager.checkExp(vet_id);
    }//GEN-LAST:event_vetComboBox2ActionPerformed

    private void vetComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetComboBox3ActionPerformed
        // TODO add your handling code here:
        String vet_id = vetComboBox3.getSelectedItem().toString();
        manager.checkExp(vet_id);
    }//GEN-LAST:event_vetComboBox3ActionPerformed

    private void autoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoButtonActionPerformed
        // TODO add your handling code here:
        String auto_query = "SELECT * FROM Auto_Schedule";
        if (autoButton.isSelected()) {
            updateJTable(auto_query);
        } else {
            updateJTable();
        }
    }//GEN-LAST:event_autoButtonActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ScheduleWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JToggleButton autoButton;
    public static javax.swing.JCheckBox catBox;
    public javax.swing.JComboBox dayComboBox;
    public static javax.swing.JCheckBox dogBox;
    public static javax.swing.JCheckBox hamsterBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JCheckBox rabbitBox;
    public static javax.swing.JCheckBox reptileBox;
    private javax.swing.JTable scheduleTable;
    public javax.swing.JComboBox vetComboBox1;
    private javax.swing.JComboBox vetComboBox2;
    private javax.swing.JComboBox vetComboBox3;
    // End of variables declaration//GEN-END:variables
}
