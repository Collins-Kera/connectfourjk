/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Scanner;

/**
 *
 * @author Kera
 */
public class OptionsMenuView {
    
    
     private final static String[][] optionsMenu = {
        
        {"T", "Pick Token Color"},
        //{"B", "Set Board Size"}, maybe add back in later
        //{"P", "Player Options"},
        {"H", "Help Menu"},      
        {"Q", "Quit Options Menu"}        
    };
    
 private OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
 private HelpMenuView callHelpMenu = new HelpMenuView();

//constructor 
public OptionsMenuView() {
        
    } 

public void getInfo() {       
              
        String directions;
        Scanner menuInfo = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get the directions entered
            directions = menuInfo.nextLine();
            directions = directions.trim().toUpperCase();
            
        switch (directions) {
                case "T":
                    this.optionsMenuControl.getTokenColor();
                    break;
                //case "B":
                  //  this.optionsMenuControl.boardSize();
                    //break;
                //case "P":
                  //  this.optionsMenuControl.playerOptions();
                    //break;                  
                case "H":
                    this.callHelpMenu.getInput();
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
   // displays the options menu with borders
    public final void display() {
        System.out.println("\n\t***************************************************************");
        System.out.println("\tEnter the letter of the Options Menu you want to view:");
         for (String[] optionsMenu1 : OptionsMenuView.optionsMenu) {
             System.out.println("\t   " + optionsMenu1[0] + "\t" + optionsMenu1[1]);
         }
        System.out.println("\t***************************************************************\n");
    }
}
