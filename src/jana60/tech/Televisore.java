package jana60.tech;

public class Televisore extends Prodotto {
	private int pollici;
	private boolean smart;

	public Televisore(String nome, String marca, double prezzo, int pollici, boolean smart) {
		super(nome, marca, prezzo);
		setSmart(smart);
		setPollici(pollici);
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {

		return "[" + "Codice: " + getCodice() + "  /  " + getNome() + "]\n" + getMarca() + " - \"" + getPrezzo() + "\""
				+ "\n" + "Dimensoni: " + getPollici() + "″ " + (isSmart() ? "Smart TV" : "NON Smart TV") + "\n"
				+ getPrezzo() + "€ (" + (getIva() * 100) + "%)" + " --> " + "Prezzo Totale: " + "€" + getFullPrezzo();
	}
}
