/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase para recolectar y citar datos de artìculos cientìficos 
 * 
 * @author: Isabella Ramírez 
 * @date: 14/10/23
 * @version: 1.0.0
 * @lastUpdate: 15/10/23
 * Changes: ---
 */
public class ArticuloC extends Recurso {
    private int volumen;
    private int edicion;
    private int[] paginas;
    private String doi;

    /**
     * Constructor de la clase ArticuloC.
     * @param nombre El nombre del artículo científico.
     * @param autor El autor del artículo científico.
     * @param fecha La fecha de publicación del artículo científico.
     * @param genero El género del artículo científico.
     * @param volumen El volumen del artículo científico.
     * @param edicion La edición del artículo científico.
     * @param paginas El arreglo de páginas del artículo científico.
     * @param doi El DOI (Digital Object Identifier) del artículo científico.
     */
    public ArticuloC(String nombre, String autor, String fecha, String genero, int volumen, int edicion, int[] paginas, String doi) {
        super(nombre, autor, null, fecha, genero, "Artículo Científico");
        this.volumen = volumen;
        this.edicion = edicion;
        this.paginas = paginas;
        this.doi = doi;
    }

    /**
     * Genera una cita para el artículo científico.
     * @return La cita bibliográfica para el artículo científico.
     */
    public String Cita() {
        return autor + " (" + fecha + "). " + nombre + ". En " + genero + ", Vol. " + volumen + ", Edición " + edicion + ", pp. " + arrayToString(paginas) + ". DOI: " + doi;
    }

    // Método para convertir el arreglo de páginas a una cadena de texto
    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
