package br.com.pizzaria.dao;

import br.com.pizzaria.model.Produto;
import br.com.pizzaria.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements GenericDAO {
    
    private Connection conexao;
    
    public ProdutoDAO() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!!!");
        } catch (Exception ex) {
            throw new Exception("Problema ao conectar com o Banco de Dados! ERRO: " + ex.getMessage());
        }
    }
    
    @Override
    public Boolean cadastrar(Object objeto) {
        Produto produto = (Produto) objeto;
        Boolean retorno = false;
        
        if (produto.getIdProduto() == 0) {
            retorno = this.inserir(produto);
        } else {
            retorno = this.alterar(produto);
        }
        return retorno;
    }
    
    @Override
    public Boolean inserir(Object objeto) {
        Produto produto = (Produto) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into pizzaria.produto (produto, detalhamento, valorproduto, tipoproduto, foto) values (?,?,?,?,?)";
        
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getProduto());
            stmt.setString(2, produto.getDetalhamento());
            stmt.setDouble(3, produto.getValorproduto());
            stmt.setInt(4, produto.getTipoProduto().getIdtipoproduto());
            stmt.setString(5, produto.getFoto());
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Produto!!! ERRO: " + ex.getMessage());
            ex.printStackTrace();
            return false;
            
        } finally {
            try {
                ConnectionFactory.closeConnection(conexao, stmt);
                
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parametros de conexao!!! ERRO: " + ex.getMessage());
                return false;
            }
        }
    }
    
    @Override
    public Boolean alterar(Object objeto) {
        Produto produto = (Produto) objeto;
        PreparedStatement stmt = null;
        String sql = "update pizzaria.produto set produto = ?, detalhamento = ?, valorproduto = ?, tipoproduto = ?, foto = ? where idproduto = ?";
        
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.setString(2, produto.getProduto());
            stmt.setString(3, produto.getDetalhamento());
            stmt.setDouble(4, produto.getValorproduto());
            stmt.setInt(5, produto.getTipoProduto().getIdtipoproduto());
            stmt.setString(6, produto.getFoto());
            stmt.executeUpdate();
            return true;
            
            
        }catch (SQLException ex){
            System.out.println("Problemas ao alterar Produto! ERRO :" + ex.getMessage());
            return false;
            
        }finally{
            try {
                ConnectionFactory.closeConnection(conexao, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parametros de conexão! ERRO :" + ex.getMessage());
            }
        }
    }
    
    @Override
    public Boolean excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "delete from pizzaria.produto where idproduto = ?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Produtos!! Erro: " + ex.getMessage());
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
    public Object carregar(Object object) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto produto = null;
        String sql = "select * from pizzaria.produto where idproduto = ?";
        
        try {
            stmt=conexao.prepareStatement(sql);
            stmt.setInt(1, (int) object);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                produto = new Produto();
                produto.setIdProduto(rs.getInt("idproduto"));
                produto.setProduto(rs.getString("produto"));
                produto.setDetalhamento(rs.getString("detalhamento"));
                produto.setTipoproduto(rs.getInt("tipoproduto"));
                produto.setValorproduto(rs.getDouble("valorproduto"));
                produto.setFoto(rs.getString("foto"));
            
            }
            return produto;
        }
        catch(SQLException ex){
            System.out.println("Problemas ao carregar o Produto!!! Erro: "+ex.getMessage());
            return null;
        }finally{
            try{
                ConnectionFactory.closeConnection(conexao, stmt, rs);
            }
            catch (Exception ex){
                System.out.println("Problemas ao Fechar os parâmetros de conexão!!! Erro: "
                    +ex.getMessage());
            }
        }
    }
    
    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "select * from pizzaria.produto";
        
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idproduto"));
                produto.setProduto(rs.getString("produto"));
                produto.setDetalhamento(rs.getString("detalhamento"));
                produto.setValorproduto(Double.parseDouble(rs.getString("valorproduto")));
                produto.setTipoproduto(rs.getInt("tipoproduto"));
                produto.setFoto(rs.getString("foto"));
                resultado.add(produto);
                
            }
            
        }catch (SQLException ex){
          System.out.println("Problemas ao listar Produtos. ERRO: "+ ex.getMessage());
            
        }finally {
          try{
              ConnectionFactory.closeConnection(conexao, stmt, rs);
          }catch (Exception ex){
              System.out.println("Problemas ao fechar os parametros de conexão! ERRO: "+ ex.getMessage());
          }
           
        }
        return resultado;
                
            }
          
        }
