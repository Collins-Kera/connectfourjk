/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.models;

import kj.crazyconnectfour.enums.TokenColor;

/**
 *
 * @author Jeanette
 */
public abstract class SuperToken {
    //private and final or public?
    private TokenColor tokenColor;
    
    public SuperToken(TokenColor tokenColor) {
        this.tokenColor = tokenColor;
    }
    
     public TokenColor getTokenColor() {
        return tokenColor;
    }

    public TokenColor setTokenColor(TokenColor tokenColor) {
        this.tokenColor = tokenColor;
        return tokenColor;
    }
    
    //each class has to use this
    public abstract String getTokenColorLetter();
}
 