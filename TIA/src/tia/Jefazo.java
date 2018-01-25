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
public final class Jefazo extends Agente {
    
    private int anyosMandato;

    public Jefazo(int anyosMandato, String nombre, int edad, String direccion, int salario) {
        super(nombre, edad, direccion, salario);
        this.anyosMandato = anyosMandato;
    }

    /**
     * @return the anyosMandato
     */
    public int getAnyosMandato() {
        return anyosMandato;
    }

    /**
     * @param anyosMandato the anyosMandato to set
     */
    public void setAnyosMandato(int anyosMandato) {
        this.anyosMandato = anyosMandato;
    }

    @Override
    public String toString() {
        return "******************************************* \n"+
                super.toString() + " Años de Mandato: " + anyosMandato + 
                "\n *******************************************";
    }
    
    
    
}
