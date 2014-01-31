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
    int numberOfTies = 0;
    double percentageWins;
            
    public void calculateWinnerScore(int win){
        if(win == 0 & numberPlayerWins < 5){
            numberPlayerWins += 1;
        }
        else if (numberPlayerWins == 5){
            System.out.println("Congrats, you are the winner.");
            return;
        }
        else if(win == 1 & numberComputerWins < 5) {
            numberComputerWins += 1;
        }
        else if(numberComputerWins == 5){
            System.out.println("Sorry, you lose.");
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
        System.out.println("SCORES:" + "\n" + "Player - " + numberPlayerWins + "\t" + 
                "Computer - " + numberComputerWins + "\t" + "Ties - " + numberOfTies + "\n");
        percentageWins =  numberPlayerWins/(numberPlayerWins + numberComputerWins + numberOfTies)* 100;
        System.out.println("You have won " + (int)percentageWins + "%" + " of the rounds so far.");
    }
    
    public void score(){
       System.out.println("Player One Has " + numberPlayerWins + " points.");
       System.out.println("Computer Has " + numberComputerWins + " points.");
   } 
}
