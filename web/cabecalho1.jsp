<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" href="favicon.ico">
        <link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/especiais.css" />
        <title>Pizzaria São Francisco</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-warning">
            <a class="navbar-brand" href="index.jsp"><img class="cabecalho" src="image/pizzaria-logo.png" height="40%" width="40%"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation" style="">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Principal</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Usuário</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="tipoUsuarioCadastrar.jsp">Cadastro Tipo Usuario</a>
                            <a class="dropdown-item" href="usuarioCadastrar.jsp">Cadastro Usuario</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Produtos</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="DadosProduto">Cadastro Produto</a>
                            <a class="dropdown-item" href="ListarTipoProduto">Cadastro de Tipos de Produto</a>
                            <a class="dropdown-item" href="ListarProduto">Listar Produtos</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Mesas</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="mesaCadastrar.jsp">Cadastro Mesas</a>
                            <a class="dropdown-item" href="reservaCadastrar.jsp">Reserva Mesas</a>
                            <a class="dropdown-item" href="ListarMesa">Listar</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Pedidos</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="tipoPedidoCadastrar.jsp">Cadastro Tipo Pedido</a>
                            <a class="dropdown-item" href="pedidoCadastrar.jsp">Cadastro Pedido</a>
                            <a class="dropdown-item" href="statusCadastrar.jsp">Cadastro Status</a>
                        </div>
                    </li>
                </ul>
                    <%--
                    <form class="form-inline my-2 my-lg-0">

                    <input class="form-control mr-sm-2" type="text" placeholder="Numero do Pedido">
                    <button class="btn btn-danger my-2 my-sm-0" type="submit">Pesquisa</button>

este tem que ir para o controller e carregar todos os produtos 
                    <button class="btn btn-success my-2 my-sm-0" href="ProdutosPedidos" >Novo Pedido </button>


                </form>--%>
            </div>
        </nav>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </body>
</html>

