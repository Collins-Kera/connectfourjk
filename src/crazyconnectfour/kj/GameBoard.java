package crazyconnectfour.kj;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kera and Jeanette
 */
public class GameBoard {
    
    String welcome = "\tGet ready to start in 3,2,1...";
    Token[][] tokenGrid = new Token[6][6]; //0,0 is the bottom left hand corner 0,1 is moving to the right & 1,0 is moving up
    
    Token token = new Token();
    
    int boardSize = 6;
   
public int enterTokens () {  
   
    String placement = "0";
    boolean x = true;
    
    //this function will ask player for column they want to drop token in
    //and then drop it in that spot.
    
    while(x){ 
       //ask player where they want to play and get column input from them  
       Scanner columnInput = CrazyConnectFour.getInputFile();
       System.out.println("Type in the column where you want to play " + "(1-" + boardSize + ") or Q to quit.");
       placement = columnInput.next();
            
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
        Token location = tokenGrid[i][Integer.parseInt(placement)-1];
        if(location == null) {
            Token blueToken = new Token();
            blueToken.tokenColor = 1;
           tokenGrid[i][Integer.parseInt(placement)-1] = blueToken;
           xInserted = i;
           yInserted = Integer.parseInt(placement)-1;
           break;
        }
    } 
    //int win = this.calculateWinLoss(xInserted, yInserted);
    
    //return win;
}


 public int computerPlay() {
     int x;
     
     while(true) {
       x = new Random().nextInt(5);
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
        Token location = tokenGrid[i][x];
        if(location == null) {
            Token redToken = new Token();
            redToken.tokenColor = 2;
           tokenGrid[i][x] = redToken;
           xInserted = i;
           yInserted = x;
           break;
        }
    }
     
     //int win = this.calculateWinLoss(xInserted, yInserted);
    
     //return win;
 }
   
}
