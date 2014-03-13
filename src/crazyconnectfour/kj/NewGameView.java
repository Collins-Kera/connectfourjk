/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Scanner;
/**
 *
 * @author Jeanette
 */
public class NewGameView extends Menu {
    
    //calls from the different classes    
   private NewGameControl newGameControl = new NewGameControl();
   private Player playerName = new Player();
   //private Computer computerName = new Computer();
   private HelpMenuView callHelpMenu = new HelpMenuView();
   private OptionsMenuView optMenu = new OptionsMenuView(); //calling gameboard and score board under S start 
   private GameBoard newGameBoard = new GameBoard();
   private Scoreboard newScoreBoard = new Scoreboard();
   private BoardView newBoardView = new BoardView();
   private GetPlayerListView newGetPlayerListView = new GetPlayerListView();
    
    private final static String[][] menuItems = {
    //how will the game 'start'? connect with display board/score? 
        {"N", "Enter Your Name"},
        {"T", "Take Your Turn"},
        {"P", "Player Statistics"},
        {"H", "Help Menu"},       
        {"Q", "Quit Game Menu"}        
    };
   
//constructor 
public NewGameView() {
        super(NewGameView.menuItems);
    } 

@Override
public String executeCommands(Object object) {       
              
        String playerName = "Player";
        String command;
        
        do {
            
            this.display(); // display the menu
            command = this.getCommand(); 
                            
        switch (command) {
            
            //pulled out the names and have in the beginning and the option menu
                case "N":
                    this.newGetPlayerListView.getPlayerNameInput(); // has them put in  name list
                    playerName = this.newGetPlayerListView.pickPlayerName(); // has them pick their name
                    newScoreBoard.setPlayer(playerName);
                    break;
                case "T":
                    NewGameControl.displayGameStart(); 
                    boolean stop = true;
                    while (stop) {
                        this.newBoardView.displayBoard(newGameBoard);
                        int result = this.newGameBoard.enterTokens();//prompt where they should play token
                        if (result == 5) {
                            newGameBoard = new GameBoard(); //reset gameboard
                            break;
                        }
                        if (result == 1) { //player won
                            this.newBoardView.displayBoard(newGameBoard);
                            this.newScoreBoard.calculateWinnerScore(0);//display scoreboard
                            newGameBoard = new GameBoard(); //reset gameboard
                            break;
                        }
                        
                        result = this.newGameBoard.computerPlay();
                        if (result == 5) {
                            newGameBoard = new GameBoard(); //reset gameboard
                            break;
                        }
                        
                        if (result == 2){ //computer won
                            this.newBoardView.displayBoard(newGameBoard);
                            this.newScoreBoard.calculateWinnerScore(1);//display scoreboard
                            newGameBoard = new GameBoard(); //reset gameboard
                            break;
                        }
                        
                    }
                    break;  //break out of menu  
                case "O":
                    this.optMenu.executeCommands(object);
                    break;  
                case "H":
                    this.callHelpMenu.executeCommands(object);
                    break; 
                case "P":
                    this.newScoreBoard.calculateWinnerScore(1); 
                case "Q": 
                    break;
                default:
                    new CrazyConnectFourError().displayError("Invalid entry. Please enter a valid letter.");
                    continue;
            }
        } while (!command.equals("Q"));  
                return command;
    }   
}
