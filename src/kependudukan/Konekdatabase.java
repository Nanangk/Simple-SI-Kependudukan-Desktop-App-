/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kependudukan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NanK
 */
public class Konekdatabase {
    public Connection conn;
    
    public Connection koneksi(){ //koneksi database
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/penduduk", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Konekdatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
