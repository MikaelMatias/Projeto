package br.com.pizzaria.model;

public class TipoProduto {
    
    	private int idtipoproduto;
	private String descricaotipo;

    public TipoProduto() {
    }

    public TipoProduto(int idtipoproduto) {
        this.idtipoproduto = idtipoproduto;
    }

    public TipoProduto(int idtipoproduto, String descricaotipo) {
        this.idtipoproduto = idtipoproduto;
        this.descricaotipo = descricaotipo;
    }

    public int getIdtipoproduto() {
        return idtipoproduto;
    }

    public void setIdtipoproduto(int idtipoproduto) {
        this.idtipoproduto = idtipoproduto;
    }

    public String getDescricaotipo() {
        return descricaotipo;
    }

    public void setDescricaotipo(String descricaotipo) {
        this.descricaotipo = descricaotipo;
    }


        
}
