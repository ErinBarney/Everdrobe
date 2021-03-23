package com.erin.Everdrobe.ui.point;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.erin.Everdrobe.MainActivity;
import com.erin.Everdrobe.R;
import com.erin.Everdrobe.ui.shopping.ShoppingFragment;

public class PointFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {




        View root = inflater.inflate(R.layout.fragment_point, container, false);
        final TextView textView = root.findViewById(R.id.text_point);

        Button btnFragment = (Button)root.findViewById(R.id.button_purchasesustainable);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getChildFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment_container, new SustainableClothesFragment());
                fr.commit();

            }
        });

        return root;
    }
}