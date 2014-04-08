/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.models;

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
