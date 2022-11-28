package ar.charlycimino.ejemplos.sort.comparable;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Persona implements Comparable<Persona> {

    private int DNI;
    private String nombre;
    private String apellido;
    private double estaturaEnM;
    private EstadoCivil estadoCivil;

    public Persona(int DNI, String nombre, String apellido, double estaturaEnM, EstadoCivil estadoCivil) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estaturaEnM = estaturaEnM;
        this.estadoCivil = estadoCivil;
    }    

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", estaturaEnM=" + estaturaEnM + ", estadoCivil=" + estadoCivil + '}';
    }    

    @Override
    public int compareTo(Persona otra) {
        // Si YO vengo antes que la OTRA, retorno un NEGATIVO
        // Si YO voy después que la OTRA, retorno un POSITIVO
        // Si somos iguales, retorno un cero

        // ORDENAMIENTO POR DNI (TIPO DE DATO ENTERO)
        return this.DNI - otra.DNI; // ASCENDENTE
        //return otra.DNI - this.DNI; // DESCENDENTE
    }

    /*@Override
    public int compareTo(Persona otra) {
        // Si YO vengo antes que la OTRA, retorno un NEGATIVO
        // Si YO voy después que la OTRA, retorno un POSITIVO
        // Si somos iguales, retorno un cero

        // ORDENAMIENTO POR APELLIDO (TIPO DE DATO STRING)
        //return this.apellido.compareTo(otra.apellido); // ASCENDENTE (A-Z)
        return otra.apellido.compareTo(this.apellido); // DESCENDENTE (Z-A)
    }*/
    
    /*@Override
    public int compareTo(Persona otra) {
        // Si YO vengo antes que la OTRA, retorno un NEGATIVO
        // Si YO voy después que la OTRA, retorno un POSITIVO
        // Si somos iguales, retorno un cero

        // ORDENAMIENTO POR ESTATURA EN METROS (TIPO DE DATO double) 
        int retorno = 0;
        
        if (this.estaturaEnM > otra.estaturaEnM) {
            retorno = 1;
        } else if (this.estaturaEnM < otra.estaturaEnM) {
            retorno = -1;
        }
        
        return retorno;
    }*/
    
    /*@Override
    public int compareTo(Persona otra) {
        // Si YO vengo antes que la OTRA, retorno un NEGATIVO
        // Si YO voy después que la OTRA, retorno un POSITIVO
        // Si somos iguales, retorno un cero

        // ORDENAMIENTO POR ESTADO CIVIL (TIPO DE DATO ENUM)
        //return this.estadoCivil.ordinal() - otra.estadoCivil.ordinal(); // Por orden de enumeración
        return this.estadoCivil.name().compareTo(otra.estadoCivil.name()); // Alfabéticamente
    }*/

}
