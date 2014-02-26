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
    String instructions = "\tWelcome, this is the game Crazy Connect Four!\n"
            +"\tIn this game you can play against the computer.\n"
            +"\tTo win this game you have to connect four tokens in a row \n "
            +"\tbefore your competitor!";
    
    public static void main(String[] args) {
        System.out.println("\t***************************************************************");
        CrazyConnectFour myGame = new CrazyConnectFour();
        myGame.displayHelp();
        System.out.println("\t***************************************************************\n");
        
        //gets all of the names
        GetPlayerListView testRun = new GetPlayerListView();
        testRun.getPlayerNameInput();
        
        //sorts them in a list and prints them out
        GetPlayerListView testRunTwo = new GetPlayerListView();
        testRunTwo.sortList(args);
        
        //add another function that lets them choose a number of who they want to be
        //consider using the same function created for choosing a color
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.whereToGo();
          
        //where do all of these go in?
        GameBoard sizeOfBoard = new GameBoard();
        sizeOfBoard.getBoardSize();
        
        BoardView displayBoard = new BoardView();
        displayBoard.displayBoard(sizeOfBoard);
        
        sizeOfBoard.enterTokens();
        displayBoard.displayBoard(sizeOfBoard);
        
        //GetPlayerListView testRun = new GetPlayerListView();
        //testRun.getPlayerNameInput();
        
       // GetPlayerListView testRunTwo = new GetPlayerListView();
       // testRunTwo.sortList(args);
        
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
        
          //ScoreSum playerone = new ScoreSum();
        //playerone.playerOneScore();
        
        //ScoreSum compscore = new ScoreSum();
        //compscore.computerScore();
        
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
