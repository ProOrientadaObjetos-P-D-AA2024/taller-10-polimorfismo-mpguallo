
package ejecutor002;

class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicialMenu, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    @Override
    public double calcularValorMenu() {
        return valorInicialMenu + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return String.format("Menu del Día:\n%s\nValor postre: %.2f\nValor bebida: %.2f\nValor del Menú: %.2f",
                super.toString(), valorPostre, valorBebida, calcularValorMenu());
    }
}