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
public class Token {
    int tokenColor = 1; //1 = Blue 2 = Red
    
public void color (){
        if(tokenColor==1)
            System.out.println("\tYou are blue.");
        else{
            System.out.println("\tYou are red.");
        }        
    } 

public String getTokenColor () {
    if(tokenColor==1)
        return "B";
    else
        return "R" ;
}
}
