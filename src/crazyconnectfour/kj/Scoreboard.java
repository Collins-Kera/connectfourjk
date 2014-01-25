/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

/**
 *
 * @author Kera
 */
public class Scoreboard {
    int playerOneScore = 0;
    int playerTwoScore = 0;
    
    public void score(){
        System.out.println("Player One Has " + playerOneScore + " points.");
        System.out.println("Player Two Has " + playerTwoScore + " points.");
    }
    
    
    
}
