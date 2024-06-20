
package ejjuegorol;
public class Guerrero extends PersonajeBase {
    private int guefue;

    public Guerrero(String nombre, int puntosVida, int nivel, int experiencia, int guefue) {
        super(nombre, puntosVida, nivel, experiencia);
        this.guefue = guefue;
    }

    @Override
    public void atacar(PersonajeBase p) {
        int dano = guefue * nivel;
        p.setPuntosVida(p.getPuntosVida() - dano);
        System.out.println(nombre + " ataca a " + p.getNombre() + " causando " + dano + " de daño.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende con su escudo.");
    }
}
