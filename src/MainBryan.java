import domain.Challenge;
import domain.Reward;
import domain.Game;

public class MainBryan {

    public static void main(String[] args) {
        executeProgram1();
    }

    public static void executeProgram1(){

        Reward test = new Reward(1,"recompensa nivel 1","Se entrega una medalla de honor por terminar el nivel 1");
        Reward test2 = new Reward(1,"recompensa nivel 1","Se entrega una medalla de honor por terminar el nivel 1");
        Reward test3 = new Reward(1,"recompensa nivel 1","Se entrega una medalla de honor por terminar el nivel 1");
        Game game1 = new Game(1);
        String[] arreglo = {"a","b","c","d"};
        Challenge challenge1 = new Challenge(1,"enunciado 1", arreglo,"a"  );
        Challenge[] challenges = {challenge1,challenge1,challenge1};

        test.setName("recompensa nivel 1");
        System.out.println(test.getName());

        test.setDescrption("Se entrega una medalla de honor por terminar el nivel 1");
        System.out.println(test.getDescrption());

        System.out.println(test.get_id());

        test2.setName("recompensa nivel 2");
        System.out.println(test2.getName());

        test2.setDescrption("Se entrega una medalla de honor por terminar el nivel 2");
        System.out.println(test2.getDescrption());

        System.out.println(test2.get_id());

        test2.setName("recompensa nivel 2");
        System.out.println(test2.getName());

        test.setDescrption("Se entrega una medalla de honor por terminar el nivel 2");
        System.out.println(test2.getDescrption());

        System.out.println(test3.get_id());

        test3.setName("recompensa nivel 3");
        System.out.println(test3.getName());

        test3.setDescrption("Se entrega una medalla de honor por terminar el nivel 3");
        System.out.println(test3.getDescrption());


        System.out.println();
        test.showReward();

        System.out.println();
        test2.showReward();

        System.out.println();
        test3.showReward();

    }
}
