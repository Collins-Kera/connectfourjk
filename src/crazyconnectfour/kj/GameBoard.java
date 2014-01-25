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
public class GameBoard {
    String welcome = "Welcome to Crazy Connect Four!\n"
                    + "Get ready to start in 3,2,1...";
    Token token = new Token();
  
    public void displayWelcome(){
        System.out.println(welcome);
        token.color();
    }
}
