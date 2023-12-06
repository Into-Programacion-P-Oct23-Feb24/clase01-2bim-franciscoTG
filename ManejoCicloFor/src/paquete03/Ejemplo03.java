/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre_Jugador;
        String apellido_Jugador;
        String posición_Juego;
        String mensajeFinal = "listado de jugadores\n";
        int edad;
        double estatura;
        int limite;
        System.out.println("Ingrese la cantidad de jugadores que quiere registrar");
        limite = entrada.nextInt();
        for (int i = 0; i <= limite; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador"+1+":");
            nombre_Jugador = entrada.nextLine();
            System.out.println("Ingrese el apellido del jugador"+1+":");
            apellido_Jugador = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador"+1+":");
            posición_Juego = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador"+1+":");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador"+1+":");
            estatura = entrada.nextDouble();           
            
           mensajeFinal=String.format( "%s%s %s-%s-edad %d,estatura %.2f\n",
                   mensajeFinal,
                   nombre_Jugador,
                   apellido_Jugador,
                   posición_Juego,
                   edad,
                   estatura);
        }
         System.out.println(mensajeFinal);
    }
}

