/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author devin_000
 */
public class Game implements Serializable {
    
    //class instance variables
    private String gameDescription;
    private String gameType;

    public Game() {
    }
    
    

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.gameDescription);
        hash = 29 * hash + Objects.hashCode(this.gameType);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "gameDescription=" + gameDescription + ", gameType=" + gameType + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameDescription, other.gameDescription)) {
            return false;
        }
        if (!Objects.equals(this.gameType, other.gameType)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
