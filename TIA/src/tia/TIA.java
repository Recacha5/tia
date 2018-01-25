/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia;

import Menus.Menu;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class TIA {

    public static void altaAgenteNuevo(Agente[] vAgentes){
        Scanner leer = new Scanner (System.in);
        Scanner leer2 = new Scanner (System.in);
        String nombre,direccion;
        int edad, opcion;
        double salario;
        
        try{
            System.out.println("Dime el nombre del agente");
            nombre = leer.nextLine();
            System.out.println("Dime la edad del agente");
            edad = leer.nextInt();
            System.out.println("Dime la direccion del agente");
            direccion = leer.nextLine();
            System.out.println("Dime el salario del agente");
            salario = leer.nextDouble();
        }catch (Exception ex){
            System.err.println("Tecla incorrecta");
        }
        
        System.out.println("Qué tipo de agente es?");
        System.out.println("1- Jefe");
        System.out.println("2- Espia");
        System.out.println("3- 007");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1: System.out.println("Cuantos años de mandato lleva?");
                    int años = leer2.nextInt();
                    break;
            case 2: System.out.println("Dime un piso franco");
                    String pisos = leer.nextLine();
                    break;
            case 3: System.out.println("Número de bajas?");
                    int bajas = leer2.nextInt();
                    break;
        }
    }
    
    public static void main(String[] args) {
        boolean bandera = true;
        String[] vPisos = new String[20];
        String[] vArmas = new String[20];
        Agente[] vAgentes = new Agente[20];

        File pisos = new File("pisos.txt");
        File armas = new File("armas.txt");

        while (bandera) {
            switch (Menu.menuAgentes()) {

                case 1: 
                        break;
                case 2:
                        break;
                case 3:
                        break;
                case 4:
                        break;
                case 5:
                        break;
                case 6:
                        break;
                case 7:
                        break;
                case 8: bandera= false;
                        break;
            }
        }

    }

}
