/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

/**
 *
 * @author Jeanette
 */
public class TokenR extends SuperToken {
    
     public TokenR() {
        super(2);

    }
    
     @Override
      public String getTokenColorLetter() {
          //1 = blue , 2 = red
          return "R";
      } 
}
