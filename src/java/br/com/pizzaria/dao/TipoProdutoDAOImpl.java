package br.com.pizzaria.dao;

import br.com.pizzaria.model.TipoProduto;
import br.com.pizzaria.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoProdutoDAOImpl implements GenericDAO {

    private Connection conexao;

    public TipoProdutoDAOImpl() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!!!");
        } catch (Exception ex) {
            throw new Exception("Problema ao conectar com o Banco de Dados! ERRO: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object objeto) {
        
        TipoProduto tipoProduto = (TipoProduto) objeto;
        Boolean retorno = false;
        
        if (tipoProduto.getIdtipoproduto() == 0){
            retorno = this.inserir(tipoProduto);
        }else {
            retorno = this.alterar(tipoProduto);
        }
        
        return retorno;
    }
        

    @Override
    public Boolean inserir(Object objeto) {
        TipoProduto tipoProduto = (TipoProduto) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into pizzaria.tipoproduto (descricaotipo) values(?)";

        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, tipoProduto.getDescricaotipo());
            stmt.execute();
            return true;
            
        }catch(SQLException ex){
            System.out.println("Problemas ao cadastrar Tipo de Produto!ERRO :" + ex.getMessage());
            return false;
            
        }finally{
            try {
                ConnectionFactory.closeConnection(conexao, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parametros de conexao! ERRO :" + ex.getMessage());
                return false;
            }
        }
    }

    @Override
    public Boolean alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "delete from pizzaria.tipoproduto where idtipoproduto = ?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Tipo Produtos!! Erro: " + ex.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conexao, stmt);

            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexao! Erro: " + ex.getMessage());
            }
        }

    }

    @Override
    public Boolean cancelar(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean desativar(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listar() {
        
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "select * from pizzaria.tipoproduto order by descricaotipo;";
        
        try{
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                TipoProduto tipoProduto = new TipoProduto();
                tipoProduto.setIdtipoproduto(rs.getInt("idtipoproduto"));
                tipoProduto.setDescricaotipo(rs.getString("descricaotipo"));
                resultado.add(tipoProduto);
            }
            
        } catch (SQLException ex){
            System.out.println("Problemas ao listar Tipo Produto! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try{
                ConnectionFactory.closeConnection(conexao, stmt, rs);
            } catch(Exception ex){
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return resultado;
        
    }

    @Override
    public Object carregar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
