/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.models;

import kj.crazyconnectfour.models.SuperToken;
import java.io.Serializable;
import kj.crazyconnectfour.enums.TokenColor;
import kj.crazyconnectfour.interfaces.TokenLetter;

/**
 *
 * @author Kera
 */
public class TokenB extends SuperToken implements TokenLetter {
    
     public TokenB() {
        super(TokenColor.BLUE);
   
    }
    
     @Override
      public String getTokenColorLetter() {
          //1 = blue , 2 = red
          return "B";
      } 
}



/*
//original code on week 9
public class Token implements Serializable{
    private int tokenColor = 1; //1 = Blue 2 = Red

    public Token() {
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