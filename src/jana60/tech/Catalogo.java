package jana60.tech;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		int counter = 1;
		boolean done = true;
		Prodotto[] devices = new Prodotto[100];
		while (done) {
			Scanner input = new Scanner(System.in);
			System.out.println("Cosa vuoi aggiungere:");
			System.out.println("1 - Smartphone");
			System.out.println("2 - Televisore");
			System.out.println("3 - Cuffie");
			System.out.println("4 - Voglio Uscire.");
			System.out.println("-------------------");

			int scelta = input.nextInt();

			if (scelta < 1 || scelta > 4) {

				System.err.println("Scelta non trovata");

				continue;
			}
			switch (scelta) {
			case 1: {
				System.out.println("Modello ?");
				String nome = input.next();
				System.out.println("Marca ?");
				String marca = input.next();
				System.out.println("Prezzo ?");
				double prezzo = input.nextDouble();
				System.out.println("Memoria ?");
				int memori = input.nextInt();

				Prodotto device = new Smartphone(nome, marca, prezzo, memori);
				devices[counter - 1] = device;
				counter++;

			}
				break;
			case 2: {
				System.out.println("Modello ?");
				String nome = input.next();

				System.out.println("Marca ?");
				String marca = input.next();
				System.out.println("Prezzo ?");
				double prezzo = input.nextDouble();
				System.out.println("Pollici ?");
				int pollici = input.nextInt();
				System.out.println("E' una smart tv ? 1 = si, 0 = no");
				boolean smart = input.nextBoolean();

				Prodotto device = new Televisore(nome, marca, prezzo, pollici, smart);
				devices[counter - 1] = device;
				counter++;
			}
				break;
			case 3: {
				System.out.println("Modello ?");
				String nome = input.next();
				System.out.println("Marca ?");
				String marca = input.next();
				System.out.println("Prezzo ?");
				double prezzo = input.nextDouble();
				System.out.println("Colore ?");
				String colore = input.next();
				System.out.println("E' Wireless ? 1 = si, 0 = no");
				boolean wireless = input.nextBoolean();

				Prodotto device = new Cuffia(nome, marca, prezzo, colore, wireless);
				devices[counter - 1] = device;
				counter++;
			}
			case 4: {
				System.out.println("Ok, ecco il catalogo: ");
				for (int i = 0; i < devices.length; i++) {
					Prodotto device = devices[i];
					device.toString();
				}
			}
			}
			input.close();
			done = false;
			System.out.println("Ok, ecco il catalogo: ");
			for (int i = 0; i < devices.length; i++) {
				Prodotto device = devices[i];
				device.toString();

			}
		}

	}

}
