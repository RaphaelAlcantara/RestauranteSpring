<%--
  Created by IntelliJ IDEA.
  User: rapha
  Date: 15/07/2022
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="uk-position-center">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.15.1/dist/css/uikit.min.css" />
    <title>Login</title>
</head>
<body  >
  <h1>Bem-vindo!</h1>


  <form >
      <div class="uk-inline">
          <span class="uk-form-icon" uk-icon="icon: user">
              <svg width="20" height="20" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><circle fill="none" stroke="#000" stroke-width="1.1" cx="9.9" cy="6.4" r="4.4"></circle><path fill="none" stroke="#000" stroke-width="1.1" d="M1.5,19 C2.3,14.5 5.8,11.2 10,11.2 C14.2,11.2 17.7,14.6 18.5,19.2"></path></svg>
          </span>
          <input class="uk-input">
      </div>
      <div class="uk-margin">
          <div class="uk-inline">
              <span class="uk-form-icon uk-form-icon-flip" uk-icon="icon: lock">
                  <svg width="20" height="20" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><rect fill="none" stroke="#000" height="10" width="13" y="8.5" x="3.5"></rect><path fill="none" stroke="#000" d="M6.5,8 L6.5,4.88 C6.5,3.01 8.07,1.5 10,1.5 C11.93,1.5 13.5,3.01 13.5,4.88 L13.5,8"></path></svg>
              </span>
              <input class="uk-input" type="password">
          </div>
      </div>

  </form>
    <button class="uk-button uk-button-link" onclick="window.location.href='/cadastrar'">Cadastrar</button>
    <button class="uk-button uk-button-primary" onclick="window.location.href='/inicial'">Entrar</button>
</body>
</html>
