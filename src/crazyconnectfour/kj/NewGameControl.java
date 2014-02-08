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
                 "\nHi player name, you are playing against computer name. "
                         + "\nThe default board size is 5x5, but you can change "
                         + "\nthat by going to options if you want.\n" );
        displayBorder();
                
    }   

   public void displayBorder() {       
        System.out.println(
            "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
}
