/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * Clase Main
 * 
 * @author: Erick Barrera - 231238
 * @date: 15/10/23
 * @version: 1.0.0
 * @lastUpdate: 15/10/23
 * Changes: ---
 */
public class Main {
    public static void main(String[] args) {
        EntradaDatos entrada = new EntradaDatos();
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Bienvenid@ al programa para"+
                            "la clasificación de recursos");
        boolean salir = false;
        while (!salir) {
            switch (entrada.menu()) {
                case 1:
                    System.out.println("\nCreación de recursos:");
                    biblioteca.crearRecurso();
                    break;
                case 2:
                    System.out.println("\nClasificación de recursos: ");
                    biblioteca.Clasificar();
                    break;
                case 3:
                    System.out.println("Mostrar recursos: ");
                    biblioteca.mostrarCatalogo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingreso inválido!");
                    break;
            }
        }
    }
}
