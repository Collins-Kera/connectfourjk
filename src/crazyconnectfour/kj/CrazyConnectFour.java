/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

//import java.util.Scanner;

/**
 *
 * @author Kera
 */
public class CrazyConnectFour {
    String instructions = "Welcome, this is the game Crazy Connect Four!\n"
            +"In this game you can play against the computer.\n"
            +"To win this game you have to connect four tokens in a row before "
            +"your competitor!";
    
    public static void main(String[] args) {
        CrazyConnectFour myGame = new CrazyConnectFour();
        myGame.displayHelp();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.whereToGo();
        
        GameBoard sizeOfBoard = new GameBoard();
        sizeOfBoard.getBoardSize();
    
/* //embedded all of these into other menus. trouble with the scoreoard and gameboard    
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
        
        NewGameView gameView = new NewGameView();
        gameView.getChoice();

        Player playerName = new Player();
        playerName.getName();
        playerName.displayName();
        
        Computer computerName = new Computer();
        computerName.getLabel();
        computerName.displayLabel();
        
        OptionsMenuView optionsView = new OptionsMenuView();
        optionsView.getInfo();
        
 //put scoreboard and game board into the NewGameView under 'Start'       
        Scoreboard points = new Scoreboard();
        points.score();
        
        GameBoard board = new GameBoard();
        board.displayWelcome();
        board.calculateWinLoss(0, 0);
        board.calculateWinLoss(-1, 0);
        board.calculateWinLoss(0, -1);
       
        Scoreboard totalWins = new Scoreboard();
        totalWins.calculateWinnerScore(0);
        */
    }
  
    public void displayHelp(){
        System.out.println(this.instructions);
       }
}
