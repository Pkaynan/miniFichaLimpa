<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="static/style.css">
</head>
<body>

    <div class="navbar">
        <div class="logo" onclick="window.location.href='${pageContext.request.contextPath}/'">
            Mini Ficha Limpa
        </div>
        <div class="menu">
            <a href="${pageContext.request.contextPath}/politico">Políticos</a>
            <a href="${pageContext.request.contextPath}/cadastropolitico">Cadastrar Político</a>
            <a href="${pageContext.request.contextPath}/produto">Produtos</a>
        </div>
    </div>

</body>
</html>
