/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leona
 */
import java.util.ArrayList;
public class Principal {
    int unEntero = 2;
    float unFlotante = 3.5f;
    double unDouble = 4.5;
    String cadenita = "hola soy leo";
    
    //metodo
    public static void main(String[] args) {
        ArrayList<Float> listaDeNumeros = new ArrayList<>(); /*el nombre del array es listaDeNumeros, si era int tengo que p0oner integer*/

        listaDeNumeros.add(2.3f);
        listaDeNumeros.add(4.6f);
        listaDeNumeros.add(6.7f);
        listaDeNumeros.add(5.0f);    

        System.out.println("Elementos de la lista:");
        for (Float numero : listaDeNumeros) {
             System.out.println(numero);
        }

        float suma = 0;
        for (Float numero : listaDeNumeros) {
             suma += numero;
        }

        float promedio = suma / listaDeNumeros.size();


        System.out.println("Promedio de los elementos: " + promedio);
    }
}
