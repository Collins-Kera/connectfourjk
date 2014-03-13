/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Scanner;

/**
 *
 * @author Jeanette and Kera
 */

public class HelpMenuView extends Menu {
    
    public static final String BOARD = "BOARD";
    public static final String GAME = "GAME";
    public static final String REAL_PLAYER = "REAL_PLAYER";
    public static final String COMPUTER_PLAYER = "COMPUTER_PLAYER";
    public static final String LOCATION = "LOCATION";
    public static final String MARKER = "MARKER";
    
    private final static String[][] menuItems = {
        
        {"B", "The board"},
        {"C", "A computer player"}, 
        {"G", "The Crazy Connect Four game"},
        {"L", "Token location"},
        {"T", "A token"},
        {"P", "A regular player"},        
        {"Q", "Quit Help"}        
    };
    
 private HelpMenuControl helpMenuControl = new HelpMenuControl();

//constructor 
public HelpMenuView() {
    super(HelpMenuView.menuItems);    
    } 

@Override
public String executeCommands(Object object) {       
           String command;
           
    do { 
            this.display(); // display the menu 
            command = this.getCommand(); 
    
        switch (command) {
                case "B":
                    this.displayHelp(HelpMenuView.BOARD);
                    break;
                case "C":
                    this.displayHelp(HelpMenuView.COMPUTER_PLAYER);
                    break;
                case "G":
                    this.displayHelp(HelpMenuView.GAME);
                    break;                  
                case "L":
                    this.displayHelp(HelpMenuView.LOCATION);
                    break;
                case "T":
                    this.displayHelp(HelpMenuView.MARKER);
                    break;
                 case "P":
                    this.displayHelp(HelpMenuView.REAL_PLAYER);
                    break; 
                case "Q": 
                    break;
                default:
                    new CrazyConnectFourError().displayError("Invalid entry. Please enter a valid letter.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return command;
    }

    private void displayHelp(String helpType) {

        String helpText = null;
        switch (helpType) {
            case HelpMenuView.BOARD: helpText = 
                 "\tThe game board for Crazy Connect Four consists of a 6x6 grid. "
                + "\n\tPlayers choose which column they want to play their "
                + "\n\ttoken in. The token will go into the next empty slot. Each column "
                + "\n\tonly holds 6 tokens.";
                break;
                
            case HelpMenuView.GAME: helpText = 
                "\tThe objective of the game is to be the first player to reach 5 points. "
                + "\n\tTo get a point the player has to connect four tokens vertically or horizontally. "
                + "\n\tEach player takes turns placing their token in one of the locations in the "
                + "\n\tgrid. The first player to get \"four-in-a-row\" is the winner of the round."
                + "\n\tIf no one connects four in a round, then the score board shows a tie and "
                + "\n\tthen another round begins.";
                break; 
                
            case HelpMenuView.REAL_PLAYER: helpText = 
                "\tA real player manually takes their turn by placing their token "
                + "\n\tin an unused location in the grid board."; 
                break;
                
            case HelpMenuView.COMPUTER_PLAYER: helpText = 
                "\tA computer based player takes its turn after the real player "
                + "\n\thas played their token on the board.";
                break;
                
            case HelpMenuView.LOCATION: helpText = 
                "\tA location on the grid where the player or computer places their token.";
                break;
                
            case HelpMenuView.MARKER: helpText = 
                "\tThe human player can pick their color of token in the options menu."
                + "\n\tThe tokens are displayed as the first letter of the color."
                + "\n\tThe computer is letter 'C'. ";
                break;
        }   
        
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText);
        System.out.println("\t" + dividerLine.toString());
    }
}
