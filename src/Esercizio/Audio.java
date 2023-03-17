package esercizio;

import java.util.Scanner;

public class Audio extends elemento_multimediale {

	Scanner s = new Scanner(System.in);

	private int volume, durata;

	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
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

	public void play() {
		while (this.durata == 0) {
			System.out.println("La durata non può essere ZERO! Inserisci una durata valida");
			this.durata=s.nextInt();			
		}
			for (int i = 0; i < durata; i++) {
				System.out.print(titolo);
				for (int j = 0; j < volume; j++) {
					System.out.print("!");
				}
				System.out.print("\n");
			}
		}
	}


