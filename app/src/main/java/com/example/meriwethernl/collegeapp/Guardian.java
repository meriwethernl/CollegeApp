package com.example.meriwethernl.collegeapp;

/**
 * Created by meriwethernl on 11/27/2017.
 */

public class Guardian extends FamilyMember{
    String occupation;


    public Guardian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Guardian(){
        firstName = "Gang";
        lastName = "Sign";
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
