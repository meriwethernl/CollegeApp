package com.example.meriwethernl.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.meriwethernl.collegeapp.R.id.theName;

/**
 * Created by meriwethernl on 11/16/2017.
 */

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    TextView mFMText1;
    TextView mFMText2;
    EditText mFMEdit;
    FamilyMember mFamilyMember = new FamilyMember();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);
        mFMText1 = (TextView) rootView.findViewById(R.id.textView);
        mFMText2 = (TextView) rootView.findViewById(R.id.theName);
        mFMText1.setText(mFamilyMember.getFirstName());
        mFMText2.setText(mFamilyMember.getLastName());
        return rootView;
     }
}
