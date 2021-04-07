package com.erin.Everdrobe.ui.shopping;

import androidx.annotation.NonNull;
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
import com.erin.Everdrobe.ui.Item;
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


        String textProduct2 = chosenItem.getName();
        String textCondi2 = chosenItem.getCondition();
        int textImageView3 = chosenItem.getImgURL();
        String textSize2 = chosenItem.getSize();
        String textUser2 = chosenItem.getUsername();


        TextView textView1 = (TextView) root.findViewById(R.id.text_product2);
        textView1.setText(textProduct2);


        TextView textView2 = (TextView) root.findViewById(R.id.text_condi2);
        textView2.setText(textCondi2);

        ImageView imageView3 = (ImageView) root.findViewById(R.id.imageView3);
        imageView3.setImageResource(textImageView3);

        TextView textView4 = (TextView) root.findViewById(R.id.text_size2);
        textView4.setText(textSize2);

        TextView textView5 = (TextView) root.findViewById(R.id.text_user2);
        textView5.setText(textUser2);



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

