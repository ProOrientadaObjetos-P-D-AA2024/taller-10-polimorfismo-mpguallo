
package ejjuegorol;
public abstract class PersonajeBase {
    protected String nombre;
    protected int puntosVida;
    protected int nivel;
    protected int experiencia;

    public PersonajeBase(String nombre, int puntosVida, int nivel, int experiencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public abstract void atacar(PersonajeBase p);

    public abstract void defender();

    public void subirNivel() {
        nivel++;
        puntosVida += 10;
        System.out.println(nombre + " ha subido de nivel! Ahora es nivel " + nivel + ".");
    }

    public void ganarExperiencia(int exp) {
        experiencia += exp;
        System.out.println(nombre + " ha ganado " + exp + " puntos de experiencia.");
        if (experiencia >= 100) {
            experiencia -= 100;
            subirNivel();
        }
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }
}