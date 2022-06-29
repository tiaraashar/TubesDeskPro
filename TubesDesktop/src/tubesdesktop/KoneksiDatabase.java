/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubesdesktop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class KoneksiDatabase {
    
    private Connection connect;
   
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3308/tubes";
    private String username = "root";
    private String password = "";
    
public Connection getKoneksiDatabase(){
    if (connect == null){
        try{
            Class.forName(driver);
            System.out.println("Class driver ditemukan");
            
            connect = DriverManager.getConnection(url, username, password);
        }
            catch (ClassNotFoundException | SQLException ex){
    Logger.getLogger(KoneksiDatabase.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
    return connect;
    }
    public static void main(String[] args){
        KoneksiDatabase koneksi = new KoneksiDatabase();
        
        koneksi.getKoneksiDatabase();
    }
}