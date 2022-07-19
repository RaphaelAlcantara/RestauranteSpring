<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 19/07/2022
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro Pagamentos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
</head>
<body class="uk-position-center">
<div>
    <h1>Cadastro de Pagamentos</h1>

    <form action="/cadastrarPagamento" method="POST">

        <div class="uk-margin">
            <label class="uk-form-label">Descrição do prato</label>
            <div>
                <input class="uk-input uk-width-1" type="text" name="descricao">
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
