/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Milagre
 */
public class ConexaoBD {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String usuario = "root";
    private static final String senha = "34de78tg";
    private static final String url = "jdbc:mysql://localhost:3306/familia";
    
    public static Connection getConectar() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar a base de dados " + ex.getMessage());
        }
        return con;
    }
}
