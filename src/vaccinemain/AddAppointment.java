
package vaccinemain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AddAppointment extends javax.swing.JFrame {

    public AddAppointment()
    {
        initComponents();  
        
        try
        {   
            BufferedReader myfiles = new BufferedReader(new FileReader("Centre.txt"));
            String [] lineArrs;
            String lines;

            while((lines = myfiles.readLine())!=null)
            {
                lineArrs = lines.split(", ");
                cmbVcc.addItem(lineArrs[1]);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        cmbName = new javax.swing.JComboBox<>();
        cmbVcc = new javax.swing.JComboBox<>();
        jCalendar = new com.toedter.calendar.JCalendar();
        cmbTime = new javax.swing.JComboBox<>();
        lblTime = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(31, 187, 166));
        jPanel2.setPreferredSize(new java.awt.Dimension(622, 115));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Appointment");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(3, 79, 74), 1, true));
        jPanel3.setForeground(new java.awt.Color(3, 79, 74));

        jPanel4.setBackground(new java.awt.Color(3, 79, 74));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        tableSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 79, 74)));
        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    tableSearch.setShowGrid(true);
    jScrollPane1.setViewportView(tableSearch);

    btnView.setBackground(new java.awt.Color(31, 187, 166));
    btnView.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    btnView.setForeground(new java.awt.Color(255, 255, 255));
    btnView.setText("View");
    btnView.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnViewActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24))))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addContainerGap())
    );

    lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    lblName.setText("Name :");

    cmbName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    cmbName.setMaximumRowCount(1000);
    cmbName.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cmbNameMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            cmbNameMouseEntered(evt);
        }
    });
    cmbName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbNameActionPerformed(evt);
        }
    });

    cmbVcc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    cmbVcc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbVccActionPerformed(evt);
        }
    });

    jCalendar.setMaxSelectableDate(new java.util.Date(4070883693000L));

    cmbTime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    cmbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0900", "0930", "1000", "1030", "1100", "1130", "1200", "1230", "1300", "1330", "1400", "1430", "1500", "1530", "1600", "1630" }));
    cmbTime.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbTimeActionPerformed(evt);
        }
    });

    lblTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    lblTime.setText("Time :");

    btnConfirm.setBackground(new java.awt.Color(249, 190, 63));
    btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
    btnConfirm.setText("Confirm");
    btnConfirm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnConfirmActionPerformed(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel4.setText("Centre : ");

    jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel5.setText("Date :");

    btnBack.setBackground(new java.awt.Color(255, 150, 0));
    btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    btnBack.setForeground(new java.awt.Color(255, 255, 255));
    btnBack.setText("Back");
    btnBack.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(lblName))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbVcc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTime)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(44, 44, 44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(228, 228, 228))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btnBack)
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbVcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTime)
                        .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                    .addComponent(btnConfirm))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        String [] columnsName = {"Name","Centre","Date","Time"};

        DefaultTableModel model = (DefaultTableModel)tableSearch.getModel();
        model.setColumnIdentifiers(columnsName);        //assinging specific names to each column
        
        model.setRowCount(0);       //setting initial row count to be zero
        
        try
        {
            BufferedReader myfile = new BufferedReader(new FileReader("Appointmentdata.txt"));

            Object [] tableLines = myfile.lines().toArray();

            for(int i = 0; i < tableLines.length; i++)
            {
                String [] dataRow = tableLines[i].toString().split(" , ");
                model.addRow(dataRow);
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        //dynamic filter (type any characters which filter the result)
        DefaultTableModel model = (DefaultTableModel)tableSearch.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter <DefaultTableModel>(model);
        tableSearch.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
    }//GEN-LAST:event_jTextField1KeyPressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        PersonnelMain pt = new PersonnelMain();
        pt.show();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String datecalendar = sd.format(jCalendar.getDate());
        
        if(cmbName.getSelectedIndex()== -1)
        {
            JOptionPane.showMessageDialog(null, "All Registered users have made an appointment");
        }
        else
        {
            Appointment ap = new Appointment(cmbName.getSelectedItem().toString(), cmbVcc.getSelectedItem().toString(), datecalendar, cmbTime.getSelectedItem().toString());
            ap.Book();
        
            btnView.doClick();
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void cmbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNameActionPerformed
        
    }//GEN-LAST:event_cmbNameActionPerformed

    private void cmbNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbNameMouseClicked
    
    }//GEN-LAST:event_cmbNameMouseClicked

    private void cmbTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTimeActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_cmbTimeActionPerformed

    private void cmbNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbNameMouseEntered
        
        cmbName.removeAllItems();
                try
                {   
                    BufferedReader myfiles = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));
                    String [] lineArrs;
                    String lines;

                    while((lines = myfiles.readLine())!=null)
                    {
                        lineArrs = lines.split(" , ");
                        String patientname = lineArrs[0];

                            try
                            {
                                int togglepassname = 1;
                                BufferedReader myfiless = new BufferedReader(new FileReader("Appointmentdata.txt"));
                                String [] lineArrss;
                                String liness;

                                while((liness = myfiless.readLine())!=null)
                                {
                                    lineArrss = liness.split(" , ");
                                    if(!lineArrss[0].equals(patientname))   //if first column not equal to patientname
                                    {
                                        togglepassname = 1;            
                                    }
                                    else
                                    {
                                        togglepassname = 0;
                                        break;
                                    }
                                }
                                if(togglepassname == 1) //if after looping through all the lines still not equal
                                {
                                    cmbName.addItem(patientname);   //add patientname into combobox
                                }
                            }
                            catch(IOException e)
                            {
                                e.printStackTrace();
                            }
                        
                    }
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
    }//GEN-LAST:event_cmbNameMouseEntered

    private void cmbVccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVccActionPerformed
        
    }//GEN-LAST:event_cmbVccActionPerformed

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
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbName;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JComboBox<String> cmbVcc;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tableSearch;
    // End of variables declaration//GEN-END:variables
}
