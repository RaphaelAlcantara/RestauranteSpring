<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 18/07/2022
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/js/uikit.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/js/uikit-icons.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>

<body>
<a href="#offcanvas-slide" class="uk-button uk-button-default" uk-toggle>MENU</a>

<div id="offcanvas-slide" uk-offcanvas>
    <div class="uk-offcanvas-bar">

        <ul class="uk-nav uk-nav-default">
            <li class="uk-active"><a>CLIENTES</a></li>
            <li><a href="/consultar">Listar</a></li>
            <li class="uk-nav-header">PRATOS</li>
            <li><a href="#">Item</a></li>
            <li><a href="#">Item</a></li>
            <li class="uk-nav-divider"></li>
            <li class="uk-active"><a href="#modal-example" uk-toggle>SAIR</a></li>
        </ul>

    </div>

    <div id="modal-example" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h1 class="uk-modal-title">Deseja mesmo sair?</h1>
            <p class="uk-text-right">
                <button class="uk-button uk-button-default uk-modal-close" type="button">Cancel</button>
                <button class="uk-button uk-button-primary" type="button" onclick="window.location.href='/'">Sair</button>
            </p>
        </div>
    </div>
</div>
</body>
</html>
