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
            <li class="breadcrumb-item active">Cadastrar Produto</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <div class="container">
            <form name="cadastrarproduto" action="./CadastrarProduto" method="POST" enctype="multipart/form-data">
                    <div>

                        <h1>Cadastro de Produto</h1>

                                <div class="alert alert-dismissible alert-success">
                                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                                    <strong>${mensagem}</strong>
                                </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="produto">Produto</label>  
                        <div class="col-md-4">
                            <input id="produto" name="produto" type="text" placeholder="nome do produto" class="form-control input-md" required="">

                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="detalhamento">Descrição</label>
                        <div class="col-md-8">                     
                            <textarea class="form-control" id="detalhamento" name="detalhamento">descrição do produto</textarea>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="valorProduto">Valor</label>  
                        <div class="col-md-2">
                            <input id="valorProduto" name="valorProduto" type="text" placeholder="" class="form-control input-md">

                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="idtipoproduto">Tipo de Produto</label>
                        <div class="col-md-4">
                            <select id="idtipoproduto" name="idtipoproduto" class="form-control">
                                <c:forEach var="tipoproduto" items="${tiposprodutos}">
                                    <option value="${tipoproduto.idtipoproduto}">${tipoproduto.descricaotipo}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="foto">Foto</label>
                        <div class="col-md-4">
                            <input id="foto" name="foto" class="input-file" type="file">
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
    </body>
</html>
