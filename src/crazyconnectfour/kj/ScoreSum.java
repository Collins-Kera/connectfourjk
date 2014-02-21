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
public class ScoreSum {
    
    /**
     *
     * @return
     */
    public String[] playerOneScore() {
        
    int playerone[] = {1,0,0,1,0}; //will get from another function later
    int sum = 0;
    
    System.out.println("Player one had the following scores: ");
    
    for (int x: playerone) {
        System.out.println(x);
        sum += x;
       }
    
    System.out.println("Total score: " + sum);
        return null;
    
    }
    
    public String[] computerScore() {
        
    int comp[] = {0,1,1,0,1}; //will get from another function later
    int sum = 0;
    
    System.out.println("\nComputer had the following scores: ");
    
    for (int x: comp) {
        System.out.println(x);
        sum += x;
       }
    
    System.out.println("Total score: " + sum);
        return null;
    
    }
}
