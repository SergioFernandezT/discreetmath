package domain;

import java.util.List;

public class Nivel {
    private int id_nivel;
    private String nombre;
    private String descripcion;
    private List<Reto> retos;
    private boolean completado = false;

    // Constructor
    public Nivel(int id_nivel, String nombre, String descripcion, List<Reto> retos) {
        this.id_nivel = id_nivel;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.retos = retos;
    }

    // Método para iniciar y jugar el nivel
    public boolean jugarNivel(Jugador jugador) {
        System.out.println("\n Nivel " + id_nivel + ": " + nombre);
        System.out.println(descripcion);

        for (Reto reto : retos) {
            reto.mostrarEnunciado();
            String respuesta = jugador.ingresarRespuesta(); // método que podrías implementar en Jugador
            if (reto.compararSeleccion(respuesta)) {
                System.out.println("Reto superado");
            } else {
                jugador.modificarVidas(-1);
                System.out.println("Fallaste, debes intentar de nuevo...");
                return false;
            }
        }
        this.completado = true;
        System.out.println("¡Has completado este nivel con éxito!");
        return true;
    }

    // Mostrar lista de retos
    public void mostrarListaRetos() {
        System.out.println("Lista de retos:");
        int i = 1;
        for (Reto reto : retos) {
            System.out.println(i + ". " + reto.getEnunciado());
            i++;
        }
    }

    // Validar si el nivel está superado
    public boolean validarNivel(Jugador jugador) {
        return completado && jugador.getCantidadVidas() > 0;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Reto> getRetos() {
        return retos;
    }

    public void setRetos(List<Reto> retos) {
        this.retos = retos;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}