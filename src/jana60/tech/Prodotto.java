package jana60.tech;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	public double prezzo;
	public double iva = 0.22;

	public Prodotto(String nome, String marca, double prezzo) {

		Random rand = new Random();
		int ranNum = rand.nextInt(10000 + 1 - 1) + 1;
		codice = ranNum;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public double getFullPrezzo() {
		return (prezzo + (prezzo * iva));
	}

	public void setPrezzo(double prezzo) {

		this.prezzo = prezzo;
	}

	public int getCodice() {
		return codice;
	}

	public double getIva() {
		return iva;
	}
}
