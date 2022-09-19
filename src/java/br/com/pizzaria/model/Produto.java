package br.com.pizzaria.model;

public class Produto {
    
    	private int idproduto;
	private String produto;
	private String detalhamento;
	private Double valorproduto;
	private int tipoproduto;
	private String foto;
	private TipoProduto tipoProduto;

    public Produto() {
    }

    public Produto(int idproduto) {
        this.idproduto = idproduto;
    }

    public Produto(int idproduto, String produto, String detalhamento, Double valorproduto, int tipoproduto, String foto, TipoProduto tipoProduto) {
        this.idproduto = idproduto;
        this.produto = produto;
        this.detalhamento = detalhamento;
        this.valorproduto = valorproduto;
        this.tipoproduto = tipoproduto;
        this.foto = foto;
        this.tipoProduto = tipoProduto;
    }

    public int getIdProduto() {
        return idproduto;
    }

    public void setIdProduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDetalhamento() {
        return detalhamento;
    }

    public void setDetalhamento(String detalhamento) {
        this.detalhamento = detalhamento;
    }

    public Double getValorproduto() {
        return valorproduto;
    }

    public void setValorproduto(Double valorproduto) {
        this.valorproduto = valorproduto;
    }

    public int getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(int tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
}
