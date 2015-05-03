<%--
  Created by IntelliJ IDEA.
  User: gabrielecugliari
  Date: 14/04/15
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
<meta charset=\"ISO-8859-1\" />
<title>Dati Confermati</title>
</head>
<body>
<h1>Hai confermato i seguenti dati</h1>
<ul>
<li>Nome: <b>
  <% out.print(session.getAttribute("NOMEPRODOTTO")); %>
</b></li>
<li>Prezzo: <b>
  <% session.getAttribute("PREZZO"); %>
</b></li>
<li>Descrizione: <b>
  <% session.getAttribute("DESCRIZIONE"); %>
</b></li>
</ul>
</body></html>
