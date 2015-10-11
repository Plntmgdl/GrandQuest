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
public class Creatures implements Serializable{
    private String monsters;
    private double robbers;
    private double giantSpiders;
    private double wildBoars;
    private double poisonousMushrooms;
    private double dragon;

    public Creatures() {
    }
    
    

    public String getMonsters() {
        return monsters;
    }

    public void setMonsters(String monsters) {
        this.monsters = monsters;
    }

    public double getRobbers() {
        return robbers;
    }

    public void setRobbers(double robbers) {
        this.robbers = robbers;
    }

    public double getGiantSpiders() {
        return giantSpiders;
    }

    public void setGiantSpiders(double giantSpiders) {
        this.giantSpiders = giantSpiders;
    }

    public double getWildBoars() {
        return wildBoars;
    }

    public void setWildBoars(double wildBoars) {
        this.wildBoars = wildBoars;
    }

    public double getPoisonousMushrooms() {
        return poisonousMushrooms;
    }

    public void setPoisonousMushrooms(double poisonousMushrooms) {
        this.poisonousMushrooms = poisonousMushrooms;
    }

    public double getDragon() {
        return dragon;
    }

    public void setDragon(double dragon) {
        this.dragon = dragon;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.monsters);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.robbers) ^ (Double.doubleToLongBits(this.robbers) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.giantSpiders) ^ (Double.doubleToLongBits(this.giantSpiders) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.wildBoars) ^ (Double.doubleToLongBits(this.wildBoars) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.poisonousMushrooms) ^ (Double.doubleToLongBits(this.poisonousMushrooms) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.dragon) ^ (Double.doubleToLongBits(this.dragon) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Creatures{" + "monsters=" + monsters + ", robbers=" + robbers + ", giantSpiders=" + giantSpiders + ", wildBoars=" + wildBoars + ", poisonousMushrooms=" + poisonousMushrooms + ", dragon=" + dragon + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Creatures other = (Creatures) obj;
        if (!Objects.equals(this.monsters, other.monsters)) {
            return false;
        }
        if (Double.doubleToLongBits(this.robbers) != Double.doubleToLongBits(other.robbers)) {
            return false;
        }
        if (Double.doubleToLongBits(this.giantSpiders) != Double.doubleToLongBits(other.giantSpiders)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wildBoars) != Double.doubleToLongBits(other.wildBoars)) {
            return false;
        }
        if (Double.doubleToLongBits(this.poisonousMushrooms) != Double.doubleToLongBits(other.poisonousMushrooms)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dragon) != Double.doubleToLongBits(other.dragon)) {
            return false;
        }
        return true;
    }
    
    
    
}
