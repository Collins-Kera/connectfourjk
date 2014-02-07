/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

/**
 *
 * @author Kera
 */
public class OptionsMenuControl {
    
    public OptionsMenuControl() {
            
        }
    public void tokenColor() {
        System.out.println();
        this.displayBorder();             
        System.out.println( 
                "\tThis is where the player will be able to choose whether they want "
                + "\n\tto have a red or blue token.");
        displayBorder();
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
