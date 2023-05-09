package jana60.tech;

public class Cuffia extends Prodotto {
	private String colore;
	private boolean wireless;

	public Cuffia(String nome, String marca, double prezzo, String colore, boolean wireless) {
		super(nome, marca, prezzo);
		setColore(colore);
		setWireless(wireless);
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	@Override
	public String toString() {

		return "[" + "Codice: " + getCodice() + "  /  " + getNome() + "]\n" + getMarca() + " - \"" + getPrezzo() + "\""
				+ "\n" + getColore() + "\n" + getPrezzo() + "€ (" + (getIva() * 100) + "%)" + " --> "
				+ "Prezzo Totale: " + "€" + getFullPrezzo();
	}
}
