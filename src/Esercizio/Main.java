package esercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		elemento_multimediale[] elementi = new elemento_multimediale[1];
		for (int i = 0; i < elementi.length; i++) {
			System.out.println("Inserisci il tipo di elemento da inserire( 1 immagine || 2 audio || 3 video )");
			int tipo = s.nextInt();
			switch (tipo) {
			// IMMAGINE
			case 1:
				System.out.println("Stai inserendo un immagine");
				System.out.println("Inserisci il titolo dell'immagine");
				String immagineNome = s.next();
				System.out.println("Inserisci la luminosita");
				int luminositaF = s.nextInt();
				// img.luminositaMeno();
				// img.luminositaPiu();
				elementi[i] = new image(immagineNome, luminositaF);
				break;
			// FINE IMMAGINE
			// AUDIO
			case 2:
				System.out.println("Stai inserendo un audio");
				System.out.println("Inserisci il titolo dell'audio");
				String titoloAudio = s.next();
				System.out.println("Inserisci il volume");
				int volumeA = s.nextInt();
				System.out.println("Inserisci la durata");
				int durataA = s.nextInt();
				elementi[i] = new Audio(titoloAudio, volumeA, durataA);
				break;
			// FINE AUDIO

			// VIDEO
			case 3:
				System.out.println("Stai inserendo un video");
				System.out.println("Inserisci il titolo del video");
				String titoloVideo = s.next();
				System.out.println("Inserisci il luminosita");
				int luminositaV = s.nextInt();
				System.out.println("Inserisci la volume");
				int volumeV = s.nextInt();
				System.out.println("Inserisci la durata");
				int durataV = s.nextInt();
				elementi[i] = new video(titoloVideo, volumeV, durataV, luminositaV);
				break;
			// FINE VIDEO
			default:
				System.out.println("Inserisci una scelta giusta");
			}

		}

		int scelta = -1;
		// se la inizializzo a 0 esce direttamente, mentre se la inizializzo a un numero
		// positivo se la lunghezza dell'array cambia prende la posizione dell'array,
		// per questo la inizializzo a -1

		while (scelta != 0) {
			System.out.println("Inserisci una elemento multimediale da visualizzare(0 per uscire)");
			scelta = s.nextInt();
			int sceltaArray = scelta - 1;
			if (scelta >= 1 && scelta < elementi.length + 1) {
				elemento_multimediale elemento = elementi[sceltaArray];
				// faccio cosi perche l'inserimento dell'utente si va a comparare con la
				// posizione dell'array

				if (elemento instanceof video) {
					video video = (video) elemento;
					video.play();
				} else if (elemento instanceof image) {
					image image = (image) elemento;
					image.show();
				} else if (elemento instanceof Audio) {
					Audio video = (Audio) elemento;
					video.play();
				}
			} else if (scelta == 0) {
				System.out.println("Sei uscito dal programma");
			}
	}
	}
}