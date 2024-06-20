
package ejecutor002;

import java.util.ArrayList;

class Cuenta {    
    private String nombreCliente;
    private ArrayList<Menu> listaMenus;
    private double iva;

    public Cuenta(String nombreCliente, ArrayList<Menu> listaMenus, double iva) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = listaMenus;
        this.iva = iva;
    }

    public void establecerSubtotal() {
        // Calcula el subtotal sumando el valor de cada menú
        double subtotal = 0;
        for (Menu menu : listaMenus) {
            subtotal += menu.calcularValorMenu();
        }
        System.out.printf("Subtotal: %.2f\n", subtotal);
    }

    public void establecerValorCancelar() {
        // Calcula el valor total a pagar incluyendo el IVA
        double subtotal = 0;
        for (Menu menu : listaMenus) {
            subtotal += menu.calcularValorMenu();
        }
        double total = subtotal * (1 + iva / 100);
        System.out.printf("IVA: %.1f%%\n", iva);
        System.out.printf("Total a pagar: %.3f\n", total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n**********************************************\n");
        sb.append("               Chefcito\n");
        sb.append("**********************************************\n");
        sb.append("Número de Factura: 1 \n");
        sb.append("Fecha: 19/06/2024\n"); //Fecha x
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        sb.append("Cédula: 1178526394\n"); //Cedula x
        sb.append("**********************************************\n");
        for (Menu menu : listaMenus) {
            sb.append(menu).append("\n");
            sb.append("----------------------------------------------\n");
        }
        sb.append("**********************************************\n");
        return sb.toString();
    }
}