<%-- 
    Document   : EstatisticasView
    Created on : May 31, 2023, 5:45:17 AM
    Author     : Milagre
--%>

<%@page import="Model.Tarefa"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.EstatisticasDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    EstatisticasDAO dao = new EstatisticasDAO();
    ArrayList<Integer> totalTarefas = dao.getTotalTarefasPorEstado();
    ArrayList<Integer> totalRemovidos = dao.getTotalTarefasRemovidas();
  
    int totalPendentes = totalTarefas.get(0);
    int totalConcluidas = totalTarefas.get(1);
    int totalRemovidas = totalRemovidos.get(0);
    
    ArrayList<Tarefa> total_alocados = dao.getTotal_ALOCADOS();
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styleR.css"/>
    <title>Tabela de Tarefas</title>
</head>
<body>
    <h1>Tabela de Tarefas</h1>
    <table>
        <thead>
            <tr>
                <th>Estado</th>
                <th>Total</th>
                <th>Categoria</th>
                <th>Total Alocados</th>
                <th>Total Removidos</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Pendentes</td>
                <td><%= totalPendentes %></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>Concluídas</td>
                <td><%= totalConcluidas %></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <% 
                for (Tarefa tarefa : total_alocados) {
                    String categoria = tarefa.getCategoria();
                    int total = tarefa.getTotal_alocados();
            %>
            <tr>
                <td></td>
                <td></td>
                <td><%= categoria %></td>
                <td><%= total %></td>
                <td></td>
            </tr>
            <% } %>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><%= totalRemovidas %></td>
            </tr>
        </tbody>
    </table>
</body>
</html>


