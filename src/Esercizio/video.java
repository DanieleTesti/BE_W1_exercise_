package esercizio;

import java.util.Scanner;

public class video extends elemento_multimediale {

	Scanner s = new Scanner(System.in);

	private int volume, luminosita;

	public video(String titolo, int volume, int durata, int luminosita) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
		this.luminosita = luminosita;
	}

	public int getVolume() {
		return volume;
	}

	public void volumePiu() {
		volume++;
	}

	public void volumeMeno() {
		if (volume > 0)
			volume--;
		else
			System.out.println("Volume al minimo");
	}

	public int getluminosita() {
		return luminosita;
	}

	public void luminositaPiu() {
		luminosita++;
	}

	public void luminositaMeno() {
		if (luminosita > 0)
			luminosita--;
		else
			System.out.println("Luminosita al minimo");
	}

	public void play() {
		while (this.durata == 0) {
			System.out.println("La durata non può essere ZERO! Inserisci una durata valida");
			this.durata = s.nextInt();
		}
		for (int i = 0; i < durata; i++) {
			System.out.print(titolo);
			for (int j = 0; j < volume; j++) {
				System.out.print("!");
			}
				for (int z = 0; z < luminosita; z++) {
					System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
