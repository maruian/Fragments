package com.example.admin.provantfragments;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDinamic2 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;

        view = inflater.inflate(R.layout.fragment_fragment_dinamic2, container, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);

    }


}
