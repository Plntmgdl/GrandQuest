/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;


import java.io.Serializable;

/**
 *
 * @author devin_000
 */
public enum SceneType implements Serializable{
    start,
    village,
    marketplace,
    tavern,
    inn,
    bathtub,
    road,
    bridge,
    forest,
    finish;

//    private final String description;
//    private final Point coordinates;
//    
//    SceneType(String description) {
//        this.description = description;
//        coordinates = new Point(1,1);
//    }
//    
//    public String getDescription() {
//        return description;
//    }    
//    public Point getCoordinates() {
//        return coordinates;
//    }
}
  
