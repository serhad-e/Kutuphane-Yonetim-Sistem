
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
public class metot {
    public static void txtfieldreset(javax.swing.JTextField txt)
    {
       // JOptionPane.showMessageDialog(null, "Geçerli bir değer giriniz! ");
           txt.setText("");
           txt.setEnabled(true);
    }
    public static void lblreset(javax.swing.JLabel lbl)
    {
        lbl.setText("");
        lbl.setEnabled(true);
        
    }
}
