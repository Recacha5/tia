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
public abstract class Agente {
    
    protected String nombre;
    protected int edad;
    protected String direccion;
    protected int salario;

    public Agente(String nombre, int edad, String direccion, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.salario = salario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void verAgentes(){
        
        
        
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + edad + " Direccion: " + direccion + " Salario:" + salario;
    }

    
    
    
}
