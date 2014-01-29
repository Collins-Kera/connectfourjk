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
    int numberPlayerWins = 0;
    int numberComputerWins = 0;
    String playerScoreUpdate = "Your score is now ";
    String computerScoreUpdate = "The computer's score is now ";
    double percentageWins;
            
    public void calculateWinnerScore(int win){
        if(win == 0){
            numberPlayerWins += 1;
            System.out.println(playerScoreUpdate + numberPlayerWins + "\n");
        }
        else if(win == 1) {
            numberComputerWins += 1;
            System.out.println(computerScoreUpdate + numberComputerWins + "\n");
        }
        else {
            System.out.println("It's a tie!");
        }
        percentageWins =  numberPlayerWins/(numberPlayerWins + numberComputerWins)* 100;
        System.out.println("You have won " + (int)percentageWins + "%" + " of the rounds so far.");
    }
    
    public void score(){
       System.out.println("Player One Has " + numberPlayerWins + " points.");
       System.out.println("Computer Has " + numberComputerWins + " points.");
   } 
}
