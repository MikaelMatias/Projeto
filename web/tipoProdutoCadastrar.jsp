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
            <li class="breadcrumb-item active">Cadastrar Tipo Produto</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <div class="container">
            <form name="cadastrartipoproduto" id="cadastrartipoproduto" action="./CadastrarTipoProduto" method="POST">

                <div>

                    <h1>Cadastro de Tipo Produto</h1>

                    <div class="alert alert-dismissible alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong>${mensagem}</strong>
                    </div>
                </div>
                <fieldset>

                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 " for="descricaoTipo">Descrição Tipo Produto </label>
                        <div class="col-md-8">
                            <input id="descricaoTipo" name="descricaoTipo" type="text"  class="form-control input-md" required="">

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
                    
                            <h2><center>Lista de Tipos de Produtos</center></h2>
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

    </body>
</html>
