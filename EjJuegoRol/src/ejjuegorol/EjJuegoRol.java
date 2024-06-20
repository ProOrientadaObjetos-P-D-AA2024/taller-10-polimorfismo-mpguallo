package ejjuegorol;

import java.util.Scanner;

public class EjJuegoRol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("      'Bievenidos a Batallas Epicas' ");
        System.out.println("=========================================");
        System.out.print("-Ingrese el nombre del Guerrero: ");
        String nombreGuerrero = scanner.nextLine();
        Guerrero guerrero = new Guerrero(nombreGuerrero, 95, 1, 0, 20);

        System.out.print("-Ingrese el nombre del Mago: ");
        String nombreMago = scanner.nextLine();
        Mago mago = new Mago(nombreMago, 70, 1, 0, 30);

        System.out.print("-Ingrese el nombre del Arquero: ");
        String nombreArquero = scanner.nextLine();
        Arquero arquero = new Arquero(nombreArquero, 85, 1, 0, 25);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=================================");
            System.out.println("      SELECCIONA EL COMBATE");
            System.out.println("=================================");
            System.out.println("1. Guerrero vs Mago");
            System.out.println("2. Guerrero vs Arquero");
            System.out.println("3. Mago vs Arquero");
            System.out.println("4. Salir");
            System.out.print("-Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Combate.iniciarCombate(guerrero, mago);
                    break;
                case 2:
                    Combate.iniciarCombate(guerrero, arquero);
                    break;
                case 3:
                    Combate.iniciarCombate(mago, arquero);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
        System.out.println("¡Gracias por jugar!");
    }
}