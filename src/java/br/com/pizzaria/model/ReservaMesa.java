package br.com.pizzaria.model;

import java.util.Date;

public class ReservaMesa {

    private int idReserva;
    private Usuario clienteReserva;
    private int mesaReserva;
    private Date dataReserva;
    private String horarioReserva;
    private Usuario funcionarioReserva;
    private String statusReserva;
    private Mesa mesa;

    public ReservaMesa() {
    }

    public ReservaMesa(int idReserva, Usuario clienteReserva, int mesaReserva, Date dataReserva, String horarioReserva, Usuario funcionarioReserva, String statusReserva, Mesa mesa) {
        this.idReserva = idReserva;
        this.clienteReserva = clienteReserva;
        this.mesaReserva = mesaReserva;
        this.dataReserva = dataReserva;
        this.horarioReserva = horarioReserva;
        this.funcionarioReserva = funcionarioReserva;
        this.statusReserva = statusReserva;
        this.mesa = mesa;
    }



    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Usuario getClienteReserva() {
        return clienteReserva;
    }

    public void setClienteReserva(Usuario clienteReserva) {
        this.clienteReserva = clienteReserva;
    }

    public int getMesaReserva() {
        return mesaReserva;
    }

    public void setMesaReserva(int mesaReserva) {
        this.mesaReserva = mesaReserva;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getHorarioReserva() {
        return horarioReserva;
    }

    public void setHorarioReserva(String horarioReserva) {
        this.horarioReserva = horarioReserva;
    }

    public Usuario getFuncionarioReserva() {
        return funcionarioReserva;
    }

    public void setFuncionarioReserva(Usuario funcionarioReserva) {
        this.funcionarioReserva = funcionarioReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(String statusReserva) {
        this.statusReserva = statusReserva;
    }

}
