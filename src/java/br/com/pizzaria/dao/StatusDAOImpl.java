package br.com.pizzaria.dao;

import br.com.pizzaria.model.Status;
import br.com.pizzaria.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StatusDAOImpl implements GenericDAO{
    private Connection conexao;
    
    public StatusDAOImpl() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!!!");
        } catch (Exception ex) {
            throw new Exception("Problema ao conectar com o Banco de Dados! ERRO: " + ex.getMessage());
        }
    }
    

    @Override
    public Boolean cadastrar(Object objeto) {
        Status status = (Status) objeto;

        Boolean retorno = false;
        
        if (status.getIdStatus()== 0) {
            retorno = this.inserir(status);
        } else {
            retorno = this.alterar(status);
        }
        return retorno;
        

    }

    @Override
    public Boolean inserir(Object objeto) {
        Status status = (Status) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into pizzaria.status (descricaostatus) values (?)";
        
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, status.getDescricaoStatus());
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Status!!! ERRO: " + ex.getMessage());
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
        Status status = (Status) objeto;
        PreparedStatement stmt = null;
        String sql = "update pizzaria.status set descrcaostatus = ? where idstatus = ?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, status.getIdStatus());
            stmt.setString(2, status.getDescricaoStatus());
            stmt.executeUpdate();
            return true;
            
            
        }catch (SQLException ex){
            System.out.println("Problemas ao alterar Status! ERRO :" + ex.getMessage());
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
        String sql = "delete from pizzaria.status where idstatus = ?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Status!! Erro: " + ex.getMessage());
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
        
        String sql = "select * from pizzaria.status";
        
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Status status = new Status();
                status.setIdStatus(rs.getInt("idstatus"));
                status.setDescricaoStatus(rs.getString("descricaostatus"));
                resultado.add(status);
                
            }
            
        }catch (SQLException ex){
          System.out.println("Problemas ao listar Status. ERRO: "+ ex.getMessage());
            
        }finally {
          try{
              ConnectionFactory.closeConnection(conexao, stmt, rs);
          }catch (Exception ex){
              System.out.println("Problemas ao fechar os parametros de conexão! ERRO: "+ ex.getMessage());
          }
           
        }
        return resultado;
                
            }

    @Override
    public Object carregar(Object object) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Status status = null;
        String sql = "select * from pizzaria.status where idstatus = ?";
        
        try {
            stmt=conexao.prepareStatement(sql);
            stmt.setInt(1, (int) object);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                status = new Status();
                status.setIdStatus(rs.getInt("idstatus"));
                status.setDescricaoStatus(rs.getString("descricaostatus"));
           
            }
            return status;
        }
        catch(SQLException ex){
            System.out.println("Problemas ao carregar o Status!!! Erro: "+ex.getMessage());
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
            
    
}
