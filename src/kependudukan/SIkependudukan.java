/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kependudukan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NanK
 */
public class SIkependudukan {
    
    private Connection konek;
    private Statement stat;
    private ResultSet rs;
    private int data;
    
    private void eksekusiAmbilSQL(String sql){
        try {
            konek = new Konekdatabase().koneksi();
            stat = konek.createStatement();
            rs = stat.executeQuery(sql);
            rs.last();
            this.data = rs.getRow();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SIkependudukan aa = new SIkependudukan();
        loadingbar pr = new loadingbar();
        pr.setVisible(true);
        
        aa.eksekusiAmbilSQL("SELECT * FROM data");
        int delay = aa.data * 20;
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(delay);
                pr.progressBar.setValue(i);
                pr.progressBar.setString(String.valueOf(i)+"%");
                pr.progressBar.setStringPainted(true);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        pr.setVisible(false);
        pr.dispose();
        beranda x = new beranda();
        x.setVisible(true);
        
    }
    
}
