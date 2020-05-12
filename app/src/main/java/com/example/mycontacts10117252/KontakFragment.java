package com.example.mycontacts10117252;
/*12 May 2020
 * 10117252 - Elsa Meilani - IF8*/

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;




/**
 * A simple {@link Fragment} subclass.
 */
public class KontakFragment extends Fragment {

    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false);
    }
}
