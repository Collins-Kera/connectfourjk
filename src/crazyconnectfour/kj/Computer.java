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
        System.out.println("Give the computer a unique name ");
        this.namecomp = input.next();
       }

public void displayLabel(){
        System.out.println("\nThe computers name is " + this.namecomp + "\n");
       }  
}
