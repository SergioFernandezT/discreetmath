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
        
        String[] arreglo;
        arreglo = new String[] {"C(n) = ln(n)" ,"C(n) = ln(n!)","C(n) = ln(n)","C(n) = Σ i"};
        
        Challenge challenge1_1 = new Challenge(1, """
                                <html>
                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                En el cálculo del costo total de entrenamiento de un modelo se define:

                                C(n) = Σᵢ₌₁ⁿ ln(i)

                                C(n) = ln(n!)    para todo n ∈ ℕ
                                </body>
                                </html>
                                """,  arreglo ,"b"  );
        
        arreglo = new String[] {" n-1 " ,"n","2n","n+1"};
        Challenge challenge1_2 = new Challenge(2,"""
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Considera el bucle en Java:
                                                for(int i = 1; i &lt;= n; i++) {
                                                    System.out.println(i);
                                                }
                                                Demuestra que el número de impresiones es n.
                                                </body>
                                                </html>
                                                """ , arreglo,"b"  );
        
                                                    
        arreglo = new String[] {"<html> 2<sup>n</sup> - 1 </html>" ,"<html> 2<sup>n+1</sup> - 1</html>","<html>2<sup>n+1</sup></html>","<html><span>(n(n+1))</span>/<span>2</span></html>"};
        Challenge challenge1_3 = new Challenge(3,"""
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Un árbol binario completo con altura n tiene
                                                N(n) = 2<sup>n+1</sup> - 1
                                                </body>
                                                </html>
                                                """ , arreglo,"b"  );
        
        
         arreglo = new String[] {"n" ,"<html> 2<sup>n</sup></html>","<html> 2<sup>n-1</sup></html>","n!"};
        Challenge challenge1_4 = new Challenge(3,"""
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Se construye una cadena duplicando la anterior, comenzando con el paso 1 = 'a'. 
                                                Demuestra que la longitud en el paso n es 2<sup>n-1</sup>.
                                                </body>
                                                </html>
                                                """ , arreglo,"c"  );
        
        
        arreglo = new String[] {"Impar siempre", "Divisible por 2", "Divisible por 3", "Nunca múltiplo de 3"};
        Challenge challenge1_5 = new Challenge(3, """
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Tres IDs consecutivos m, m+1, m+2. Su suma es múltiplo de 3.
                                                </body>
                                                </html>
                                                """ , arreglo,"c"  );
        
        
       challengesLevel1 = new Challenge[] {challenge1_1,challenge1_2,challenge1_3, challenge1_4, challenge1_5}; 
        
       
        
        arreglo = new String[] {"{1, 2, 3, 4}", "{3, 4, 5, 6}", "{1, 2, 3, 4, 5, 6}", "{5, 6}"};
        Challenge challenge2_1 = new Challenge(4,"""
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Dado los conjuntos A y B:

                                                <pre>
                                                Conjunto A:        Conjunto B:
                                               _________           _________
                                              /         \\        /         \\
                                             /     1     \\      /     3     \\
                                             |  2     3   |     |  4     5    |
                                             |       4    |     |       6     |
                                             \\           /     \\            /
                                              \\_________/       \\__________/
                                                </pre>

                                                ,la unión entre ambos es:
                                                </body>
                                                </html>
                                                """, arreglo,"c"  );
        
     
        
        arreglo = new String[] {"{a,b,d}", "{c,e}", "{f,g}", "{a,b,c,d,e,f,g}"};
        Challenge challenge2_2 = new Challenge(5,"""
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Sean los conjuntos X y Y:

                                                <pre>
                                                Conjunto X:          Conjunto Y:
                                                 _________           _________
                                                /              /     \\               \\
                                               /     a       /    \\      c     \\
                                               |  b     c   |      |  e     f   |
                                               |       d    |      |       g    |
                                               \\           /      \\           /
                                                \\_________/        \\_________/
                                                </pre>

                                                La diferencia X − Y es:
                                                </body>
                                                </html>
                                                """, arreglo,"a"  );
        
        
        
        
        
        
         
        arreglo = new String[] {" {∅, {x}, {y}} ", " {{x}, {y}}", "  {∅, {x}, {y}, {x, y}} ", " {{x, y}}"};
        Challenge challenge2_3 = new Challenge(6,"""
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Sea el conjunto:

                                                Conjunto M: {x, y}  

                                                 El conjunto potencia P(M) es:
                                                </body>
                                                </html>
                                                """, arreglo,"c"  );
        
        
        arreglo = new String[] {"{2,4,6,8} ", "{1,3,5,7}", "{1,2,3,4,5,6,7,8}", "{8}"};
        Challenge challenge2_4 = new Challenge(6,"""
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Universo U con el conjunto A dentro:

                                                <pre>
                                                Universo U:
                                                 ___________________________
                                                /                           \\
                                               / 1                      3    \\
                                               |                              |
                                               |    _______          5        |  
                                               |   /          \\              |
                                               |  |    2    6  |  Conjunto A  |
                                               |  |   4   8    |              |  
                                               |  \\_______    /              |
                                               \\                     7       /
                                                \\_________________________  /
                                                </pre>
                                                </body>
                                                </html>
                                                """, arreglo,"b"  );
        
        
        arreglo = new String[] {"{m,n} ", "{o,p}", "{q,r}", "{m,n,o,p,q,r}"};
        Challenge challenge2_5 = new Challenge(6, """
                                                <html>
                                                <body style='font-family: Cambria Math; font-size: 18px; color: white;'>
                                                Sean los conjuntos P y Q:

                                                <pre>
                                                    Conjunto P:        Conjunto Q:
                                                     _________           _________
                                                    /         \\        /         \\
                                                   /  m   n    \\      /   o   p   \\
                                                   |  o      p  |      |  q       r |
                                                   |            |      |            |
                                                   \\          /       \\          /
                                                    \\________/         \\________/
                                                </pre>

                                                La intersección de P y Q es:
                                                </body>
                                                </html>
                                                """, arreglo,"b"  );
        
        
        challengesLevel2 = new Challenge[] {challenge2_1,challenge2_2,challenge2_3,challenge2_4, challenge2_5};        
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
