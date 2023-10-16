/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * Clase para entrada de datos del usuario
 * 
 * @author: Erick Barrera - 231238
 * @date: 15/10/23
 * @version: 1.0.0
 * @lastUpdate: 15/10/23
 * Changes: ---
 */
import java.util.Scanner;
public class EntradaDatos {
    Scanner scan = new Scanner(System.in);
    public int pedirTipoClasificacion(){

        System.out.println("\nIngrese el número de la opción de clasificación a realizar: "+
                                    "\n1. Por género"+
                                    "\n2. Por autor"+
                                    "\n3. Por año");
        try {
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirTipoClasificacion();
        }
        return 0;
    }

    public int pedirRecurso(){
        System.out.println("Ingrese el número de la opción a crear: "+
                                "\n1. Libro"+
                                "\n2. Artículo Científico"+
                                "\n3. DVD"+
                                "\n4. Periódico"+
                                "\n5. Tesis"+
                                "\n6. Sitio Web");
        try {
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirRecurso();
        }
        return 0;
    }

    public String pedirNombre(){
        System.out.println("\nIngrese el título del recurso: ");
        try {
            String nombre = scan.nextLine().trim();
            return nombre;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirNombre();
        }
        return "";
    }

    public String pedirEditorial(){
        System.out.println("\nIngrese la institución que lo publica (editorial, cada productora, etc.): ");
        try {
            String editorial = scan.nextLine().trim();
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirEditorial();
        }
        return "";
    }


    public String pedirFecha(){
        System.out.println("\nIngrese el año en que fue publicado (Ej.: 2019):  ");
        try {
            String fecha = scan.nextLine().trim();
            try {
                int fechaCorrecta = Integer.parseInt(fecha);
                return fecha;
            } catch (Exception e) {
                System.out.println("Ingrese una año válido!!");
                pedirFecha();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirFecha();
        }
        return "";
    }

    public String pedirGenero(){
        System.out.println("\nIngrese el género del recurso: ");
        try {
            String genero = scan.nextLine().trim();
            return genero;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirGenero();
        }
        return "";
    }

    public String pedirAutor(){
        System.out.println("\nIngrese el autor del recurso: ");
        try {
            String autor = scan.nextLine().trim();
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirAutor();
        }
        return "";
    }
    
    public int pedirVolumen(){
        System.out.println("\nIngrese el número del volumen del recurso (número entero): ");
        try {
            String volumen = scan.nextLine().trim();
            try {
                int volInt = Integer.parseInt(volumen);
                return volInt;
            } catch (Exception e) {
                System.out.println("Ingrese un número válido");
                pedirVolumen();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirVolumen();
        }
        return 0;
    }

    public int[] pedirPaginas(){
        System.out.println("Ingrese la página donde inicia su referencia: ");
        try {
            int limiteInferior = scan.nextInt();
            scan.nextLine();
            System.out.println("Ingrese el número de página donde finaliza su referencia: ");
            try {
                int limiteSuperior = scan.nextInt();
                scan.nextLine();
                int[] rangoPags = {limiteInferior, limiteSuperior};
                return rangoPags;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Repita el proceso, ingreso inválido");
                pedirPaginas();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Repita el proceso, ingreso inválido");
            pedirPaginas();
        }
        return null;
    }

    public int pedirEdicion(){
        System.out.println("Ingrese el número de la edición: ");
        String edicion = scan.nextLine().trim();
        try {
            int edicionNum = Integer.parseInt(edicion);
            return edicionNum;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirEdicion();
        }
        return 0;
    }

    public String pedirDOI(){
        System.out.println("Ingrese el DOI del artículo: ");
        try {
            String doi = scan.nextLine();
            return doi.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirDOI();
        }
        return "";
    }

    public String pedirNombrePeriodico(){
        System.out.println("ingrese el nombre del periodico: ");
        try {
            String periodico = scan.nextLine().trim();
            return periodico;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirNombrePeriodico();
        }
        return "";
    }

    public String pedirEnlace(){
        System.out.println("Ingrese el enlace del recurso: ");
        try {
            String enlace = scan.nextLine().trim();
            return enlace;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirEnlace();
        }
        return "";
    }

    public String pedirGradoTesis(){
        System.out.println("Ingrese el grado de la tesis: ");
        try {
            String tesis = scan.nextLine().trim();
            return tesis;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirGradoTesis();
        }
        return "";
    }

    public String pedirUniversidad(){
        System.out.println("Ingrese la universidad que publica: ");
        try {
            String universidad = scan.nextLine().trim();
            return universidad;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pedirUniversidad();
        }
        return "";
    }

    public int menu(){
        System.out.println("-----Menú-----"+
                                "\n1. Crear Recurso"+
                                "\n2. Mostrar por clasificación"+
                                "\n3. Mostrar todos los recursos"+
                                "\n4. Salir");
        try {
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            menu();
        }
        return 0;
    }
}
