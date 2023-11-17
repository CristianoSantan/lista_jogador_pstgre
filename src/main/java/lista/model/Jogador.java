package lista.model;

public class Jogador {
	private String nome, img, escudo;
	private int camisa;

	public Jogador() {
		super();
	}

	public Jogador(String nome, String img, String escudo, int camisa) {
		super();
		this.nome = nome;
		this.img = img;
		this.escudo = escudo;
		this.camisa = camisa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getBrasao() {
		return escudo;
	}

	public void setBrasao(String escudo) {
		this.escudo = escudo;
	}

}
