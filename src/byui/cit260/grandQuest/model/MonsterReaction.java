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
public class MonsterReaction implements Serializable{
    
    private String Reaction;
    private String robber;
    private String spider;
    private String mushroom;
    private String boar;
    private String dragn;

    public MonsterReaction() {
    }
    
    

    public String getReaction() {
        return Reaction;
    }

    public void setReaction(String Reaction) {
        this.Reaction = Reaction;
    }

    public String getRobber() {
        return robber;
    }

    public void setRobber(String robber) {
        this.robber = robber;
    }

    public String getSpider() {
        return spider;
    }

    public void setSpider(String spider) {
        this.spider = spider;
    }

    public String getMushroom() {
        return mushroom;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }

    public String getBoar() {
        return boar;
    }

    public void setBoar(String boar) {
        this.boar = boar;
    }

    public String getDragn() {
        return dragn;
    }

    public void setDragn(String dragn) {
        this.dragn = dragn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Reaction);
        hash = 97 * hash + Objects.hashCode(this.robber);
        hash = 97 * hash + Objects.hashCode(this.spider);
        hash = 97 * hash + Objects.hashCode(this.mushroom);
        hash = 97 * hash + Objects.hashCode(this.boar);
        hash = 97 * hash + Objects.hashCode(this.dragn);
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
        if (!Objects.equals(this.robber, other.robber)) {
            return false;
        }
        if (!Objects.equals(this.spider, other.spider)) {
            return false;
        }
        if (!Objects.equals(this.mushroom, other.mushroom)) {
            return false;
        }
        if (!Objects.equals(this.boar, other.boar)) {
            return false;
        }
        if (!Objects.equals(this.dragn, other.dragn)) {
            return false;
        }
        return true;
    }
    public class EncounterResults implements Serializable{
    
    private String eulogy;
    private String nothing;

    public EncounterResults() {
    }
    
    

    public String getEulogy() {
        return eulogy;
    }

    public void setEulogy(String eulogy) {
        this.eulogy = eulogy;
    }

    public String getNothing() {
        return nothing;
    }

    public void setNothing(String nothing) {
        this.nothing = nothing;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.eulogy);
        hash = 59 * hash + Objects.hashCode(this.nothing);
        return hash;
    }

    @Override
    public String toString() {
        return "EncounterResults{" + "eulogy=" + eulogy + ", nothing=" + nothing + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EncounterResults other = (EncounterResults) obj;
        if (!Objects.equals(this.eulogy, other.eulogy)) {
            return false;
        }
        if (!Objects.equals(this.nothing, other.nothing)) {
            return false;
        }
        return true;
    }
    
    
}

}