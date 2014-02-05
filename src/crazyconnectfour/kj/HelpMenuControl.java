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
public class HelpMenuControl {
  
    public HelpMenuControl() {
            
        }
    public void displayBoardHelp() {
        System.out.println();
        this.displayBorder();             
        System.out.println( 
                "\tThe game board for Crazy Connect Four consists of a 5x5 grid. "
                + "\n\tPlayers choose which column they want to play their "
                + "\n\ttoken in. The token will go into the next empty slot. Each column "
                + "\n\tonly holds 5 tokens.");
        displayBorder();
    }
    
    public void displayGameHelp() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                 "\tThe objective of the game is to be the first player to reach 5 points. "
                + "\n\tTo get a point the player has to connect four tokens vertically (for now). "
                + "\n\tEach player takes turns placing their token in one of the locations in the "
                + "\n\tgrid. The first player to get \"four-in-a-row\" is the winner of the round."
                + "\n\tIf no one connects four in a round, then the score board shows a tie and "
                + "\n\tthen another round begins."
                ); 
        displayBorder();
    }    

    public void displayRealPlayerHelp() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                "\tA real player manually takes their turn by placing their token "
                + "\n\tin an unused location in the grid board."
                ); 
        displayBorder();
    }    
    
     public void displayComputerPlayerHelp() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                "\tA computer based player takes its turn after the real player "
                + "\n\thas played their token on the board."
                ); 
        displayBorder();
    }
     
    public void displayLocationHelp() {
        System.out.println();
        displayBorder();     
        System.out.println( 
               "\tA location on the grid where the player or computer places their token."
                ); 
        displayBorder();
    }
    
   public void displayTokenHelp() {
        System.out.println();
        displayBorder();     
        System.out.println( 
               "\tEach player has a specific color of token where the computer is red "
                + "\n\tand the real player is blue. These are displayed as colored cirlces"
                + "\n\tin the location on the grid seleted."
                ); 
        displayBorder();
    } 
   
   public void displayBorder() {       
        System.out.println(
        "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
