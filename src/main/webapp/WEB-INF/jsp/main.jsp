<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 18/07/2022
  Time: 11:13
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

<h1 class="uk-heading-line uk-text-center"><p class="uk-align-center">${msg}</p></h1>
<div id="offcanvas-slide" uk-offcanvas>
    <div class="uk-offcanvas-bar">

        <ul class="uk-nav uk-nav-default">
            <li class="uk-active"><a>PEDIDOS</a></li>
            <li><a href="#">Meus pedidos</a></li>
            <li class="uk-nav-divider"></li>
            <li class="uk-active"><a href="#modal-example" uk-toggle>SAIR</a></li>
        </ul>
    </div>
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

<div class="uk-grid-column-small uk-grid-row-large uk-child-width-1-3@s uk-text-center" uk-grid>
    <div>
        <div>
            <div class="uk-card uk-card-default">
                <div class="uk-card-media-top">
                    <img src="https://img.cybercook.com.br/receitas/527/massa-de-pizza-7-840x480.jpeg?q=75" width="200" height="150" alt="">
                </div>
                <div class="uk-card-body">
                    <h3 class="uk-card-title">Media Top</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                    <p class="uk-text-bold">R$40,00</p>
                    <button class="uk-button uk-button-primary uk-button-small">Comprar</button>
                </div>
            </div>
        </div>
    </div>


</div>
</body>
</html>
