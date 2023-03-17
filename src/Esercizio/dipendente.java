package Esercizio;

public class dipendente {

	double StipendioBase = 1000;
	int matricola;
	double stipendio;
	double importoOrarioStraordinario = 30;
	private static int count=1;

	// ENUMS
	private livello_dipendente livello = livello_dipendente.OPERAIO;
	private Dipartimento dipartimento = Dipartimento.NON_ASSEGNATO;

	public dipendente( livello_dipendente livello) {
		this.livello = livello;
		this.stipendio = stampaStipendi();
		this.matricola = count++;
		// this.importoOrarioStraordinario = importoOrarioStraordinario;
		System.out.println(livello);
		System.out.println(this.stipendio);
	}
	


	public dipendente(Dipartimento dipartimento, int matricola, double importoOrarioStraordinario, double stipendio,
			livello_dipendente livello) {
		this.dipartimento = dipartimento;
		this.matricola = matricola;
		this.stipendio = stipendio;
		// this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
	}

	public String toString() {
		String stringa = this.livello + "\n" + this.stipendio + "\n"
				+ this.matricola;
		return stringa;
	}

	public void stampaDatiDipendente() {
		System.out.println(toString());
	}

	public double stampaStipendi() {
		switch (livello) {
		case IMPIEGATO:
			stipendio = this.StipendioBase * 1.2;
			break;
		case QUADRO:
			stipendio = this.StipendioBase * 1.5;
			break;
		case DIRIGENTE:
			stipendio = this.StipendioBase * 2;
			break;
		case OPERAIO:
			stipendio=StipendioBase;
			break;
		default:
			break;
		}
		return stipendio;
	}

	public double promuovi() {
		switch (livello) {
		case OPERAIO:
			livello = livello_dipendente.IMPIEGATO;
			stipendio = ((StipendioBase) * (1.2));
			System.out.println(
					"Livello passato da OPERAIO a " + livello + " e il tuo stipendio ora è " + stipendio + " €");
			return stipendio;
		case IMPIEGATO:
			livello = livello_dipendente.QUADRO;
			stipendio = ((StipendioBase) * (1.5));
			System.out.println(
					"Livello passato da IMPIEGATO a " + livello + " e il tuo stipendio ora è " + stipendio + " €");
			return stipendio;
		case QUADRO:
			livello = livello_dipendente.DIRIGENTE;
			stipendio = ((StipendioBase) * (2));
			System.out.println(
					"Livello passato da QUADRO a " + livello + " e il tuo stipendio ora è " + stipendio + " €");
			return stipendio;
		case DIRIGENTE:
			System.out.println("Sei già dirigente, dove vuoi arrivare?");
			break;
		default:
			System.out.println("Inserisci un livello corretto!");
		}
		return stipendio;
	}

	public void addStraordinario(livello_dipendente livello) {
		stipendio = stipendio;
		importoOrarioStraordinario = 30; // livello = "OPERAIO";
		System.out.println(stipendio + " €");
		System.out.println("Ore di straordinari :" + importoOrarioStraordinario);
		System.out.println(livello);
	}
	
	static  double stipendiTotali(dipendente di, int ore ) {
		double somma=ore*di.importoOrarioStraordinario;
		return (di.stipendio+somma);
	}

	/*
	 * public void stampaTutto(String livello, String dipartimento, int matricola,
	 * float importoOrarioStraordinario) { System.out.println(matricola);
	 * System.out.println(livello); switch (livello) { case "IMPIEGATO": livello =
	 * "QUADRO"; StipendioBase = ((StipendioBase) * (1.2)); break; case "QUADRO":
	 * livello = "DIRIGENTE"; StipendioBase = ((StipendioBase) * (1.5));
	 * 
	 * break; case "DIRIGENTE": StipendioBase = ((StipendioBase) * (2)); break;
	 * default: System.out.println("Inserisci un livello corretto!");
	 * 
	 * } System.out.println(dipartimento);
	 * System.out.println(importoOrarioStraordinario);
	 * System.out.println(StipendioBase); System.out.println(stipendio); }
	 * 
	 * public void stampaDipendente(int matricola, String livello, float stipendio)
	 * { System.out.println(matricola); System.out.println(livello);
	 * System.out.println(stipendio); }
	 */
}