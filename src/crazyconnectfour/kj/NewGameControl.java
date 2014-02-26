/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

/**
 *
 * @author Jeanette
 */
public class NewGameControl {
    public NewGameControl(){
        
    }
public void displayGameStart() {
        displayBorder();     
        System.out.println( 
                 "\tHi player name, you are playing against computer name. "
                         + "\n\tThe default board size is 4x4, but you can change "
                         + "\n\tthat by going to options if you want." );
        displayBorder();
                
    }   

   public void displayBorder() {       
        System.out.println(
            "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
}
