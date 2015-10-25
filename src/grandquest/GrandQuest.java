/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandquest;

import byui.cit260.grandQuest.model.Bathtub;
import byui.cit260.grandQuest.model.Player;

import byui.cit260.grandQuest.model.Road;

import byui.cit260.grandQuest.model.Forest;

import byui.cit260.grandQuest.model.Bridge;
import byui.cit260.grandQuest.model.Castle;
import byui.cit260.grandQuest.model.CastleMerchant;
import byui.cit260.grandQuest.model.CastlePrince;
import byui.cit260.grandQuest.model.Creatures;
import byui.cit260.grandQuest.model.EncounterResults;

import byui.cit260.grandQuest.model.Encounters;
import byui.cit260.grandQuest.model.Game;
import byui.cit260.grandQuest.model.Inn;
import byui.cit260.grandQuest.model.Map;
import byui.cit260.grandQuest.model.MarketPlace;
import byui.cit260.grandQuest.model.MathEquations;
import byui.cit260.grandQuest.model.Menu;
import byui.cit260.grandQuest.model.Merchant;
import byui.cit260.grandQuest.model.MonsterReaction;
import byui.cit260.grandQuest.model.PlayerReaction;
import byui.cit260.grandQuest.model.Prince;
import byui.cit260.grandQuest.model.Tavern;
import byui.cit260.grandQuest.model.Village;
import byui.cit260.grandQuest.view.StartProgramView;
/**
 *
 * @author Jassen
 */
public class GrandQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Start Program View and start program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
       
    }
}
