package jana60.tech;

public class Shop {

	public static void main(String[] args) {

		Prodotto iphone = new Smartphone("Iphone 14", "Apple", 1399, 128);

		Prodotto beats = new Cuffia("Beats", "Beats", 299, "Black", true);

		Prodotto samsungTv = new Televisore("TV", "Samsung", 799, 55, true);

		System.out.println(iphone.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(beats.toString());
		System.out.println("------------------------------------------------------------------");
		System.out.println(samsungTv.toString());
	}
}
