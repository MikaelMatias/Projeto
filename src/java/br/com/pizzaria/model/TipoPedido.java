package br.com.pizzaria.model;

public class TipoPedido {
    	private int idTipoPedido;
	private String descricaoTipoPedido;

    public TipoPedido() {
    }

    public TipoPedido(int idTipoPedido, String descricaoTipoPedido) {
        this.idTipoPedido = idTipoPedido;
        this.descricaoTipoPedido = descricaoTipoPedido;
    }

    public int getIdTipoPedido() {
        return idTipoPedido;
    }

    public void setIdTipoPedido(int idTipoPedido) {
        this.idTipoPedido = idTipoPedido;
    }

    public String getDescricaoTipoPedido() {
        return descricaoTipoPedido;
    }

    public void setDescricaoTipoPedido(String descricaoTipo) {
        this.descricaoTipoPedido = descricaoTipoPedido;
    }


}
