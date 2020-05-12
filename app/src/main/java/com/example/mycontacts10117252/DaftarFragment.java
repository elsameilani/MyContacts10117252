package com.example.mycontacts10117252;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
/*10 May 2020
 * 10117252 - Elsa Meilani - IF8*/


/**
 * A simple {@link Fragment} subclass.
 */
public class DaftarFragment extends Fragment {

    public DaftarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daftar, container, false);
    }
}
