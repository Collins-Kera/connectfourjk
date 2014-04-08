/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.controls;

import java.io.Serializable;
import java.util.Scanner;
import kj.crazyconnectfour.frames.MainFrame;


/**
 *
 * @author Kera and Jeanette 
 */
public class CrazyConnectFour implements Serializable{
    
    private static Scanner inFile = new Scanner (System.in);
    private static MainFrame mainFrame;

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
    
    public static void main(String[] args) {
        CrazyConnectFour crazyConnectFour = null;
        
        try {
            crazyConnectFour = new CrazyConnectFour();
            java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CrazyConnectFour.mainFrame = new MainFrame();
                CrazyConnectFour.mainFrame.setVisible(true);
            }
        });
       }
        catch (Exception ex) {
            System.out.println("An unexpected error was caught!" + ex.getMessage()); 
            ex.printStackTrace();
        }
        finally {
           if(CrazyConnectFour.mainFrame != null) {
              CrazyConnectFour.mainFrame.dispose();
           }
        }
    }
}


