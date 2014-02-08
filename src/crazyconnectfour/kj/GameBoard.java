/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Scanner;

/**
 *
 * @author Kera and Jeanette
 */
public class GameBoard {
    
    String welcome = "\tGet ready to start in 3,2,1...";
    Token[][] tokenGrid = new Token[5][5]; //0,0 is the bottom left hand corner 0,1 is moving to the right & 1,0 is moving up
    
    Token token = new Token();
    
/*    
// This is Jeanette's programming mess
public void enterTokens () {    
    String placement;

 //will ask player for input of row, send it through loop and send final
 //       coordinate to the next function to calculate
   
//ask player where they want to play and get column input from them  
Scanner columnInput = new Scanner(System.in);
   System.out.println("Type in the column where you want to play (0-4): ");
   this. (int)placement = columnInput.next();
        
//issues because placement is a String, not sure how to get numberic 
    //input from the user 
    
//if it is greater then an option, show an error    
   
   if (placement > 5){   
        System.out.println("Invalid entry!");
            break; 
//break ends, but return will return a value & needs int instead of void
            }
    else if (placement < 0) {  
        System.out.println("Invalid entry!");
            break; //break ends, but return will return a value & needs int instead of void
            } 
    else if (placement == Nan) {
         System.out.println("Invalid entry!");
            break; //break ends, but return will return a value & needs int instead of void
            }  
    else {
//send the information to the gameBoard function. not sure how to do this.
            }
    
   */
    
    public GameBoard(){
        tokenGrid[0][0] = new Token();
        // tokenGrid[0][0].tokenColor = 3; test of invalid token color
        tokenGrid[0][1] = new Token();
        tokenGrid[0][2] = new Token();
        tokenGrid[0][3] = new Token();
        
        //output will go into gameboard
    }
    public void displayWelcome(){
        token.color();
        System.out.println(welcome); 
    }
    
    public int calculateWinLoss(int x, int y){
        
        if (x <0 || x > 4){
            System.out.println("Out of grid bounds.");
            return 0;
        }
        
         if (y <0 || y > 4){
            System.out.println("Out of grid bounds.");
            return 0;
        }
         
         Token insertedToken = tokenGrid[x][y];
         
         int insertedTokenColor = insertedToken.tokenColor;
         
         if (insertedTokenColor <1 || insertedTokenColor >2){
             System.out.println ("Invalid token color.");
             return 0;
         }
        
        double numberTokenRight = 0;
        
        double numberTokenLeft = 0;
        
        
        for(int i=0; i<3; i++){
            if(y+i+1 > 4){
                break;
            }
            Token a = tokenGrid[x][y+i+1];
            int tokenColor = a.tokenColor;
            
            if (insertedTokenColor == tokenColor){
                numberTokenRight += 1;  
            }
            else{
                break;
            }  
        }
        
        if((int)numberTokenRight == 3){
            if(insertedTokenColor == 1) {//player won
                System.out.println("\"Congrats, you have won the round!\"\n");
                return 1;
            }
            else{
                System.out.println("\"Sorry, you lost the round!\"\n");
                return 2; //computer won
            }
        }
        
        //check lefthand side
        for(int i=0; i<3; i++){
            if(y-i-1 < 0){
                break;
            }
            Token a = tokenGrid[x][y-i-1];
            int tokenColor = a.tokenColor;
            
            if (insertedTokenColor == tokenColor){
                numberTokenLeft += 1;  
            }
            else{
                break;
            }  
        }
        
        if(numberTokenRight + numberTokenLeft == 3){
            if(insertedTokenColor == 1){ //player won
                System.out.println("\"Congrats, you have won the round!\"\n");
                return 1;
            }
            else {
                System.out.println("\"Sorry, you lost the round!\" \n");
                return 2; //computer won
            }
        }
        return 0;//default, no one has won yet
    }
    
}
