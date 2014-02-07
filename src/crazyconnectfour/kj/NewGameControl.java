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
                 "\tThis is where there will be a connection to an options menu"
                         + "that will allow them to choose their token color and "
                         + "maybe their board size as well."    
                ); 
        displayBorder();
    }   

   public void displayBorder() {       
        System.out.println(
        "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
}
