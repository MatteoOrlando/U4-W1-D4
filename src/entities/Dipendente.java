package entities;

public class Dipendente {
    private int matricola;
    private double stipendio;
    private String dipartimento;

    public Dipendente(int matricola, double stipendio, String dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }



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
