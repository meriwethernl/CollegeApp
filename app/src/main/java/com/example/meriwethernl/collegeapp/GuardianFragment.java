package com.example.meriwethernl.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by meriwethernl on 11/16/2017.
 */

public class GuardianFragment extends android.support.v4.app.Fragment {
    TextView mFMText1;
    TextView mFMText2;
    TextView mFMText3;
    EditText mFMEdit1;
    EditText mFMEdit2;
    EditText mFMEdit3;
    Button submitButton;
    Guardian mGuardianMember = new Guardian();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);
        mFMText1 = (TextView) rootView.findViewById(R.id.theName1);
        mFMText2 = (TextView) rootView.findViewById(R.id.theName2);
        mFMText3 = (TextView) rootView.findViewById(R.id.occupation);
        mFMEdit1 = (EditText) rootView.findViewById(R.id.mFMEdit1);
        mFMEdit2 = (EditText) rootView.findViewById(R.id.mFMEdit2);
        mFMEdit3 = (EditText) rootView.findViewById(R.id.mFMEdit3);
        submitButton = (Button) rootView.findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFMText1.setText(mFMEdit1.getText());
                mFMText2.setText(mFMEdit2.getText());
                mFMText3.setText(mFMEdit3.getText());
            }
        });
        mFMText1.setText(mGuardianMember.getFirstName());
        mFMText2.setText(mGuardianMember.getLastName());
        mFMText3.setText(mGuardianMember.getOccupation());
        return rootView;
     }
}
