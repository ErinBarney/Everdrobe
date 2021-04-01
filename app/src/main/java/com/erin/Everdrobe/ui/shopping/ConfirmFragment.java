package com.erin.Everdrobe.ui.shopping;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.erin.Everdrobe.R;


public class ConfirmFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_confirm, container, false);


        Button btnFragment4 = (Button) root.findViewById(R.id.button_no);
        btnFragment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, new DetailFragment());
                fr.commit();


            }
        });

        Button btnFragment5 = (Button) root.findViewById(R.id.button_yes);

        btnFragment5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, new ShoppingFragment());
                fr.commit();
                Toast.makeText(getActivity(),"Borrowed!",Toast.LENGTH_LONG).show();






            }
        });




        return root;
    }



}

