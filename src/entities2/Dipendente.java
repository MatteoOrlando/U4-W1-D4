package entities2;

public abstract class Dipendente {
    private int matricola;
    protected double stipendio;
    protected String dipartimento;

    public Dipendente(int matricola, double stipendio, String dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }


public abstract void calculateSalary();
    public int getMatricola(){
        return matricola;
    }
    public double getStipendio(){
        return stipendio;
    }
    public String getDipartimento(){
        return dipartimento;
    }
    public void setDipartimento(String dipartimento){
        this.dipartimento = dipartimento;
    }
}
