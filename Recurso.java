/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase abstracta para generar citas de diversos recursos bibliográficos.
 * 
 * @author: Erick Barrera - 231238, Isabella Ramírez - 
 * @date: 13/10/23
 * @version: 1.0.0
 * @lastUpdate: 13/10/23
 * Changes: ---
 */
public abstract class Recurso{
    protected String nombre, autor, editorial, fecha, genero, tipo;

    /**
     * @param nombre
     * @param autor
     * @param editorial
     * @param fecha
     * @param genero
     * @param tipo
     */
    public Recurso(String nombre, String autor, String editorial,
     String fecha, String genero, String tipo){
        
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha = fecha;
        this. genero = genero;
        this.tipo = tipo;
    }

    /**
     * @return
     */
    public abstract String Cita();

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public String getAutor() {
        return autor;
    }
    /**
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    /**
     * @return
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return
     */
    public String getGenero() {
        return genero;
    }
    /**
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}