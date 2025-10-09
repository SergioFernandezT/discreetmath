package com.mycompany.proyect;

import java.util.Arrays;

public class Game {
    private int idGame, currentLevel = 1, idPlayer = 0; 
    private int PastChallenges = 0, giveReward = 0;
    private Level level1, level2;
    private Reward reward1, reward2;
    private Player player1;
    private Challenge currentChallengen;
    private String [] rewardsS = {}; 
    


    public Game(int idGame) {
        this.idGame = idGame;
    }

    public void passLevel(boolean challengerPass, int idLevel, Reward reward) {
        // si cumple los tres retos pasa nevvel y sae asigna recompensa
        if (challengerPass == true) {
            if(PastChallenges < 2){
                PastChallenges = PastChallenges + 1;
                giveReward = 0;
                
            }else{
                player1.addReward(reward);
                currentLevel = currentLevel + 1;
                PastChallenges = 0;
                giveReward = 1;
                
            }                     
        }else {
            player1.setLives(player1.getLives() - 1);
        }
    }

    public void playGame(Challenge[] retosLevel1, Challenge[] retosLevel2, String namePlayer) {
        //Se creara los niveles y las recompensas necesarias para que el juego funcione
        reward1 = new Reward(1,"recompensa nivel 1","/images/recompensa_1.png", 1);
        reward2 = new Reward(2,"recompensa nivel 2","/images/recompensa_2.png", 2);
        
        level1 = new Level(1, "Nivel 1","Nivel de introduccion" ,retosLevel1);
        level2 = new Level(2, "Nivel 2","Nivel de conjuntos" ,retosLevel2);

        player1 = new Player(idPlayer, namePlayer, idGame);
        idPlayer = idPlayer + 1;
       
    }
    
      // modificaciones para convinar con la interfaz grafica
    
    public int getIdGame(){
        return idGame;
    }

    public void setGiveReward(int giveReward) {
        this.giveReward = giveReward;
    }
    
    public Challenge currentChallengen(){
        if(player1.getLives() > 0){
            switch(currentLevel){
                case 1: 
                    currentChallengen = level1.playLevel();
                    break;
                   
                case 2:
                    currentChallengen = level2.playLevel();
                    break;
                    
                default:
                    
                    // en este default se pondria un panel de cierre crear mas adelante  
            }
            
        }else{
           currentChallengen = null; 
        }
        
        return currentChallengen;
    }
    
    public boolean StatusLevel(String answer){
        return currentChallengen.getSolucion().equalsIgnoreCase(answer);
    }
    
    public void controlLevel(boolean resultComparison){
        switch(currentLevel){
            case 1: 
                passLevel(resultComparison,level1.getLevelId(),reward1);
                break;
            case 2:
                passLevel(resultComparison,level2.getLevelId(),reward2); 
                break;
        }        
    }

    
    public String[]  dataPlayer(){
        String livePlayer =  "" + player1.getLives();
        String namePlayer = player1.getName();
        String challengerPass = "" + PastChallenges;
        String level = "" +  currentLevel;
        String giveReward = "" + this.giveReward;
        String [] data = {livePlayer, namePlayer, challengerPass, level,giveReward};
                   
        return data;
    }
    
    public String[]  dataReward(){
        if (player1.getRewards() != null && player1.getRewards().length > 0){
            Reward[] rewards = player1.getRewards();
            for (int index = 0; index < rewards.length; index++){
                if (rewards[index] != null) {                        
                    addRewardS(rewards[index].getDescrption());     
                }
            }
        }    
         return rewardsS;
    }
    
    public void addRewardS(String reward) {
       if (this.rewardsS == null) {
            // Si el arreglo no existe, lo inicializa con un solo elemento
            this.rewardsS = new String[1];
            this.rewardsS[0] = reward;
        } else {
            // Si ya hay recompensas, crea uno nuevo con espacio extra
            int newLength = this.rewardsS.length + 1;
            this.rewardsS = Arrays.copyOf(this.rewardsS, newLength);
            this.rewardsS[this.rewardsS.length - 1] = reward;
        }
    }
    
   
    
    
    
    
    
    

}