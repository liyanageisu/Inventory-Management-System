/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
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

        BackgroundPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        HeadlineLabel = new javax.swing.JLabel();
        AddtoinventoryButton = new javax.swing.JButton();
        RemovefrominventoryButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        InventorymovementButton = new javax.swing.JButton();
        InventoryavailabilityButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(0, 255, 204));

        HeadlineLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        HeadlineLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeadlineLabel.setText("INVENTORY SYSTEM");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(HeadlineLabel)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(HeadlineLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        BackgroundPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 110));

        AddtoinventoryButton.setText("Add to Inventory");
        AddtoinventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoinventoryButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(AddtoinventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        RemovefrominventoryButton.setText("Remove from Inventory");
        RemovefrominventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovefrominventoryButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(RemovefrominventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        SettingsButton.setText("Settings ");
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        InventorymovementButton.setText("Inventory Movement");
        InventorymovementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventorymovementButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(InventorymovementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        InventoryavailabilityButton.setText("Inventory Availability");
        InventoryavailabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryavailabilityButtonActionPerformed(evt);
            }
        });
        BackgroundPanel.add(InventoryavailabilityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddtoinventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoinventoryButtonActionPerformed
        new Add().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddtoinventoryButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        new Settings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SettingsButtonActionPerformed

    private void InventoryavailabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryavailabilityButtonActionPerformed
        new Availability().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InventoryavailabilityButtonActionPerformed

    private void InventorymovementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventorymovementButtonActionPerformed
        new Movement().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InventorymovementButtonActionPerformed

    private void RemovefrominventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovefrominventoryButtonActionPerformed
        new Remove().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RemovefrominventoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoinventoryButton;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HeadlineLabel;
    private javax.swing.JButton InventoryavailabilityButton;
    private javax.swing.JButton InventorymovementButton;
    private javax.swing.JButton RemovefrominventoryButton;
    private javax.swing.JButton SettingsButton;
    // End of variables declaration//GEN-END:variables
}
