/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import byui.cit260.grandQuest.control.GameControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author devin_000
 */
public class Map implements Serializable {

    
    
    //class instance variables
    private int rowCount;
    private int columnCount;
    private String displayMap;
    private Location[][] locations;
    private int noOfRows;
    private int noOfColumns;

    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
           System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                // create and initialize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the location object to the current position in array
                locations[row][column] = location;
            }
        }
    }
    public static Map createMap() {
        // create the map
        Map map = new Map(10, 10); 
        // create the scenes for the game
        //Scene[] scenes = Scene.createScenes();
        // assign scenes to locations
        return map;
    }  

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public String getDisplayMap() {
        return displayMap;
    }

    public void setDisplayMap(String displayMap) {
        this.displayMap = displayMap;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.rowCount);
        hash = 47 * hash + Objects.hashCode(this.columnCount);
        hash = 47 * hash + Objects.hashCode(this.displayMap);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", displayMap=" + displayMap + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.displayMap, other.displayMap)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
