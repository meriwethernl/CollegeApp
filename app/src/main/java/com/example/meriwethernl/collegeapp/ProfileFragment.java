package com.example.meriwethernl.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
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
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

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
            }
        });
        mFMText3.setText(mProfile.getFirstName());
        mFMText4.setText(mProfile.getLastName());
        mProfile.getDOB
        dob.updateDate();
        return rootView;
    }
}

