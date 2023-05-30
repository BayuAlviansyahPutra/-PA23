package projekakhirpbo23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    
    private Connection koneksi;
    public Connection getKoneksi() {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Koneksi Berhasil");
        } catch(ClassNotFoundException ex){
            
        }
        try{
            koneksi= DriverManager.getConnection("jdbc:mysql://localhost/bioskop","root","");
        } catch(SQLException ex){
            System.out.println("Koneksi Gagal");
        }
        return koneksi;
    }
}