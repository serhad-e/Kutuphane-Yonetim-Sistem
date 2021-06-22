
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serhad
 */
public class k_db {
    public static Connection conn_db()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Serhad\\Desktop\\kutuphane\\kutuphanedb.sqlite");
            return conn;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
