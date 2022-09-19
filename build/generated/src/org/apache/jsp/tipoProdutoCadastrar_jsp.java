package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tipoProdutoCadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cabecalho1.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro Papa Pizza</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/especiais.css\" />\n");
      out.write("        <title>PAPA PIZZA</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-secondary\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><img class=\"cabecalho\" src=\"image/papalogo.png\" height=\"40%\" width=\"40%\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\" style=\"\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Principal</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Usuário</a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"usuarioCadastrar.jsp\">Cadastro Tipo Usuario</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"usuarioCadastrar.jsp\">Cadastro Usuario</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ListarUsuario\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Produtos</a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"DadosProduto\">Cadastro Produto</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"tipoProdutoCadastrar.jsp\">Cadastro de Tipos de Produto</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ListarProduto\">Listar Produtos</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Mesas</a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"imagemCadastrar.jsp\">Cadastro Mesas</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"imagemCadastrar.jsp\">Reserva Mesas</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ListarImagem\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Pedidos</a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"tipoPedidoCadastrar.jsp\">Cadastro Tipo Pedido</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"pedidoCadastrar.jsp\">Cadastro Pedido</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"artigoCadastrar.jsp\">Cadastro Status</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ListarArtigo\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Numero do Pedido\">\n");
      out.write("                    <button class=\"btn btn-danger my-2 my-sm-0\" type=\"submit\">Pesquisa</button>\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <button class=\"btn btn-success my-2 my-sm-0\" href=\"ProdutosPedidos\" >Novo Pedido </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <ol class=\"breadcrumb bg-primary\">\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"index.jsp\">Principal</a></li>\n");
      out.write("            <li class=\"breadcrumb-item active\">Cadastrar Tipo de Produto</li>\n");
      out.write("        </ol>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form name=\"cadastrartipoproduto\" id=\"cadastrartipoproduto\" action=\"./CadastrarTipoProduto\" method=\"POST\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table align=\"center\" border=\"0\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\" align=\"center\">\n");
      out.write("                            Cadastro de Tipo Produto</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\" align=\"center\">\n");
      out.write("                                <div class=\"alert alert-dismissible alert-success\">\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("                                    <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>\n");
      out.write("                                </div>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Descrição Tipo: </td>\n");
      out.write("                        <td><input type=\"text\" name=\"descricaoTipo\" id=\"descricaotipo\" \n");
      out.write("                                   size=\"30\" maxlength=\"30\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>                    \n");
      out.write("                        <td colspan=\"2\" align=\"center\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\">Cadastrar</button>\n");
      out.write("                            <button type=\"reset\" class=\"btn btn-warning\">Limpar</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>                        \n");
      out.write("                        <td align=\"center\" colspan=\"2\"><h5><a \n");
      out.write("                                    href=\"index.jsp\">Voltar à Página Inicial</a></h5></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
