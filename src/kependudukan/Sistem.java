/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kependudukan;

import java.applet.AudioClip;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

//import java.awt.Toolkit;

/**
 *
 * @author NanK
 */
public class Sistem extends javax.swing.JFrame {
    AudioClip soundtract;
    private Connection konek;
    private Statement stat;
    private ResultSet rs;
    private ButtonModel rbPria;
    private ButtonModel rbPerempuan;
    
    /**
     * Creates new form Sistem
     */
    public Sistem() {
        initComponents();
        updateTabel();
        rbJenisKelaminGroup.add(kelamin1);
        rbJenisKelaminGroup.add(kelamin2);
        this.rbPria = kelamin1.getModel();
        this.rbPerempuan = kelamin2.getModel();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbJenisKelaminGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        NIKlabel = new javax.swing.JLabel();
        NamaLabel = new javax.swing.JLabel();
        Umurlabel = new javax.swing.JLabel();
        Jeniskelaminlabel = new javax.swing.JLabel();
        Agamalab = new javax.swing.JLabel();
        Statuslab = new javax.swing.JLabel();
        inputNIK = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputUmur = new javax.swing.JTextField();
        cbAgama = new javax.swing.JComboBox<String>();
        cbStatus = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        kelamin1 = new javax.swing.JRadioButton();
        kelamin2 = new javax.swing.JRadioButton();
        btnDataBaru = new javax.swing.JButton();
        btnHapusData = new javax.swing.JButton();
        btnUpdateData1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARSIP DATA MAHASISWA");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 850));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NIKlabel.setBackground(new java.awt.Color(39, 129, 191));
        NIKlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NIKlabel.setForeground(new java.awt.Color(39, 129, 191));
        NIKlabel.setText("NIK");
        jPanel1.add(NIKlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 55, 35));

        NamaLabel.setBackground(new java.awt.Color(39, 129, 191));
        NamaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NamaLabel.setForeground(new java.awt.Color(39, 129, 191));
        NamaLabel.setText("Nama");
        jPanel1.add(NamaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        Umurlabel.setBackground(new java.awt.Color(39, 129, 191));
        Umurlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Umurlabel.setForeground(new java.awt.Color(39, 129, 191));
        Umurlabel.setText("Umur");
        jPanel1.add(Umurlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 55, 30));

        Jeniskelaminlabel.setBackground(new java.awt.Color(39, 129, 191));
        Jeniskelaminlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jeniskelaminlabel.setForeground(new java.awt.Color(39, 129, 191));
        Jeniskelaminlabel.setText("Jenis Kelamin");
        jPanel1.add(Jeniskelaminlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 29));

        Agamalab.setBackground(new java.awt.Color(39, 129, 191));
        Agamalab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Agamalab.setForeground(new java.awt.Color(39, 129, 191));
        Agamalab.setText("Agama");
        jPanel1.add(Agamalab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 30));

        Statuslab.setBackground(new java.awt.Color(39, 129, 191));
        Statuslab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Statuslab.setForeground(new java.awt.Color(39, 129, 191));
        Statuslab.setText("Status");
        jPanel1.add(Statuslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 62, 30));

        inputNIK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(inputNIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 275, 35));

        inputNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(inputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 275, 35));

        inputUmur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(inputUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 275, 35));

        cbAgama.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        cbAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Agama", "Islam", "Hindu", "Budha", "Kristen", "Katolik" }));
        jPanel1.add(cbAgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 275, 34));

        cbStatus.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Status", "Menikah", "Belum Menikah" }));
        jPanel1.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 275, 30));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 5, 35, 35));

        kelamin1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        kelamin1.setText("Laki-Laki");
        kelamin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelamin1ActionPerformed(evt);
            }
        });
        jPanel1.add(kelamin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        kelamin2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        kelamin2.setText("Perempuan");
        kelamin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelamin2ActionPerformed(evt);
            }
        });
        jPanel1.add(kelamin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        btnDataBaru.setBackground(new java.awt.Color(9, 90, 146));
        btnDataBaru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDataBaru.setForeground(new java.awt.Color(255, 255, 255));
        btnDataBaru.setText("Tambah");
        btnDataBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBaruActionPerformed(evt);
            }
        });
        jPanel1.add(btnDataBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 40));

        btnHapusData.setBackground(new java.awt.Color(9, 90, 146));
        btnHapusData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapusData.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusData.setText("Hapus ");
        btnHapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapusData, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 40));

        btnUpdateData1.setBackground(new java.awt.Color(9, 90, 146));
        btnUpdateData1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdateData1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateData1.setText("Ubah");
        btnUpdateData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateData1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 40));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("REPORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 180, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 90, 950, 220);

        jScrollPane1.setBackground(new java.awt.Color(0, 255, 204));

        tabelData.setBackground(new java.awt.Color(102, 255, 204));
        tabelData.setFont(new java.awt.Font("Bebas Neue", 0, 18));
        JTableHeader header = tabelData.getTableHeader();
        header.setFont(new java.awt.Font("Bebas Neue", 0, 28));
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIK", "Nama", "Umur", "Jenis Kelamin", "Agama", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelData.setGridColor(new java.awt.Color(240, 240, 240));
        tabelData.setOpaque(false);
        tabelData.setRowMargin(2);
        tabelData.setSelectionBackground(new java.awt.Color(0, 255, 51));
        tabelData.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);
        if (tabelData.getColumnModel().getColumnCount() > 0) {
            tabelData.getColumnModel().getColumn(0).setResizable(false);
            tabelData.getColumnModel().getColumn(0).setHeaderValue("No");
            tabelData.getColumnModel().getColumn(1).setResizable(false);
            tabelData.getColumnModel().getColumn(1).setHeaderValue("NIK");
            tabelData.getColumnModel().getColumn(2).setResizable(false);
            tabelData.getColumnModel().getColumn(2).setHeaderValue("Nama");
            tabelData.getColumnModel().getColumn(3).setResizable(false);
            tabelData.getColumnModel().getColumn(3).setHeaderValue("Umur");
            tabelData.getColumnModel().getColumn(4).setResizable(false);
            tabelData.getColumnModel().getColumn(4).setHeaderValue("Jenis Kelamin");
            tabelData.getColumnModel().getColumn(5).setResizable(false);
            tabelData.getColumnModel().getColumn(5).setHeaderValue("Agama");
            tabelData.getColumnModel().getColumn(6).setResizable(false);
            tabelData.getColumnModel().getColumn(6).setHeaderValue("Status");
        }
        tabelData.setAutoResizeMode(tabelData.AUTO_RESIZE_OFF);
        tabelData.getColumnModel().getColumn(0).setPreferredWidth(43);
        tabelData.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelData.getColumnModel().getColumn(2).setPreferredWidth(225);
        tabelData.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabelData.getColumnModel().getColumn(4).setPreferredWidth(140);
        tabelData.getColumnModel().getColumn(6).setPreferredWidth(135);
        tabelData.setRowHeight(40);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 949, 420);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 20, 70, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bantuan.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(870, 10, 50, 50);

        jLabel2.setBackground(new java.awt.Color(39, 129, 191));
        jLabel2.setFont(new java.awt.Font("A-Space Black Demo", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA PENDUDUK");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 30, 490, 46);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsdsdsxxx7.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(940, 0, 60, 60);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdsddsdd.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel3.setMinimumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1020, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void eksekusiUpdateSQL(String sql){
        try {
            konek = new Konekdatabase().koneksi();
            stat = konek.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"BERHASIL");
            this.updateTabel();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"GAGAL");
            
        }
    }
    
    private void eksekusiAmbilSQL(String sql){
        try {
            konek = new Konekdatabase().koneksi();
            stat = konek.createStatement();
            rs = stat.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void updateTabel(){
        
       
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
        model.setRowCount(0);
        
       
        String sql = "SELECT * FROM data";
        String NIK, namaLengkap, umur, jenisKelamin, agama, status;
        this.eksekusiAmbilSQL(sql);
        
        int id = 0;
        try {
            while(rs.next()){
                Object[] rowData = null;
                ((DefaultTableModel) tabelData.getModel()).addRow(rowData);
                
               
                NIK = rs.getString("NIK");
                namaLengkap = rs.getString("FullName");
                umur = rs.getString("umur")+" Thn";
                jenisKelamin = rs.getString("jenis-kelamin");
                agama = rs.getString("agama");
                status = rs.getString("status");
                
                
                tabelData.setValueAt(id+1, id, 0);
                tabelData.setValueAt(NIK, id, 1);
                tabelData.setValueAt(namaLengkap, id, 2);
                tabelData.setValueAt(umur, id, 3);
                tabelData.setValueAt(jenisKelamin, id, 4);
                tabelData.setValueAt(agama, id, 5);
                tabelData.setValueAt(status, id, 6);
                id++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sistem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void resetPanelInput(){
        inputNIK.setText("");
        inputNIK.setEditable(true);
        inputNama.setText("");
        inputUmur.setText("");
        
      
        rbJenisKelaminGroup.clearSelection();
        
        cbAgama.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);
    }
    
    private void progressBar(){
        
    }
    
    private void btnHapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataActionPerformed
        String NIK = inputNIK.getText();
        String sql = "DELETE FROM data WHERE NIK='%s'";
        sql = String.format(sql, NIK);
        
    
        this.eksekusiUpdateSQL(sql);
        
      
        this.resetPanelInput();
    }//GEN-LAST:event_btnHapusDataActionPerformed

    private void btnDataBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBaruActionPerformed
        String NIK, NamaFull, jenisKelamin="", agama="", status="";
        int umur;
        
        
        NIK = inputNIK.getText();
        NamaFull = inputNama.getText();
        umur = Integer.parseInt(inputUmur.getText());
        
    
        if (rbPria.isSelected()) {
            jenisKelamin="Laki-Laki";
        }
        else if (rbPerempuan.isSelected()) {
            jenisKelamin="perempuan";
        }
        
  
        switch (cbAgama.getSelectedIndex()) {
            case 1:
                agama="Islam";
                break;
            case 2:
                agama="Hindu";
                break;
            case 3:
                agama="Budha";
                break; 
            case 4:
                agama="Kristen";
                break;
            case 5:
                agama="Katolik";
                break;
            default:
                break;
        }
     
        switch (cbStatus.getSelectedIndex()) {
            case 1:
                status="Menikah";
                break;
            case 2:
                status="Belum Menikah";
                break;
            default:
                status="";
                break;
        }
        String sql = "INSERT INTO data VALUES ('%s', '%s', %d, '%s', '%s', '%s')";
        sql = String.format(sql, NIK, NamaFull,umur, jenisKelamin, agama, status);
        this.eksekusiUpdateSQL(sql);
        
       
        this.resetPanelInput();
    }//GEN-LAST:event_btnDataBaruActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        int baris = tabelData.getSelectedRow();
        String NIK = tabelData.getModel().getValueAt(baris, 1).toString();
        String sql = "SELECT * FROM data WHERE NIK ='%s'";
        sql = String.format(sql, NIK);
        this.eksekusiAmbilSQL(sql);
        try {
            rbJenisKelaminGroup.clearSelection();
            if (rs.next()) {
                inputNIK.setText(rs.getString("NIK"));
                inputNIK.setEditable(false);
                inputNama.setText(rs.getString("FullName"));
                inputUmur.setText(rs.getString("umur"));
                
            
                String jenisKelamin = rs.getString("jenis-kelamin");
                System.out.println(jenisKelamin);
                if ("Laki-Laki".equals(jenisKelamin)) {
                    System.out.println("laki");
                    rbJenisKelaminGroup.setSelected(rbPria, true);
                    rbJenisKelaminGroup.setSelected(rbPerempuan, false);
                }
                else if ("Perempuan".equals(jenisKelamin)) {
                    System.out.println("perempuan");
                    rbJenisKelaminGroup.setSelected(rbPria, false);
                    rbJenisKelaminGroup.setSelected(rbPerempuan, true);
                }
                
               
                String agama = rs.getString("agama");
                switch (agama) {
                    case "Islam":
                        cbAgama.setSelectedIndex(1);
                        break;
                    case "Hindu":
                        cbAgama.setSelectedIndex(2);
                        break;
                    case "Budha":
                        cbAgama.setSelectedIndex(3);
                        break;
                    case "Kristen":
                        cbAgama.setSelectedIndex(4);
                        break;
                    case "Katolik":
                        cbAgama.setSelectedIndex(5);
                        break;
                    default:
                        cbAgama.setSelectedIndex(0);
                        break;
                }
                
            
                String status = rs.getString("status");
                switch (status) {
                    case "Menikah":
                        cbStatus.setSelectedIndex(1);
                        break;
                    case "Belum Menikah":
                        cbStatus.setSelectedIndex(2);
                        break;
                    default:
                        cbStatus.setSelectedIndex(0);
                        break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tabelDataMouseClicked

    private void kelamin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelamin1ActionPerformed
        rbPria = rbJenisKelaminGroup.getSelection();
    }//GEN-LAST:event_kelamin1ActionPerformed

    private void kelamin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelamin2ActionPerformed
        rbPerempuan = rbJenisKelaminGroup.getSelection();
    }//GEN-LAST:event_kelamin2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        resetPanelInput();
        updateTabel();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JOptionPane.showMessageDialog(null,"Hubungi Developer Untuk Bantuan");
    }//GEN-LAST:event_jLabel5MouseClicked
     
    private void btnUpdateData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateData1ActionPerformed
        String NIK, NamaFull,  jenisKelamin="", agama="", status="";
        int umur;
    
        NIK = inputNIK.getText();
        NamaFull = inputNama.getText();
        umur = Integer.parseInt(inputUmur.getText());
        
        //jenis Kelamin
        if (rbPria.isSelected()) {
            jenisKelamin="Laki-Laki";
        }
        else if (rbPerempuan.isSelected()) {
            jenisKelamin="perempuan";
        }
        
       
        switch (cbAgama.getSelectedIndex()) {
            case 1:
                agama="Islam";
                break;
            case 2:
                agama="Hindu";
                break;
            case 3:
                agama="Budha";
                break; 
            case 4:
                agama="Kristen";
                break;
            case 5:
                agama="Katolik";
                break;
            default:
                agama="";
                break;
        }
      
        String sql = "UPDATE `data` SET `FullName`='%s',`umur`=%d,`jenis-kelamin`='%s',`agama`='%s' WHERE `NIK`='%s'";
        sql = String.format(sql, NamaFull,  umur, jenisKelamin, agama, NIK);
        this.eksekusiUpdateSQL(sql);
        
       
        this.resetPanelInput();// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateData1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "SELECT * FROM data";  
        try {
            ResultSet rs = stat.executeQuery(sql);
            JasperPrint jasperPrint;       
            JRResultSetDataSource jrRS = new JRResultSetDataSource (rs);            
            JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\NanK\\Documents\\NetBeansProjects\\SIKependudukan\\src\\kependudukan\\cetak.jrxml");          
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak Ada Laporan "+e);
        } // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistem().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agamalab;
    private javax.swing.JLabel Jeniskelaminlabel;
    private javax.swing.JLabel NIKlabel;
    private javax.swing.JLabel NamaLabel;
    private javax.swing.JLabel Statuslab;
    private javax.swing.JLabel Umurlabel;
    private javax.swing.JButton btnDataBaru;
    private javax.swing.JButton btnHapusData;
    private javax.swing.JButton btnUpdateData1;
    private javax.swing.JComboBox<String> cbAgama;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JTextField inputNIK;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputUmur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kelamin1;
    private javax.swing.JRadioButton kelamin2;
    private javax.swing.ButtonGroup rbJenisKelaminGroup;
    private javax.swing.JTable tabelData;
    // End of variables declaration//GEN-END:variables
}
