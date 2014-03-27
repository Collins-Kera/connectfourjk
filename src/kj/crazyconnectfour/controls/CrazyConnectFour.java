/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.controls;

import kj.crazyconnectfour.menu.views.MainMenuView;
import java.io.Serializable;
import java.util.Scanner;
import kj.crazyconnectfour.exceptions.MenuException;


/**
 *
 * @author Kera and Jeanette 
 */
public class CrazyConnectFour implements Serializable{
    
    private static Scanner inFile = new Scanner (System.in);
    //private static final MainMenuView MainMenu = new MainMenuView();

    public CrazyConnectFour(){
    }
    
    static String instructions = "\tWelcome, this is the game Crazy Connect Four!\n"
            +"\tIn this game you can play against the computer.\n"
            +"\tTo win this game you have to connect four tokens in a row \n "
            +"\tbefore your competitor!";
    
    public static Scanner getInputFile() {
        return CrazyConnectFour.inFile;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
//    public static MainMenuView getMainMenuView() {
//        return MainMenu;
//    }
    
    public static void main(String[] args) {
        
        CrazyConnectFour myGame = new CrazyConnectFour();
        myGame.displayHelp();
        
        try {
        myGame.play();
        } catch (Exception ex) {
            System.out.println("An unexpected error was caught!" + ex.getMessage()); 
            ex.printStackTrace();
        }
        finally {
            CrazyConnectFour.inFile.close();
        }
    }
  
    private void displayHelp(){
        System.out.println("\t***************************************************************");
        System.out.println(getInstructions());
        System.out.println("\t***************************************************************\n");
       }
    
  private void play(){
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display(this);
    }
}
