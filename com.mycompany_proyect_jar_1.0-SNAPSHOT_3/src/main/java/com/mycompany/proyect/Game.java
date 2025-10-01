package com.mycompany.proyect;

public class Game {
    private int idGame, currentLevel = 1, idPlayer = 1;
    private int PastChallenges = 0;
    private Level level1, level2;
    private Reward reward1, reward2;
        private Player player1;
    private Challenge currentChallengen;

    public Game(int idGame) {
        this.idGame = idGame;
    }

    public void passLevel(boolean challengerPass, int idLevel, Reward reward) {
        // si cumple los tres retos pasa nevvel y sae asigna recompensa
        if (challengerPass == true) {
            if(PastChallenges <= 3){
                PastChallenges = PastChallenges + 1;
            }else{
                player1.addReward(reward);
                currentLevel = currentLevel + 1; 
            }                     
        }else {
            player1.setLives(player1.getLives() - 1);
            System.out.println("paso por aca " + player1.getLives());
        }
    }

    public void playGame(Challenge[] retosLevel1, Challenge[] retosLevel2, String namePlayer) {
        //Se creara los niveles y las recompensas necesarias para que el juego funcione
        reward1 = new Reward(1,"recompensa nivel 1","Se entrega una medalla de honor por terminar el nivel 1", 1);
        reward2 = new Reward(2,"recompensa nivel 2","Se entrega una medalla de honor por terminar el nivel 2", 2);
        
        level1 = new Level(1, "Nivel 1","Nivel de introduccion" ,retosLevel1);
        level2 = new Level(2, "Nivel 2","Nivel de conjuntos" ,retosLevel2);

        player1 = new Player(idPlayer, namePlayer, idGame);
        idPlayer = idPlayer + 1;
       
    }
    
      // modificaciones para convinar con la interfaz grafica
    
    public int getIdGame(){
        return idGame;
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
        System.out.println("paso por aca " + player1.getLives());
        String namePlayer = player1.getName();
        String challengerPass = "" + PastChallenges;
        
        String [] data = {livePlayer, namePlayer, challengerPass};
               
        return data;
    }
    
    
    
    
    
    

}