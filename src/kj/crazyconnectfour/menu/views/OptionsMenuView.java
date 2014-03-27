/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.menu.views;

import kj.crazyconnectfour.controls.CrazyConnectFourError;
import kj.crazyconnectfour.controls.OptionsMenuControl;
import kj.crazyconnectfour.menu.views.HelpMenuView;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import kj.crazyconnectfour.exceptions.MenuException;

/**
 *
 * @author Kera
 */
public class OptionsMenuView extends Menu{
    
     private OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
     private HelpMenuView callHelpMenu = new HelpMenuView();
    
     private final static String[][] menuItems = {
        
        {"T", "Pick Token Color"},
        {"H", "Help Menu"},      
        {"Q", "Quit Options Menu"}        
    };
    
//constructor 
public OptionsMenuView() {
        super(OptionsMenuView.menuItems);
    } 

public String display(Object object) {    
    String command = "";
        
        do {
        try {            
            this.display(); // display the menu
            command = this.getInput();
            
            switch (command) {
                case "T":
                    this.optionsMenuControl.getTokenColor();
                    break;                  
                case "H":
                    this.callHelpMenu.display(object);
                    break;
                case "Q":
                    break;
                default:
                    throw (new MenuException("Invalid entry. Please enter a valid letter."));
                            }
        } catch (MenuException ex) {
            System.out.println (ex.getMessage());
            Logger.getLogger(OptionsMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        } while (!command.equals("Q"));  
        
         return command;
    }
}
