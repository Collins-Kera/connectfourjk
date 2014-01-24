/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Scanner;

/**
 *
 * @author Kera
 */
public class CrazyConnectFour {
    String name;
    String instructions = "This is game crazy connect four\n"
            +"This game you can play against the computer or another player.\n"
            +"To win this game you have to connect four token in a row before"
            +"your competitor!";
    public static void main(String[] args) {
        CrazyConnectFour myGame = new CrazyConnectFour();
        myGame.getName();
        myGame.displayHelp();
    }
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
       }
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
       }
public class Player{

}
public class Computer{
   
}
public class Board{
    
}
public class Scoreboard{
    
}
}