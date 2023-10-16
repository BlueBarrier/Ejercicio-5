/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para almacenar y crear los datos bibliográficos de los libros.

 * 
 * @author: Erick Barrera - 231238
 * @date: 13/10/23
 * @version: 1.0.0
 * @lastUpdate: 13/10/23
 * Changes: ---
 */
import java.util.Arrays;
public class Libro extends Recurso {
    private int volumen;
    private int[] paginas;

    /**
     * @param nombre
     * @param autor
     * @param editorial
     * @param fecha
     * @param genero
     * @param tipo
     * @param volumen
     * @param paginas
     */
    public Libro(String nombre, String autor, String editorial, 
    String fecha, String genero, String tipo, int volumen, int[]paginas){

        super(nombre, autor, editorial, fecha, genero, tipo);
        this.volumen = volumen;
        this.paginas = paginas;
    }
// getters y setters
    /**
     * @return
     */
    public int[] getPaginas() {
        return paginas;
    }
    /**
     * @param paginas
     */
    public void setPaginas(int[] paginas) {
        this.paginas = paginas;
    }

    /**
     * @return
     */
    public int getVolumen() {
        return volumen;
    }
    /**
     * @param volumen
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
// clase abstracta hecha para libro
    @Override
    public String Cita(){
        return autor+ " ("+fecha+"). " + nombre+"."+
        " vol. "+volumen+". "+editorial+". pág. "+Arrays.toString(paginas);
    }

}