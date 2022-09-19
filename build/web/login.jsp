<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getSession().getAttribute("usuario") != null) {
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
%>
<!doctype html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">
        <title>Entrar na sua Conta - E-Commerce</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://d19m59y37dris4.cloudfront.net/hub/1-3-1/vendor/font-awesome/css/font-awesome.min.css">
    </head>

    <body>
            <%@include file="cabecalho1.jsp" %>
        <ol class="breadcrumb bg-warning">
            <li class="breadcrumb-item"><a href="index.jsp">Principal</a></li>
            <li class="breadcrumb-item active">Login</li>
        </ol>
        <div class="container">



            <div class="row">
                <div class="col-12 col-md-6 m-auto">
                    <form class="form-signin" method="post" action="entrar">
                        <%
                            if (request.getAttribute("mensagem") != null && ((String) request.getAttribute("type")) == "true") {
                        %>
                        <div class="alert alert-success alert-dismissible fade show" role="alert">
                            <%=request.getAttribute("mensagem")%>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <%
                        } else if (request.getAttribute("mensagem") != null) {
                        %>
                        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                            <strong>Erro!</strong> <%=request.getAttribute("mensagem")%>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <% }%>
                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="loginUsuario">Login</label>  
                        <div class="col-md-4">
                            <input id="loginUsuario" name="loginUsuario" type="text" placeholder="" class="form-control input-md" required="">

                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group row">
                        <label class="col-md-2 control-label" for="senhaUsuario">Senha</label>  
                        <div class="col-md-4">
                            <input id="senhaUsuario" name="senhaUsuario" type="text" placeholder="" class="form-control input-md" required="">

                        </div>
                    </div>
                        <div class="mt-2">
                            <button id="submit" name="submit" class="btn btn-success">Autenticar Usuario</button>
                            <button id="reset" name="reset" class="btn btn-danger">Limpar</button>
                        </div>
                    </form>
                </div>
            </div>

        </div>

        <!-- Bootstrap core JavaScript -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="js/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="js/bootstrap.bundle.js" type="text/javascript"></script>
    </body>
</html>