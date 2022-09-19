package br.com.pizzaria.dao;

import java.util.List;

public interface GenericDAO {
    
    public Boolean cadastrar(Object objeto);
    public Boolean inserir(Object objeto);
    public Boolean alterar(Object objeto);
    public Boolean excluir(int numero);
    public Boolean cancelar(int numero);
    public Boolean desativar(int numero);
    public Object carregar(Object object);
    public List<Object> listar();
}
