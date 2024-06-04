/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GadaGadars.models;

/**
 *
 * @author Lenovo
 */
public class Gadagadars {
   String jerseyNo;
   String playerName;
    String addressText;
    String searchField;

    public String getJerseyNo() {
        return jerseyNo;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getAddressText() {
        return addressText;
    }

    public String getRoleText() {
        return roleText;
    }

    public String getStatusText() {
        return StatusText;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public String getTopScoreText() {
        return topScoreText;
    }


    public String getMatchesText() {
        return matchesText;
    }
                   
    String roleText;
    String StatusText;
    String marriageStatus;

    public Gadagadars(String jerseyNo, String playerName, String addressText, String roleText, String StatusText, String marriageStatus, String topScoreText, String matchesText) {
        this.jerseyNo = jerseyNo;
        this.playerName = playerName;
        this.addressText = addressText;
        this.roleText = roleText;
        this.StatusText = StatusText;
        this.marriageStatus = marriageStatus;
        this.topScoreText = topScoreText;
        this.matchesText = matchesText;
    }
     String topScoreText;
     String matchesText;

    public void setJerseyNo(String jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    public void setRoleText(String roleText) {
        this.roleText = roleText;
    }

    public void setStatusText(String StatusText) {
        this.StatusText = StatusText;
    }

    public Gadagadars(String jerseyNo, String playerName, String addressText, String searchField, String roleText, String StatusText, String marriageStatus, String topScoreText, String matchesText) {
        this.jerseyNo = jerseyNo;
        this.playerName = playerName;
        this.addressText = addressText;
        this.searchField = searchField;
        this.roleText = roleText;
        this.StatusText = StatusText;
        this.marriageStatus = marriageStatus;
        this.topScoreText = topScoreText;
        this.matchesText = matchesText;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    
    public void setTopScoreText(String topScoreText) {
        this.topScoreText = topScoreText;
    }

    public void setMatchesText(String matchesText) {
        this.matchesText = matchesText;
    }

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet.");  
    }

    public String getSearchField() {
        return searchField;
    }
   

        public Object gettopScore() {
            throw new UnsupportedOperationException("Not supported yet.");
            
        }

    
}

    
