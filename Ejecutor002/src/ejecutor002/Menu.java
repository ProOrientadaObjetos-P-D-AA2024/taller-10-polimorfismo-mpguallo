
package ejecutor002;

abstract class Menu {
    protected String nombrePlato;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu = valorInicialMenu;
    }

    public abstract double calcularValorMenu();

    @Override
    public String toString() {
        return String.format("Plato: %s\nValor Inicial: %.2f\nValor del Menú: %.2f", nombrePlato, valorInicialMenu, calcularValorMenu());
    }
}