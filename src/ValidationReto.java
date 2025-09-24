import domain.Reto;

import java.util.Random;

public class ValidationReto {

    public static final Reto[] retos = {
            new Reto(1,"Enunciado 1", new String[]{"op1","op2","op3"},"Solución 1",2),
            new Reto(2,"Enunciado 2", new String[]{"a","b","c"},"Solución 2",1),
            new Reto(3,"Enunciado 3", new String[]{"uno","dos","tres"},"Solución 3",3),
            new Reto(4,"Enunciado 4", new String[]{"rojo","verde","azul"},"Solución 4",0),
            new Reto(5,"Enunciado 5", new String[]{"perro","gato","loro"},"Solución 5",1)
    };

    public static void main(String[] args) {
        createChallenge();
        testSelectChallenges();

    }

    /*
     * Probar la creacion de un reto, mediante cosntructor
     */
    public static void createChallenge() {
        String[] opciones = {"opcion1", "opcion2", "opcion3"};
        Reto reto = new Reto(1,"Este es el enunciado 1", opciones,"Esta es la solucion", 2 );
        reto.mostrarEnunciado();

    }


    /*
        Testea de la seleccion de los retos, considerando que si pierde el reto se le asine otro distinto
     */
    public static void testSelectChallenges() {
        int cantidad = 0;
        boolean prueba = true;
        while(cantidad != 3){
            Reto reto = selectChallenge();
            reto.mostrarEnunciado();
            String respuesta = "False";
            if (prueba){
                respuesta = reto.getsolucion();
                prueba = false;
            }else {
                prueba = true;
            }
            reto.corroborarSolucion(respuesta);
            cantidad++;
        }
    }

    /*
        Seleccionar un reto que aun no fueron marcados como ganado
     */
    public static Reto selectChallenge(){
        Reto[] valoresDisponibles = new Reto[5]; // es 5 porque el maximo de valores es 5 retos
        int cantidadElementos = -1;
        int indice = -1;
        for (Reto reto : retos){
           if(!reto.isGanado()) {
               indice++;
               valoresDisponibles[indice] = reto;
               cantidadElementos++;
           }
        }
        int valorSeleccionado = new Random().nextInt(cantidadElementos);
        return valoresDisponibles[valorSeleccionado];
    }

    //La variable oportunidades no deberia solicitarse en el constructor en caso de que siempre tenga las mismas oportunidades
    //El metodo "mostrarEnunciado" deberia mostrar tambien las opciones
    //El metodo de "seleccionarReto" deberia pertenecer a la clase de Nivel, porque nivel tiene la lista de retos de acuerdo al nivel
    //Reto deberia tener un valor que indique que se ha ganado ese reto - Se añadio
    //Si consideramos que cuando pierde se le asigna un nuevo reto, el atributo de oportunidades deberia pertencer a la clase de nivel

}
