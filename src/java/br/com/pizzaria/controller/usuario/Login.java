package br.com.pizzaria.controller.usuario;

import br.com.pizzaria.dao.UsuarioDAOImpl;
import br.com.pizzaria.model.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/entrar"})
public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if ("POST".equals(request.getMethod())) {
            Usuario usuario = new Usuario();
            usuario.setLoginUsuario(request.getParameter("loginUsuario"));
            usuario.setSenhaUsuario(request.getParameter("senhaUsuario"));
            try {
                UsuarioDAOImpl dao = new UsuarioDAOImpl();
                if (dao.realizarLogin(usuario)) {
                    dao = new UsuarioDAOImpl();
                    usuario = (Usuario) dao.carregar(usuario);
                    HttpSession session = request.getSession(true);
                    session.setAttribute("usuario", usuario);
                    response.sendRedirect("index.jsp");
                } else {
                    request.setAttribute("mensagem", "Usuário e/ou senha invalido(s).");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } catch (Exception ex) {
                System.out.println("Erro na controller login! Erro: " + ex.getMessage());
                request.setAttribute("mensagem", "Erro ao processar solicitação, tente novamente mais tarde.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
