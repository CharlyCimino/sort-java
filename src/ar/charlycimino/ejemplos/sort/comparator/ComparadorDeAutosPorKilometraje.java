
package ar.charlycimino.ejemplos.sort.comparator;

import java.util.Comparator;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ComparadorDeAutosPorKilometraje implements Comparator<Auto> {
    
    private int multiplicador;

    public ComparadorDeAutosPorKilometraje(boolean ascendente) {
        if (ascendente) multiplicador = 1;
        else multiplicador = -1;
    } 
    
    @Override
    public int compare(Auto o1, Auto o2) {
        return multiplicador * (o1.getKilometraje() - o2.getKilometraje());
    }

}
