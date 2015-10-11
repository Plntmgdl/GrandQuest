/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import java.util.Objects;

/**
 *
 * @author Jassen
 */
public class MonsterReaction implements Serializable{
    
    private String Reaction;
    private double robber;
    private double spider;
    private double mushroom;
    private double boar;
    private double dragn;

    public MonsterReaction() {
    }
    
    

    public String getReaction() {
        return Reaction;
    }

    public void setReaction(String Reaction) {
        this.Reaction = Reaction;
    }

    public double getRobber() {
        return robber;
    }

    public void setRobber(double robber) {
        this.robber = robber;
    }

    public double getSpider() {
        return spider;
    }

    public void setSpider(double spider) {
        this.spider = spider;
    }

    public double getMushroom() {
        return mushroom;
    }

    public void setMushroom(double mushroom) {
        this.mushroom = mushroom;
    }

    public double getBoar() {
        return boar;
    }

    public void setBoar(double boar) {
        this.boar = boar;
    }

    public double getDragn() {
        return dragn;
    }

    public void setDragn(double dragn) {
        this.dragn = dragn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Reaction);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.robber) ^ (Double.doubleToLongBits(this.robber) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.spider) ^ (Double.doubleToLongBits(this.spider) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.mushroom) ^ (Double.doubleToLongBits(this.mushroom) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.boar) ^ (Double.doubleToLongBits(this.boar) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.dragn) ^ (Double.doubleToLongBits(this.dragn) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "MonsterReaction{" + "Reaction=" + Reaction + ", robber=" + robber + ", spider=" + spider + ", mushroom=" + mushroom + ", boar=" + boar + ", dragn=" + dragn + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonsterReaction other = (MonsterReaction) obj;
        if (!Objects.equals(this.Reaction, other.Reaction)) {
            return false;
        }
        if (Double.doubleToLongBits(this.robber) != Double.doubleToLongBits(other.robber)) {
            return false;
        }
        if (Double.doubleToLongBits(this.spider) != Double.doubleToLongBits(other.spider)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mushroom) != Double.doubleToLongBits(other.mushroom)) {
            return false;
        }
        if (Double.doubleToLongBits(this.boar) != Double.doubleToLongBits(other.boar)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dragn) != Double.doubleToLongBits(other.dragn)) {
            return false;
        }
        return true;
    }
    
    
    
}
