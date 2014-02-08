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
        System.out.println();
        displayBorder(); 
        System.out.println("\tEnter your name: ");
        this.name = input.next();
       }
  
  public void displayName (){
    System.out.println("\tWelcome " + this.name + " you are player one");
    displayBorder();
  }
  //border like in help menu
    public void displayBorder() {       
        System.out.println(
        "\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}