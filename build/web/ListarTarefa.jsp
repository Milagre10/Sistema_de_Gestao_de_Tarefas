            <%-- 
    Document   : ListarTarefa
    Created on : May 16, 2023, 2:14:38 PM
    Author     : Milagre
--%>

<%@page import="Model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Tarefa"%>
<%@page import="Model.TarefaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="styleR.css"/>
    </head>
    <body>
        <h1 class="title"> Lista de Tarefas</h1>

    <center><form>
            <table>
                <thead>
                    <tr>

                        <th>Nome</th>
                        <th>Descricao</th>
                        <th>Data_Criacao</th>
                        <th>Categoria</th>
                        <th>Data_Vencimento</th>
                        <th>Responsavel</th>
                        <th>ID</th>
                        <th>Estado</th>
                         <td>Opcoes</td>
                            <td>Ordenar</td>
                    </tr>
                </thead>
                <tbody>
                <tbody>
                    
                    <%
                       
                        TarefaDAO da = new TarefaDAO();
                        ArrayList<Tarefa> lista = da.listar();
                        for (Tarefa us : lista) {
                    %>
                    <tr class="alternando">

                        <td><%= us.getNome()%></td>
                        <td><%= us.getDescricao()%></td>
                        <td><%= us.getData_criacao()%></td>
                        <td><%= us.getCategoria()%></td>
                        <td><%= us.getData_vencimento()%></td>
                        <td><%= us.getResponsavel()%></td>
                        <td><%= us.getId()%></td>
                        <td><%= us.getEstado()%></td>
                        <td>
                            
                            <a href="AddTarefa?id=<%= us.getId()%>&_method=GET" class="button"> CONCLUIR</a>
                            <a href="Parte2?id=<%= us.getId()%>&_method=GET" class="button"> REMOVER</a>
                        </td>
                         <td>
                            
                            <a href="AddTarefa?id=<%= us.getId()%>&_method=GET" class="button"> CONCLUIR</a>
                            <a href="Parte2?id=<%= us.getId()%>&_method=GET" class="button"> REMOVER</a>
                        </td> 

                    </tr>
                    <% }%>
                    
                </tbody>


                </tbody>
            </table>
              
            </body>
            </html>
