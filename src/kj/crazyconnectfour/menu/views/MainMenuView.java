/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.menu.views;

import crazyconnectfour.kj.CrazyConnectFourError;
import kj.crazyconnectfour.menu.views.HelpMenuView;
import java.util.Scanner;

/**
 *
 * @author Jeanette
 */
public class MainMenuView extends Menu {
    
    private final static String[][] menuItems = {
        
        {"S", "Start new game"},
        {"O", "Options Menu"},
        {"H", "Help menu"},       
        {"Q", "Quit Game"}        
    };

//constructor 
public MainMenuView() {
       super(MainMenuView.menuItems);  
    } 

//@Override
public String display(Object object) {       
 
     String command;
        do {
            
            this.display(); // display the main menu
            command = this.getInput();
            
                
        switch (command) {
                case "S":
                    NewGameView newGameView = new NewGameView();
                    newGameView.display(null);
                    break;
                case "O":
                    OptionsMenuView optMenu = new OptionsMenuView();
                    optMenu.display(null);
                    break;  
                case "H":
                    HelpMenuView helpMenu = new HelpMenuView();
                    helpMenu.display(null);                  
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
}
  
    
    

