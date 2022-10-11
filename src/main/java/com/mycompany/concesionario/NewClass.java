package com.mycompany.concesionario;

import java.io.File;
import java.util.Arrays;
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
            /*File f = new File("D:\\Nueva carpeta\\FormCochesV1\\FormCoches\\coche.txt");
            
            Scanner lectura = new Scanner(f);
            //Si se ejecuta, se ha abierto al fichero
            
            while (lectura.hasNext()) {
                String[] next = lectura.nextLine().split(";");
                System.out.print(Arrays.toString(next));
            }
            File folder = new File("D:\\Java\\FormCoches\\Coches");
            String[] filenames = folder.list();
            for (int i = 0; i < filenames.length; i++) {
                if(filenames[i].equals());
            }*/
                
                
            
            //lectura.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
}