import domain.Reward;

public class MainBryan {

    public static void main(String[] args) {
        executeProgram();
    }

    public static void executeProgram1(){

        Reward test = new Reward();
        Reward test2 = new Reward();
        Reward test3 = new Reward();

        test.setName("recompensa nivel 1");
        System.out.println(test.getName());

        test.setDescrption("Se entrega una medalla de honor por terminar el nivel 1");
        System.out.println(test.getDescrption());

        test.setIdLevel(1);
        System.out.println(test.get_id());

        test2.setName("recompensa nivel 2");
        System.out.println(test2.getName());

        test2.setDescrption("Se entrega una medalla de honor por terminar el nivel 2");
        System.out.println(test2.getDescrption());

        test2.setIdLevel(2);
        System.out.println(test2.get_id());

        test2.setName("recompensa nivel 2");
        System.out.println(test2.getName());

        test.setDescrption("Se entrega una medalla de honor por terminar el nivel 2");
        System.out.println(test2.getDescrption());

        test3.setIdLevel(3);
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
