package com.salma.counterfragmentapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class CounterValueFragment extends Fragment {

    TextView counterView;
    CounterFragment counterFragment;
    View view;
    int counter=0;

    public CounterValueFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Log.i("tagName","onCreateView");
        view = inflater.inflate(R.layout.fragment_counter_value, container, false);
        counterView = (TextView) view.findViewById(R.id.counterValue);
        if(savedInstanceState!=null){
            counter=savedInstanceState.getInt("counter");
            counterView.setText(String.valueOf(counter));
        }
        else{
            counterView.setText(String.valueOf(counter));

        }
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    public void increaseCounter(int counter) {
        counterView = (TextView) view.findViewById(R.id.counterValue);
        counterView.setText(String.valueOf(counter));
        this.counter=counter;
    }

}
