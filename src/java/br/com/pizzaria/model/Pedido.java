package br.com.pizzaria.model;

import java.util.Date;

public class Pedido {
    
    	private int idPedido;
	private Date dataPedido;
	private String horaPedido;
	private Double valorPedido;
	private int idStatusPedido;
	private int tipoPedido;
	private int idEntregadorPedido;
	private int idFuncionarioPedido;
	private Double descontoPedido;
	private int idClientePedido;
	private TipoPedido tipoPedidoc;
        private Usuario usuarioPedido;
        private Status statusPedido;

    public Pedido() {
    }

    public Pedido(int idPedido, Date dataPedido, String horaPedido, Double valorPedido, int idStatusPedido, int tipoPedido, int idEntregadorPedido, int idFuncionarioPedido, Double descontoPedido, int idClientePedido, TipoPedido tipoPedidoc, Usuario usuarioPedido, Status statusPedido) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.horaPedido = horaPedido;
        this.valorPedido = valorPedido;
        this.idStatusPedido = idStatusPedido;
        this.tipoPedido = tipoPedido;
        this.idEntregadorPedido = idEntregadorPedido;
        this.idFuncionarioPedido = idFuncionarioPedido;
        this.descontoPedido = descontoPedido;
        this.idClientePedido = idClientePedido;
        this.tipoPedidoc = tipoPedidoc;
        this.usuarioPedido = usuarioPedido;
        this.statusPedido = statusPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public int getIdStatusPedido() {
        return idStatusPedido;
    }

    public void setIdStatusPedido(int idStatusPedido) {
        this.idStatusPedido = idStatusPedido;
    }

    public int getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(int tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public int getIdEntregadorPedido() {
        return idEntregadorPedido;
    }

    public void setIdEntregadorPedido(int idEntregadorPedido) {
        this.idEntregadorPedido = idEntregadorPedido;
    }

    public int getIdFuncionarioPedido() {
        return idFuncionarioPedido;
    }

    public void setIdFuncionarioPedido(int idFuncionarioPedido) {
        this.idFuncionarioPedido = idFuncionarioPedido;
    }

    public Double getDescontoPedido() {
        return descontoPedido;
    }

    public void setDescontoPedido(Double descontoPedido) {
        this.descontoPedido = descontoPedido;
    }

    public int getIdClientePedido() {
        return idClientePedido;
    }

    public void setIdClientePedido(int idClientePedido) {
        this.idClientePedido = idClientePedido;
    }

    public TipoPedido getTipoPedidoc() {
        return tipoPedidoc;
    }

    public void setTipoPedidoc(TipoPedido tipoPedidoc) {
        this.tipoPedidoc = tipoPedidoc;
    }

    public Usuario getUsuarioPedido() {
        return usuarioPedido;
    }

    public void setUsuarioPedido(Usuario usuarioPedido) {
        this.usuarioPedido = usuarioPedido;
    }

    public Status getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(Status statusPedido) {
        this.statusPedido = statusPedido;
    }

    
}
