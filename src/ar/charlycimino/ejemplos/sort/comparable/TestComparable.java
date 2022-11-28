
package ar.charlycimino.ejemplos.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class TestComparable {

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
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(3333, "Luis", "Perez", 1.82, EstadoCivil.VIUDO));
        personas.add(new Persona(1111, "Maria", "Gomez", 1.66, EstadoCivil.DIVORCIADO));
        personas.add(new Persona(4444, "Pepe", "Lopez", 1.78, EstadoCivil.SOLTERO));
        personas.add(new Persona(2222, "Ana", "Jerez", 1.69, EstadoCivil.CASADO));
        
        Collections.sort(numeros);
        mostrarLista(numeros);
        
    }

    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }
}
