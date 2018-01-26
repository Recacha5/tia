/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia;

/**
 *
 * @author Alex Recacha
 */
public final class A007 extends Agente {
    
    private int bajas;

    public A007(int bajas, String nombre, int edad, String direccion, double salario) {
        super(nombre, edad, direccion, salario);
        this.bajas = bajas;
    }

    /**
     * @return the bajas
     */
    public int getBajas() {
        return bajas;
    }

    /**
     * @param bajas the bajas to set
     */
    public void setBajas(int bajas) {
        this.bajas = bajas;
    }

    @Override
    public String toString() {
        return super.toString() + " Bajas: " + bajas;
    }
    
    
    
}
