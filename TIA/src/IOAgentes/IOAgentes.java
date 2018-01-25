/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOAgentes;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tia.Agente;

/**
 *
 * @author Alex Recacha
 */
public class IOAgentes {
    
    public static void guardarBinario(File pisos, File armas, String[] vPisos, String[] vArmas){

        try (FileOutputStream fs = new FileOutputStream(pisos);
             DataOutputStream ds = new DataOutputStream(fs)){
            
            for (String p:vPisos){
                if (p!= null) {
                    ds.writeUTF(p);
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero pisos.txt no encontrado");
        } catch (IOException ex) {
            System.err.println("Fallo al guardar en pisos.txt");
        }
        
        try (FileOutputStream fs = new FileOutputStream(armas);
             DataOutputStream ds = new DataOutputStream(fs)){
            
            for (String a:vArmas){
                if (a!= null) {
                    ds.writeUTF(a);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero arma.txt no encontrado");
        } catch (IOException ex) {
            System.err.println("Fallo al guardar en armas.txt");
        }
        
    }
    
    public static void encriptar(){
        
        
        
    }
    
    public static void desencriptar(){
        
        
        
    }
    
    public static void cargarFicherosBinario(File pisos, File armas, String[] vPisos, String[] vArmas){
        
        
        
    }
    
    public static void altaPisoNuevo(){
        File file = new File("pisos.txt");
        Scanner leer = new Scanner (System.in);
        
        try (FileWriter fi = new FileWriter(file,true);
             PrintWriter escribir = new PrintWriter(fi)) {
            
            System.out.println("Dime el nombre del piso");
            escribir.println(leer.nextLine());
            
        } catch (IOException ex) {
            System.out.println("Error al introducir el piso nuevo");
        }
    }
    
    public static void altaArmaNueva(){
        File file = new File("armas.txt");
        Scanner leer = new Scanner (System.in);
        
        try (FileWriter fi = new FileWriter(file,true);
             PrintWriter escribir = new PrintWriter(fi)) {
            
            System.out.println("Dime el nombre de la nueva arma.");
            escribir.println(leer.nextLine());
            
        } catch (IOException ex) {
            System.out.println("Error al introducir la arma nueva");
        }
    }
    
    
}
