package br.com.pizzaria.controller;

import br.com.pizzaria.dao.GenericDAO;
import br.com.pizzaria.dao.ProdutoDAO;
import br.com.pizzaria.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlterarProduto", urlPatterns = {"/AlterarProduto"})
public class AlterarProduto extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Integer idProduto = Integer.parseInt(request.getParameter("idProduto"));
            String produto = request.getParameter("produto");
            String detalhamento = request.getParameter("detalhamento");
            Double valorProduto = Double.parseDouble(request.getParameter("valorProduto"));
            Integer idTipoproduto = Integer.parseInt(request.getParameter("idTipoproduto"));
            String foto = request.getParameter("foto");
            String mensagem = null;
            
            Produto produtoa = new Produto();
            produtoa.setIdProduto(idProduto);
            produtoa.setProduto(produto);
            produtoa.setDetalhamento(detalhamento);
            produtoa.setValorproduto(valorProduto);
            produtoa.setTipoproduto(idTipoproduto);
            produtoa.setFoto(foto);
            
            try {
                GenericDAO dao = new ProdutoDAO();
                if(dao.alterar(produtoa)){
                    mensagem = "Produto alterado com sucesso";
                }else {
                    mensagem = "Problema ao alterar o Produto";
                    
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("ListarProduto").forward(request, response);
                
                
            }catch (Exception ex){
                
            }
            
            

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
