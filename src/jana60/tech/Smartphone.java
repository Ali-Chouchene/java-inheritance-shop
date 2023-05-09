package jana60.tech;

import java.util.Random;

public class Smartphone extends Prodotto {
	private int codiceImei;
	private int memory;

	public Smartphone(String nome, String marca, double prezzo, int memory) {
		super(nome, marca, prezzo);
		Random rand = new Random();
		int ranNum = rand.nextInt(100000000 + 1 - 1) + 1;
		codiceImei = ranNum;
		setMemory(memory);

	}

	public int getCodiceImei() {
		return codiceImei;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {

		return "[" + "Codice: " + getCodice() + "  /  " + getNome() + "]\n" + getMarca() + " - \"" + "Prezzo: "
				+ getPrezzo() + "\"" + "\n" + "IMEI: " + getCodiceImei() + "Mermoria: " + getMemory() + "\n"
				+ getPrezzo() + "€ (" + (getIva() * 100) + "%)" + " --> " + "Prezzo Totale: " + "€" + getFullPrezzo();
	}
}
