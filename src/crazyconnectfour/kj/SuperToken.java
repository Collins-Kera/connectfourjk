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
public abstract class SuperToken {
    //private and final or public?
    public int tokenColor;
    
    public SuperToken(int tokenColor) {
    }
    
     public int gettokenColor() {
        return tokenColor;
    }

    public int settokenColor(int tokenColor) {
        this.tokenColor = tokenColor;
        return tokenColor;
    }
    
    //each class has to use this
    public abstract String getTokenColorLetter();
}
 