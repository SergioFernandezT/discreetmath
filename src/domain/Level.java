package domain;

import java.util.Random;
import java.util.Scanner;

public class Level {
    private int levelId;
    private String levelName;
    private String levelDescription;
    private Challenge[] levelChallenges;
    private boolean levelCompleted = false;
    private Reward reward;

    // Constructor
    public Level(int levelId, String levelName, String levelDescription, Challenge[] levelChallenges,  Reward reward) {
        this.levelId = levelId;
        this.levelName = levelName;
        this.levelDescription = levelDescription;
        this.levelChallenges = levelChallenges;
        this.reward = reward;
    }

    // Method to start and play the level
    public boolean playLevel(Player gamePlayer) {
        int indiceResponse = -1;
        Scanner sc = new Scanner(System.in);
        int countLevels = 0;
        while(gamePlayer.hasLive() && !levelCompleted) {
            System.out.println("\n Level " + levelId + ": " + levelName);
            System.out.println("\n Lives: " + gamePlayer.getLives());

            System.out.println(levelDescription);
            Challenge challenge = this.selectChallenge();
            challenge.mostrarEnunciado();
            challenge.showOptions();
            System.out.print("\n Seleccione una opcion: " );
            indiceResponse = sc.nextInt();

            //System.out.println("La respuesta seleccionada es: " + challenge.getOpciones()[indiceResponse-1]);
            //System.out.println("Lo que esta guardado es: " + challenge.getSolucion());
            if (challenge.compareSelection(challenge.getOpciones()[(indiceResponse-1)])){
                countLevels++;
                System.out.println("Acertaste la soluccion");
            }else {
                System.out.println("************* No acertaste el valor ******************");
                gamePlayer.modifyLives();
            }
            if (countLevels == 3)
                levelCompleted = true;
            sc.nextLine();
        }

        return this.levelCompleted;


        //for (Challenge currentChallenge : levelChallenges) {
//            currentChallenge.showStatement();
//            String playerAnswer = gamePlayer.enterAnswer(); // method to be implemented in Player
//            if (currentChallenge.checkAnswer(playerAnswer)) {
//                System.out.println("Challenge completed");
//            } else {
//                gamePlayer.modifyLives(-1);
//                System.out.println("You failed, try again...");
//                return false;
//            }
      //  }
        //this.levelCompleted = true;
        //System.out.println("You have successfully completed this level!");
        //return true;

    }


    // Show list of challenges
    public void showChallengeList() {
        System.out.println("List of challenges:");
        for (int challengeIndex = 0; challengeIndex < levelChallenges.length; challengeIndex++) {
            //System.out.println((challengeIndex + 1) + ". " + levelChallenges[challengeIndex].getStatement());
        }
    }

    public Challenge selectChallenge(){
        Challenge[] valoresDisponibles = new Challenge[5]; // es 5 porque el maximo de valores es 5 retos
        int cantidadElementos = -1;
        int indice = -1;
        for (Challenge challenge : levelChallenges){
            if(!challenge.isCompleted()) {
                indice++;
                valoresDisponibles[indice] = challenge;
                cantidadElementos++;
            }
        }
        int valorSeleccionado = new Random().nextInt(cantidadElementos);
        return valoresDisponibles[valorSeleccionado];
    }


    // Validate if the level has been completed
    public boolean validateLevel(Player gamePlayer) {
        return levelCompleted && gamePlayer.getLives() > 0;
    }

    // Getters and setters
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String newLevelName) {
        this.levelName = newLevelName;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int newLevelId) {
        this.levelId = newLevelId;
    }

    public String getLevelDescription() {
        return levelDescription;
    }

    public void setLevelDescription(String newLevelDescription) {
        this.levelDescription = newLevelDescription;
    }

    public Challenge[] getLevelChallenges() {
        return levelChallenges;
    }

    public void setLevelChallenges(Challenge[] newLevelChallenges) {
        this.levelChallenges = newLevelChallenges;
    }

    public boolean isLevelCompleted() {
        return levelCompleted;
    }

    public void setLevelCompleted(boolean newLevelCompleted) {
        this.levelCompleted = newLevelCompleted;
    }

    public Reward getReward() { return  reward; }
    public void setReward(Reward newReward) { reward = newReward; }
}
