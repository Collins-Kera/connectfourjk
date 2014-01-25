/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Scanner;

/**
 *
 * @author Kera
 */
public class CrazyConnectFour {
    String instructions = "Welcome, this is the game Crazy Connect Four!\n"
            +"In this game you can play against the computer or another player.\n"
            +"To win this game you have to connect four token in a row before"
            +"your competitor!";
    
    public static void main(String[] args) {
        CrazyConnectFour myGame = new CrazyConnectFour();
        myGame.getName();
        myGame.displayHelp();
        GameBoard board = new GameBoard();
        board.displayWelcome();
        Scoreboard points = new Scoreboard();
        points.score();
        Computer play = new Computer();
        play.displayComputer();
    }
  
    public void displayHelp(){
        System.out.println(this.instructions);
       }
}