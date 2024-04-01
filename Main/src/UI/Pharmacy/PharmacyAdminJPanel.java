/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Pharmacy;


import static Charts.PharmacyCharts.createBarChartFromDatabase;
import Charts.PharmacyCharts;
import Model.MainAdmin;
import UI.LabAdmin.LabAdminJPanel;
import UI.LabAdmin.ManageStaffJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.*;

/**
 *
 * @author aniketpatole
 */
public class PharmacyAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyAdminJPanel
     */
    JPanel MainWorkArea;
    MainAdmin admin;
    String username;
    

    public PharmacyAdminJPanel(JPanel MainWorkArea, MainAdmin admin, String username) {
        initComponents();
        this.MainWorkArea = MainWorkArea;
        this.admin=admin;
        this.username=username;
    }

    PharmacyAdminJPanel(JPanel MainWorkArea, MainAdmin admin) {
        initComponents();
        this.MainWorkArea = MainWorkArea;
        this.admin=admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageOrders = new javax.swing.JButton();
        btnViewPharmaAdmin = new javax.swing.JButton();
        btnMedsAnalysis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });

        btnViewPharmaAdmin.setText("View Pharmacy Admins");
        btnViewPharmaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPharmaAdminActionPerformed(evt);
            }
        });

        btnMedsAnalysis.setText("Medicinal Analysis ");
        btnMedsAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedsAnalysisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 18)); // NOI18N
        jLabel1.setText("MANAGE PHARMACY ADMIN");

        jButton1.setText("Manage Pharmacy Staff");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedsAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewPharmaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewPharmaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedsAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        // TODO add your handling code here:
        
        ManagePharmacyJPanel panel =  new ManagePharmacyJPanel(MainWorkArea, admin);
        MainWorkArea.add("ManagePharmacyJPanel",panel);
        CardLayout layout = (CardLayout) MainWorkArea.getLayout();
        layout.next(MainWorkArea);
    }//GEN-LAST:event_btnManageOrdersActionPerformed

    private void btnViewPharmaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPharmaAdminActionPerformed
        // TODO add your handling code here:ViewLabAdminJPanel panel =  new ViewLabAdminJPanel(MainWorkArea, admin);
        
        ViewPharmacyAdminJPanel panel =  new ViewPharmacyAdminJPanel(MainWorkArea, admin,username);
        MainWorkArea.add("ViewPharmacyAdminJPanel",panel);
        CardLayout layout = (CardLayout) MainWorkArea.getLayout();
        layout.next(MainWorkArea);
    }//GEN-LAST:event_btnViewPharmaAdminActionPerformed

    private void btnMedsAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedsAnalysisActionPerformed
        // TODO add your handling code here:
            Charts.PharmacyCharts.createBarChartFromDatabase();
    }//GEN-LAST:event_btnMedsAnalysisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManagePharmacyStaffJPanel panel =  new ManagePharmacyStaffJPanel(MainWorkArea, admin);
        MainWorkArea.add("ManagePharmacyStaffJpanel",panel);
        CardLayout layout = (CardLayout) MainWorkArea.getLayout();
        layout.next(MainWorkArea);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnMedsAnalysis;
    private javax.swing.JButton btnViewPharmaAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}