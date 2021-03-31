package com.erin.Everdrobe.ui.shopping;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.erin.Everdrobe.R;
import com.erin.Everdrobe.ui.point.SustainableClothesFragment;


public class DetailFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail, container, false);
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



/*
    TextView product;
    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        TextView product = (TextView) view.findViewById(R.id.text_product);
        ImageView image = (ImageView) view.findViewById(R.id.imageView3);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            product.setText(bundle.getString("Product Name"));
            if (product.getText().toString().equalsIgnoreCase("Earring")) {
                image.setImageDrawable(ContextCompat.getDrawable(DetailFragment.this, R.drawable.item1));
            } else if (product.getText().toString().equalsIgnoreCase("Jean Jacket")) {
                image.setImageDrawable(ContextCompat.getDrawable(DetailFragment.this, R.drawable.item2));
            } else if (product.getText().toString().equalsIgnoreCase("Pants")) {
                image.setImageDrawable(ContextCompat.getDrawable(DetailFragment.this, R.drawable.item3));
            } else if (product.getText().toString().equalsIgnoreCase("Top&Bottom set")) {
                image.setImageDrawable(ContextCompat.getDrawable(DetailFragment.this, R.drawable.item4));
            } else if (product.getText().toString().equalsIgnoreCase("Skirt")) {
                image.setImageDrawable(ContextCompat.getDrawable(DetailFragment.this, R.drawable.item5));
            } else if (product.getText().toString().equalsIgnoreCase("Dress")) {
                image.setImageDrawable(ContextCompat.getDrawable(DetailFragment.this, R.drawable.item6));
            }
        }
    }*/



}

