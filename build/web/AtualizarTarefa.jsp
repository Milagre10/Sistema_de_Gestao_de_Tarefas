<%-- 
    Document   : AtualizarTarefa
    Created on : May 17, 2023, 3:44:26 AM
    Author     : Milagre
--%>

<%@page import="Model.Tarefa"%>
<%@page import="Model.TarefaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <style>
        .header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center; 
        }
        
        .form-control {
            width: 900px;
            height: 500px;
            margin: 20px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        
        .form-control label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }
        
        .form-control input {
            width: 400px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        
        .form-control input[type="submit"] {
            background-color: #333;
            display: block;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            width: 100px;
            margin-right: 30px;
            margin: 20px 0px 20px 100px;
            margin: top right bottom left;
        }
        
        .form-control input[type="submit"]:hover {
            background-color: #555;
        }
        
        select {
            width: 420px;
            padding: 10px;
            display: block;
            margin-bottom: 20px;
        }
        
        #myTextarea {
            width: 400px;
            height: 100px;
            padding: 10px;
            font-family: Arial, sans-serif;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
    </style>
    </head>
    <body>
         <div class="header">
        <h2>Registo de Tarefa</h2>
    </div>
    <form action="AddTarefa" method="post" class="form-control">
            <%
    // Recuperar o ID da tarefa a ser editada
    String nome = request.getParameter("nome");

    // Obter os dados da tarefa do banco de dados com base no ID
    TarefaDAO tarefaDao = new TarefaDAO();
    Tarefa tarefa = tarefaDao.buscar(nome);
out.println(tarefaDao.buscar(nome));
%>
        <label for="">Nome da Tarefa</label>
        <input type=" text" name="nome" placeholder="Nome" required="" value="<%= tarefa.getNome() %>">
        <label for="data_nasc">Descricao</label>
        <textarea id="myTextarea" rows="4" cols="50" name="descricao" required=""></textarea>
        <label for="data_nasc">Categoria</label>
        <select name="nivel" name="nivel">
            <option value="Limpeza">Limpeza</option>
            <option value="Trabalho">Compra</option>
            <option value="Trabalho">Trabalho</option>
            <option value="Escolar">Escolar</option>
            <option value="Outro">Outro</option>
        </select>
        <label for="data_nasc">Data_Vencimento</label>
        <input type="date" name="data" name="data" required="">

        <label for="">Responsavel</label>
        <input type=" text" name="resp" required="">
        <input type="submit" value="Criar" name="criar" ></form>
        <%
    // Recuperar o ID da tarefa a ser editada
    
%>



        <script>
            function validarFormulario() {
                var nomeTarefa = document.getElementsByName("apelido")[0].value;
                var dataCriacao = document.getElementsByName("criacao")[0].value;
                var dataVencimento = document.getElementsByName("data_venc")[0].value;
                var responsavel = document.getElementsByName("resp")[0].value;

                if (nomeTarefa === "" || dataCriacao === "" || dataVencimento === "" || responsavel === "") {
                    alert("Por favor, preencha todos os campos.");
                    return false;
                }

                // Aqui você pode adicionar outras validações específicas, se necessário

                return true;
            }
        </script>
    </body>
</html>
