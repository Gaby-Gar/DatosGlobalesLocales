/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Local {


    // Variable global
    static int globalVar = 10;

    public static void main(String[] args) {
        // Variable local
        int localVar = 5;

        System.out.println("Valor de la variable global antes de la llamada: " + globalVar);
        System.out.println("Valor de la variable local antes de la llamada: " + localVar);

        // Llamar función
        modificarVariables();

        System.out.println("Valor de la variable global después de la llamada: " + globalVar);
        System.out.println("Valor de la variable local después de la llamada: " + localVar);
    }

    public static void modificarVariables() {
        // Actualizar variable global
        globalVar = 20;
        // Variable local con mismo nombre que la global
        int globalVar = 15;

        System.out.println("Nuevo valor de la variable global dentro de la función: " + globalVar);
    }
}
