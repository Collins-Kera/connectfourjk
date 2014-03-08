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
public class HelpMenuView {

    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
    
    private final static String[][] menuOptions = {
        
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
        
    } 

public void getInput() {       
              
        String directions;
        Scanner menuInput = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get the directions entered
            directions = menuInput.nextLine();
            directions = directions.trim().toUpperCase();
            
        switch (directions) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "L":
                    this.helpMenuControl.displayLocationHelp();
                    break;
                case "T":
                    this.helpMenuControl.displayTokenHelp();
                    break;
                 case "P":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break; 
                case "Q": 
                    break;
                default:
                    new CrazyConnectFourError().displayError("Invalid entry. Please enter a valid letter.");
                    continue;
            }
        } while (!directions.equals("Q"));  
        
         return;
    }
   // displays the help menu border with options
    private final void display() {
        System.out.println("\n\t***************************************************************");
        System.out.println("\tEnter the letter of the Help Menu option you want to view:");
        for (String[] menuOption : HelpMenuView.menuOptions) {
            System.out.println("\t   " + menuOption[0] + "\t" + menuOption[1]);
        }
        System.out.println("\t***************************************************************\n");
    }
}
