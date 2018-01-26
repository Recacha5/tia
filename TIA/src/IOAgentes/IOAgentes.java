/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOAgentes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    public static void cargarFicheros(File pisos, File armas, File agente, Agente vAgentes[], String[] vPisos, String[] vArmas){
        int contador=0;
        //cargo el fichero pisos.
        try (FileInputStream fi = new FileInputStream(pisos);
             DataInputStream leer = new DataInputStream(fi);) {
            
            while (true) {
                vPisos[contador] = leer.readUTF();
                contador++;
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Fichero pisos no encontrado al leer.");
        } catch (EOFException ex) {
            System.out.println("Fin de lectura del fichero pisos.");
        } catch (IOException ex) {
            System.err.println("Fallo al leer pisos");
        }
        //reinicio la variable contador para reutilizarla al cargar el fichero armas.
        contador=0;

        try (FileInputStream fi = new FileInputStream(armas);
             DataInputStream leer = new DataInputStream(fi);) {
            
            while (true) {
                vArmas[contador] = leer.readUTF();
                contador++;
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Fichero armas no encontrado al leer.");
        } catch (EOFException ex) {
            System.out.println("Fin de lectura del fichero armas.");
        } catch (IOException ex) {
            System.err.println("Fallo al leer armas");
        }
        //cargo el vector de agentes
        contador=0;
        try (FileInputStream fi = new FileInputStream(armas);
             ObjectInputStream leer = new ObjectInputStream(fi);) {
            
            while (true) {
                vAgentes[contador] = (Agente) leer.readObject();
                contador++;
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Fichero agente no encontrado al leer.");
        } catch (EOFException ex) {
            System.out.println("Fin de lectura del fichero agente.");
        } catch (ClassNotFoundException ex) {
            System.err.println("Fallo al leer agentes, no se ha encontrado la clase.");
        } catch (IOException ex) {
            System.err.println("Fallo al leer agente");
        } 
    }
    
    public static void guardarFicheros(File pisos, File armas, File agentes,Agente[] vAgentes, String[] vPisos, String[] vArmas){
        //guardo el fichero pisos
        try (FileOutputStream fo = new FileOutputStream(pisos);
             DataOutputStream escribir = new DataOutputStream(fo);){
            for (String p : vPisos) {
                if (p != null) {
                    escribir.writeUTF(p);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero pisos no encontrado al guardar.");
        } catch (IOException ex) {
            System.err.println("Error al guardar pisos.");
        }
        //guardo el fichero armas
        try (FileOutputStream fo = new FileOutputStream(pisos);
             DataOutputStream escribir = new DataOutputStream(fo);){
            for (String a : vArmas) {
                if (a!= null) {
                    escribir.writeUTF(a);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero armas no encontrado al guardar.");
        } catch (IOException ex) {
            System.err.println("Error al guardar armas.");
        }
        //Guardo el vector entero de agentes.
        try (FileOutputStream fo = new FileOutputStream(pisos);
             ObjectOutputStream escribir = new ObjectOutputStream(fo);){
            for (Agente a : vAgentes) {
                if (a!= null) {
                    escribir.writeObject(a);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero agentes no encontrado al guardar.");
        } catch (IOException ex) {
            System.err.println("Error al guardar agentes.");
        }
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
