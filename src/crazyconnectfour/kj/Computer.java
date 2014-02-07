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
public class Computer {
    String namecomp;
            
public void getLabel(){
        Scanner input = new Scanner(System.in);
        displayBorder();
        System.out.println("\nGive the computer a unique name: ");
        this.namecomp = input.next();
       }

public void displayLabel(){
        System.out.println("\nThe computer's name is " + this.namecomp + "\n");
        displayBorder();
       } 

//border like in help menu
    public void displayBorder() {       
        System.out.println(
        "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
