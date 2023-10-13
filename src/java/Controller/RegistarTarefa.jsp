<%-- 
    Document   : RegistarTarefa
    Created on : May 16, 2023, 11:43:20 AM
    Author     : Milagre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="styleR.css"/>
        <title>JSP Page</title>
    </head>
    <body>
         <div class="header">
        <h2>Registo de Tarefas</h2>
       <a href="EstatisticasView.jsp" class="button"> Estatisticas</a>
       <a  class="button" href="ListarTarefa.jsp" >Listar</a>
    </div>
        <form action="AddTarefa" class="form-control" method="post">
        <label for="">Nome da Tarefa</label>
        <input type=" text" name="nome" placeholder="Nome">
        <label for="data_nasc">Descricao</label>
        <textarea id="myTextarea" rows="4" cols="50" name="descricao"></textarea>
        <label for="data_nasc">Categoria</label>
        <select  name="categoria">
            <option value="Limpeza">Limpeza</option>
            <option value="Compra">Compra</option>
            <option value="Trabalho">Trabalho</option>
            <option value="Escolar">Escolar</option>
            <option value="Outro">Outro</option>
        </select>
        <label for="data_nasc">Data_Vencimento</label>
        <input type="date" name="data" class="data">

        <label for="">Responsavel</label>
        <input type=" text" name="resp">
        <input type="submit" value="Criar"> </form>
        
<script>
    function validarFormulario() {
          function validarFormulario() {
        var nomeTarefa = document.getElementsByName("apelido")[0].value;
        var descricao = document.getElementsByName("descricao")[0].value;
        var categoria = document.getElementsByName("nivel")[0].value;
        var dataVencimento = document.getElementsByName("data")[0].value;
        var responsavel = document.getElementsByName("resp")[0].value;
        var password = document.getElementById("password").value;

        if (nomeTarefa.trim() === "" || descricao.trim() === "" || categoria.trim() === "" || dataVencimento.trim() === "" || responsavel.trim() === "" || password.trim() === "") {
            alert("Por favor, preencha todos os campos obrigatórios.");
            return false;
        }

        return true;
    }
</script>

    </body>
</html>
