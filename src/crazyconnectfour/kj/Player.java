package crazyconnectfour.kj;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeanette
 */
public class Player {
    String name;
    
  public void getName(){
        Scanner input = new Scanner(System.in);
        //two lines to make similar to the help menu style. take out border if doesn't work
        System.out.println();
        displayBorder(); 
        System.out.println("\nEnter your name: ");
        this.name = input.next();
       }
  
  public void displayName (){
    System.out.println("\nWelcome " + this.name + " you are player one\n");
    displayBorder();
  }
  //border like in help menu
    public void displayBorder() {       
        System.out.println(
        "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}