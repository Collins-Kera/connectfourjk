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
    Token[][] tokenGrid = new Token[6][6]; //0,0 is the bottom left hand corner 0,1 is moving to the right & 1,0 is moving up
    
    Token token = new Token();
    
    int rowCount = 0;
    int columnCount = 0;
    
    /**
     *
     */
 public int getBoardSize() {

        Scanner inFile = new Scanner(System.in); // get input file      
        String boardSize;
        
        // prompt the user for the gamboard size
        while (true) {
            // prompt user for gameboard size
            System.out.println("\n\n\tAll gameboards are squares: 4x4, 6x6, & 8x8."
                + "Enter the size square you want. (4, 6, or 8)");
            
            // get the value entered by the user 
            boardSize = inFile.nextLine(); 
            
            // trim off all extra blanks from the input
            boardSize = boardSize.trim();  
            
            // replace any commas enter with blanks
            boardSize = boardSize.replace(',', ' '); 
            
            if (Integer.parseInt(boardSize) == 4) { // value entered 4x4
                this.rowCount = 4;
                this.columnCount = 4;
                System.out.println("\n\n\tThe board size you have selected is 4x4.");
                return 4;
            }    
            else if (Integer.parseInt(boardSize) == 6) { // value entered 6x6
                this.rowCount = 6;
                this.columnCount = 6;
                System.out.println("\n\n\tThe board size you have selected is 6x6.");
                return 6;
            }    
            else if (Integer.parseInt(boardSize) == 8) { // value entered 8x8
                System.out.println("\n\n\tThe board size you have selected is 8x8.");
                this.rowCount = 8;
                this.columnCount = 8;
                return 8;
            }  

            else { // wrong number of values entered.
                    new CrazyConnectFourError().displayError(
                        "You must enter either 4, 6, or 8 for it to be valid.");
                    continue;
                }
            }   
    }

public void enterTokens () {    
    String placement = "0";
    boolean x = true;
    
    //this function will ask player for column they want to drop token in
    //and then drop it in that spot.
    while(x){ 
       //ask player where they want to play and get column input from them  
       Scanner columnInput = new Scanner(System.in);
       System.out.println("Type in the column where you want to play " + "(1-" + columnCount + ")");
       placement = columnInput.next();
       
       try{
        //if it is greater then an option, show an error     
        if (Integer.parseInt(placement)>columnCount){   
            System.out.println("Invalid entry!");
                break; 
                }
        else if (Integer.parseInt(placement)< 1) {  
            System.out.println("Invalid entry!");
                break; 
                } 
        else {
           x = false;
             }  
       } catch(NumberFormatException ex)
            {
                System.out.println("Invalid entry!");
            }
    }
    
    //place token in desired column
    int i=0;
    for(Token location : tokenGrid [Integer.parseInt(placement)-1]){
       //starting from the bottom check each place in column to see if token
        //there. If there is a token move to next spot until an empty one is found.
        //Place token in the empty spot.
        if(location == null) {
            Token blueToken = new Token();
            blueToken.tokenColor = 1;
           tokenGrid[Integer.parseInt(placement)-1] [i] = blueToken;
           break;
        }
        i++;
    }
}

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
