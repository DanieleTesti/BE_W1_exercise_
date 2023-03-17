package Esercizio;

public class Main {
	public static void main(String[] args) {

		//dipendente dip1 = new dipendente(Dipartimento.PRODUZIONE, 01, 30, livello_dipendente.IMPIEGATO);
		//dipendente dip2 = new dipendente(Dipartimento.AMMINISTRAZIONE, 02, 30, livello_dipendente.DIRIGENTE);
		//dipendente dip3 = new dipendente(Dipartimento.VENDITA, 03, 30, livello_dipendente.OPERAIO);
		dipendente dip1= new dipendente( livello_dipendente.DIRIGENTE);
		dipendente dip2= new dipendente( livello_dipendente.IMPIEGATO);
		//dip4.stampaStipendi();

		//dip1.stampaDatiDipendente();
		// dip2.stampaDatiDipendente();
		System.out.println("------------------------");
		//dip3.stampaDatiDipendente();
		System.out.println("------------------------");
		dip1.promuovi();
		dip1.stampaDatiDipendente();
		System.out.println(dipendente.stipendiTotali(dip1, 55));
		System.out.println("------------------------");
		dip2.stampaDatiDipendente();
		//dip1.promuovi(livello_dipendente.OPERAIO);
		//dip1.addStraordinario(livello_dipendente.IMPIEGATO);
	}

}
