package ejjuegorol;
public class Mago extends PersonajeBase {
    private int magMan;

    public Mago(String nombre, int puntosVida, int nivel, int experiencia, int magMan) {
        super(nombre, puntosVida, nivel, experiencia);
        this.magMan = magMan;
    }

    @Override
    public void atacar(PersonajeBase p) {
        int dano = magMan * nivel;
        p.setPuntosVida(p.getPuntosVida() - dano);
        System.out.println(nombre + " lanza un hechizo a " + p.getNombre() + " causando " + dano + " de daño.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " crea un escudo mágico.");
    }
}