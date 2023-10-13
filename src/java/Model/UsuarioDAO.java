/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Milagre
 */
public class UsuarioDAO {
    public Usuario buscar(String email, String senha){
         Connection con = ConexaoBD.getConectar();
      String sql = "SELECT * FROM usuario where email = '"+email+"' and senha = '"+senha+"' "; 
      Usuario us = new Usuario();
        try(PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                us.setNome(rs.getString("nome"));
                
                us.setEmail(rs.getString("email"));
                
                us.setSenha(rs.getString("senha"));
                
                us.setNivel_acesso(rs.getInt("nivel_acesso"));
                
     
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        return us;
    }
    
    public  Usuario validarCredenciais(String email, String senha) {

            Usuario e = buscar(email,senha);
           if(e==null){
               JOptionPane.showMessageDialog(null, "Credenciais invalidas");
           }else{
               if(e!=null){
                 return e;  
               }
           } 
           
        
     return null;
    }
    
}
