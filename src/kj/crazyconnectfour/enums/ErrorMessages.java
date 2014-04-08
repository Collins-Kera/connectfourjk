/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.enums;

/**
 *
 * @author Jeanette
 */
public enum ErrorMessages {
    
    ERROR101 ("Invalid input"), //scoreboard 59 
    ERROR102 ("You must enter either 1, 2, 3 or 4 for your entry to be valid.\n"), //optionsmenucontrol 60
    ERROR103 ("Invalid command. Please enter a valid entry."); //menu ln 76 also controlling all menu view classes
    
   //a ton from getplayerlistview, gameboard
   

String message;
    
    ErrorMessages(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
}



    
    
