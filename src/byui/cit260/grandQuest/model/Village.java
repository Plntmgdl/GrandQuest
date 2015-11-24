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
 * @author Jassen
 */
public class Village implements Serializable {
    
    private String villageDescription;
    private String startingPoint;

    public Village() {
    }
    
    

    public String getVillageDescription() {
        return villageDescription;
    }

    public void setVillageDescription(String villageDescription) {
        this.villageDescription = villageDescription;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.villageDescription);
        hash = 61 * hash + Objects.hashCode(this.startingPoint);
        return hash;
    }

    @Override
    public String toString() {
        return "Village{" + "villageDescription=" + villageDescription + ", startingPoint=" + startingPoint + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Village other = (Village) obj;
        if (!Objects.equals(this.villageDescription, other.villageDescription)) {
            return false;
        }
        if (!Objects.equals(this.startingPoint, other.startingPoint)) {
            return false;
        }
        return true;
    }
    
 public class MarketPlace implements Serializable {
    
    //class instance variables
    private String marketPlaceDescription;
    private String items;

    public MarketPlace() {
    }
    
    

    public String getMarketPlaceDescription() {
        return marketPlaceDescription;
    }

    public void setMarketPlaceDescription(String marketPlaceDescription) {
        this.marketPlaceDescription = marketPlaceDescription;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.marketPlaceDescription);
        hash = 29 * hash + Objects.hashCode(this.items);
        return hash;
    }

    @Override
    public String toString() {
        return "MarketPlace{" + "marketPlaceDescription=" + marketPlaceDescription + ", items=" + items + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MarketPlace other = (MarketPlace) obj;
        if (!Objects.equals(this.marketPlaceDescription, other.marketPlaceDescription)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
  public class Inn implements Serializable {
    
    //class instance variables
    private String innDescription;
    private String playerChoice;
    private String returnToStart;

    public Inn() {
    }
    
    

    public String getInnDescription() {
        return innDescription;
    }

    public void setInnDescription(String innDescription) {
        this.innDescription = innDescription;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getReturnToStart() {
        return returnToStart;
    }

    public void setReturnToStart(String returnToStart) {
        this.returnToStart = returnToStart;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.innDescription);
        hash = 67 * hash + Objects.hashCode(this.playerChoice);
        hash = 67 * hash + Objects.hashCode(this.returnToStart);
        return hash;
    }

    @Override
    public String toString() {
        return "Inn{" + "innDescription=" + innDescription + ", playerChoice=" + playerChoice + ", returnToStart=" + returnToStart + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inn other = (Inn) obj;
        if (!Objects.equals(this.innDescription, other.innDescription)) {
            return false;
        }
        if (!Objects.equals(this.playerChoice, other.playerChoice)) {
            return false;
        }
        if (!Objects.equals(this.returnToStart, other.returnToStart)) {
            return false;
        }
        return true;
    }
    
  public class Bathtub implements Serializable {
    
    //class instance variables
    private String bathtubDescription;
    private String mathEquationT;
    private String playerSolution;

    public Bathtub() {
    }
    
    

    public String getBathtubDescription() {
        return bathtubDescription;
    }

    public void setBathtubDescription(String bathtubDescription) {
        this.bathtubDescription = bathtubDescription;
    }

    public String getMathEquationT() {
        return mathEquationT;
    }

    public void setMathEquationT(String mathEquationT) {
        this.mathEquationT = mathEquationT;
    }

    public String getPlayerSolution() {
        return playerSolution;
    }

    public void setPlayerSolution(String playerSolution) {
        this.playerSolution = playerSolution;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.bathtubDescription);
        hash = 79 * hash + Objects.hashCode(this.mathEquationT);
        return hash;
    }

    @Override
    public String toString() {
        return "Bathtub{" + "bathtubDescription=" + bathtubDescription + ", mathEquationT=" + mathEquationT + ", playerSolution=" + playerSolution + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bathtub other = (Bathtub) obj;
        if (!Objects.equals(this.bathtubDescription, other.bathtubDescription)) {
            return false;
        }
        if (!Objects.equals(this.mathEquationT, other.mathEquationT)) {
            return false;
        }
        if (!Objects.equals(this.playerSolution, other.playerSolution)) {
            return false;
        }
        return true;
    }
    
  }
    
    
} 
 public class Tavern implements Serializable {
    
    //class instance variables
    private String tavernDescription;
    private String princeRequest;
    private String playerChoice;

    public Tavern() {
    }
    
    

    public String getTavernDescription() {
        return tavernDescription;
    }

    public void setTavernDescription(String tavernDescription) {
        this.tavernDescription = tavernDescription;
    }

    public String getPrinceRequest() {
        return princeRequest;
    }

    public void setPrinceRequest(String princeRequest) {
        this.princeRequest = princeRequest;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tavernDescription);
        hash = 53 * hash + Objects.hashCode(this.princeRequest);
        hash = 53 * hash + Objects.hashCode(this.playerChoice);
        return hash;
    }

    @Override
    public String toString() {
        return "Tavern{" + "tavernDescription=" + tavernDescription + ", princeRequest=" + princeRequest + ", playerChoice=" + playerChoice + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tavern other = (Tavern) obj;
        if (!Objects.equals(this.tavernDescription, other.tavernDescription)) {
            return false;
        }
        if (!Objects.equals(this.princeRequest, other.princeRequest)) {
            return false;
        }
        if (!Objects.equals(this.playerChoice, other.playerChoice)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
   
}
