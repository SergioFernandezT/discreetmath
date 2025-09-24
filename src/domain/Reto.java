package domain;

public class Reto {
    private int idReto;
    private String enunciado;
    private String[] opciones;
    private String solucion;
    private int oportunidades;
    private boolean ganado;

    public Reto(int idReto, String enunciado, String[] opciones, String solucion, int oportunidades) {
        this.idReto = idReto;
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.solucion = solucion;
        this.oportunidades = oportunidades;
        this.ganado = false;
    }
    public void mostrarEnunciado(){
        System.out.println("El enunciado es: " + this.enunciado);
        mostrarOpciones();
    }
    public Reto[] seleccionarReto(){
        Reto[] retoSeleccionado = {};
        return retoSeleccionado;
    }

    private void mostrarOpciones() {
        System.out.println("\n***** Mostrando opciones *****\n");
       for(int i = 0; i < opciones.length; i++){
           System.out.println((i+1) + " - " + opciones[i]);
       }
    }

    public boolean isGanado() {
        return ganado;
    }

    public String getsolucion() {
        return solucion;
    }

    public void corroborarSolucion(String respuesta){
        if(respuesta.equals(this.solucion)){
            this.ganado = true;
            System.out.println("\n*** Felicidades, ganaste el juego ***");
        }else {
            System.out.println("\n*** Respuesta incorrecta ***");
        }
    }
}
