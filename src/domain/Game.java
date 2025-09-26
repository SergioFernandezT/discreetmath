package domain;

public class Game {
    private int id;
    private Level[] levels;

    public Game(int id) {
        this.loadLevels();
    }

    public void controlLevel() {

    }

    public void passLevel() {

    }

    public void assignReward() {

    }

    private void loadLevels() {
        this.levels = new Level[2]; // se cargan los 2 niveles
        this.levels[0] = new Level(1, "Induccion", "Resolver problemas de patrones y sumatorias aplicando inducción matemática.",this.challengesLevelOne(),new Reward(1, "Llave de Plata","Permite avanzar al siguiente nivel y simboliza el dominio de patrones y sumatorias por inducción."));
        this.levels[0] = new Level(2, "Conjuntos", "El aprendiz atravsa un valle encantado resolviendo acertijos sobre operaciones y relaciones de conjuntos.",this.challengesLevelTwo(),new Reward(2, "Llave de Oro","Abre la salida del nivel y representa el control sobre operaciones y relaciones de conjuntos."));
    }

    private Challenge[] challengesLevelOne() {
        return new Challenge[]{
                new Challenge(1, "Enunciado 1", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion3"),
                new Challenge(2, "Enunciado 2", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion2"),
                new Challenge(3, "Enunciado 3", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion1"),
                new Challenge(4, "Enunciado 4", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion4"),
                new Challenge(5, "Enunciado 5", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion2")
        };
    }

    private Challenge[] challengesLevelTwo() {
        return new Challenge[]{
                new Challenge(6, "Enunciado 6", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion3"),
                new Challenge(7, "Enunciado 7", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion2"),
                new Challenge(8, "Enunciado 8", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion1"),
                new Challenge(9, "Enunciado 9", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion4"),
                new Challenge(10, "Enunciado 10", new String[]{"Opcion1", "Opcion2", "Opcion3", "Opcion4"}, "Opcion2")
        };
    }


}

