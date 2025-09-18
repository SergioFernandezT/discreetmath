package domain;

public class Recompensa {
    private int _id;
    private String nombre;
    private String descripcion;

    public void mostraRecompensa(){
        System.out.println("********** Recompensa ***********");
        System.out.println("Nombre: "+nombre);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("*********************************");
    }

    public int get_id() {
        return _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
