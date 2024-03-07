import entities.Dipendente;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(1, 2000.0, "PRODUZIONE");
        Dipendente dipendente2 = new Dipendente(2, 2800.0, "AMMINISTRAZIONE");
        Dipendente dipendente3 = new Dipendente(3,2500.0, "VENDITE");

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for(Dipendente dipendente : dipendenti){
            System.out.println("Matricola: " + dipendente.getMatricola());
            System.out.println("Dipartimento: " + dipendente.getDipartimento());
        }
    }
}

