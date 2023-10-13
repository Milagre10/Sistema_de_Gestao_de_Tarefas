<%-- 
    Document   : RegistoTarefa
    Created on : May 16, 2023, 11:51:12 AM
    Author     : Milagre
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-pt">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
        <label for="">Nome da Tarefa</label>
        <input type=" text" name="nome" placeholder="Nome" required="">
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
        <script>

</body>

</html>

