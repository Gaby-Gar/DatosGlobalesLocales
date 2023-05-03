/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Globales {

     // Variable global
    static int globalVar = 10;

    public static void main(String[] args) {
        // Variable local
        int localVar = 5;

        System.out.println("Valor de la variable global: " + globalVar);
        System.out.println("Valor de la variable local: " + localVar);

        // Actualizar variable global
        globalVar = 20;
        System.out.println("Nuevo valor de la variable global: " + globalVar);
    }
}
