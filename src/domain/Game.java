package domain;
import domain.Challenge;
import domain.Reward;
import domain.Level;
import domain.Player;

public class Game {
    private int id_game;
    private int CantidadRetosPasados;

    public Game(int id_game) {
        this.id_game = id_game;
    }

    public boolean passLevel(boolean statuslevel, int idLevel, Player player, Reward reward) {
        // si cumple los tres retos pasa nevvel y sae asigna recompensa
        if (statuslevel == true) {

            player.addReward(reward);
            return   true;
        }else {
            player.setLives(player.getLives() - 1);
        }
        return false;
    }

    public void playGame(Challenge[] reto1, Challenge[] reto2, Reward reward1,  Reward reward2) {
        //Se creara los niveles y las recompensas necesarias para que el juego funcione
        Level level1 = new Level(1, "Nivel 1","Nivel de introduccion" ,reto1);
        Level level2 = new Level(2, "Nivel 2","Nivel de conjuntos" ,reto2);

        Player player1 = new Player(198, "Daniel12", 12983);

        while (player1.getLives() > 0){

            boolean levelPass = passLevel(level1.playLevel(player1), level1.getLevelId(), player1, reward1);
            if (levelPass == true) {
                passLevel(level2.playLevel(player1), level2.getLevelId(), player1, reward2);
            }
        }

    }

}
