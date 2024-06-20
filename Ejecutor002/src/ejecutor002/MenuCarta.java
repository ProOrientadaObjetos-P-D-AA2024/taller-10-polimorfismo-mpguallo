
package ejecutor002;

class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicionalServicio;

    public MenuCarta(String nombrePlato, double valorInicialMenu, double valorGuarnicion, double valorBebida, double porcentajeAdicionalServicio) {
        super(nombrePlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    @Override
    public double calcularValorMenu() {
        double adicionalServicio = valorInicialMenu * (porcentajeAdicionalServicio / 100);
        return valorInicialMenu + valorGuarnicion + valorBebida + adicionalServicio;
    }

    @Override
    public String toString() {
        return String.format("Menu a la Carta:\n%s\nValor guarnición: %.2f\nValor bebida: %.2f\nPorcentaje Adicional: %.2f\nValor del Menú: %.2f",
                super.toString(), valorGuarnicion, valorBebida, porcentajeAdicionalServicio, calcularValorMenu());
    }
}