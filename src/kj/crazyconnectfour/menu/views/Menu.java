/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.menu.views;

import kj.crazyconnectfour.controls.CrazyConnectFour;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import kj.crazyconnectfour.enums.ErrorMessages;
import kj.crazyconnectfour.exceptions.MenuException;
import kj.crazyconnectfour.interfaces.DisplayInfo;
import kj.crazyconnectfour.interfaces.EnterInfo;

/**
 *
 * @author Kera
 */
public abstract class Menu implements DisplayInfo, EnterInfo{
    
    private String[][] menuItems = null;

    public Menu() {
    }

    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
      
    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    

    @Override
    public void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final String getInput() {

        Scanner inFile = CrazyConnectFour.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                try {
                    throw (new MenuException (ErrorMessages.ERROR103.getMessage()));
                } catch (MenuException ex) {
                    System.out.println (ex.getMessage());
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
        } while (!valid);
        
        return command;
    }

}
