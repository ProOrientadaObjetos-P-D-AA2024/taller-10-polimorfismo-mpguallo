
package ejecutor002;

class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicialMenu, double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularValorMenu() {
        double descuento = valorInicialMenu * (porcentajeDescuento / 100);
        return valorInicialMenu - descuento;
    }

    @Override
    public String toString() {
        return String.format("Menu Económico:\n%s\nPorcentaje Descuento: %.2f\nValor del Menú: %.2f",
                super.toString(), porcentajeDescuento, calcularValorMenu());
    }
}