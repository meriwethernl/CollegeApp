package com.example.meriwethernl.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.meriwethernl.collegeapp.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by meriwethernl on 11/27/2017.
 */

public class ProfileFragment  extends android.support.v4.app.Fragment {
    @Nullable
    DatePicker dob;
    TextView mFMText3;
    TextView mFMText4;
    EditText mFMEdit3;
    EditText mFMEdit4;
    Button submitButton2;
    Profile mProfile= new Profile();
    Calendar calendar = Calendar.getInstance();

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        dob = (DatePicker) rootView.findViewById(R.id.dob);
        mFMText3 = (TextView) rootView.findViewById(R.id.theName1);
        mFMText4 = (TextView) rootView.findViewById(R.id.theName2);
        mFMEdit3 = (EditText) rootView.findViewById(R.id.mFMEdit1);
        mFMEdit4 = (EditText) rootView.findViewById(R.id.mFMEdit2);
        submitButton2 = (Button) rootView.findViewById(R.id.submitButton);
        submitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFMText3.setText(mFMEdit3.getText());
                mFMText4.setText(mFMEdit4.getText());

                int day = dob.getDayOfMonth();
                int month = dob.getMonth();
                int year = dob.getYear();

                calendar.set(year, month, day);
                mProfile.setDob(year, month, day);
            }
        });
        mFMText3.setText(mProfile.getFirstName());
        mFMText4.setText(mProfile.getLastName());
        mProfile.getDob();

        dob.init(mProfile.getDob().get(Calendar.YEAR), mProfile.getDob().get(Calendar.MONTH), mProfile.getDob().get(Calendar.DAY_OF_MONTH), null);

        return rootView;}

}

