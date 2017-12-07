package com.example.meriwethernl.collegeapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by meriwethernl on 11/27/2017.
 */

public class Profile {
    String firstName;
    String lastName;
    Calendar dob;

    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = Calendar.getInstance();
        dob.set(1999, 00, 01);
    }



    public Profile() {




        this.firstName = "Ada";
        this.lastName = "Lovelace";



    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(int year, int month , int day) {
        dob.set(year , month, day);
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
