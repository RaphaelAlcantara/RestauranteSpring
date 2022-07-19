<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 19/07/2022
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
    <title>Meus pedidos</title>
</head>
<body>
<h1>Meus pedidos</h1>
<table class="uk-table uk-table-hover uk-table-divider">
    <thead>
    <tr >
        <th>ID</th>
        <th>Nome</th>
        <th>Nome do prato</th>
        <th>Preço</th>
        <th>Observação</th>
        <th>Data</th>
        <th>Forma de Pagamento</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="pedido" items="${pedidos}">
    <tr>
        <td>${pedido.id}</td>
        <td>${pedido.nome}</td>
        <td>${pedido.prato}</td>
        <td>${pedido.preco}</td>
        <td>${pedido.observacao}</td>
        <td>${pedido.data}</td>
        <td>${pedido.pagamento}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<button class="uk-button uk-button-default" type="button" onclick="location.href='/main'">Voltar</button>
</body>
</html>
