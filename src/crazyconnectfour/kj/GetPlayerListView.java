package crazyconnectfour.kj;

import java.util.Scanner;

/**
 *
 * @author Jeanette and Kera
 */
public class GetPlayerListView {

    //sets up the array 
    public Player[] listofPlayers = new Player[10];
    
    public GetPlayerListView() {
        
    }
   
    public String[] getPlayerNameInput() {
        
        
        Scanner inFile = new Scanner(System.in);
        
        System.out.println("\n\t***************************************************************");
        System.out.println("\tEnter a list of names of any players who want to play Crazy "
                + "\n\tConnect Four. You will be able to choose from the list who is going to"
                + "\n\t play first");
        System.out.println("\n\t***************************************************************");
        
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10  && !done) { 
            System.out.println("\tPlease enter the name of a player who is going "
                    + "to play first or enter \"Q\" to quit.");
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
                            
            if (alreadyInList(listofPlayers, playersName)) {
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
            listofPlayers[playerIndex]= new Player();
            this.listofPlayers[playerIndex].name = playersName;
            playerIndex++;

            
        }
        
        String[] newNameList = new String[playerIndex];
        for (int i = 0; i < playerIndex; i++) {
            newNameList[i] = this.listofPlayers[i].name;          
        }
        

        newNameList = this.sortList(newNameList);
        this.displayNameList(newNameList); // display the list of names
        
        return newNameList;
    }
    
    private String[] sortList(String[] names) {
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
    
    private boolean alreadyInList(Player[] list, String value) {
        for (Player valueInList : list) {
            if(valueInList != null) {
               if (value.equals(valueInList.name)) {
                return true;
            } 
            }          
        }
        return false;
    }
    
    
    private void displayNameList(String[] names) {
        System.out.println("\n\t***************************************************************");
        System.out.println("\tHere is the list of players in the game: ");

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
                
            int namePosition = i+1;
            System.out.println("\t   " + namePosition + "\t" + names[i]);
        }
        System.out.println("\n\tIf you want to choose what color of token you are"
                + "\n\tthen check out the option menu.");
        System.out.println("\t***************************************************************");
    }
    
    public String pickPlayerName(){
        String selectedPlayerNames;
        
            System.out.println("\tPlease enter the number of the person who wants to play first.");
            
            // get players name
            selectedPlayerNames = this.getName(listofPlayers);
            if (selectedPlayerNames ==  null) {
                return null;
            }
           
            System.out.println("\n\t"+selectedPlayerNames + " is going to play first."); 
             
        return selectedPlayerNames;
        
    }

    private String getName(Player[] nameList) {

        Scanner inFile = new Scanner(System.in);
        String name = null;
        boolean valid = false;
        do {
            String strNumber = inFile.nextLine();
            
            if (strNumber.length() < 1) { // was a value entered ?
                new CrazyConnectFourError().displayError("You must enter a name or enter a \"Q\" to quit. Try again.");
                continue;
            }
            
            strNumber = strNumber.trim(); // trim off all blanks from front and back    
            strNumber = strNumber.substring(0, 1); // get only the first character
            
            if (strNumber.toUpperCase().equals("Q")) { // quit?
                return null;
            }
                       
            if (!strNumber.matches("[0-9]+")) { // is the value entered a number?
                new CrazyConnectFourError().displayError("You must enter a number in the list. Try again.");
                continue;
            }
            
            int numberSelected = Integer.parseInt(strNumber); // convert string to integer
            
            // is the number outside the range of the list of names
            if (numberSelected < 1  ||  numberSelected > nameList.length) {
                new CrazyConnectFourError().displayError(
                        "You must enter a number from the list. Try again.");
                continue;
            }
            
            name = nameList[numberSelected-1].name; // get the name from the list
            
            valid = true; // names selected successfully
      
        } while (!valid);
        
        return name;
    }
    
}
