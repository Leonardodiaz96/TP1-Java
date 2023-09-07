/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author leona
 */

public class PrimeraClase {
    // Atributos
    String unaCadena;
    int unEntero;

    public static void main(String[] args) {
        // Crear una instancia de PrimeraClase
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        ArrayList<PrimeraClase> unObjeto = new ArrayList<>();
       
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Escritorio";
        unObjeto2.unEntero = 2;
        unObjeto3.unaCadena = "casa";
        unObjeto3.unEntero = 23;
        unObjeto4.unaCadena = "departamento";
        unObjeto4.unEntero = 43;
        unObjeto5.unaCadena = "camping";
        unObjeto5.unEntero = 223;
        
        // Llamar al método mostrar() para mostrar los atributos
        /*unObjeto1.mostrar();
        unObjeto2.mostrar();
        unObjeto3.mostrar();
        unObjeto4.mostrar();
        unObjeto5.mostrar();con esto anda*/
        
        //otro metodo para mostrar() los atribtos
         
        unObjeto.add(unObjeto1);
        unObjeto.add(unObjeto2);
        unObjeto.add(unObjeto3);
        unObjeto.add(unObjeto4);
        unObjeto.add(unObjeto5);
        for(int i=0; i < unObjeto.size(); i++){
            unObjeto.get(i).mostrar();
        }
        //hasta aca ese el metodo   

    }
    
        // Método para mostrar los atributos SIEMPRE SIN COMENTAR EN ESTE CASO
    public void mostrar() {
        System.out.println("Atributos: " + unaCadena + " y " + unEntero);
    }
}

