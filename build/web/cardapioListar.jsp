<%-- 
    Document   : cardapioListar
    Created on : 31/10/2018, 16:58:07
    Author     : PC 05
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="favicon.ico">
        <title>Listar Produtos</title>
        <link rel="stylesheet" type="text/css" media="screen" href="css/especiais.css" />

    </head>
    <body>
        <%@ include file="cabecalho1.jsp" %>
        <ol class="breadcrumb bg-primary">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Cardápio</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <h2><center>Cardápio</center></h2>
        <hr>
        <div class="container wrapper topo">
            <div class="row">
                <c:forEach var="produtos" items="${produtos}">
                    <div class="card col-3">
                        <h4 class="card-header">${produtos.produto}</h4>
                        <img style="width: 100%;" src="${produtos.foto}" alt="Card image">
                        <div class="card-body">
                            <p class="card-text">${produtos.detalhamento}</p>
                        </div>
                        <ul class="list-group list-group-flush">
                            <h3><fmt:formatNumber value='${produtos.valorproduto}' type='currency'/></h3>
                        </ul>
                        <div class="card-body">
                            <!--<a href="#" class="card-link">Card link</a>
                            <a href="#" class="card-link">Another link</a> -->
                        </div>
                    </div>
                </c:forEach>
            </div>

        </div>
    </body>
</html>

