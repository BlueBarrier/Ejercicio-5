/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * clase Driver para organizar, mostrar y crear recursos
 * 
 * @author: Erick Barrera - 231238
 * @date: 15/10/23
 * @version: 1.0.1
 * @lastUpdate: 16/10/23
 * Changes: mejoras en el formato de mensaje
 */
import java.util.ArrayList;
import java.util.Collections;
public class Biblioteca {
    EntradaDatos entrada = new EntradaDatos();
    private ArrayList<Object> recursos = new ArrayList<>();

    public void Clasificar(){
        switch (entrada.pedirTipoClasificacion()) {
            case 1:
                clasificarGenero();
                break;
            case 2:
                clasificarAutor();
                break;
            case 3:
                clasificarFecha();
                break;
            default:
                System.out.println("\nElija una opción válida!!\n");
                Clasificar();
                break;
        }
    } 

    /**
     * función que cita los recursos dependiendo el género
     */
    public void clasificarGenero(){
        ArrayList<String> generos = new ArrayList<>();
        for (Object recurso : recursos) {
            if (recurso instanceof Recurso) {
                Recurso temp = (Recurso) recurso;
                if (!generos.contains(temp.getGenero())) {
                    generos.add(temp.getGenero());
                }
            }
        }
        for (String genero : generos) {
            int count =0;
            System.out.println("\nGénero: "+ genero);
            for (Object recurso : recursos) {
                Recurso temp = (Recurso) recurso;
                if (temp.getGenero().equals(genero)) {
                    if (recurso instanceof Libro) {
                        Libro libroTemp = (Libro) recurso;
                        System.out.println("\n");
                        System.out.println("-"+libroTemp.Cita());
                        count++;
                    }else if (recurso instanceof ArticuloC) {
                        ArticuloC articuloTemp = (ArticuloC) recurso;
                        System.out.println("\n");
                        System.out.println("-"+articuloTemp.Cita());
                        count++;
                    }else  if (recurso instanceof DVD) {
                        DVD dvdTemp = (DVD) recurso;
                        System.out.println("\n");
                        System.out.println("-"+dvdTemp.Cita());
                        count++;
                    } else if(recurso instanceof Tesis){
                        Tesis tesisTemp = (Tesis) recurso;
                        System.out.println("\n");
                        System.out.println("-"+tesisTemp.Cita());
                        count++;
                    }else if (recurso instanceof Web) {
                        Web webTemp = (Web) recurso;
                        System.out.println("\n");
                        System.out.println("-"+webTemp.Cita());
                        count++;
                    } else if (recurso instanceof Periodico) {
                        Periodico periodicoTemp = (Periodico) recurso;
                        System.out.println("\n");
                        System.out.println("-"+periodicoTemp.Cita());
                        count++;
                    }
                }
            }
            System.out.println("Total: "+count);
        }
    }

    /**
     * función que ordena y muestra a los recursos según autor
     */
    public void clasificarAutor(){
        ArrayList<String> autores = new ArrayList<>();
        for (Object recurso : recursos) {
            if (recurso instanceof Recurso) {
                Recurso temp = (Recurso) recurso;
                if (!autores.contains(temp.getAutor())) {
                    autores.add(temp.getAutor());
                }
            }
        }
        for (String autor : autores) {
            int count = 0;
            System.out.println("\nAutor: "+ autor);
            for (Object recurso : recursos) {
                Recurso temp = (Recurso) recurso;
                if (temp.getAutor().equals(autor)) {
                    if (recurso instanceof Libro) {
                        Libro libroTemp = (Libro) recurso;
                        System.out.println("\n");
                        System.out.println("-"+libroTemp.Cita());
                        count++;
                    }else if (recurso instanceof ArticuloC) {
                        ArticuloC articuloTemp = (ArticuloC) recurso;
                        System.out.println("\n");
                        System.out.println("-"+articuloTemp.Cita());
                        count++;
                    }else  if (recurso instanceof DVD) {
                        DVD dvdTemp = (DVD) recurso;
                        System.out.println("\n");
                        System.out.println("-"+dvdTemp.Cita());
                        count++;
                    } else if(recurso instanceof Tesis){
                        Tesis tesisTemp = (Tesis) recurso;
                        System.out.println("\n");
                        System.out.println("-"+tesisTemp.Cita());
                        count++;
                    }else if (recurso instanceof Web) {
                        Web webTemp = (Web) recurso;
                        System.out.println("\n");
                        System.out.println("-"+webTemp.Cita());
                        count++;
                    } else if (recurso instanceof Periodico) {
                        Periodico periodicoTemp = (Periodico) recurso;
                        System.out.println("\n");
                        System.out.println("-"+periodicoTemp.Cita());
                        count++;
                    }
                }
            }
            System.out.println("Total: "+count);
        }
    }

    /**
     * función que clasifica y muestra el recurso por año, del más 
     * reciente al más antigüo
     */
    public void clasificarFecha(){
        ArrayList<String> fechas = new ArrayList<>();
        for (Object recurso : recursos) {
            if (recurso instanceof Recurso) {
                Recurso temp = (Recurso) recurso;
                if (!fechas.contains(temp.getFecha())) {
                    fechas.add(temp.getFecha());
                }
            }
        }
        Collections.sort(fechas, Collections.reverseOrder()); // ordenar del año más reciente al más antigüo
        for (String fecha : fechas) {
            int count = 0;
            System.out.println("\nAño: "+ fecha);
            for (Object recurso : recursos) {
                Recurso temp = (Recurso) recurso;
                if (temp.getFecha().equals(fecha)) {
                    if (recurso instanceof Libro) {
                        Libro libroTemp = (Libro) recurso;
                        System.out.println("\n");
                        System.out.println("-"+libroTemp.Cita());
                        count++;
                    }else if (recurso instanceof ArticuloC) {
                        ArticuloC articuloTemp = (ArticuloC) recurso;
                        System.out.println("\n");
                        System.out.println("-"+articuloTemp.Cita());
                        count++;
                    }else  if (recurso instanceof DVD) {
                        DVD dvdTemp = (DVD) recurso;
                        System.out.println("\n");
                        System.out.println("-"+dvdTemp.Cita());
                        count++;
                    } else if(recurso instanceof Tesis){
                        Tesis tesisTemp = (Tesis) recurso;
                        System.out.println("\n");
                        System.out.println("-"+tesisTemp.Cita());
                        count++;
                    }else if (recurso instanceof Web) {
                        Web webTemp = (Web) recurso;
                        System.out.println("\n");
                        System.out.println("-"+webTemp.Cita());
                        count++;
                    } else if (recurso instanceof Periodico) {
                        Periodico periodicoTemp = (Periodico) recurso;
                        System.out.println("\n");
                        System.out.println("-"+periodicoTemp.Cita());
                        count++;
                    }
                }
            }
            System.out.println("Total: "+count);
        }
    }

    /**
     * Clase que muestra todo el catálogo de la biblioteca
     */
    public void mostrarCatalogo(){
        System.out.println("\nCatálogo: ");
        for (Object recurso : recursos) {
            if (recurso instanceof Libro) {
                Libro libroTemp = (Libro) recurso;
                System.out.println("\n-"+libroTemp.Cita());
            }else if (recurso instanceof ArticuloC) {
                ArticuloC articuloTemp = (ArticuloC) recurso;
                System.out.println("\n-"+articuloTemp.Cita());
            }else  if (recurso instanceof DVD) {
                DVD dvdTemp = (DVD) recurso;
                System.out.println("\n-"+dvdTemp.Cita());
            } else if(recurso instanceof Tesis){
                Tesis tesisTemp = (Tesis) recurso;
                System.out.println("\n-"+tesisTemp.Cita());
            }else if (recurso instanceof Web) {
                Web webTemp = (Web) recurso;
                System.out.println("\n-"+webTemp.Cita());
            } else if (recurso instanceof Periodico) {
                Periodico periodicoTemp = (Periodico) recurso;
                System.out.println("\n-"+periodicoTemp.Cita());
            }
        }
    }


    /**
     * función para agregar recursos a la lista recursos según el usuario
     * elija entre los recursos disponibles
     */
    public void crearRecurso(){
        switch (entrada.pedirRecurso()) {
            case 1:
                recursos.add(new Libro(entrada.pedirNombre(),entrada.pedirAutor(), 
                entrada.pedirEditorial(), entrada.pedirFecha(), entrada.pedirGenero(), "Libro", 
                entrada.pedirVolumen(), entrada.pedirPaginas()));
                System.out.println("Recurso creado");
                break;
            case 2:
                recursos.add(new ArticuloC(entrada.pedirNombre(), entrada.pedirAutor(),
                 entrada.pedirFecha(), entrada.pedirGenero(), entrada.pedirVolumen(), 
                 entrada.pedirEdicion(), entrada.pedirPaginas(), entrada.pedirDOI()));
                 System.out.println("Recurso creado");
                break;
            case 3:
                recursos.add(new DVD(entrada.pedirNombre(), entrada.pedirAutor(),
                 entrada.pedirFecha(), entrada.pedirGenero(), "DVD"));
                 System.out.println("Recurso creado");
                break;
            case 4:
                recursos.add(new Periodico(entrada.pedirNombre(),entrada.pedirAutor() ,entrada.pedirFecha(),
                 entrada.pedirGenero(), entrada.pedirNombrePeriodico(), entrada.pedirEnlace()));
                 System.out.println("Recurso creado");
                break;
            case 5:
                recursos.add(new Tesis(entrada.pedirNombre(), entrada.pedirAutor(), 
                entrada.pedirFecha(), entrada.pedirGenero(), entrada.pedirGradoTesis(), 
                entrada.pedirUniversidad(), entrada.pedirEnlace()));
                System.out.println("Recurso creado");
                break;
            case 6:
                recursos.add(new Web(entrada.pedirNombre(), entrada.pedirAutor(), entrada.pedirFecha(), entrada.pedirEnlace()));
                System.out.println("Recurso creado");
                break;
            default:
                System.out.println("Ingrese una opción válida!!!");
                crearRecurso();
                break;
        }
    }
}
