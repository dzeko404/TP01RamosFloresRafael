package ar.edu.unju.edm.model;

public class Punto03 {
    private int numeroPar;

    public Punto03(){

    }

    public Punto03(int numeroPar) {
        this.numeroPar = numeroPar;
    }

    public int getNumeroPar() {
        return numeroPar;
    }

    public void setNumeroPar(int numeroPar) {
        this.numeroPar = numeroPar;
    }

    public boolean verifacarPar(int numeroPar){
        boolean trueFalse = false;
        if(numeroPar % 2 == 0){
            trueFalse = true;
        }
        return trueFalse;
    }

    public String comprobraPar(int numeroPar){
        String numeroParTrue = "";

        if(numeroPar % 2 == 0){
            numeroParTrue = "Es un numero par";
        }
        else{
            numeroParTrue = "No es un numero par";
        }

        return numeroParTrue;
    }
  }
