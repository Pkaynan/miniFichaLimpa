package model;

public class Politico {

	private Long id;
	private String nome;
	private int numeroEleitoral;
	private String nomeEleitoral;
	private Long partido;

	public Politico() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroEleitoral() {
		return numeroEleitoral;
	}

	public void setNumeroEleitoral(int numeroEleitoral) {
		this.numeroEleitoral = numeroEleitoral;
	}

	public String getNomeEleitoral() {
		return nomeEleitoral;
	}

	public void setNomeEleitoral(String nomeEleitoral) {
		this.nomeEleitoral = nomeEleitoral;
	}

	public Long getPartido() {
		return partido;
	}

	public void setPartido(Long partido) {
		this.partido = partido;
	}
}
