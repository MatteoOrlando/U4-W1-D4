package entities2;

public class DipendenteFullTime  extends Dipendente {
    public DipendenteFullTime(int matricola, double stipendio, String dipartimento){
        super(matricola, stipendio, dipartimento);
}

@Override
public void calculateSalary(){
        stipendio = getStipendio();
}
}