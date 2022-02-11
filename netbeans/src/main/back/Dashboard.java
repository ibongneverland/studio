/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.back;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.SQLException;
import main.front.Display;
import setting.koneksi.Koneksi;
import setting.koneksi.Koneksi2;


/**
 *
 * @author ibongneverland
 */
public class Dashboard extends javax.swing.JFrame {
    public Display aDisplay = new Display();
    private final Connection koneksi=Koneksi.getJaringan();
    private final Connection koneksi2=Koneksi2.getJaringan2();
    private PreparedStatement ps;
    private ResultSet rs;
    /**
     * Creates new form HalamanUtama
     */
    public Dashboard() {
        initComponents();
        
        datab();
        datan();
       datab1();
       datan1();
          bb1();
          nn1();
          ambilData();
        cbc();
        isicbc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(805, 450));
        jPanel6.setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kirim");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(120, 370, 90, 30);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tombol Display Antrian MEA");
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(10, 20, 315, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAM Versi 2.5.0");
        jLabel1.setToolTipText("Info Update : Perbaikan di Menu Simpan Running Teks");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(470, 330, 190, 17);

        jTextArea2.setColumns(10);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(10);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setPreferredSize(new java.awt.Dimension(315, 174));
        jPanel6.add(jTextArea2);
        jTextArea2.setBounds(10, 190, 315, 170);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel6.add(jComboBox1);
        jComboBox1.setBounds(10, 150, 315, 23);

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Simpan");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(10, 370, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("001");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(370, 30, 150, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("001");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(370, 170, 150, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("001");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(590, 30, 150, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("001");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(590, 100, 150, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("001");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(370, 100, 150, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("001");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(590, 170, 150, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Peringatan : Auto Refresh akan Menyebabkan Lag dan Lemot!");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(330, 310, 460, 13);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RS LUDIRA HUSADA TAMA");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(20, 90, 300, 13);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NOMOR YANG SUDAH DIPANGGIL");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel10);
        jLabel10.setBounds(340, 80, 460, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NOMOR YANG BELUM DIPANGGIL");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel11);
        jLabel11.setBounds(340, 20, 460, 17);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Close");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);
        jButton3.setBounds(350, 410, 90, 30);

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Refresh");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setRequestFocusEnabled(false);
        jButton5.setVerifyInputWhenFocusTarget(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5);
        jButton5.setBounds(340, 260, 210, 30);

        jButton6.setBackground(new java.awt.Color(0, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Auto Refresh");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRequestFocusEnabled(false);
        jButton6.setVerifyInputWhenFocusTarget(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(560, 260, 220, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SELISIH YANG BELUM DIPANGGIL");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel12);
        jLabel12.setBounds(340, 150, 460, 17);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gantiDisplay();
        jLabel9.setText(jTextArea2.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "JIKA KOMPUTER ANDA BUKAN KOMPUTER DISPLAY, KOMPUTER andA AKAN EROR", "MENAMPILKAN DISPLAY?",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    aDisplay.showOnScreen(1, aDisplay);
    } else {
    // no option
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        simpanData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        isicbc();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        manual();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jam();
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
  
    private void simpanData(){
        try {
            ps=koneksi2.prepareStatement("update runningteks set isiteks='"+jTextArea2.getText()+"' where kategoriteks='"+jComboBox1.getSelectedItem()+"'");
            try{                            
                ps.executeUpdate(); 
             }catch(Exception e){
                System.out.println(e);
             }finally{
                if(ps != null){
                    ps.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void gantiDisplay(){
        try {
            ps=koneksi2.prepareStatement("update runningteks_temp set isidisplay='"+jTextArea2.getText()+"'");
            try{                            
                ps.executeUpdate(); 
             }catch(Exception e){
                System.out.println(e);
             }finally{
                if(ps != null){
                    ps.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void cbc(){
         jComboBox1.removeAllItems();
        try{
            ResultSet rs=koneksi2.createStatement().executeQuery("select kategoriteks from runningteks");
            while(rs.next()){
                jComboBox1.addItem(rs.getString("kategoriteks"));
            }
        }catch(SQLException e){
            System.out.println(e+"Error");
        }
        
        
    }
    
    private void isicbc(){
    try {
            ps=koneksi2.prepareStatement("select isiteks from runningteks where kategoriteks='"+jComboBox1.getSelectedItem()+"'");
            try{           
                rs=ps.executeQuery();
                while(rs.next()){
                    jTextArea2.setText(rs.getString("isiteks"));
                }
            }catch(Exception e){
                
            }finally{
                if(rs != null){
                    rs.close();
                }
                
                if(ps != null){
                    ps.close();
                }
            }

        } catch (Exception e) {
            
        }
        
    }
    
    private void datab(){      
    try {
            ps=koneksi.prepareStatement("select ta_number from tantri where ta_status='O' and ta_type='B'");
            try{           
                rs=ps.executeQuery();
                while(rs.next()){
                    jLabel5.setText(rs.getString("ta_number"));
                }
            }catch(Exception e){
                
            }finally{
                if(rs != null){
                    rs.close();
                }
                
                if(ps != null){
                    ps.close();
                }
            }

        } catch (Exception e) {
            
        }
}
  
    private void datan(){      
    try {
            ps=koneksi.prepareStatement("select ta_number from tantri where ta_status='O' and ta_type='N'");
            try{           
                rs=ps.executeQuery();
                while(rs.next()){
                    jLabel6.setText(rs.getString("ta_number"));
                }
            }catch(Exception e){
                
            }finally{
                if(rs != null){
                    rs.close();
                }
                
                if(ps != null){
                    ps.close();
                }
            }

        } catch (Exception e) {
            
        }
}

    private void datab1(){      
    try {
            ps=koneksi.prepareStatement("select ta_number from tantri where ta_type='B' ORDER BY ta_id ASC");
            try{           
                rs=ps.executeQuery();
                while(rs.next()){
                    jLabel4.setText(rs.getString("ta_number"));
                }
            }catch(Exception e){
                
            }finally{
                if(rs != null){
                    rs.close();
                }
                
                if(ps != null){
                    ps.close();
                }
            }

        } catch (Exception e) {
            
        }
}
  
    private void datan1(){      
    try {
            ps=koneksi.prepareStatement("select ta_number from tantri where ta_type='N' ORDER BY ta_id ASC");
            try{           
                rs=ps.executeQuery();
                while(rs.next()){
                    jLabel2.setText(rs.getString("ta_number"));
                }
            }catch(Exception e){
                
            }finally{
                if(rs != null){
                    rs.close();
                }
                
                if(ps != null){
                    ps.close();
                }
            }

        } catch (Exception e) {
            
        }
}

    private void bb1(){
        String selisihb = jLabel4.getText().substring(1, 5);
        String selisihb1 = jLabel5.getText().substring(1, 5);
        int ttlb = Integer.parseInt(selisihb) - Integer.parseInt(selisihb1);
        jLabel7.setText(String.valueOf(ttlb));
    }
    
    private void nn1(){
        String selisihn = jLabel2.getText().substring(1, 5);
        String selisihn1 = jLabel6.getText().substring(1, 5);
        int ttln = Integer.parseInt(selisihn) - Integer.parseInt(selisihn1);
        jLabel3.setText(String.valueOf(ttln));
    }
    
    private void jam(){
        ActionListener taskPerformer = new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                datab();
                datan();
                datab1();
                datan1();
                bb1();
                nn1();
            }
        };
        // Timer
        new Timer(1000, taskPerformer).start();
    }
    
    private void ambilData(){
        try {
            ps=koneksi2.prepareStatement("select isidisplay from runningteks_temp");
            try{           
                rs=ps.executeQuery();
                while(rs.next()){
                    jLabel9.setText(rs.getString(1));
                }
            }catch(Exception e){
                
            }finally{
                if(rs != null){
                    rs.close();
                }
                
                if(ps != null){
                    ps.close();
                }
            }

        } catch (Exception e) {
            
        }
    }
    
//    private void stopTimer(){
//        ActionListener taskPerformer = new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//            }
//        };
//        // Timer
//        new Timer(1000, taskPerformer).stop();
//    }
    
    private void manual(){
        datab();
                datan();
                datab1();
                datan1();
                bb1();
                nn1();
    }
    
}
