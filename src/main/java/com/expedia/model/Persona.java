/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.model;

/**
 *
 * @author Bashar Othman
 */
public class Persona {

    private String personaType;

    public String getPersonaType() {
        return this.personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    @Override
    public String toString() {
        return "Persona{" + "personaType=" + personaType + '}';
    }
     
}
