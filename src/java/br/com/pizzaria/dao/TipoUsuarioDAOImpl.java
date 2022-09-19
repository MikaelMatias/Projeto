package br.com.pizzaria.dao;

import br.com.pizzaria.model.TipoUsuario;
import br.com.pizzaria.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoUsuarioDAOImpl implements GenericDAO {

    private Connection conexao;

    public TipoUsuarioDAOImpl() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    @Override
    public Boolean cadastrar(Object objeto) {
        TipoUsuario tipoUsuario = (TipoUsuario) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into pizzaria.tipousuario (descricaotipousuario) values(?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, tipoUsuario.getDescricaoTipoUsuario());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Tipo de Usuário! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conexao, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

    }

    @Override
    public Boolean inserir(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean excluir(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        List<Object> tiposUsuarios = new ArrayList<>();
        PreparedStatement stmt= null;
        ResultSet rs = null;
        
        String sql = "select * from pizzaria.tipousuario order by descricaotipousuario;";
        
        try{
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                TipoUsuario tipoUsuario = new TipoUsuario();
                tipoUsuario.setIdTipoUsuario(rs.getInt("idtipousuario"));
                tipoUsuario.setDescricaoTipoUsuario(rs.getString("descricaotipousuario"));
                tiposUsuarios.add(tipoUsuario);
            }
        } catch(SQLException ex){
            System.out.println("Problemas ao listar Tipo de Usuarios! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try{
                ConnectionFactory.closeConnection(conexao, stmt, rs);
            } catch (Exception ex){
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return tiposUsuarios;    }

    @Override
    public Object carregar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
