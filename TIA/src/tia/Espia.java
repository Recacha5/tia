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
public final class Espia extends Agente {
    
    private String[] pisos;

    public Espia(String[] pisos, String nombre, int edad, String direccion, int salario) {
        super(nombre, edad, direccion, salario);
        this.pisos = new String[20];
    }

    /**
     * @return the pisos
     */
    public String[] getPisos() {
        return pisos;
    }

    /**
     * @param pisos the pisos to set
     */
    public void setPisos(String[] pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return super.toString() + " Pisos: " + pisos;
    }
    
    
    
}
