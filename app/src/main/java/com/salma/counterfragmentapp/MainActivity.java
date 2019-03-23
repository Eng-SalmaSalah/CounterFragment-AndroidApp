package com.salma.counterfragmentapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CounterInterface {
    int counter=0;
    CounterValueFragment counterValueFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CounterFragment counterFragment=new CounterFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.upperLayout,counterFragment,"counterFragment");
        fragmentTransaction.commit();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    @Override
    public void manageCounter(int counter) {
        counterValueFragment= (CounterValueFragment) getSupportFragmentManager().findFragmentById(R.id.lowerFragment);
        counterValueFragment.increaseCounter(counter);
        this.counter=counter;
    }
}

