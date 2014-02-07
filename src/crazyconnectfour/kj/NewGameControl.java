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
public void displayOptions() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                 "\n\tThis is where Kera's menu will connect in.\n"    
                ); 
        displayBorder();
    }   

   public void displayBorder() {       
        System.out.println(
        "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
}
