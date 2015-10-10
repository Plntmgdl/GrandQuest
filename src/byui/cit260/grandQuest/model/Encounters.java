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
public class Encounters implements Serializable{
    
    private String monster;
    private double robbers;
    private double mushrooms;
    private double wildBoar;
    private double giantSpider;
    private double dragon;

    public Encounters() {
    }
    
    

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public double getRobbers() {
        return robbers;
    }

    public void setRobbers(double robbers) {
        this.robbers = robbers;
    }

    public double getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(double mushrooms) {
        this.mushrooms = mushrooms;
    }

    public double getWildBoar() {
        return wildBoar;
    }

    public void setWildBoar(double wildBoar) {
        this.wildBoar = wildBoar;
    }

    public double getGiantSpider() {
        return giantSpider;
    }

    public void setGiantSpider(double giantSpider) {
        this.giantSpider = giantSpider;
    }

    public double getDragon() {
        return dragon;
    }

    public void setDragon(double dragon) {
        this.dragon = dragon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.monster);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.robbers) ^ (Double.doubleToLongBits(this.robbers) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.mushrooms) ^ (Double.doubleToLongBits(this.mushrooms) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.wildBoar) ^ (Double.doubleToLongBits(this.wildBoar) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.giantSpider) ^ (Double.doubleToLongBits(this.giantSpider) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.dragon) ^ (Double.doubleToLongBits(this.dragon) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Encounters{" + "monster=" + monster + ", robbers=" + robbers + ", mushrooms=" + mushrooms + ", wildBoar=" + wildBoar + ", giantSpider=" + giantSpider + ", dragon=" + dragon + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Encounters other = (Encounters) obj;
        if (!Objects.equals(this.monster, other.monster)) {
            return false;
        }
        if (Double.doubleToLongBits(this.robbers) != Double.doubleToLongBits(other.robbers)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mushrooms) != Double.doubleToLongBits(other.mushrooms)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wildBoar) != Double.doubleToLongBits(other.wildBoar)) {
            return false;
        }
        if (Double.doubleToLongBits(this.giantSpider) != Double.doubleToLongBits(other.giantSpider)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dragon) != Double.doubleToLongBits(other.dragon)) {
            return false;
        }
        return true;
    }

   
}
