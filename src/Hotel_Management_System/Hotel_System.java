/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel_Management_System;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AYMAN
 */
public class Hotel_System extends javax.swing.JFrame {

    /**
     * Creates new form Hotel_System
     */
    public Hotel_System() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtCustomerRef = new javax.swing.JTextField();
        jtxtFirstname = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtPostCode = new javax.swing.JTextField();
        jtxtCustomerMobile = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLocaleNation = new com.toedter.components.JLocaleChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtxtTax = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jbtnTotalCost = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jComboIDtype = new javax.swing.JComboBox<>();
        jComboGender = new javax.swing.JComboBox<>();
        jComboRoomType = new javax.swing.JComboBox<>();
        jComboRoomNo = new javax.swing.JComboBox<>();
        jComboRoomExt = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboMeal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Customer_Ref :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Firstname :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Surname :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address 1 :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Post Code :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Customer Mobile :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("E-mail :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        jtxtCustomerRef.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtCustomerRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCustomerRefActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtCustomerRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 160, 30));

        jtxtFirstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFirstnameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 160, 30));

        jtxtSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, 30));

        jtxtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        jtxtPostCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        jtxtCustomerMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtCustomerMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 160, 30));

        jtxtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nationality :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Date of Birth :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ID Type :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Gender :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Check In Date :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Check Out Date :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Room Type :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Room No. :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));
        getContentPane().add(jLocaleNation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 160, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_Ref", "Firstname", "Surname", "Address 1", "Post Code", "Customer Mobile", "E-mail", "Nationality", "Date of Birth", "ID Type", "Gender", "Check In Date", "Check Out Date", "Meal", "Room Type", "Room No.", "Room Ext No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 1240, 670));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Room Ext. No :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 160, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 160, -1));
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 160, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Tax :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("SubTotal :");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Total :");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 13, 160, 30));

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 53, 160, 30));

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 93, 160, 30));

        jbtnTotalCost.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTotalCost.setText("Total Cost");
        jbtnTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTotalCostActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 200, 60));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 200, 60));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 200, 60));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 40, 200, 60));

        jbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 200, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1560, 130));

        jComboIDtype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboIDtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driving Licence", "Passport", "Pilot Licence", "Student ID" }));
        getContentPane().add(jComboIDtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 160, -1));

        jComboGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(jComboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 160, -1));

        jComboRoomType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Family" }));
        getContentPane().add(jComboRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 160, -1));

        jComboRoomNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboRoomNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011", "012", "013", "014", "015" }));
        getContentPane().add(jComboRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 160, -1));

        jComboRoomExt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboRoomExt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115" }));
        getContentPane().add(jComboRoomExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 160, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Meal :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jComboMeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboMeal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        getContentPane().add(jComboMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 160, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCustomerRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCustomerRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCustomerRefActionPerformed

    private void jtxtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFirstnameActionPerformed
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hotel Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No data to delete", "Hotel Management System", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Hotel Management System", JOptionPane.OK_OPTION);
            }
        } else {
            model.removeRow(jTable1.getSelectedRow());
        }

    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Hotel Booking Update Confirmed", "Hotel Management System", JOptionPane.OK_OPTION);
            }
        }

    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtCustomerRef.setText(null);
        jtxtFirstname.setText(null);
        jtxtSurname.setText(null);
        jtxtAddress.setText(null);
        jtxtPostCode.setText(null);
        jtxtEmail.setText(null);
        jtxtCustomerMobile.setText(null);
        jtxtTax.setText(null);
        jtxtSubTotal.setText(null);
        jtxtTotal.setText(null);
        jLocaleNation.setSelectedIndex(12);
        jComboGender.setSelectedIndex(0);
        jComboIDtype.setSelectedIndex(0);
        jComboMeal.setSelectedIndex(0);
        jComboRoomType.setSelectedIndex(0);
        jComboRoomNo.setSelectedIndex(0);
        jComboRoomExt.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jDateChooser3.setDate(null);

    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTotalCostActionPerformed
        int singleRoom = 35;
        int doubleRoom = 55;
        int familyRoom = 70;
        int oneMeal = 7;
        int twoMeals = 15;
        int threeMeals = 20;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date check_In_Date = null;
        Date check_Out_Date = null;
        
        try{
        check_In_Date = format.parse(format.format(jDateChooser2.getDate()));
        check_Out_Date = format.parse(format.format(jDateChooser3.getDate()));
        }
        catch(Exception e){
        e.printStackTrace();
        }
        long checkdiff = check_Out_Date.getTime() - check_In_Date.getTime();
        int days = (int)(checkdiff/1000/60/60/24);
        
        if(jComboRoomType.getSelectedItem().equals("Single") && jComboMeal.getSelectedItem().equals("1"))
        {
        jtxtTotal.setText(Integer.toString(days*singleRoom)+oneMeal);
        jtxtTax.setText(Integer.toString(days*singleRoom)+oneMeal);
        jtxtSubTotal.setText(Integer.toString(days*singleRoom)+oneMeal);
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
        
        else if(jComboRoomType.getSelectedItem().equals("Double") && jComboMeal.getSelectedItem().equals("1"))
        {
        jtxtTotal.setText(Integer.toString(days*doubleRoom)+oneMeal);
        jtxtTax.setText(Integer.toString(days*doubleRoom)+oneMeal);
        jtxtSubTotal.setText(Integer.toString(days*doubleRoom)+oneMeal);
        
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
        
        else if(jComboRoomType.getSelectedItem().equals("Family") && jComboMeal.getSelectedItem().equals("1"))
        {
        jtxtTotal.setText(Integer.toString(days*familyRoom)+oneMeal);
        jtxtTax.setText(Integer.toString(days*familyRoom)+oneMeal);
        jtxtSubTotal.setText(Integer.toString(days*familyRoom)+oneMeal);
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
        
        if(jComboRoomType.getSelectedItem().equals("Single") && jComboMeal.getSelectedItem().equals("2"))
        {
        jtxtTotal.setText(Integer.toString(days*singleRoom)+twoMeals);
        jtxtTax.setText(Integer.toString(days*singleRoom)+twoMeals);
        jtxtSubTotal.setText(Integer.toString(days*singleRoom)+twoMeals);
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
        
        else if(jComboRoomType.getSelectedItem().equals("Double") && jComboMeal.getSelectedItem().equals("2"))
        {
        jtxtTotal.setText(Integer.toString(days*doubleRoom)+twoMeals);
        jtxtTax.setText(Integer.toString(days*doubleRoom)+twoMeals);
        jtxtSubTotal.setText(Integer.toString(days*doubleRoom)+twoMeals);
        
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
        
        else if(jComboRoomType.getSelectedItem().equals("Family") && jComboMeal.getSelectedItem().equals("2"))
        {
        jtxtTotal.setText(Integer.toString(days*familyRoom)+twoMeals);
        jtxtTax.setText(Integer.toString(days*familyRoom)+twoMeals);
        jtxtSubTotal.setText(Integer.toString(days*familyRoom)+twoMeals);
        
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
        
         if(jComboRoomType.getSelectedItem().equals("Single") && jComboMeal.getSelectedItem().equals("3"))
        {
        jtxtTotal.setText(Integer.toString(days*singleRoom)+threeMeals);
        jtxtTax.setText(Integer.toString(days*singleRoom)+threeMeals);
        jtxtSubTotal.setText(Integer.toString(days*singleRoom)+threeMeals);
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
         
         else if(jComboRoomType.getSelectedItem().equals("Double") && jComboMeal.getSelectedItem().equals("3"))
        {
        jtxtTotal.setText(Integer.toString(days*doubleRoom)+threeMeals);
        jtxtTax.setText(Integer.toString(days*doubleRoom)+threeMeals);
        jtxtSubTotal.setText(Integer.toString(days*doubleRoom)+threeMeals);
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
         
         else if(jComboRoomType.getSelectedItem().equals("Family") && jComboMeal.getSelectedItem().equals("3"))
        {
        jtxtTotal.setText(Integer.toString(days*familyRoom)+threeMeals);
        jtxtTax.setText(Integer.toString(days*familyRoom)+threeMeals);
        jtxtSubTotal.setText(Integer.toString(days*familyRoom)+threeMeals);
        double q = Double.parseDouble(jtxtTax.getText());
        q=(q*0.25)/100;
        String tax = String.format(("$ %.2f"), q);
        jtxtTax.setText(tax);
        
        double st = Double.parseDouble(jtxtSubTotal.getText());
        st =(st);
        String subtotal = String.format(("$ %.2f"), st);
        jtxtSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jtxtTotal.getText());
        t =(t);
        String total = String.format(("$ %.3f"), t + q);
        jtxtTotal.setText(total);
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
        jtxtCustomerRef.getText(),
        jtxtFirstname.getText(),
        jtxtSurname.getText(),
        jtxtAddress.getText(),
        jtxtPostCode.getText(),
        jtxtCustomerMobile.getText(),
        jtxtEmail.getText(),
        jLocaleNation.getSelectedItem(),
        jDateChooser1.getDate(),
        jComboIDtype.getSelectedItem(),
        jComboGender.getSelectedItem(),
        jDateChooser2.getDate(),
        jDateChooser3.getDate(),
        jComboMeal.getSelectedItem(),
        jComboRoomType.getSelectedItem(),
        jComboRoomNo.getSelectedItem(),
        jComboRoomExt.getSelectedItem(),
        
        });
    }//GEN-LAST:event_jbtnTotalCostActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboGender;
    private javax.swing.JComboBox<String> jComboIDtype;
    private javax.swing.JComboBox<String> jComboMeal;
    private javax.swing.JComboBox<String> jComboRoomExt;
    private javax.swing.JComboBox<String> jComboRoomNo;
    private javax.swing.JComboBox<String> jComboRoomType;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleNation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTotalCost;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtCustomerMobile;
    private javax.swing.JTextField jtxtCustomerRef;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
