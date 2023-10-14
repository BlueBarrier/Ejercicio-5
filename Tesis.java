public class Tesis extends Recurso {
    private String gradoTesis;
    private String universidad;
    private String enlace;

    /**
     * Constructor de la clase Tesis.
     * @param nombre El nombre de la tesis.
     * @param autor El autor de la tesis.
     * @param fecha La fecha de publicación de la tesis.
     * @param genero El género de la tesis.
     * @param gradoTesis El grado de la tesis (por ejemplo, maestría, doctorado, etc.).
     * @param universidad La universidad donde se realizó la tesis.
     * @param enlace El enlace o URL de la tesis.
     */
    public Tesis(String nombre, String autor, String fecha, String genero, String gradoTesis, String universidad, String enlace) {
        super(nombre, autor, null, fecha, genero, "Tesis");
        this.gradoTesis = gradoTesis;
        this.universidad = universidad;
        this.enlace = enlace;
    }

    /**
     * Genera una cita para la tesis.
     * @return La cita bibliográfica para la tesis.
     */
    public String Cita() {
        return autor + " (" + fecha + "). " + nombre + ". Tesis de " + gradoTesis + ". " +
               universidad + ". Disponible en: " + enlace;
    }

    /**
     * Obtiene el grado de la tesis.
     * @return El grado de la tesis.
     */
    public String getGradoTesis() {
        return gradoTesis;
    }

    /**
     * Establece el grado de la tesis.
     * @param gradoTesis El grado de la tesis a establecer.
     */
    public void setGradoTesis(String gradoTesis) {
        this.gradoTesis = gradoTesis;
    }

    /**
     * Obtiene el nombre de la universidad.
     * @return El nombre de la universidad.
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     * Establece el nombre de la universidad.
     * @param universidad El nombre de la universidad a establecer.
     */
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    /**
     * Obtiene el enlace o URL de la tesis.
     * @return El enlace o URL de la tesis.
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Establece el enlace o URL de la tesis.
     * @param enlace El enlace o URL de la tesis a establecer.
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
