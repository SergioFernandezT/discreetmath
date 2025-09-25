import domain.Player;
import domain.Reward;

public class MainDaniel {

    public static void main(String[] args) {
        executeProgram();
    }

    public static void executeProgram(){
        Player player1 = new Player(198, "Daniel12", 12983);

        Player player2 = new Player(130, "Carlos", 19273);

        Player player3 = new Player(189, "Juan", 19827);

        Reward manzanaDorada = new Reward(87, "Manzana dorada", "Manzana de oro", 2882);

        player1.setName("Pedro");
        player1.setLives(8);
        player1.setGameId(29827);
        player1.setPlayerId(287);
        Reward[] recompensa1 = {manzanaDorada};
        player1.setRewards(recompensa1);

        for(Reward recompensa:player1.getRewards()){
            recompensa.showReward();
        }

        System.out.println("Nombre: " + player1.getName());
        System.out.println("Game id: " + player1.getGameId());
        System.out.println("Recompensas: " + player1.getRewards());
        System.out.println("Vidas: " + player1.getLives());
        System.out.println("Player id: " + player1.getPlayerId());

        System.out.println("Nombre: " + player2.getName());
        System.out.println("Game id: " + player2.getGameId());
        System.out.println("Recompensas: " + player2.getRewards());
        System.out.println(player2.getLives());
        System.out.println("Player id: " + player2.getPlayerId());

        System.out.println("Nombre: " + player3.getName());
        System.out.println("Game id: " + player3.getGameId());
        System.out.println("Recompensas: " + player3.getRewards());
        System.out.println(player3.getLives());
        System.out.println("Player id: " + player3.getPlayerId());


        
    }
}
