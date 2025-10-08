package com.mycompany.proyect;

public class Challenge {
    private int idChallenge;
    private String enunciado;
    private String[] opciones;
    private String solucion;

    public Challenge(int idChallenge, String enunciado, String[] opciones, String solucion) {
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
    
    
    
        // modificaciones para convinar con la interfaz grafica

    public int getIdChallenge() {
        return idChallenge;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setIdChallenge(int idChallenge) {
        this.idChallenge = idChallenge;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
    
    
}