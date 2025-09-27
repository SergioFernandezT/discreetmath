package domain;

public class Challenge {
    private int idChallenge;
    private String enunciado;
    private String[] opciones;
    private String solucion;
    private boolean completed;

    public Challenge(int idChallenge, String enunciado, String[] opciones, String solucion) {
        this.idChallenge = idChallenge;
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.solucion = solucion;
        this.completed = false;
    }
    public void mostrarEnunciado(){
        System.out.println("\nThe statement is: " + this.enunciado);
    }
   /* public Challenge[] seleccionarChallenge(){
        Challenge[] retoSeleccionado = {};
        return retoSeleccionado;
    }*/

    public void showOptions() {
        System.out.println("\n***** Show options *****\n");
        for(int i = 0; i < opciones.length; i++){
            System.out.println((i+1) + " - " + opciones[i]);
        }
    }

    public boolean compareSelection(String respuesta){
        if(respuesta.equals(this.solucion)){
            this.completed = true;
            return true;
        }else {
            return false;
        }
    }

    public int getIdChallenge() {
        return idChallenge;
    }

    public void setIdChallenge(int idChallenge) {
        this.idChallenge = idChallenge;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
