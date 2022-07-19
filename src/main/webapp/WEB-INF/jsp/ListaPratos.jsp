<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 18/07/2022
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
    <title>Lista Pratos</title>
</head>
<body>
<h1>Lista de pratos</h1>
<table class="uk-table uk-table-hover uk-table-divider">
    <thead>
    <tr >
        <th>ID</th>
        <th>Nome</th>
        <th>Descrição</th>
        <th>Preço</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="prato" items="${pratos}">
    <tr>
        <td>${prato.id}</td>
        <td>${prato.nome}</td>
        <td>${prato.descricao}</td>
        <td>R$${prato.preco}</td>
        <td><button onclick="location.href='/excluirPrato${prato.id}'">Remover</button></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<button class="uk-button uk-button-default" type="button" onclick="location.href='/mainADM'">Voltar</button>
</body>
</html>
