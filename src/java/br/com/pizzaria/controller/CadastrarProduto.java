package br.com.pizzaria.controller;

import br.com.pizzaria.dao.GenericDAO;
import br.com.pizzaria.dao.ProdutoDAO;
import br.com.pizzaria.model.Produto;
import br.com.pizzaria.model.TipoProduto;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(name = "CadastrarProduto", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException {
        request.setCharacterEncoding("UTF-8");

        Produto produto = new Produto();

        Boolean isMultPart = ServletFileUpload.isMultipartContent(request);
        if (isMultPart) {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);

            List items = upload.parseRequest(request);
            InputStream is = null;
            Iterator it = items.iterator();
            while (it.hasNext()) {
                FileItem fileItem = (FileItem) it.next();
                if (!fileItem.isFormField()) {
                    try {
                        fileItem.write(new File("C:\\Users\\PC 05\\Desktop\\ProjetoPizzaria\\web\\image\\produtos\\" + (new File(fileItem.getName())).getName()));
                    } catch (Exception e) {
                        System.out.println("Problemas ao Gravar a imagem! ERRO: " + e.getMessage());
                        e.printStackTrace();
                    }

                    produto.setFoto("image/produtos/" + fileItem.getName());

                } else {
                    String dados = fileItem.getFieldName();
                    if (dados.equals("produto")) {
                        produto.setProduto(fileItem.getString());
                    } else if (dados.equals("detalhamento")) {
                        produto.setDetalhamento(fileItem.getString());
                    } else if (dados.equals("valorProduto")) {
                        produto.setValorproduto(Double.parseDouble(fileItem.getString()));
                    } else if (dados.equals("idtipoproduto")) {
                        produto.setTipoProduto(new TipoProduto(Integer.parseInt(fileItem.getString())));
                    }
                }
            }
        }

        String mensagem = null;

        try {
            GenericDAO dao = new ProdutoDAO();
            if (dao.cadastrar(produto)) {
                mensagem = "Produto cadastrado com sucesso!!!";
            } else {
                mensagem = "Problemas ao cadastrar Produto. Verifique os dados informados e tente novamente!!!";
            }

            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("DadosProduto").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas no Servelet ao cadastrar Produto!!! Erro: " + ex.getMessage());
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
