public class Periodico extends Recurso {
    private String nombrePeriodico;
    private String enlace;

    /**
     * Constructor de la clase Periodico.
     * @param nombre El nombre del periódico.
     * @param fecha La fecha de publicación del periódico.
     * @param genero El género del periódico.
     * @param nombrePeriodico El nombre específico del periódico.
     * @param enlace El enlace o URL del periódico.
     */
    public Periodico(String nombre, String fecha, String genero, String nombrePeriodico, String enlace) {
        super(nombre, null, null, fecha, genero, "Periódico");
        this.nombrePeriodico = nombrePeriodico;
        this.enlace = enlace;
    }

    /**
     * Genera una cita para el periódico.
     * @return La cita bibliográfica para el periódico.
     */
    public String Cita() {
        return nombrePeriodico + " (" + fecha + "). " + nombre + ". " + genero + ". Disponible en: " + enlace;
    }

    /**
     * Obtiene el nombre específico del periódico.
     * @return El nombre del periódico.
     */
    public String getNombrePeriodico() {
        return nombrePeriodico;
    }

    /**
     * Establece el nombre específico del periódico.
     * @param nombrePeriodico El nombre del periódico a establecer.
     */
    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    /**
     * Obtiene el enlace o URL del periódico.
     * @return El enlace o URL del periódico.
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Establece el enlace o URL del periódico.
     * @param enlace El enlace o URL del periódico a establecer.
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
