<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Papa Pizza</title>
    </head>
    <body>
        <%@ include file="cabecalho1.jsp" %>

        <ol class="breadcrumb bg-primary">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Cadastrar Tipo Pedido/li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <div class="container">
        <form name="cadastrartipopedido" action="./CadastrarTipoPedido" method="POST" enctype="multipart/form-data">


                <div>

                    <h1>Cadastro de Tipo Pedido</h1>

                    <div class="alert alert-dismissible alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong>${mensagem}</strong>
                    </div>
                </div>
                <fieldset>

                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 " for="descricaoTipoPedido">Descrição Tipo Pedido </label>
                        <div class="col-md-8">
                            <input id="descricaoTipoPedido" name="descricaoTipoPedido" type="text"  class="form-control input-md" required="">

                        </div>
                    </div>


                    <!-- Button (Double) -->
                    <div class="form-group row">
                       <label class="col-md-2 control-label" for="submit"></label>
                        <div class="col-md-8">
                            <button id="submit" type="submit" class="btn btn-success">Gravar Registro</button>
                            <button id="reset" type="reset" class="btn btn-danger">Limpar</button>
                        </div>
                    </div>

                </fieldset>
        </form>        
        </div>
    </body>
</html>
