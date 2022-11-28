
package ar.charlycimino.ejemplos.sort.comparator;

import ar.charlycimino.ejemplos.sort.comparable.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class TestComparator {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(33);
        numeros.add(11);
        numeros.add(44);
        numeros.add(22);
        
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Celeste");
        colores.add("Blanco");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("ASD534", 3333));
        autos.add(new Auto("WRV365", 1111));
        autos.add(new Auto("VFE587", 4444));
        autos.add(new Auto("BGFD69", 5555));
        autos.add(new Auto("AER358", 2222));
        
        //Collections.sort(numeros, new ComparadorDeEnteros());
        //Collections.sort(colores, new ComparadorDeCadenas());
        
        Collections.sort(autos, new ComparadorDeAutosPorKilometraje(false));
        
        mostrarLista(autos);
        
    }

    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }
}
