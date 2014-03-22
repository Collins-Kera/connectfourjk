/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kj.crazyconnectfour.models;

import kj.crazyconnectfour.interfaces.PlayToken;

/**
 *
 * @author Kera
 */
public abstract class SuperPlayer implements PlayToken{
    
    private String name = "";

    public SuperPlayer() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      // This is an abstract function. It specifies that all sub-classes must
    // implement this function.
    @Override
    public abstract String playToken();
}

