
package ejecutor002;

import java.util.ArrayList;
public class Ejecutor002 {

    public static void main(String[] args) {
        // Crear lista de menús
        ArrayList<Menu> listaMenus = new ArrayList<>();

        // Crear objetos de menús
        MenuNinos menuNino1 = new MenuNinos("Niños 01", 2.00, 1.00, 1.50);
        MenuNinos menuNino2 = new MenuNinos("Niños 02", 3.00, 1.00, 1.50);
        MenuEconomico menuEconomico = new MenuEconomico("Econo 001", 4.00, 25.0);
        MenuDia menuDia = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        MenuCarta menuCarta = new MenuCarta("Carta 001", 6.0, 1.50, 2.0, 10.0);

        // Agregar menús a la lista
        listaMenus.add(menuNino1);
        listaMenus.add(menuNino2);
        listaMenus.add(menuEconomico);
        listaMenus.add(menuDia);
        listaMenus.add(menuCarta);

        // Crear objeto de cuenta
        Cuenta miCuenta = new Cuenta("René Elizalde", listaMenus, 10.0);

        // Mostrar factura
        System.out.println(miCuenta);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
    }
}
