/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

/**
 *
 * @author Kera
 */


//move into the Player class, and connect with OptionsMenuControl
public class Token{
    public int tokenColor = 1; //1 = Blue 2 = Red

public String getTokenColor () {
    if(tokenColor==1)
        return "B";
    else
        return "R" ;
}
}
