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
public class Parte2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
    try {
        Connection con = ConexaoBD.getConectar();
        String id = request.getParameter("id"); // ou algum outro identificador único do usuário
        String sql = "UPDATE tarefa SET apagar='Nao_Existe' WHERE id=?";
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
        
        
    }

}
