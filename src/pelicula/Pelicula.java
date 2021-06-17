package src.pelicula;

public class Pelicula {
    
    //Declarando variables
    private int idPelicula;
    private String nombrePelicula;
    private int año;
    private String categoriaPelicula;
    private boolean estado;

    //Creando constructor

    public Pelicula(int idPelicula, String nombrePelicula, int año, String categoriaPelicula, boolean estado){
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.año = año;
    }

    public Pelicula(int contadorPelicula, int idPelicula2, String nombrePelicula2, int año2, String categoria2, boolean estado2){
    
    }

    //getters y setters

    public int getIdPelicula(){
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula){
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula(){
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula){
        this.nombrePelicula= nombrePelicula;
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        this.año = año;
    }

    public String getCategoria(){
        return categoriaPelicula;
    }

    public void setCategoria(String categoriaPelicula){
        this.categoriaPelicula = categoriaPelicula;
    }

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public String getInformacion() {
        String resultado = "Id pelicula: " + idPelicula + " Nombre de la pelicula: " + nombrePelicula +
        "Año: "+año + "Categoría: "+categoriaPelicula + "Estado: "+ estado;
        return resultado;
    }

}
