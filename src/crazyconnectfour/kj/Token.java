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


//move into the Player class, and connect with OptionsMenuControl
public class Token implements Serializable{
    public int tokenColor = 1; //1 = Blue 2 = Red

    public Token() {
    }

public String TokenColor () {
    if(tokenColor==1)
        return "B";
    else
        return "R" ;
}
}
