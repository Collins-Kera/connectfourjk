/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.models;

import kj.crazyconnectfour.models.SuperToken;
import kj.crazyconnectfour.enums.TokenColor;

/**
 *
 * @author Jeanette
 */
public class TokenR extends SuperToken {
    
     public TokenR() {
        super(TokenColor.RED);

    }
    
     @Override
      public String getTokenColorLetter() {
          //1 = blue , 2 = red
          return "R";
      } 
}
