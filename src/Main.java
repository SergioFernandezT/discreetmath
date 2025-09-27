import domain.Game;
import domain.Player;


public class Main {

    public static void main(String[] args) {
        Game game = new Game(1);
        Player player = new Player(1, "Milagro");
        game.jugar(player);
    }
}
