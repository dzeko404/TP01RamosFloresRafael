package ar.edu.unju.edm.model;

public class Punto01 {
    private int num;

    public Punto01(int num) {
        this.num = num;
    }

    public Punto01() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int calcularFactorial(int num){
        int factorial = 1;
        int i = num;
        
        while(i != 0){
            factorial = factorial*i;
            i--;
        }

        return factorial;
    }
}
