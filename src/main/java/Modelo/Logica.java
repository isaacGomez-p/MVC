/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ISAACELEAZAR
 * @author Brayan
 */
public class Logica {
    /**
     * Variable que representa el primer numero a multiplicar
     */
    private int num1;
    /**
     * Variable que representa el segundo numero a multiplicar
     */
    private int num2;    
    /**
     * Constructor de la clase logica
     */
    public Logica(){
        
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    /**
     * metodo que retorna el resultado de la multiplicacion
     * @return 
     */
    public String resultado(){
        int rs = (this.num1*this.num2);
        return String.valueOf(rs);
    }
        
}
