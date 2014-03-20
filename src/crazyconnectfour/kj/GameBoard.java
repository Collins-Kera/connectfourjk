package crazyconnectfour.kj;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kera and Jeanette
 */
public class GameBoard implements Serializable{
    
    SuperToken[][] tokenGrid = new SuperToken [6][6]; //0,0 is the bottom left hand corner 0,1 is moving to the right & 1,0 is moving up
    private static int boardSize = 6;

    public SuperToken[][] getTokenGrid() {
        return tokenGrid;
    }

    public void setTokenGrid(TokenB[][] tokenGrid) {
        this.tokenGrid = tokenGrid;
    }

    public static int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public FourConnectingTokenCheck getCalculateWinLoss() {
        return calculateWinLoss;
    }

    public void setCalculateWinLoss(FourConnectingTokenCheck calculateWinLoss) {
        this.calculateWinLoss = calculateWinLoss;
    }
    
    FourConnectingTokenCheck calculateWinLoss = new FourConnectingTokenCheck();
    
    public class FourConnectingTokenCheck {
    
    
    public int calculateWinLoss(int x, int y){
        
        if (x <0 || x > 5){
            System.out.println("Out of grid bounds.");
            return 0;
        }
        
         if (y <0 || y > 5){
            System.out.println("Out of grid bounds.");
            return 0;
        }
        
         
         SuperToken insertedToken = tokenGrid[x][y];
         
         int insertedTokenColor = insertedToken.gettokenColor();
         
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
            SuperToken a = tokenGrid[x][y+i+1];
            if (a == null) {
                 break;
             }
            int tokenColor = a.gettokenColor();
            
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
            SuperToken a = tokenGrid[x][y-i-1];
            if (a == null) {
                 break;
             }
            int tokenColor = a.gettokenColor();
            
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
            SuperToken a = tokenGrid[x+i+1][y];
            if (a == null) {
                 break;
             }
            int tokenColor = a.gettokenColor();
            
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
            SuperToken a = tokenGrid[x-i-1][y];
            if (a == null) {
                 break;
             }
            int tokenColor = a.gettokenColor();
            
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

   
public int enterTokens () {  
   
    String placement = "0";
    boolean x = true;
    
    //this function will ask player for column they want to drop token in
    //and then drop it in that spot.
    
    while(x){ 
       //ask player where they want to play and get column input from them  
       Player input = new Player();
       placement=input.playToken();
            
       if ("Q".equals(placement) || "q".equals(placement)) {
                return 5;
       }
       
       try{
        //if it is greater then an option, show an error     
        if (Integer.parseInt(placement)>boardSize){   
            System.out.println("Invalid entry!");
                continue; 
                }
        else if (Integer.parseInt(placement)< 1) {  
            System.out.println("Invalid entry!");
                continue; 
                } 
        else {
           x = false;
             }  
       } catch(NumberFormatException ex)
            {
                System.out.println("Invalid entry!");
                continue;
            }
       if (tokenGrid[5][Integer.parseInt(placement)-1] != null){
           System.out.println("This column is full. Try again.");
           continue;
       }
    }
    
    int xInserted = 0;
    int yInserted = 0;
    //place token in desired column
    for(int i=0;i<tokenGrid.length;i++){
       //starting from the bottom check each place in column to see if token
        //there. If there is a token move to next spot until an empty one is found.
        //Place token in the empty spot.
        SuperToken location = tokenGrid[i][Integer.parseInt(placement)-1];
        if(location == null) {
            TokenB blueToken = new TokenB();
            blueToken.settokenColor(1);
           tokenGrid[i][Integer.parseInt(placement)-1] = blueToken;
           xInserted = i;
           yInserted = Integer.parseInt(placement)-1;
           break;
        }
    } 
    int win = calculateWinLoss.calculateWinLoss(xInserted, yInserted);
    
    return win;
}


 public int computerPlay() {
     int x;
     String placement;
     
     while(true) {
       Computer input = new Computer();
       placement=input.playToken();
       x = Integer.parseInt(placement);
        if (tokenGrid[5][x] == null){
            break;
         }
     } 
     int xInserted = 0;
     int yInserted = 0;
     for(int i=0;i<tokenGrid.length;i++){
       //starting from the bottom check each place in column to see if token
        //there. If there is a token move to next spot until an empty one is found.
        //Place token in the empty spot.
        SuperToken location = tokenGrid[i][x];
        if(location == null) {
            TokenR redToken = new TokenR();
            redToken.settokenColor(2);
           tokenGrid[i][x] = redToken;
           xInserted = i;
           yInserted = x;
           break;
        }
    }
     
     int win = calculateWinLoss.calculateWinLoss(xInserted, yInserted);
    
     return win;
 }
   
}
