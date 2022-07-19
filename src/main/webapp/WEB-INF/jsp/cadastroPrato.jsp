<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 18/07/2022
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro Pratos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
</head>
<body class="uk-position-center">
<div>
    <h1>Cadastro de Pratos</h1>

    <form action="/cadastrarPrato" method="POST">

        <div class="uk-margin">
            <label class="uk-form-label">Nome</label>
            <div class="uk-margin">
                <input class="uk-input uk-width-1" type="text" name="nome">
            </div>
        </div>

        <div class="uk-margin">
            <label class="uk-form-label" >Descrição do prato</label>
            <div>
                <input class="uk-input uk-width-1" type="text" name="descricao">
            </div>
        </div>

        <div class="uk-margin">
            <label class="uk-form-label" >Preço</label>
            <div>
                <input class="uk-input uk-width-1" type="number" step="0.5" min="0" name="preco">
            </div>
        </div>

        <div class="uk-margin">
            <label class="uk-form-label" >Url da imagem</label>
            <div>
                <input class="uk-input uk-width-1" type="text" name="urlImagem">
            </div>
        </div>
        <div class="uk-align-center">
            <input type="submit" class="uk-button uk-button-primary" value="Confirmar" />
            <button type="button" class="uk-button uk-button-default" onclick="location.href='/mainADM'">Voltar</button>
        </div>
    </form>

</div>
</body>
</html>
