/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.io.Serializable;

/**
 *
 * @author Kera
 */
public class TokenB extends SuperToken {
    
     public TokenB() {
        super(1);
   
    }
    
     @Override
      public String getTokenColorLetter() {
          //1 = blue , 2 = red
          return "B";
      } 
}



/*
//original code on week 9
public class TokenB implements Serializable{
    private int tokenColor = 1; //1 = Blue 2 = Red

    public TokenB() {
    }

    public int getTokenColor() {
        return tokenColor;
    }

    public void setTokenColor(int tokenColor) {
        this.tokenColor = tokenColor;
    }
    
    public String getTokenColorLetter() {
        if(tokenColor==1)
            return "B";
        else
            return "R" ;
    }
}
*/