package com.example.meriwethernl.collegeapp;

/**
 * Created by meriwethernl on 11/27/2017.
 */

public class Guardian {

    String firstName;
    String lastName;

    public Guardian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
