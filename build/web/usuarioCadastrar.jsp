<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="icon" href="image/usuario.ico">
    <title>Cadastrar Usuário</title>
</head>

<body>
    <%@ include file="cabecalho1.jsp" %>

    <ol class="breadcrumb bg-primary1">
        <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
        <li class="breadcrumb-item active">Cadastrar Usuario</li>
        <li class="breadcrumb-item ">Usuario Ativo: ${usuario.nomeUsuario}</li>
    </ol>
    <div class="container">
        <form name="cadastrarusuario" action="CadastrarUsuario" method="POST" id="cadastrarusuario">
            <div>

                <h1>Cadastro de Usuario</h1>

                <div class="alert alert-dismissible alert-success">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                    <strong>${mensagem}</strong>
                </div>
            </div>
            <fieldset>

                <!-- Text input-->
                <div class="form-group row">
                    <label class="col-md-2 " for="nomeUsuario">Nome</label>
                    <div class="col-md-4">
                        <input id="nomeUsuario" name="nomeUsuario" type="text" placeholder="Nome Completo"
                            class="form-control input-md" required="">
                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="cpfUsuario">CPF</label>
                    <div class="col-md-4">
                        <input id="cpfUsuario" name="cpfUsuario" type="text" placeholder="999.999.999-99"
                            class="form-control input-md" required="">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="enderecoUsuario">Endereço</label>
                    <div class="col-md-4">
                        <input id="enderecoUsuario" name="enderecoUsuario" type="text" placeholder="Endereço Completo"
                            class="form-control input-md" required="">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="cepUsuario">CEP</label>
                    <div class="col-md-4">
                        <input id="cepUsuario" name="cepUsuario" type="text" placeholder="99.999-999"
                            class="form-control input-md">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="telefoneUsuario">Telefone</label>
                    <div class="col-md-4">
                        <input id="telefoneUsuario" name="telefoneUsuario" type="text" placeholder="(17) 99699-9999"
                            class="form-control input-md" required="">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="loginUsuario">Login</label>
                    <div class="col-md-4">
                        <input id="loginUsuario" name="loginUsuario" type="text" placeholder=""
                            class="form-control input-md" required="">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="senhaUsuario">Senha</label>
                    <div class="col-md-4">
                        <input id="senhaUsuario" name="senhaUsuario" type="text" placeholder=""
                            class="form-control input-md" required="">

                    </div>
                </div>

                <!-- Select Basic -->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="idTipoUsuario">Tipo de Usuario</label>
                    <div class="col-md-4">
                        <select id="idTipoUsuario" name="idTipoUsuario" type="text" class="form-control">
                            <option value="1">Cliente</option>
                            <option value="2">Gerente</option>
                            <option value="3">Administrativo</option>
                            <option value="4">Garçon</option>
                            <option value="5">Entregador</option>
                            <option value="6">Cozinha</option>
                        </select>
                    </div>
                </div>
                <!-- Button (Double) -->
                <div class="form-group row">
                    <label class="col-md-2 control-label" for="submit"></label>
                    <div class="col-md-8">
                        <button id="submit" type="submit" class="btn btn-success">Cadastrar</button>
                        <button id="reset" type="reset" class="btn btn-danger">Limpar</button>
                    </div>
                </div>

            </fieldset>
        </form>
    </div>
</body>

</html>