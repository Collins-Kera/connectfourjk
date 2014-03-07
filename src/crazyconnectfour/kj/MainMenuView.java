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
public class MainMenuView {
    
      //calls from the different classes    
   private NewGameView newGameView = new NewGameView();
   private HelpMenuView callHelpMenu = new HelpMenuView();
   private OptionsMenuView optMenu = new OptionsMenuView();
       
    private final static String[][] menuMainOptions = {
        
        {"S", "Start new game"},
        {"O", "Options Menu"},
        {"H", "Help menu"},       
        {"Q", "Quit Game"}        
    };


//constructor 
public MainMenuView() {
        
    } 

public void whereToGo() {       
              
        String main;
        Scanner mainChoice = CrazyConnectFour.getInputFile();
        
        do {
            
            this.output(); // display the main menu
            
            // get the directions entered
            main = mainChoice.nextLine();
            main = main.trim().toUpperCase();
                   
        switch (main) {
                case "S":
                    this.newGameView.getChoice();
                    break;
                case "O":
                    this.optMenu.getInfo();
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
        } while (!main.equals("Q"));  
                return;
    }   
    private final void output() {
        System.out.println("\n\t***************************************************************");
        System.out.println("\tEnter the letter of the Menu Option you want to view:");

        for (int i = 0; i < MainMenuView.menuMainOptions.length; i++) {
            System.out.println("\t   " + menuMainOptions[i][0] + "\t" + menuMainOptions[i][1]);
        }
        System.out.println("\t***************************************************************\n");
    }
}
  
    
    

