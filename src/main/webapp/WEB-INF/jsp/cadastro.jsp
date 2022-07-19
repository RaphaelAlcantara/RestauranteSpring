<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 16/07/2022
  Time: 01:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="restaurantejsp.springboot.restaurante.modelo.Cliente" %>
<html>
<head>
    <title>Cadastro</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
</head>
<body class="uk-position-center">
<div>
<h1>Cadastro de Cliente</h1>

<form action="/cadastrar" method="POST">

    <div class="uk-margin">
        <label class="uk-form-label">CPF</label>
        <div class="uk-margin">
            <input class="uk-input uk-width-1" type="text" name="cpf">
        </div>
    </div>

    <div class="uk-margin">
        <label class="uk-form-label" >Nome</label>
        <div>
            <input class="uk-input uk-width-1" type="text" name="nome">
        </div>
    </div>

    <div class="uk-margin">
        <label class="uk-form-label" >Telefone</label>
        <div>
            <input class="uk-input uk-width-1" type="text" name="telefone">
        </div>
    </div>

    <div class="uk-margin">
        <label class="uk-form-label" >Email</label>
        <div>
            <input class="uk-input uk-width-1" type="text" name="email">
        </div>
    </div>

    <div class="uk-margin">
        <label class="uk-form-label" >Senha</label>
        <div>
            <input class="uk-input uk-width-1" type="text" name="senha">
        </div>
    </div>
    <div class="uk-align-center">
    <input type="submit" class="uk-button uk-button-primary" value="Confirmar" />
    <button type="button" class="uk-button uk-button-default" onclick="location.href='/'">Voltar</button>
    </div>
</form>

</div>
</body>
</html>
