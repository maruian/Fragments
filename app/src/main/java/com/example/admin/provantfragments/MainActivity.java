package com.example.admin.provantfragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FragmentDinamic1.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = findViewById(R.id.fragment);

        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //Primer pas: instanciar el administrador de fragments
        FragmentManager fragmentManager = getFragmentManager();

        //Segon pas: crear una nova transaccio
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        //Pas tres, crear un nou fragment i afegir-ho
        FragmentDinamic1 fragment = new FragmentDinamic1();
        transaction.add(R.id.layoutFragmentDinamic1, fragment);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
