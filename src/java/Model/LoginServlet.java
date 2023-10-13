/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Model;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Milagre
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Aceitar o username e senha do index.html
        String email = request.getParameter("nome");
        String senha = request.getParameter("senha");

        // Base de dados
        try {
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuario = dao.validarCredenciais(email, senha);
            if (usuario == null) {
                out.println("Senha ou Usuario Invalido");
            } else {
                if (usuario.getNivel_acesso() == 1) {

                    response.sendRedirect("RegistarTarefa.jsp");
                } else {
                    if (usuario.getNivel_acesso() == 2 || usuario.getNivel_acesso() == 1 || usuario.getNivel_acesso() == 3) {
                        response.sendRedirect("ListarTarefa.jsp");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // Tratamento adequado de exceção deve ser feito aqui
        }
    }

}
