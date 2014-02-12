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
public class test {
    
}

public class GetLocationView {
    private Game game;
    
    public GetLocationView(Game game) {
        this.game = game;
    }
    
    public int getBoardSize() {

        Scanner inFile = new Scanner(System.in); // get input file      
        String boardSize;
       
        boolean valid = true;
        
        // prompt the user for the gamboard size
        while (valid) {
            // prompt user for gameboard size
            System.out.println("\n\n\tAll gameboards are squares: 4x4, 6x6, & 8x8."
                + "Enter the size square you want. (4, 6, or 8)");
            
            // get the value entered by the user 
            boardSize = inFile.nextLine(); 
            
            // trim off all extra blanks from the input
            boardSize = boardSize.trim();  
            
            // replace any commas enter with blanks
            boardSize = boardSize.replace(',', ' '); 
            
            if (boardSize == 4) { // value entered 4x4
                return 4;
            }    
            else if (boardSize == 6) { // value entered 6x6
                return 6;
            }    
            else if (boardSize == 8) { // value entered 8x8
                return 8;
            }  

            else { // wrong number of values entered.
                    new CrazyConnectFourError().displayError(
                        "You must enter either 4, 6, or 8 for it to be valid.");
                    continue;
                }
            }   
    }

}