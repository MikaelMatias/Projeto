package br.com.pizzaria.model;

public class Mesa {

    private int idMesa;
    private String statusMesa;
    private String observacaoMesa;

    public Mesa() {
    }

    public Mesa(int idMesa, String statusMesa, String odservacaoMesa) {
        this.idMesa = idMesa;
        this.statusMesa = statusMesa;
        this.observacaoMesa = observacaoMesa;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(String statusMesa) {
        this.statusMesa = statusMesa;
    }

    public String getObservacaoMesa() {
        return observacaoMesa;
    }

    public void setObservacaoMesa(String observacaoMesa) {
        this.observacaoMesa = observacaoMesa;
    }

    
}