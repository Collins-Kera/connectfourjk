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
                 "\tHello!! Welcome to the game! To get started press 'T' to take your turn."
                         );
        displayBorder();
                
    }   

   private void displayBorder() {       
        System.out.println(
            "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
}
