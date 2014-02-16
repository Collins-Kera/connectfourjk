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
public class OptionsMenuControl {
    String tokenColor;
    
    public OptionsMenuControl() {
            
        }
  
    public int getTokenColor() { 
        Scanner inFile = new Scanner(System.in); // get input file      
        int i = 0;
        
        // prompt the user for the token color
        for (;i<5;) {
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
            
            if (Integer.parseInt(tokenColor) == 1) { // value entered 4x4
                System.out.println("\n\n\tPlayer 1 you are now token color yellow");
                return 1;
            }    
            else if (Integer.parseInt(tokenColor) == 2) { // value entered 6x6
                System.out.println("\n\n\tPlayer 1 you are now token color red.");
                return 2;
            }    
            else if (Integer.parseInt(tokenColor) == 3) { // value entered 8x8
                System.out.println("\n\n\tPlayer 1 you are now token color blue.");
                return 3;
            }  
            else if (Integer.parseInt(tokenColor) == 4) { // value entered 8x8
                System.out.println("\n\n\tPlayer 1 you are now token color green.");
                return 4;
            }
            else { // wrong number of values entered.
                    new CrazyConnectFourError().displayError(
                        "You must enter either 1, 2, 3 or 4 for it to be valid.");
            }
        
       } return 0;
                
    }
    
    public void boardSize() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                 "\tThis is where the player will be able to change the size of "
                + "\n\tthe board. There will most likely be 3 size options they "
                + "\n\tcan choose from. "
                ); 
        displayBorder();
    }   

    public void playerOptions() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                "\tA Here the player will be able to pick whether they want to play "
                + "\n\tthe computer or another player."
                ); 
        displayBorder();
    }    
    
   public void displayBorder() {       
        System.out.println(
        "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
