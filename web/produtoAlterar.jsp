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
            <li class="breadcrumb-item active">Alterar Produtos</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <div class="container">
            <form name="alterarproduto" action="AlterarProduto" method="POST" enctype="multipart/form-data">



                <table align="center" border="0">
                    <thead>
                        <tr>
                            <th colspan="2" align="center">
                                Cadastro de Produto - Alteração</th>
                        </tr>
                        <tr>
                            <th colspan="2" align="center">
                                <div class="alert alert-dismissible alert-success">
                                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                                    <strong>${mensagem}</strong>
                                </div>
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>ID Produto: </td>
                            <td><input type="text" name="idproduto" id="idproduto"
                                       value="${produto.idProduto}" readonly="readonly" />
                            </td>

                        </tr>


                        <tr>
                            <td>Produto: </td>
                            <td><input type="text" name="produto" id="produto" 
                                       value="${produto.produto}"
                                       size="30" maxlength="30"/></td>
                        </tr>
                        <tr>
                            <td>Descrição: </td>
                            <td><textarea type="text" name="detalhamento" 
                                          id="detalhamento" cols="100" rows="5">${produto.detalhamento}</textarea>

                        </tr>
                        <tr>
                            <td>Valor: </td>
                            <td><input type="text" name="valorProduto" id="valorProduto"
                                       value="${produto.valorproduto}"
                                       size="10" maxlength="10" /></td>
                        </tr>
                        <tr>
                            <td>Tipo: </td>
                            <td>
                                <select name="idtipoproduto">
                                    <c:forEach var="tipoproduto" items="${tiposprodutos}">
                                        <option value="${tipoproduto.idtipoproduto}">${tipoproduto.descricaotipo}</option>
                                    </c:forEach>                                                                
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Foto: </td>

                            <td><input type="text" name="foto" value="${produto.foto}" id="foto"/></td>
                        </tr>

                        <tr>
                            <td>
                                Imagem:
                            </td>
                            <td>
                                <img src="${produto.foto}">
                            </td>
                        </tr>

                        <tr>                    
                            <td colspan="2" align="center">
                                <button type="submit" class="btn btn-success">Alterar</button>
                                <button type="reset" class="btn btn-warning">Limpar</button>
                            </td>
                        </tr>
                        <tr>                        
                            <td align="center" colspan="2"><h5><a 
                                        href="index.jsp">Voltar à Página Inicial</a></h5></td>
                        </tr>
                    </tbody>
                </table>
            </form>        
        </div>
    </body>
</html>
