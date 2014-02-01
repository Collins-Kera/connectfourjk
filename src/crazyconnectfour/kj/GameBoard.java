/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

/**
 *
 * @author Kera
 */
public class GameBoard {
    String welcome = "Get ready to start in 3,2,1...";
    Token[][] tokenGrid = new Token[5][5]; //0,0 is the bottom left hand corner 0,1 is moving to the right & 1,0 is moving up
    
    Token token = new Token();
  
    public GameBoard()
    {
        tokenGrid[0][0] = new Token();
        // tokenGrid[0][0].tokenColor = 3; test of invalid token color
        tokenGrid[0][1] = new Token();
        tokenGrid[0][2] = new Token();
        tokenGrid[0][3] = new Token();
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
                System.out.println("Congrats, you have won the round!\n");
                return 1;
            }
            else{
                System.out.println("Sorry, you lost the round! \n");
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
                System.out.println("Congrats, you have won the round!\n");
                return 1;
            }
            else {
                System.out.println("Sorry, you lost the round! \n");
                return 2; //computer won
            }
        }
        return 0;//default, no one has won yet
    }
    
}
