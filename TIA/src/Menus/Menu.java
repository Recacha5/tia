/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Menu {
    
    public static int menuAgentes(){
        Scanner leer = new Scanner (System.in);
        
        System.out.println("-------------------Menú Agentes--------------------" + "\n" + 
                           "1- Ver todos los agentes con su información.\n" +
                           "2- Ver los agentes que ganen más de una cantidad X.\n" +
                           "3- Dar de alta un nuevo piso.\n" +
                           "4- Dar de alta una nueva arma.\n" +
                           "5- Dar de alta un nuevo agente.\n" +
                           "6- Encriptar toda la información.\n" +
                           "7- Desencriptar toda la información.\n" +
                           "8- Salir. \n" +
                           "---------------------------------------------------");
        System.out.println("Dime una opción.\n");
        return leer.nextInt();
    }
    
}
