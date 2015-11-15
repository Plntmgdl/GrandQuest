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
public class Menu implements Serializable {
    
    //class instance variables
    private String help;
    private String map;
    private String restart;
    private String doOver;

    public Menu() {
    }
    
    

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getRestart() {
        return restart;
    }

    public void setRestart(String restart) {
        this.restart = restart;
    }

    public String getDoOver() {
        return doOver;
    }

    public void setDoOver(String doOver) {
        this.doOver = doOver;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.help);
        hash = 53 * hash + Objects.hashCode(this.map);
        hash = 53 * hash + Objects.hashCode(this.restart);
        hash = 53 * hash + Objects.hashCode(this.doOver);
        return hash;
    }

    @Override
    public String toString() {
        return "Menu{" + "help=" + help + ", map=" + map + ", restart=" + restart + ", doOver=" + doOver + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.restart, other.restart)) {
            return false;
        }
        if (!Objects.equals(this.doOver, other.doOver)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
