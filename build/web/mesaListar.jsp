<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Mesas</title>
    </head>
    <body>
        <%@ include file="cabecalho1.jsp" %>
        <ol class="breadcrumb bg-primary">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Listar Mesa</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>

        <div class="container-fluid">
            <div class="row ">
                <div class="col-12">
                    <div class="row d-flex justify-content-center p-3">
                        <c:forEach var="mesa" items="${mesa}">
                            <c:choose>
                                <c:when test="${mesa.statusMesa == 'Privativo'}">
                                    <div class="card text-white bg-info col-12 col-sm-12 col-md-5 col-lg-2 m-1">
                                        <div class="card-header">${mesa.idMesa} ${mesa.statusMesa}</div>
                                        <div class="card-body">
                                            <p class="card-text">${mesa.observacaoMesa}</p>
                                        </div>
                                    </div>
                                </c:when>
                                <c:when test="${mesa.statusMesa == 'Interno'}">
                                    <div class="card text-white bg-danger col-12 col-sm-12 col-md-5 col-lg-2 m-1">
                                        <div class="card-header">${mesa.idMesa} ${mesa.statusMesa}</div>
                                        <div class="card-body">
                                            <p class="card-text">${mesa.observacaoMesa}</p>
                                        </div>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="card text-white bg-success col-12 col-sm-12 col-md-5 col-lg-2 m-1">
                                        <div class="card-header">${mesa.idMesa} ${mesa.statusMesa}</div>
                                        <div class="card-body">
                                            <p class="card-text">${mesa.observacaoMesa}</p>
                                        </div>
                                    </div>
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
