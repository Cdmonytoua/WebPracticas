/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author los_d
 */
public class modelo {
    
    private int numuno;
    private int numdos;
    private int resultado;

    public int getNumuno() {
        return numuno;
    }

    public void setNumuno(int numuno) {
        this.numuno = numuno;
    }

    public int getNumdos() {
        return numdos;
    }

    public void setNumdos(int numdos) {
        this.numdos = numdos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int suma(){
        
        this.resultado = this.numuno + this.numdos;
        return this.resultado;
        
    }
    
}
