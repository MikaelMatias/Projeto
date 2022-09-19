<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Usuário</title>
    </head>
    <body>
        <%@ include file="cabecalho1.jsp" %>

        <ol class="breadcrumb bg-primary">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Cadastrar Pedido</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <div class="container">
            <form name="cadastrarusuario" action="./CadastrarUsuario" method="POST" enctype="multipart/form-data">
                <div>

                    <h1>Cadastro de Pedido</h1>

                    <div class="alert alert-dismissible alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong>${mensagem}</strong>
                    </div>
                </div>
                <fieldset>

                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="dataPedido">Data</label>  
                        <div class="col-md-3">
                            <input id="dataPedido" name="dataPedido" type="text" placeholder="" class="form-control input-md">

                        </div>
                        <label class="col-md-2 control-label" for="horaPedido">Hora</label>  
                        <div class="col-md-3">
                            <input id="horaPedido" name="horaPedido" type="text" placeholder="" class="form-control input-md">

                        </div>
                    </div>

                    <!-- Select Basic -->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="tipoPedido">Tipo Pedido</label>
                        <div class="col-md-2">
                            <select id="tipoPedido" name="tipoPedido" class="form-control">
                                <option value="11">Entrega</option>
                                <option value="22">Mesa</option>
                            </select>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="entregadorPedido">Entregador</label>  
                        <div class="col-md-2">
                            <input id="entregadorPedido" name="entregadorPedido" type="text" placeholder="" class="form-control input-md">

                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="funcionarioPedido">Funcionário Responsável</label>  
                        <div class="col-md-2">
                            <input id="funcionarioPedido" name="funcionarioPedido" type="text" placeholder="" class="form-control input-md">

                        </div>
                    </div>

                    <!-- Select Basic -->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="descontoPedido">Desconto</label>
                        <div class="col-md-3">
                            <select id="descontoPedido" name="descontoPedido" class="form-control">
                                <option value="5">5% de desconto</option>
                                <option value="10">10% de desconto</option>
                                <option value="15">15% de desconto</option>
                            </select>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="clientePedido">Cliente</label>  
                        <div class="col-md-5">
                            <input id="clientePedido" name="clientePedido" type="text" placeholder="" class="form-control input-md">

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
