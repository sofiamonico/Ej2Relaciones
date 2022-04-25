/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2relaciones;

import entidades.juego.Juego;
import entidades.juego.Jugador;
import entidades.juego.RevolverdeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Ej2Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RevolverdeAgua r1 = new RevolverdeAgua();
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego j1 = new Juego();
        llenarJugadores(jugadores);
        r1.llenarRevolver();
        j1.llenarJuego(jugadores, r1);
        j1.ronda();
    }

    public static void llenarJugadores(ArrayList<Jugador> jugadores) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de jugadores. MAXIMO 6");
        int numJugadores = leer.nextInt();
        if (numJugadores > 6)
        {
            numJugadores = 0;
        }

        for (int i = 0; i < numJugadores; i++)
        {
            System.out.println("Ingrese el ID del jugador");
            String id = leer.next();
            System.out.println("Ingrese el nombre del jugador");
            String nombre = leer.next();
            nombre = nombre + " " + id;
            jugadores.add(new Jugador(id, nombre, false));
        }

    }
}
