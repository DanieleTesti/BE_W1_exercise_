package esercizio;

import java.util.Scanner;

public class image extends elemento_multimediale {

	Scanner s = new Scanner(System.in);

	private int luminosita;

	public image(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
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

	public void show() {
		System.out.print(titolo);
		if (luminosita > 0) {
			for (int i = 0; i < luminosita; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		} else {
			System.out.println("Luminosita al minimo");

	}
	}
}
