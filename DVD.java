public class DVD extends Recurso {
    /**
     * Constructor de la clase DVD.
     * @param nombre El nombre del DVD.
     * @param autor El autor o director del DVD.
     * @param fecha La fecha de publicación del DVD.
     * @param genero El género del DVD.
     * @param tipo El tipo de DVD (por ejemplo, documental, película, etc.).
     */
    public DVD(String nombre, String autor, String fecha, String genero, String tipo) {
        super(nombre, autor, null, fecha, genero, tipo);
    }

    /**
     * Genera una cita para el DVD.
     * @return La cita bibliográfica para el DVD.
     */
    public String Cita() {
        return autor + " (" + fecha + "). " + nombre + ". [DVD]. Género: " + genero + ".";
    }
}
