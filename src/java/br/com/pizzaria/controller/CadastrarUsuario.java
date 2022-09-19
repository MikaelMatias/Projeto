package br.com.pizzaria.controller;

import br.com.pizzaria.dao.GenericDAO;
import br.com.pizzaria.dao.UsuarioDAOImpl;
import br.com.pizzaria.model.TipoUsuario;
import br.com.pizzaria.model.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomeUsuario = request.getParameter("nomeUsuario");
        String cpfUsuario = request.getParameter("cpfUsuario");
        String enderecoUsuario = request.getParameter("enderecoUsuario");
        String cepUsuario = request.getParameter("cepUsuario");
        String telefoneUsuario = request.getParameter("telefoneUsuario");
        String loginUsuario = request.getParameter("loginUsuario");
        String senhaUsuario = request.getParameter("senhaUsuario");
        Integer idTipoUsuario = Integer.parseInt(request.getParameter("idTipoUsuario"));
        
        String mensagem = null;
        Usuario usuario = new Usuario();
        usuario.setNomeUsuario(nomeUsuario);
        usuario.setCpfUsuario(cpfUsuario);
        usuario.setEnderecoUsuario(enderecoUsuario);
        usuario.setCepUsuario(cepUsuario);
        usuario.setLoginUsuario(loginUsuario);
        usuario.setSenhaUsuario(senhaUsuario);
        usuario.setTelefoneUsuario(telefoneUsuario);
        usuario.setTipoUsuario(new TipoUsuario(idTipoUsuario));

        try {
            GenericDAO dao = new UsuarioDAOImpl();
            if (dao.cadastrar(usuario)) {
                mensagem = "Usuário cadastrado com sucesso!";
            } else {
                mensagem = "Problemas ao cadastrar Usuário. "
                        + "Verifique os dados informados e tente novamente!";
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("usuarioCadastrar.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Usuário! Erro: " + ex.getMessage());
            ex.printStackTrace();
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
