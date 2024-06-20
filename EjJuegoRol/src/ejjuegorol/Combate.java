
package ejjuegorol;
import java.util.Scanner;
public class Combate {public static void iniciarCombate(PersonajeBase p1, PersonajeBase p2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n============================================");
        System.out.println("   COMIENZA EL COMBATE ENTRE " + p1.getNombre().toUpperCase() + " Y " + p2.getNombre().toUpperCase());
        System.out.println("============================================");

        while (p1.getPuntosVida() > 0 && p2.getPuntosVida() > 0) {
            System.out.println("\n-----------------------------------------------");
            System.out.println(p1.getNombre() + " (PV: " + p1.getPuntosVida() + ") - ¿Qué quieres hacer?");
            System.out.println("1: Atacar");
            System.out.println("2: Defender");
            System.out.print("Elige una opción: ");
            int opcionP1 = scanner.nextInt();
            if (opcionP1 == 1) {
                p1.atacar(p2);
            } else {
                p1.defender();
            }

            if (p2.getPuntosVida() > 0) {
                System.out.println("\n-----------------------------------------------");
                System.out.println(p2.getNombre() + " (PV: " + p2.getPuntosVida() + ") - ¿Qué quieres hacer?");
                System.out.println("1: Atacar");
                System.out.println("2: Defender");
                System.out.print("Elige una opción: ");
                int opcionP2 = scanner.nextInt();
                if (opcionP2 == 1) {
                    p2.atacar(p1);
                } else {
                    p2.defender();
                }
            }

            System.out.println("\n========================================");
            System.out.println("ESTADO ACTUAL:");
            System.out.println(p1.getNombre() + " tiene " + p1.getPuntosVida() + " puntos de vida.");
            System.out.println(p2.getNombre() + " tiene " + p2.getPuntosVida() + " puntos de vida.");
            System.out.println("========================================");
        }

        if (p1.getPuntosVida() > 0) {
            System.out.println(p1.getNombre() + " ha ganado el combate.");
            p1.ganarExperiencia(50);
        } else {
            System.out.println(p2.getNombre() + " ha ganado el combate.");
            p2.ganarExperiencia(50);
        }

        System.out.println("==============================\n");
    }
}