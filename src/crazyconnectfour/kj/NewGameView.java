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
        {"N", "Enter your name"},
        {"C", "Name the computer"},
        {"S", "Start"},
        {"O", "Options menu"}, 
        {"H", "Help menu"},       
        {"Q", "Quit game menu"}        
    };
    
//calls from the different classes    
   private NewGameControl newGameControl = new NewGameControl();
   private Player playerName = new Player();
   private Computer computerName = new Computer();
   private HelpMenuView callHelpMenu = new HelpMenuView();
    //calling gameboard and score board under S start 
   private GameBoard newGameBoard = new GameBoard();
   private Scoreboard newScoreBoard = new Scoreboard();
   
//constructor 
public NewGameView() {
        
    } 

public void getChoice() {       
              
        String choice;
        Scanner menuChoice = new Scanner(System.in);
        
        do {
            
            this.show(); // display the menu
            
            // get the directions entered
            choice = menuChoice.nextLine();
            choice = choice.trim().toUpperCase();
                   
        switch (choice) {
                case "N":
                    this.playerName.getName();
                    this.playerName.displayName();
                    break;
                case "C":
                    this.computerName.getLabel();
                    this.computerName.displayLabel();
                    break;
                case "S":
                    this.newGameBoard.displayWelcome();
               //how to run calculateWinLoss?
                    //this.newGameBoard.calculateWinLoss();
               //how to run calculateWinnerScore? 
                    //this.newScoreBoard.calculateWinnerScore(int win);
                    break;  //add a label and break out of menu?   
                case "O":
                    this.newGameControl.displayOptions();
                    break;  
                case "H":
                    this.callHelpMenu.getInput();
                    break; 
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
