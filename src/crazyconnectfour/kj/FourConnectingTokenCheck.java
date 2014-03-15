/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.io.Serializable;

/**
 *
 * @author Jeanette and Kera
 */
public class FourConnectingTokenCheck implements Serializable{
    
    private static TokenB[][] tokenGrid = new TokenB[6][6];

    private static TokenB tokenColor = new TokenB();
    //GameBoard enterTokens = new GameBoard();

    
    public int calculateWinLoss(int x, int y){
        
        if (x <0 || x > 5){
            System.out.println("Out of grid bounds.");
            return 0;
        }
        
         if (y <0 || y > 5){
            System.out.println("Out of grid bounds.");
            return 0;
        }
        
         
         TokenB insertedToken = tokenGrid[x][y];
         
         int insertedTokenColor = insertedToken.getTokenColor();
         
         if (insertedTokenColor <1 || insertedTokenColor >2){
             System.out.println ("Invalid token color.");
             return 0;
         }
        //checks horizontally
        double numberTokenRight = 0;
        
        double numberTokenLeft = 0;
        
        
        for(int i=0; i<3; i++){
            if(y+i+1 > 4){
                break;
            }
            TokenB a = tokenGrid[x][y+i+1];
            if (a == null) {
                 break;
             }
            int tokenColor = a.getTokenColor();
            
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
            TokenB a = tokenGrid[x][y-i-1];
            if (a == null) {
                 break;
             }
            int tokenColor = a.getTokenColor();
            
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
        
        //checks vertically
        double numberTokenUp = 0;
        
        double numberTokenDown = 0;
        
        //checks up
        for(int i=0; i<3; i++){
            if(x+i+1 > 4){
                break;
            }
            TokenB a = tokenGrid[x+i+1][y];
            if (a == null) {
                 break;
             }
            int tokenColor = a.getTokenColor();
            
            if (insertedTokenColor == tokenColor){
                numberTokenUp += 1;  
            }
            else{
                break;
            }  
        }
        
        if((int)numberTokenUp == 3){
            if(insertedTokenColor == 1) {//player won
                System.out.println("\"Congrats, you have won the round!\"\n");
                return 1;
            }
            else{
                System.out.println("\"Sorry, you lost the round!\"\n");
                return 2; //computer won
            }
        }
        
        //check down
        for(int i=0; i<3; i++){
            if(x-i-1 < 0){
                break;
            }
            TokenB a = tokenGrid[x-i-1][y];
            if (a == null) {
                 break;
             }
            int tokenColor = a.getTokenColor();
            
            if (insertedTokenColor == tokenColor){
                numberTokenDown += 1;  
            }
            else{
                break;
            }  
        }
        
        if(numberTokenUp + numberTokenDown == 3){
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
