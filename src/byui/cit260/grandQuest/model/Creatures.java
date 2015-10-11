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
    private String robbers;
    private String giantSpiders;
    private String wildBoars;
    private String poisonousMushrooms;
    private String dragon;

    public Creatures() {
    }
    
    

    public String getMonsters() {
        return monsters;
    }

    public void setMonsters(String monsters) {
        this.monsters = monsters;
    }

    public String getRobbers() {
        return robbers;
    }

    public void setRobbers(String robbers) {
        this.robbers = robbers;
    }

    public String getGiantSpiders() {
        return giantSpiders;
    }

    public void setGiantSpiders(String giantSpiders) {
        this.giantSpiders = giantSpiders;
    }

    public String getWildBoars() {
        return wildBoars;
    }

    public void setWildBoars(String wildBoars) {
        this.wildBoars = wildBoars;
    }

    public String getPoisonousMushrooms() {
        return poisonousMushrooms;
    }

    public void setPoisonousMushrooms(String poisonousMushrooms) {
        this.poisonousMushrooms = poisonousMushrooms;
    }

    public String getDragon() {
        return dragon;
    }

    public void setDragon(String dragon) {
        this.dragon = dragon;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.monsters);
        hash = 37 * hash + Objects.hashCode(this.robbers);
        hash = 37 * hash + Objects.hashCode(this.giantSpiders);
        hash = 37 * hash + Objects.hashCode(this.wildBoars);
        hash = 37 * hash + Objects.hashCode(this.poisonousMushrooms);
        hash = 37 * hash + Objects.hashCode(this.dragon);
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
        if (!Objects.equals(this.robbers, other.robbers)) {
            return false;
        }
        if (!Objects.equals(this.giantSpiders, other.giantSpiders)) {
            return false;
        }
        if (!Objects.equals(this.wildBoars, other.wildBoars)) {
            return false;
        }
        if (!Objects.equals(this.poisonousMushrooms, other.poisonousMushrooms)) {
            return false;
        }
        if (!Objects.equals(this.dragon, other.dragon)) {
            return false;
        }
        return true;
    }
    
    
}
