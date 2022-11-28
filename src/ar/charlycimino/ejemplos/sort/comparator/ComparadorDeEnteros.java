
package ar.charlycimino.ejemplos.sort.comparator;

import java.util.Comparator;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ComparadorDeEnteros implements Comparator<Integer> {
    // Si el 1ro va antes que el 2do, retorno un NEGATIVO
    // Si el 1ro va después que el 2do, retorno un POSITIVO
    // Si son iguales, retorno un cero
    
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }

}
