/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Random;

/**
 *
 * @author Kera
 */
public class Computer extends SuperPlayer {

    public Computer() {
        super();
        setName("Computer");
    }
    
    @Override
    public String playToken(){
       
       int x = new Random().nextInt(5);
       
       String placement = String.valueOf(x);
       return placement; 
    }
}