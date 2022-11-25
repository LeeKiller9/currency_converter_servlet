<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Currency Converter</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<h1><%= "Currency Converter USD To VND" %>
</h1>
<br/>
<form action="/Servlet_convert" method="post">
    <label for="rate">Rate 1 USD To VND:</label>
    <input id="rate" type="number" name="rate" value="0" placeholder="Rate"><br>
    <label for="amount">Amount:</label>
    <input id="amount" type="number" name="amount" value="0" placeholder="Amount"><br>
    <button type="submit">Convert</button>
</form>
</body>
</html>