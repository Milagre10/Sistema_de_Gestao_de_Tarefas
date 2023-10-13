/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Model;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;import java.sql.Connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Milagre
 */
public class AddTarefa extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
    try {
        Connection con = ConexaoBD.getConectar();
        String id = request.getParameter("id"); // ou algum outro identificador único do usuário
        String sql = "UPDATE tarefa SET estado='Concluido' WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        int updatedRows = ps.executeUpdate();
        if (updatedRows > 0) {
            out.println("<br><br><br><h1 align=center><font color=\"green\">Tarefa Terminada COM SUCESSO<br></font></h1>");
        } else {
            out.println("<br><br><br><h1 align=center><font color=\"red\">Tarefa NAO ENCONTRADA<br></font></h1>");
        }
    } catch (Exception e) {
        out.println("<br><br><br><h1 align=center><font color=\"red\">ERRO AO REMOVER USUÁRIO<br></font></h1>");
        e.printStackTrace(out);
    }
}

        
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        try {
            Connection con =ConexaoBD.getConectar();
            String nome = request.getParameter("nome");
            String descricao = request.getParameter("descricao");
            String categoria = request.getParameter("categoria");
            String data  = request.getParameter("data");
            String resp = request.getParameter("resp");
            
            String sql = "insert into tarefa (nome,descricao,data_venc,responsavel,categoria)\n" +
                     "values (?,?,?,?,?);";
          
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, descricao);
            ps.setString(3,data);
            ps.setString(4, resp);
            ps.setString(5, categoria);
           
             
           int ad= ps.executeUpdate();
           if(ad>0){
               out.println("<br><br><br><h1 align=center><font color=\"green\">ADICIONADO COM SUCESSO<br></font></h1>");
           }else{
               response.setContentType("text/html");  
		out.println("<br><br><br><h1 align=center><font color=\"red\">THERE IS SOME PROBLEM<br></font></h1>");  
           }
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
      @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        try {
            Connection con =ConexaoBD.getConectar();
            String nome = request.getParameter("nome");
            String descricao = request.getParameter("descricao");
            String categoria = request.getParameter("categoria");
            String data  = request.getParameter("data");
            String resp = request.getParameter("resp");
            
            String sql =" UPDATE tarefa SET nome = ?, descricao = ?, data_venc = ?, categoria = ?, responsavel = ?, estado = ? WHERE id = ?";
          
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, descricao);
            ps.setString(3,data);
            ps.setString(4, resp);
            ps.setString(5, categoria);
           
             
           int ad= ps.executeUpdate();
           if(ad>0){
               out.println("<br><br><br><h1 align=center><font color=\"green\">ADICIONADO COM SUCESSO<br></font></h1>");
           }else{
               response.setContentType("text/html");  
		out.println("<br><br><br><h1 align=center><font color=\"red\">THERE IS SOME PROBLEM<br></font></h1>");  
           }
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }

}
