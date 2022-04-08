/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dave
 */
public class pbill extends javax.swing.JFrame {

    /**
     * Creates new form pbill
     */
    public pbill() {
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
        pid = new javax.swing.JTextField();
        psearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ptext = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setMinimumSize(new java.awt.Dimension(880, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Patient Bill");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 260, 60));

        pid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, -1));

        psearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        psearch.setText("Search");
        psearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psearchActionPerformed(evt);
            }
        });
        getContentPane().add(psearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        ptext.setColumns(20);
        ptext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ptext.setRows(5);
        jScrollPane1.setViewportView(ptext);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 340, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("PatientID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dave\\Downloads\\pexels-daniel-frank-305568.jpg")); // NOI18N
        jLabel11.setText("jLabel5");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void psearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psearchActionPerformed
        // TODO add your handling code here:
        String patientid=pid.getText();
        try {
            Connection conn=Connectionprovider.getCon();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from `bill` where pid='"+patientid+"'");
             if (rs.next()) {
 
                String name = rs.getString("pid");
                String mbill = rs.getString("medbill");
                String wbill = rs.getString("wardbill");
                String tbill = rs.getString("totalbill");

                
               
                 System.out.println(name+mbill+wbill+tbill);
                ptext.setText("Patient ID"+" "+name +"\n"+"Med Bill"+" "+mbill+"\n"+"Ward bill"+" "+wbill+"\n"+"Total"+" "+tbill);
                
            }
             else{
                 JOptionPane.showMessageDialog(null, "No Record found");
             }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_psearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pbill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pid;
    private javax.swing.JButton psearch;
    private javax.swing.JTextArea ptext;
    // End of variables declaration//GEN-END:variables
}