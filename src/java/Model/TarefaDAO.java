/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Milagre
 */
public class TarefaDAO {
    public Tarefa buscar(String nome){
        Connection con = ConexaoBD.getConectar();
        String sql = "SELECT * FROM usuario where nome = '"+nome+"' "; 
         Tarefa us = new Tarefa();
        try ( PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
                us.setId(rs.getInt("id"));
                us.setNome(rs.getString("nome"));
                us.setDescricao(rs.getString("descricao"));
                us.setCategoria(rs.getString("categoria"));
                us.setData_criacao(rs.getString("data_criacao"));
                us.setData_vencimento(rs.getString("data_venc"));
                us.setResponsavel(rs.getString("responsavel"));
                us.setEstado(rs.getString("estado"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return us;
    }

   

    public ArrayList<Tarefa> listar() {
         ArrayList<Tarefa> lista = new ArrayList<>();
        Connection con = ConexaoBD.getConectar();
        String sql = "Select * from tarefa where apagar = 'existe' order by responsavel asc  ";
        try ( PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tarefa us = new Tarefa();
                us.setId(rs.getInt("id"));
                us.setNome(rs.getString("nome"));
                us.setDescricao(rs.getString("descricao"));
                us.setCategoria(rs.getString("categoria"));
                us.setData_criacao(rs.getString("data_criacao"));
                us.setData_vencimento(rs.getString("data_venc"));
                us.setResponsavel(rs.getString("responsavel"));
                us.setEstado(rs.getString("estado"));
                us.setDelete(rs.getString("apagar"));
                

                lista.add(us);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return lista;
    }
    

}
