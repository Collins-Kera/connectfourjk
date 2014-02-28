/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnectfour.kj;

/**
 *
 * @author Kera
 */
public class BoardView {
    
    GameBoard board;
    
    public void displayBoard(GameBoard board) {
        this.board = board;
        
        this.printHeadRow(); // row dividers
        this.printDividerRow(); // column dividers
        
        // for all rows
        for (int i = this.board.boardSize-1; i >=0 ; i--) {
            // get the list of columns locations in the row
            Token[] rowOfLocations = this.board.tokenGrid[i];
            
            // print the contents of each location in the row
            this.printRow(rowOfLocations); 
            
            this.printDividerRow();// print the ending divider for the row
        }
        
        System.out.println(); // print blank line after the board
    }

    private void printHeadRow() {

        // print the first column in the header row
        System.out.print("\n\t      1   ");
        
        // print remaining header cells in row between the first and last column
        int columnsInRow = this.board.boardSize;
        for (int i = 1; i < columnsInRow - 1; i++) {
            int col = i + 1;
            System.out.print("  " + col + "   ");
        }
        // print the header for the last column in the header
        System.out.print(" " + columnsInRow + "   ");
    }

    private void printDividerRow() {

        // print the divider for the first column in the row
        System.out.print("\n\t  |------");
        
        int columnsInRow = this.board.boardSize;
        // print remaining divider for each column between the first and last
        for (int i = 1; i < columnsInRow - 1; i++) {
            System.out.print("------");
        }
        // print the row divider for the last column in the row
        System.out.print("-----|");
    }

    private void printRow(Token[] rowLocations) {
        
        // print contents of first column in the row
        String letter = " ";
        if (rowLocations[0] != null) {
            letter = rowLocations[0].getTokenColor();
        }
        System.out.print("\n\t" + "  |  " + letter + "  |");

        // print the contents of the rest of the columns in the row 
        for (int i = 1; i < rowLocations.length; i++) {
            if (rowLocations[i] == null) {
                letter = " ";
            } else {
                letter = rowLocations[i].getTokenColor();
            }
            
            System.out.print("  " + letter + "  |");
        }
    }
}
