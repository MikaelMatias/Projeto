package br.com.pizzaria.dao;

import br.com.pizzaria.model.Mesa;
import br.com.pizzaria.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MesaDAOImpl implements GenericDAO {

    private Connection conexao;

    public MesaDAOImpl() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!!!");
        } catch (Exception ex) {
            throw new Exception("Problema ao conectar com o Banco de Dados! ERRO: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object objeto) {
        Mesa mesa = (Mesa) objeto;
        Boolean retorno = false;
        
        if (mesa.getIdMesa()== 0) {
            retorno = this.inserir(mesa);
        } else {
            retorno = this.alterar(mesa);
        }
        return retorno;    }

    @Override
    public Boolean inserir(Object objeto) {
        Mesa mesa = (Mesa) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into pizzaria.mesa (statusmesa, observacaomesa) values(?,?)";
        
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, mesa.getStatusMesa());
            stmt.setString(2, mesa.getObservacaoMesa());
            stmt.execute();
            return true;
            
        }catch (SQLException ex){
            System.out.println("Problemas ao cadastrar Mesa!!! ERRO: " + ex.getMessage());
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
        Mesa mesa = (Mesa) objeto;
        PreparedStatement stmt = null;
        String sql = "update pizzaria.mesa set statusmesa = ?, observacaomesa = ? where idmesa = ?";
        
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, mesa.getIdMesa());
            stmt.setString(2, mesa.getStatusMesa());
            stmt.setString(3, mesa.getObservacaoMesa());
            stmt.executeUpdate();
            return true;
            
            
        }catch (SQLException ex){
            System.out.println("Problemas ao alterar Mesa! ERRO :" + ex.getMessage());
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
        String sql = "delete from pizzaria.mesa where idmesa = ?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Mesa!! Erro: " + ex.getMessage());
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
        Mesa mesa = null;
        String sql = "select * from pizzaria.mesa where idmesa = ?";
        
        try {
            stmt=conexao.prepareStatement(sql);
            stmt.setInt(1, (int) object);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idmesa"));
                mesa.setStatusMesa(rs.getString("statusmesa"));
                mesa.setObservacaoMesa(rs.getString("observacaomesa"));
            
            }
            return mesa;
        }
        catch(SQLException ex){
            System.out.println("Problemas ao carregar a Mesa!!! Erro: "+ex.getMessage());
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
        
        String sql = "select * from pizzaria.mesa order by idmesa";
        
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idmesa"));
                mesa.setStatusMesa(rs.getString("statusmesa"));
                mesa.setObservacaoMesa(rs.getString("observacaomesa"));
                resultado.add(mesa);
                
            }
            
        }catch (SQLException ex){
          System.out.println("Problemas ao listar Mesas. ERRO: "+ ex.getMessage());
            
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


