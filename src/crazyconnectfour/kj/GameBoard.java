/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.ArrayList;

/**
 *
 * @author Kera
 */
public class GameBoard {
    String welcome = "Get ready to start in 3,2,1...";
    Token[][] tokenLocations = new Token[5][5]; //0,0 is the bottom left hand corner 0,1 is moving to the right & 1,0 is moving up
    
    Token token = new Token();
  
    public void displayWelcome(){
        token.color();
        System.out.println(welcome); 
    }
    
    public void calculateWinLoss(int x, int y){
        tokenLocations[0][0] = token;
        //recognize four tokens in a row, who gt the token in a row, return 0 for player win, 1 computer win, 2 for a tie.
        
        //for loop(){ // scan gameboard for tokens
            
       // }
        
     //insert token // tell my function where the token is
    }
    
}
