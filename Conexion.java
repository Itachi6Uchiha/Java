# Java

package formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class formulario extends javax.swing.JFrame {

>>
    public static final String URL = "jdbc:mysql://localhost/bd";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
>>>    
    public formulario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    [Generated Code]
    
    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            Connection con = null;
            con = getConection();
            PreparedStatement ps;
            ResultSet res;

            ps = con.prepareStatement("SELECT * FROM clientes");
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(null, res.getString("nom_cli") + " " + res.getString("ape_cli"));
            } else {

                JOptionPane.showMessageDialog(null, "No existen Datos");
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    
<<<     
    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;

    }
>>>    
    public static void main(String args[]) {
        [Look and feel setting code (optional)]

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConectar;
    // End of variables declaration                   
}
    
<<
