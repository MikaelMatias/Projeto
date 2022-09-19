package br.com.pizzaria.model;

public class TipoUsuario {
    	private int idTipoUsuario;
	private String descricaoTipoUsuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String descricaoTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.descricaoTipoUsuario = descricaoTipoUsuario;
    }

    public TipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getDescricaoTipoUsuario() {
        return descricaoTipoUsuario;
    }

    public void setDescricaoTipoUsuario(String descricaoTipoUsuario) {
        this.descricaoTipoUsuario = descricaoTipoUsuario;
    }

}
