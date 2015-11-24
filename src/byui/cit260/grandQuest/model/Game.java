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
    private Player player;
    private InventoryItem[] inventory;
    private Wagon wagon;
    private Map map;
    
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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
