
package ejjuegorol;

public class Arquero extends PersonajeBase {
    private int arqpre;

    public Arquero(String nombre, int puntosVida, int nivel, int experiencia, int arqpre) {
        super(nombre, puntosVida, nivel, experiencia);
        this.arqpre = arqpre;
    }

    @Override
    public void atacar(PersonajeBase p) {
        int dano = arqpre * nivel;
        p.setPuntosVida(p.getPuntosVida() - dano);
        System.out.println(nombre + " dispara una flecha a " + p.getNombre() + " causando " + dano + " de daño.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se esconde y esquiva el ataque.");
    }
}