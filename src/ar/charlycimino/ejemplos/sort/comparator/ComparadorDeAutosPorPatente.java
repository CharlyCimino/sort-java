
package ar.charlycimino.ejemplos.sort.comparator;

import java.util.Comparator;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ComparadorDeAutosPorPatente implements Comparator<Auto> {
    
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.getPatente().compareTo(o2.getPatente());
    }

}
