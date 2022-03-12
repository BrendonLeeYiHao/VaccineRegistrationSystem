/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vaccinemain;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author brend
 */
public class ViewOwnDetailsPage extends javax.swing.JFrame {

    public static String FullName;
    /**
     * Creates new form ViewOwnDetaiilsPage
     */
    public ViewOwnDetailsPage(String u) {
        initComponents();
        FullName = u;
        jPanel1.setBackground(Color.orange);
    }
    
    public ViewOwnDetailsPage()
    {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblDisplayhouse = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        lblDisplayhealth = new javax.swing.JLabel();
        lblpeople = new javax.swing.JLabel();
        lblDisplaypeople = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblHealth = new javax.swing.JLabel();
        lblDisplayfull = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblDisplaypass = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblDisplayicp = new javax.swing.JLabel();
        lblICPassport = new javax.swing.JLabel();
        lblDisplayphone = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDisplayemail = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(31, 187, 166));

        lblWelcome.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("OWN DETAILS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(lblWelcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblWelcome))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(255, 150, 0));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblDisplayhouse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplayhouse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblHouse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblHouse.setText("House Address:");

        lblDisplayhealth.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplayhealth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblpeople.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblpeople.setText("Citizenship:");

        lblDisplaypeople.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplaypeople.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnView.setBackground(new java.awt.Color(249, 190, 63));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("Click Here to VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblHealth.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblHealth.setText("HealthStatus:");

        lblDisplayfull.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplayfull.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFullname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFullname.setText("Full Name (same as UserName):");

        lblDisplaypass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplaypass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPassword.setText("Password:");

        lblDisplayicp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplayicp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblICPassport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblICPassport.setText("IC / Passport");

        lblDisplayphone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplayphone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhone.setText("Phone Number");

        lblDisplayemail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDisplayemail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail.setText("Email Address:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDisplayfull, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDisplaypass, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHealth)
                                .addGap(18, 18, 18)
                                .addComponent(lblDisplayhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblFullname)
                                    .addComponent(lblICPassport)
                                    .addComponent(lblPhone)
                                    .addComponent(lblEmail)
                                    .addComponent(lblHouse))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDisplayicp, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplayphone, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplayemail, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplayhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblpeople, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDisplaypeople, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnView))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisplayfull, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullname))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDisplaypass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblICPassport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDisplayicp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(lblDisplayphone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDisplayemail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDisplayhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDisplaypeople, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpeople))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHealth)
                    .addComponent(lblDisplayhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnView)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        PeopleFunctionPage pfp = new PeopleFunctionPage(FullName);
        pfp.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        
        try
        {
            BufferedReader myfile = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));
            
            String [] lineArr;
            String line;
            
            while((line = myfile.readLine())!=null)
            {
                lineArr = line.split(" , ");
                if(lineArr[0].equals(FullName))
                {
                    lblDisplayfull.setText(FullName);
                    lblDisplaypass.setText(lineArr[1]);
                    lblDisplayicp.setText(lineArr[2]);
                    lblDisplayphone.setText(lineArr[3]);
                    lblDisplayemail.setText(lineArr[4]);
                    lblDisplayhouse.setText(lineArr[5]);
                    lblDisplaypeople.setText(lineArr[6]);
                    lblDisplayhealth.setText(lineArr[7]);
                    break;
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnViewActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOwnDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOwnDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOwnDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOwnDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOwnDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDisplayemail;
    private javax.swing.JLabel lblDisplayfull;
    private javax.swing.JLabel lblDisplayhealth;
    private javax.swing.JLabel lblDisplayhouse;
    private javax.swing.JLabel lblDisplayicp;
    private javax.swing.JLabel lblDisplaypass;
    private javax.swing.JLabel lblDisplaypeople;
    private javax.swing.JLabel lblDisplayphone;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblHealth;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblICPassport;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblpeople;
    // End of variables declaration//GEN-END:variables
}