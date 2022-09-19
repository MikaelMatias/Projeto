package br.com.pizzaria.model;

public class Status {
    	private int idStatus;
	private String descricaoStatus;

    public Status() {
    }

    public Status(int idStatus, String descricaoStatus) {
        this.idStatus = idStatus;
        this.descricaoStatus = descricaoStatus;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    public void setDescricaoStatus(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }



}
