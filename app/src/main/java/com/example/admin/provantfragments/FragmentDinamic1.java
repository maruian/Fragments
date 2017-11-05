package com.example.admin.provantfragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDinamic1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;

        view = inflater.inflate(R.layout.fragment_fragment_dinamic1, container, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getFragmentManager();

                //Segon pas: crear una nova transaccio
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                //Pas tres, crear un nou fragment i afegir-ho
                FragmentDinamic2 fragment = new FragmentDinamic2();
                transaction.add(R.id.layoutFragmentDinamic2, fragment);
                transaction.commit();
            }
        });

        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }


    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);

    }


}
