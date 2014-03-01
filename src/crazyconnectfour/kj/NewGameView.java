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
public class NewGameView {
    
    private final static String[][] menuNewOptions = {
    //how will the game 'start'? connect with display board/score? 
        {"N", "Enter Your Name"},
        //{"C", "Name the Computer"},
        {"T", "Take Your Turn"},
        //{"O", "Options Menu"},
        {"P", "Player Statistics"},
        {"H", "Help Menu"},       
        {"Q", "Quit Game Menu"}        
    };
    
//calls from the different classes    
   private NewGameControl newGameControl = new NewGameControl();
   private Player playerName = new Player();
   private Computer computerName = new Computer();
   private HelpMenuView callHelpMenu = new HelpMenuView();
   private OptionsMenuView optMenu = new OptionsMenuView();
    //calling gameboard and score board under S start 
   private GameBoard newGameBoard = new GameBoard();
   private Scoreboard newScoreBoard = new Scoreboard();
   private BoardView newBoardView = new BoardView();
   private GetPlayerListView newGetPlayerListView = new GetPlayerListView();
  // private ScoreSum currentScores = new ScoreSum();
 

   
//constructor 
public NewGameView() {
        
    } 


public void getChoice() {       
              
        String choice;
        Scanner menuChoice = new Scanner(System.in);
        String playerName = "Player";
        
        do {
            
            this.show(); // display the menu
            
            // get the directions entered
            choice = menuChoice.nextLine();
            choice = choice.trim().toUpperCase();
                   
        switch (choice) {



            //pulled out the names and have in the beginning and the option menu
                case "N":
                    this.newGetPlayerListView.getPlayerNameInput(); // has them put in  name list
                    playerName = this.newGetPlayerListView.pickPlayerName(); // has them pick their name
                    newScoreBoard.player = playerName;
                    break;
                //case "C":
                  //  this.computerName.getLabel();
                  //  this.computerName.displayLabel();
                  //  break;


                case "T":
                   //this.newGetPlayerListView.getPlayerNameInput(); // has them put in  name list
                    //this.newGetPlayerListView.pickPlayerName(); // has them pick their name and computer name
                    this.newGameControl.displayGameStart(); 
                    //Create a refined start menu. Add take turn function & start new game function. 
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
                    
                    
                  
               //how to run calculateWinLoss?
                    //this.newGameBoard.calculateWinLoss();
               //how to run calculateWinnerScore? 
                    //this.newScoreBoard.calculateWinnerScore(int win);
                    break;  //add a label and break out of menu?   
                case "O":
                    this.optMenu.getInfo();
                    break;  
                case "H":
                    this.callHelpMenu.getInput();
                    break; 
                case "P":
                   // this.currentScores.playerOneScore();
                    //this.currentScores.computerScore();
                    // this.showScore.score();
                    this.newScoreBoard.calculateWinnerScore(1);
                    //call calculateWinnerScore from Scoreboard, but it isn't working
                    
                   
                case "Q": 
                    break;
                default:
                    new CrazyConnectFourError().displayError("Invalid entry. Please enter a valid letter.");
                    continue;
            }
        } while (!choice.equals("Q"));  
                return;
    }   
    public final void show() {
        System.out.println("\n\t***************************************************************");
        System.out.println("\tEnter the letter of the New Game Menu option you want to view:");

        for (int i = 0; i < NewGameView.menuNewOptions.length; i++) {
            System.out.println("\t   " + menuNewOptions[i][0] + "\t" + menuNewOptions[i][1]);
        }
        System.out.println("\t***************************************************************\n");
    }
}
