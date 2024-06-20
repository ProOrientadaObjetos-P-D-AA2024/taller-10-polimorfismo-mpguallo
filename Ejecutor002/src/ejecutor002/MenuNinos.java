
package ejecutor002;

class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorInicialMenu, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    @Override
    public double calcularValorMenu() {
        return valorInicialMenu + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return String.format("Menu de Niños:\n%s\nValor helado: %.2f\nValor pastel: %.2f\nValor del Menú: %.2f",
                super.toString(), valorHelado, valorPastel, calcularValorMenu());
    }
}