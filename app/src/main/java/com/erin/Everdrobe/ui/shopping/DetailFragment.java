package com.erin.Everdrobe.ui.shopping;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.erin.Everdrobe.R;
import com.erin.Everdrobe.ui.Item;
import com.erin.Everdrobe.ui.point.SustainableClothesFragment;


public class DetailFragment extends Fragment {



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail, container, false);

        //ここから
        Intent intent = getIntent();
        Item exampleItem = intent.getParcelableExtra("Item");

        String line1 = exampleItem.getName();
        String line2 = exampleItem.getCondition();
        String line3 = exampleItem.getImgURL();


        TextView textView1 = root.findViewById(R.id.text_product2);
        textView1.setText(line1);

        TextView textView2 = root.findViewById(R.id.text_condi2);
        textView2.setText(line2);

        ImageView imageView = root.findViewById(R.id.imageView3);
        imageView.setImageDrawable(Drawable.createFromPath(line3));
        //ここまで変えた



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

