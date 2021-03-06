/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.controls;

import java.util.Scanner;
import kj.crazyconnectfour.enums.ErrorMessages;

/**
 *
 * @author Kera
 */
public class OptionsMenuControl {
    private static String tokenColor;
    
    public OptionsMenuControl() {
            
        }
  
    public int getTokenColor() { 
        Scanner inFile = CrazyConnectFour.getInputFile(); // get input file      
        
        
        // prompt the user for the token color
        for (int i =0; i<5; i++) {
            // prompt user for gameboard size
            System.out.println("\tYou can choose from 4 different token colors. Enter a letter "
                        + "to make your choice. "
                        + "\n\t1 = yellow, 2 = red, 3 = blue, and 4 = green.");
            
            // get the value entered by the user 
            tokenColor = inFile.nextLine(); 
            
            // trim off all extra blanks from the input
            tokenColor = tokenColor.trim();  
            
            // replace any commas enter with blanks
            tokenColor = tokenColor.replace(',', ' '); 
            
            if (Integer.parseInt(tokenColor) == 1) { 
                System.out.println("\n\n\tPlayer 1 you are now token color yellow");
                return 1;
            }    
            else if (Integer.parseInt(tokenColor) == 2) { 
                System.out.println("\n\n\tPlayer 1 you are now token color red.");
                return 2;
            }    
            else if (Integer.parseInt(tokenColor) == 3) { 
                System.out.println("\n\n\tPlayer 1 you are now token color blue.");
                return 3;
            }  
            else if (Integer.parseInt(tokenColor) == 4) { 
                System.out.println("\n\n\tPlayer 1 you are now token color green.");
                return 4;
            }
            else { // wrong number of values entered.
                    //new CrazyConnectFourError().displayError(
                    //    "You must enter either 1, 2, 3 or 4 for it to be valid.");
                System.out.println(ErrorMessages.ERROR102.getMessage());
            }
        
       } return 0;
                
    }
     
   private static void displayBorder() {       
        System.out.println(
        "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
