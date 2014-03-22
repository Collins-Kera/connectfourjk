/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.io.Serializable;

/**
 *
 * @author Kera
 */
public class Scoreboard implements Serializable {
    private static int numberPlayerWins = 0;
    private static int numberComputerWins = 0;
    private static int numberOfTies = 0;
    private static double percentageWins;
    private static String player = "Player";
    
    public Scoreboard() {
    }
    
    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
  
    public void calculateWinnerScore (int win){
        if(win == 0 & numberPlayerWins < 4){
            numberPlayerWins += 1;
        }
        else if (numberPlayerWins == 5){
            System.out.println("Congrats, you are the winner.");
            numberPlayerWins = 0;
            numberComputerWins = 0;
            numberOfTies = 0;
            return;
        }
        else if(win == 1 & numberComputerWins < 4) {
            numberComputerWins += 1;
        }
        else if(numberComputerWins == 5){
            System.out.println("Sorry, you lose.");
            numberPlayerWins = 0;
            numberComputerWins = 0;
            numberOfTies = 0;
            return;
        }
        else if (win == 2){
            numberOfTies += 1;
            System.out.println("It's a tie!");
        }
        else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("SCORES:" + "\n" + player + " - " + numberPlayerWins + "\t" + 
                "Computer - " + numberComputerWins + "\t" /*+ "Ties - " + numberOfTies + "\n"*/);
        percentageWins =  (double)numberPlayerWins/(numberPlayerWins + numberComputerWins + numberOfTies)* 100;
        System.out.println("You have won " + (int)percentageWins + "%" + " of the rounds so far.");
    }
}
