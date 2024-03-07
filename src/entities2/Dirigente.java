package entities2;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {

        stipendio = getStipendio();
    }
}
