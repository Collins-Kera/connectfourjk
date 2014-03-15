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
public class Player extends SuperPlayer{

    public Player() {
        super();
        setName("Player");
    }
 
    @Override
    public String playToken(){
        String placement = "0";
        
        Scanner columnInput = CrazyConnectFour.getInputFile();
        System.out.println("Type in the column where you want to play " + "(1-" + GameBoard.getBoardSize() + ") or Q to quit.");
        placement = columnInput.next();
        return placement;
    }
}

