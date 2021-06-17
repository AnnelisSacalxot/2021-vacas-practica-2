package src.pelicula;
import java.util.Scanner;
import src.tienda.*;

public class VectorPelicula {
    
    private VectorPelicula[] peliculas = new VectorPelicula[100];
    private int contadorPelicula;
    Scanner leer = new Scanner(System.in);

    //Constructor
    public VectorPelicula(){
        contadorPelicula= 1;
    }

    //Agregamos peliculas

    public void agregarPelicula(int idPelicula, String nombrePelicula, int año, String categoria, boolean estado){
       
    }

    public void agregarPelicula(int idPelicula, String nombrePelicula, int año, String categoriaPelicula){

        System.out.println("\nIngrese la cantidad de películas para añadir");
        contadorPelicula= leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < contadorPelicula; i++) {
            System.out.println("\n« « « Película "+(i+1) +"» » »");
            System.out.println("Id de película: ");
            idPelicula = leer.nextInt();
            leer.nextLine();
            System.out.println("Nombre de la película: ");
            nombrePelicula = leer.nextLine();
            System.out.println("Año de la película: ");
            año = leer.nextInt();
            leer.nextLine();
            System.out.println("Categoría, ejemplo: terror, fantasía, otros):");
            categoriaPelicula = leer.nextLine();
        }
    }

    public void agregarPelicula(){
        int idPelicula = IngresoDatos.getEntero("", false);
        String nombrePelicula = IngresoDatos.getTexto("Ingrese el nombre del cliente");
        int año = IngresoDatos.getEntero("Ingrese el número de telefono", false);
        String categoriaPelicula = IngresoDatos.getTexto("");
        agregarPelicula(idPelicula, nombrePelicula, año, categoriaPelicula);
    }

    //Mostramos los datos recibidos

    public void mostrarPeliculas(){

        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (contadorPelicula-1); i++) {
           // System.out.println("-"+i+") "+peliculas[i].getInformacion());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
            
        }
    }


}
