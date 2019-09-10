<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: SonHT
  Date: 9/8/2019
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiment List</title>
</head>
<body>

<form action="/index" method="get">
    <h3>List of condiment</h3>
    <input type="checkbox" name="condiment" value="Lettuce">Lettuce
    <input type="checkbox" name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
<button>Submit</button>
    <div>
        <span>List of chosen condiment: ${condiment}</span>
    </div>
</form>
</body>
</html>
