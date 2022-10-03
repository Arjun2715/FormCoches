package com.mycompany.concesionario;

import java.io.File;
import java.util.Scanner;
public class NewClass {

    public static void main(String[] args) {
        NewClass program = new NewClass();
        program.inicio();
        
    }
    public void inicio(){
        int cont =1;
        try{
            //intentar abrir un archivo
            File f = new File("C:/Temp/Enteros.txt");
            
            Scanner lectura = new Scanner(f);
            //Si se ejecuta, se ha abierto al fichero
            for (int i = 0; i < 10; i++) {
                int valor = lectura.nextInt();
                System.out.println("El valor["+cont+"] leido es: " + valor);
                cont++;
            }
            
            lectura.close();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
}