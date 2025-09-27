package domain;

public class Challenge {
    private int idChallenge;
    private String enunciado;
    private String[] opciones;
    private String solucion;

    public Challenge(int idChallenge, String enunciado, String[] opciones, String solucion, int oportunidades) {
        this.idChallenge = idChallenge;
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.solucion = solucion;
    }
    public void mostrarEnunciado(){
        System.out.println("El enunciado es: " + this.enunciado);
    }
    public Challenge[] seleccionarChallenge(){
        Challenge[] retoSeleccionado = {};
        return retoSeleccionado;
    }

}
