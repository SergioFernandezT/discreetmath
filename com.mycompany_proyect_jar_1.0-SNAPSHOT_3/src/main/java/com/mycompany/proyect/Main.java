/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect;

import javax.swing.SwingUtilities;

/**
 *
 * @author brayan
 */
public class Main {
    private int idGame = 0;
    private Game game;
    private Challenge[] challengesLevel1, challengesLevel2;
    private String namePlayer;
    
    public static void main(String[] args) {
        // Siempre es buena práctica lanzar Swing en el Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            Start start = new Start();
            start.setVisible(true);
        });       
        
        
            
    }
    
    public void createNewGame(){
        game = new Game(idGame);
        idGame = idGame + 1;
    }
    
    public void createNewPlayer(String namePlayer){ 
        this.namePlayer = namePlayer;        
        Reward reward1 = new Reward(1,"recompensa nivel 1","Se entrega una medalla de honor por terminar el nivel 1", 1);
        Reward reward2 = new Reward(2,"recompensa nivel 2","Se entrega una medalla de honor por terminar el nivel 2", 2);
        
        String[] arreglo = {"a","b","c","d"};
        Challenge challenge1_1 = new Challenge(1,"/images/RETO_1_NIVEL_1_ENUNCUADO.png", arreglo,"a"  );
        Challenge challenge1_2 = new Challenge(2,"/images/RETO_2_NIVEL_1_ENUNCUADO.png", arreglo,"c"  );
        Challenge challenge1_3 = new Challenge(3,"/images/RETO_2_NIVEL_1_ENUNCUADO.png", arreglo,"d"  );
        
       challengesLevel1 = new Challenge[] {challenge1_1,challenge1_2,challenge1_3}; 
        
        Challenge challenge2_1 = new Challenge(4,"/images/RETO_1_NIVEL_2_ENUNCUADO.png", arreglo,"b"  );
        Challenge challenge2_2 = new Challenge(5,"/images/RETO_2_NIVEL_2_ENUNCUADO.png", arreglo,"d"  );
        Challenge challenge2_3 = new Challenge(6,"/images/RETO_3_NIVEL_2_ENUNCUADO.png", arreglo,"a"  );
        
        challengesLevel2 = new Challenge[] {challenge2_1,challenge2_2,challenge2_3};        
        game.playGame(challengesLevel1, challengesLevel2, this.namePlayer);
    }
    
    public Challenge runGame(){
        return game.currentChallengen(); 
    }
    
    public boolean answer(String answer){
        boolean correctanswer = game.StatusLevel(answer);
        game.controlLevel(correctanswer);    
        return correctanswer;
    }
    
    public String[] dataGame() {     
        String[] data = game.dataPlayer();  
        return data;
    }
 
   
    
}
