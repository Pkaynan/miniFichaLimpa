<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="model.Politico"%>

<%
Politico politico = (Politico) request.getAttribute("politico");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Perfil do Político</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/style.css">
</head>
<body>

	<div class="navbar">
		<div class="logo">
			<a href="${pageContext.request.contextPath}/home"
				style="color: white; text-decoration: none;">Mini Ficha Limpa </a>
		</div>

		<div class="menu">
			<a href="${pageContext.request.contextPath}/cadastropolitico">Cadastrar Político</a> 
		</div>
	</div>

	<div class="container">
		<h1>Detalhes do Político</h1>
		<p>
			<strong>ID:</strong>
			<%=politico.getId()%></p>
		<p>
			<strong>Nome:</strong>
			<%=politico.getNome()%></p>
		<p>
			<strong>Número Eleitoral:</strong>
			<%=politico.getNumeroEleitoral()%></p>
		<p>
			<strong>Nome Eleitoral:</strong>
			<%=politico.getNomeEleitoral()%></p>
		<p>
			<strong>ID do Partido:</strong>
			<%=politico.getPartido()%></p>
		<p style="margin: 20px;">
			<button
				onclick="window.location.href='${pageContext.request.contextPath}/politico'">Voltar</button>
		</p>

	</div>

</body>
</html>
