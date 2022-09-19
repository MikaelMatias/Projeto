package br.com.pizzaria.model;

public class ItemPedido {
    	private int idItemPedido;
        private int idPedidoProduto;
	private int idProdutoPedido;
	private int quantidade;
        private Produto produto;
        private Pedido pedido;

    public ItemPedido() {
    }

    public ItemPedido(int idItemPedido, int idPedidoProduto, int idProdutoPedido, int quantidade, Produto produto, Pedido pedido) {
        this.idItemPedido = idItemPedido;
        this.idPedidoProduto = idPedidoProduto;
        this.idProdutoPedido = idProdutoPedido;
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(int idItemPedido) {
        this.idItemPedido = idItemPedido;
    }

    public int getIdPedidoProduto() {
        return idPedidoProduto;
    }

    public void setIdPedidoProduto(int idPedidoProduto) {
        this.idPedidoProduto = idPedidoProduto;
    }

    public int getIdProdutoPedido() {
        return idProdutoPedido;
    }

    public void setIdProdutoPedido(int idProdutoPedido) {
        this.idProdutoPedido = idProdutoPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


}
