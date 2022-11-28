package ar.charlycimino.ejemplos.sort.comparator;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Auto {

    private String patente;
    private int kilometraje;

    public Auto(String patente, int kilometraje) {
        this.patente = patente;
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", kilometraje=" + kilometraje + '}';
    }    

    public String getPatente() {
        return patente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

}
