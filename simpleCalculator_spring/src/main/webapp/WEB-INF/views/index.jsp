<%--
  Created by IntelliJ IDEA.
  User: SonHT
  Date: 9/9/2019
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="get" action="/index">
    <h3>Result: ${result}</h3>
    <input type="number" name="firstNumber">
    <input type="number" name="secondNumber">
    <div>
        <button name="plus">+</button>
        <button name="minus">-</button>
        <button name="multiply">x</button>
        <button name="division">/</button>
    </div>
</form>
</body>
</html>
