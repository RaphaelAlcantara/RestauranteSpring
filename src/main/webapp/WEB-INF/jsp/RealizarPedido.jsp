<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 19/07/2022
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>




    <html>
    <head>
        <title>Realizar pedido</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
    </head>
    <body class="uk-position-center">
    <div>
        <h1>Realizar pedidos</h1>

        <form action="/cadastrarPedido" method="POST">

            <div class="uk-margin">
                <label class="uk-form-label">Nome</label>
                <div class="uk-margin">
                    <input class="uk-input uk-width-1" type="text" name="nome" value="${cliente}">
                </div>
            </div>

            <div class="uk-margin">
                <label class="uk-form-label" >Nome do prato</label>
                <div>
                    <input class="uk-input uk-width-1" type="text" name="prato" value="${prato}" >
                </div>
            </div>

            <div class="uk-margin">
                <label class="uk-form-label" >Preço</label>
                <div>
                    <input class="uk-input uk-width-1" type="number" step="0.5" min="0" name="preco" value="${preco}">
                </div>
            </div>

            <div class="uk-modal-body">
                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-select">Forma de pagamento</label>
                    <div class="uk-form-controls">

                        <select class="uk-select" id="form-stacked-select" name="pagamento">
                            <c:forEach var="pagamento" items="${pagamentos}">
                                <option typeof="text"  value="${pagamento.descricao}" >${pagamento.descricao}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
            </div>

            <div class="uk-margin">
                <label class="uk-form-label" for="form-stacked-text">Observações</label>
                <div class="uk-form-controls">
                    <input class="uk-input" id="form-stacked-text" type="text" placeholder="Sem cebola, sem tomate..." name="observacao">
                </div>
            </div>


            <div class="uk-align-center">
                <input type="submit" class="uk-button uk-button-primary" value="Confirmar" />
                <button type="button" class="uk-button uk-button-default" onclick="location.href='/main'">Voltar</button>
            </div>
        </form>

    </div>
    </body>
    </html>
