package hospitalproject;


import hospitalproject.Connectionprovider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dave
 */
public class pharmacy extends javax.swing.JFrame {

    /**
     * Creates new form pharmacy
     */
    public pharmacy() {
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
        patientID12 = new javax.swing.JLabel();
        patientID = new javax.swing.JTextField();
        pnamee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Psearch = new javax.swing.JButton();
        dname = new javax.swing.JTextField();
        pdiagn = new javax.swing.JTextField();
        pprescription = new javax.swing.JTextField();
        vsave = new javax.swing.JButton();
        vclose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setMinimumSize(new java.awt.Dimension(880, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Pharmacy");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, -1));

        patientID12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        patientID12.setForeground(new java.awt.Color(51, 51, 255));
        patientID12.setText("Patient ID");
        getContentPane().add(patientID12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        patientID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(patientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 190, -1));

        pnamee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(pnamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 220, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Patient Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Patient Diagnosis");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Patient Prescription");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Doctor name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        Psearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Psearch.setText("Search");
        Psearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Psearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        dname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 220, -1));

        pdiagn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pdiagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdiagnActionPerformed(evt);
            }
        });
        getContentPane().add(pdiagn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 220, -1));

        pprescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(pprescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 220, -1));

        vsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vsave.setText("Save");
        vsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsaveActionPerformed(evt);
            }
        });
        getContentPane().add(vsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        vclose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vclose.setText("Close");
        vclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcloseActionPerformed(evt);
            }
        });
        getContentPane().add(vclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dave\\Downloads\\pexels-daniel-frank-305568.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsaveActionPerformed
        // TODO add your handling code here:
        String pid=patientID.getText();
        String dnam=dname.getText();
        String pdiag=pdiagn.getText();
        String ppre=pprescription.getText();
        
        try{
        Connection conn = Connectionprovider.getCon();
            Statement st = conn.createStatement();
            String insert = "INSERT INTO `pharmacy`(`pid`, `dname`, `pdiag`, `ppre`) VALUES('"+pid+"','"+dnam+"','"+pdiag+"','"+ppre+"')";
            st.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "Successfully Saved");
            setVisible(false);
            new newPatient().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "enter correct info");
                        System.err.println(e);

        }
    }//GEN-LAST:event_vsaveActionPerformed

    private void pdiagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdiagnActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_pdiagnActionPerformed

    private void vcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_vcloseActionPerformed

    private void PsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsearchActionPerformed
        // TODO add your handling code here:
        String patientid=patientID.getText();
        try {
            Connection conn=Connectionprovider.getCon();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from `pinfo` where pid='"+patientid+"'");
             if (rs.next()) {
 
                String dname1 = rs.getString("dname");
                String pdia = rs.getString("pdiag");
                String name = rs.getString("pname");
                            
               
                pnamee.setText(name);
                dname.setText(dname1);
                pdiagn.setText(pdia);
            }
             else{
                 JOptionPane.showMessageDialog(null, "No Record found");
             }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_PsearchActionPerformed

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
            java.util.logging.Logger.getLogger(pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Psearch;
    private javax.swing.JTextField dname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField patientID;
    private javax.swing.JLabel patientID12;
    private javax.swing.JTextField pdiagn;
    private javax.swing.JTextField pnamee;
    private javax.swing.JTextField pprescription;
    private javax.swing.JButton vclose;
    private javax.swing.JButton vsave;
    // End of variables declaration//GEN-END:variables
}
