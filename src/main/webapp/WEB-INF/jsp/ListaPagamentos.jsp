<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 19/07/2022
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
    <title>Lista Pagamentos</title>
</head>
<body>
<h1>Lista de pagamentos</h1>
<table class="uk-table uk-table-hover uk-table-divider">
    <thead>
    <tr >
        <th>ID</th>
        <th>Descrição</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="pagamento" items="${pagamentos}">
    <tr>
        <td>${pagamento.id}</td>
        <td>${pagamento.descricao}</td>

        <td><button onclick="location.href='/excluirPagamento${pagamento.id}'">Remover</button></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<button class="uk-button uk-button-default" type="button" onclick="location.href='/mainADM'">Voltar</button>
</body>
</html>
