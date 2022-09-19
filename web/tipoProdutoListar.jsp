<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Produtos</title>
        <link rel="stylesheet" type="text/css" media="screen" href="css/especiais.css" />

    </head>
    <body>
        <%@ include file="cabecalho1.jsp" %>
        <ol class="breadcrumb bg-primary">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Listar Tipo Produto</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>

        <h2><center>Lista de Tipos de Produtos</center></h2>
        <hr>
        <div class="container">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th width="1%" scope="col">ID</th>
                        <th width="15%" scope="col">Descrição</th>
                        <th width="5%" scope="col">Ação</th>
                    </tr>
                </thead>


                <tbody>

                    <c:forEach var="produto" items="${tipoproduto}">

                        <tr>
                            <th scope="row">${produto.idtipoproduto}</th>
                            <td>${produto.descricaotipo}</td>
                            <td><a class="btn btn-danger" href="ExcluirTipoProduto?idtipoproduto=${produto.idtipoproduto}">Excluir</a>
                                <a class="btn btn-warning" href="CarregarProduto?idtipoproduto=${produto.idtipoproduto}">Alterar</a>

                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        <div class="alert alert-dismissible alert-success">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            <strong>${mensagem}</strong>
        </div>
        </div>
    </body>
</html>
