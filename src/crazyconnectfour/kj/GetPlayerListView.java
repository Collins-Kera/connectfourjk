/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

import java.util.Scanner;

/**
 *
 * @author Jeanette
 */
public class GetPlayerListView {

    public String[] listOfPlayerNames = new String[10];//sets up the array 
    
    public GetPlayerListView() {
        
    }
   
    public String[] getPlayerNameInput() {
        
        
        Scanner inFile = new Scanner(System.in);
        
        System.out.println("\n\t***************************************************************");
        System.out.println("\tEnter a list of names of any players who want to play Crazy "
                + "\n\tConnect Four. ");
        System.out.println("\n\t***************************************************************");
        
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10  && !done) { 
            System.out.println("\tPlease enter the name of a player "
                    + "or enter \"Q\" to quit.");
            String playersName;
            playersName = inFile.nextLine();
            playersName = playersName.trim();

            if (playersName.length() < 1) {
                new CrazyConnectFourError().displayError("A name must be at least "
                        + "one character long. "
                        + "\n\tTry again or enter \"Q\" to quit.");
                continue;
            }
            
            if (playersName.equals("Computer")) {
                new CrazyConnectFourError().displayError(
                        "This is a reserved name. You can not use it. "
                        + "\n\tTry again or enter \"Q\" to quit.");
                continue;
            }
            
            if (alreadyInList(listOfPlayerNames, playersName)) {
                new CrazyConnectFourError().displayError(
                        "That name has already been entered. "
                        + "\n\tTry again or enter \"Q\" to quit.");
                continue;
            }

            if (playersName.toUpperCase().equals("Q")) { // quit?
                done = true;
                break;
            } 
            
            // add name to list of player names
            this.listOfPlayerNames[playerIndex] = playersName;
            playerIndex++;

            
        }
        
        String[] newNameList = new String[playerIndex];
        for (int i = 0; i < playerIndex; i++) {
            newNameList[i] = this.listOfPlayerNames[i];          
        }
        

        newNameList = this.sortList(newNameList);
        this.displayNameList(newNameList); // display the list of names
        
        return newNameList;
    }
    
    public String[] sortList(String[] names) {
        String tmpName;
        int i,j;
        
            for (i = 0; i < names.length-1; i++) {
                
                for (j = i+1; j<names.length; j++) {
           
                    if ( names [ i ].compareToIgnoreCase( names [ j ] ) > 0 ) {
                        // swap names
                        tmpName = names[i];
                        names[i] = names[j];
                        names[j] = tmpName;
                   
                } 
            }
        }

        return names;
    }
    
    private boolean alreadyInList(String[] list, String value) {
        for (String valueInList : list) {
            if (value.equals(valueInList)) {
                return true;
            }           
        }
        return false;
    }
    
    
    
    public void displayNameList(String[] names) {
        System.out.println("\n\t***************************************************************");
        System.out.println("\tHere is the list of players in the game");

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
                
            int namePosition = i+1;
            System.out.println("\t   " + namePosition + "\t" + names[i]);
        }
        System.out.println("\n\t***************************************************************");
    }
    
    
}
