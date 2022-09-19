package br.com.pizzaria.dao;

import br.com.pizzaria.model.Usuario;
import br.com.pizzaria.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAOImpl implements GenericDAO {

    private Connection conexao;

    public UsuarioDAOImpl() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!!!");
        } catch (Exception ex) {
            throw new Exception("Problema ao conectar com o Banco de Dados! ERRO: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object objeto) {
        Usuario usuario = (Usuario) objeto;
        Boolean retorno = false;

        if (usuario.getIdUsuario() == 0) {
            retorno = this.inserir(usuario);
        } else {
            retorno = this.alterar(usuario);
        }
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        Usuario usuario = (Usuario) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into pizzaria.usuario (nomeusuario, cpfusuario, enderecousuario, cepusuario, loginusuario, senhausuario, telefoneusuario, idtipousuario) values (?,?,?,?,?,?,?,?)";

        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getCpfUsuario());
            stmt.setString(3, usuario.getEnderecoUsuario());
            stmt.setString(4, usuario.getCepUsuario());
            stmt.setString(5, usuario.getLoginUsuario());
            stmt.setString(6, usuario.getSenhaUsuario());
            stmt.setString(7, usuario.getTelefoneUsuario());
            stmt.setInt(8, usuario.getTipoUsuario().getIdTipoUsuario());

            stmt.execute();
            return true;
            
        } catch (SQLException ex){
            System.out.println("Problemas ao cadastrar Usuario!!! ERRO: " + ex.getMessage());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Boolean realizarLogin(Usuario usuario) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select idusuario from pizzaria.usuario where loginusuario = ? and senhaUsuario = ?;";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getLoginUsuario());
            stmt.setString(2, usuario.getSenhaUsuario());
            rs = stmt.executeQuery();
            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao efetuar login do usuário! Erro: " + ex.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conexao, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parametros de conexão! Erro: " + ex.getMessage());
            }
        }
    }

    @Override
    public Object carregar(Object object) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = (Usuario) object;

        String sql = "select * from pizzaria.usuario where idusuario = ?;";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            rs = stmt.executeQuery();
            if (rs.next()) {
                usuario.setNomeUsuario(rs.getString("nomeusuario"));
                usuario.setLoginUsuario(rs.getString("loginusuario"));
                usuario.setSenhaUsuario(rs.getString("senhaUsuario"));
            } else {
                throw new Error("Usuário não encontrado.");
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Usuário! Erro: " + ex.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(conexao, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parametros de conexão! Erro: " + ex.getMessage());
            }
        }
        return usuario;
    }
}
