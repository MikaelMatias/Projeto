<%--
Devemos criar as mesas e designar cadeiras na hora da reserva 

Mesas: Interno e Externo (vide verificar lugares disponiveis interna  e externamente)
Cadeiras: qtd de cadeiras disponíveis (cadastrado anteriormente)




--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Papa Pizza - Reserva</title>
    </head>
    <body>
        <%@ include file="cabecalho1.jsp" %>

        <ol class="breadcrumb bg-primary">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Cadastrar Reserva de Mesa</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <div class="container">
            <form name="cadastrarproduto" action="./CadastrarProduto" method="POST" enctype="multipart/form-data">
                <div>

                    <h1>Cadastro de Reserva Mesa</h1>

                    <div class="alert alert-dismissible alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong>${mensagem}</strong>
                    </div>
                </div>
                <!-- Text input-->
                <div class="row">
                    <div class="col-md-5">

                        <div class="form-group row">
                            <label class="col-md-4 control-label" for="clienteReserva">Cliente</label>  
                            <div class="col-md-7">
                                <input id="clienteReserva" name="clienteReserva" type="text" placeholder="" class="form-control input-md">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group row">
                            <label class="col-md-4 control-label" for="mesaReserva">Mesa</label>  
                            <div class="col-md-2">
                                <input id="mesaReserva" name="mesaReserva" type="text" placeholder="" class="form-control input-md">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group row">
                            <label class="col-md-4 control-label" for="dataReserva">Data</label>  
                            <div class="col-md-4">
                                <input id="dataReserva" name="dataReserva" type="text" placeholder="" class="form-control input-md">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group row">
                            <label class="col-md-4 control-label" for="horarioReserva">Horario</label>  
                            <div class="col-md-4">
                                <input id="horarioReserva" name="horarioReserva" type="text" placeholder="" class="form-control input-md">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group row">
                            <label class="col-md-4 control-label" for="funcionarioReserva">Funcionário Responsável</label>  
                            <div class="col-md-7">
                                <input id="funcionarioReserva" name="funcionarioReserva" type="text" placeholder="" class="form-control input-md">

                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-2 control-label" for="submit"></label>
                            <div class="col-md-8">
                                <button id="submit" type="submit" class="btn btn-success">Gravar Registro</button>
                                <button id="reset" type="reset" class="btn btn-danger">Limpar</button>
                            </div>
                        </div>

                        </form>        
                    </div>
                    <div class="col-md-7 row">
                        <div class="row">

                            <c:forEach var="reserva" items="${reservas}">
                                <div class="card text-white bg-primary mb-2" style="max-width: 20rem;">
                                    <div class="card-header">Mesa ${reserva.mesaReserva}</div>
                                    <div class="card-body">
                                        <p class="card-text">Reservado</p>
                                    </div>
                                </div>
                            </c:forEach>

                        </div>
                    </div>
                </div>
        </div>

    </body>
</html>
