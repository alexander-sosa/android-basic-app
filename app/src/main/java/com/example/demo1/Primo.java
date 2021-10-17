package com.example.demo1;

public class Primo {
    private int n;

    public Primo(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int cont_divisores_exactos(){
        int c=0;
        for (int i = 1; i<=n; i++){
            if(n%i == 0) c++;
        }
        return c;
    }

    public boolean isPrime(){
        if(cont_divisores_exactos() == 2){
            return true;
        }
        else
            return false;
    }
}
