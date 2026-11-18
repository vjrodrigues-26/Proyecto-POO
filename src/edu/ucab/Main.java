package edu.ucab;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int opt = -1;
        Scanner scan = new Scanner(System.in);

        while (opt != 0) {
            System.out.println("***** MENÚ *****");
            System.out.println("1.- Crear orden de reparación.");
            System.out.println("0.- Salir");
            System.out.println("****************");

            System.out.println("Escoge una opción: ");
            try {
                opt = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Por favor ingresa un número válido.");
                opt = -1;
                continue;
            }

            switch(opt) {
                case 1:
                    System.out.println("Entró en el caso 1.");

                    break;

                default:
                    System.out.println("No existe esa opción. Intenté otra vez.");
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
            }
        }
    }
}