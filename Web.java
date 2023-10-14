public class Web extends Recurso {
    private String enlace;
    /**
     * Constructor de la clase Web.
     * @param nombre El nombre o título de la página web.
     * @param autor El autor o entidad responsable de la página web.
     * @param fecha La fecha de publicación o actualización de la página web.
     * @param enlace El enlace o URL de la página web.
     */
    public Web(String nombre, String autor, String fecha, String enlace) {
        super(nombre, autor, "", fecha, "Sitio Web","");
        this.enlace = enlace;
    }

    /**
     * Genera una cita para la página web.
     * @return La cita bibliográfica para la página web.
     */
    public String Cita() {
        return autor + " (" + fecha + "). " + nombre + ". Disponible en: " + enlace;
    }

    /**
     * Obtiene el enlace o URL de la página web.
     * @return El enlace o URL de la página web.
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Establece el enlace o URL de la página web.
     * @param enlace El enlace o URL de la página web a establecer.
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}

