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

import org.w3c.dom.Text;

import java.util.List;


public class DetailFragment extends Fragment {

Item chosenItem;


    private List<Item> listItem;

    public DetailFragment () {

    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail, container, false);


        Bundle bundle = this.getArguments();
        if (bundle != null) {
            chosenItem = bundle.getParcelable("Item");
        }


        String line1 = chosenItem.getName();
        String line2 = chosenItem.getCondition();
        String line3 = chosenItem.getImgURL();
        String line4 = chosenItem.getSize();
        String line5 = chosenItem.getUsername();


        TextView textView1 = (TextView) root.findViewById(R.id.text_product2);
        textView1.setText(line1);


        TextView textView2 = (TextView) root.findViewById(R.id.text_condi2);
        textView2.setText(line2);

        ImageView imageView3 = (ImageView) root.findViewById(R.id.imageView3);
        imageView3.setImageDrawable(Drawable.createFromPath(line3));

        TextView textView4 = (TextView) root.findViewById(R.id.text_size2);
        textView4.setText(line4);

        TextView textView5 = (TextView) root.findViewById(R.id.text_user2);
        textView5.setText(line5);



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

