<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Papa Pizza - Mesa</title>
    </head>
    <body>
        <%@ include file="cabecalho1.jsp" %>

        <ol class="breadcrumb bg-primary">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Mesa Cadastrar</li>
            <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
        </ol>
        <div class="container">
            <form name="cadastrarmesa" id="cadastrarmesa" action="./CadastrarMesa" method="POST">
                <div>

                    <h1>Cadastro de Mesa</h1>

                    <div class="alert alert-dismissible alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong>${mensagem}</strong>
                    </div>
                </div>
                    
                <!-- Select Basic -->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="statusMesa">Status</label>
                    <div class="col-md-4">
                        <select id="statusMesa" name="statusMesa" type="text" class="form-control">
                            <option value="Interno">Interno</option>
                            <option value="Externo">Externo</option>
                            <option value="Privativo">Privativo</option>
                        </select>
                    </div>
                </div>

                <!-- Textarea -->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="observacaoMesa">Observações</label>
                    <div class="col-md-4">                     
                        <textarea class="form-control" type="text" id="observacaoMesa" name="observacaoMesa"></textarea>
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

