<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="restaurantejsp.springboot.restaurante.modelo.Cliente" %>
<%@ page import="restaurantejsp.springboot.restaurante.repositorio.ClienteRepositorio" %>
<%@ page import="restaurantejsp.springboot.restaurante.controller.ClienteController" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 17/07/2022
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
    <title>Lista clientes</title>
</head>
<body>
  <h1>Lista de clientes</h1>
  <table class="uk-table uk-table-hover uk-table-divider">
    <thead>
    <tr >
      <th>CPF</th>
      <th>Nome</th>
      <th>Telefone</th>
      <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <c:forEach var="cliente" items="${clientes}">
    <tr>
        <td>${cliente.cpf}</td>
        <td>${cliente.nome}</td>
        <td>${cliente.telefone}</td>
        <td>${cliente.email}</td>
        <td><button onclick="location.href='/excluir${cliente.cpf}'">Remover</button></td>
    </tr>
        </c:forEach>
    </tbody>
  </table>
  <button class="uk-button uk-button-default" type="button" onclick="location.href='/main'">Voltar</button>
</body>
</html>
