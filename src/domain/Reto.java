package domain;

public class Reto {
    private int idReto;
    private String enunciado;
    private String[] opciones;
    private String solucion;
    private int oportunidades;

    public Reto(int idReto, String enunciado, String[] opciones, String solucion, int oportunidades) {
        this.idReto = idReto;
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.solucion = solucion;
        this.oportunidades = oportunidades;
    }
    public void mostrarEnunciado(){
        System.out.println("El enunciado es: " + this.enunciado);
    }
    public Reto[] seleccionarReto(){
        Reto[] retoSeleccionado = {};
        return retoSeleccionado;
    }

}
