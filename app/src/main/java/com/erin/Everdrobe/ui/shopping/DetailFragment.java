package com.erin.Everdrobe.ui.shopping;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.erin.Everdrobe.R;
import com.erin.Everdrobe.ui.Item;
import com.erin.Everdrobe.ui.point.SustainableClothesFragment;

import java.util.List;


public class DetailFragment extends Fragment {

Item model;

//１ここから
   /* private List<Item> listItem;

    public DetailFragment () {

    }*/
//１ここまで


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail, container, false);
        //２ここから
        /*model = new Item(Parcel.obtain());
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            model = bundle.getParcelable("Item");
        }*/
        //2ここまで


        Button btnFragment3 = (Button) root.findViewById(R.id.button_borrow);
        btnFragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, new ConfirmFragment());
                fr.commit();


            }
        });

        return root;
    }







}

