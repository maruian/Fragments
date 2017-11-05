package com.example.admin.provantfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentEstatic extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;

        view = inflater.inflate(R.layout.fragment_fragment_estatic, container);

        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
