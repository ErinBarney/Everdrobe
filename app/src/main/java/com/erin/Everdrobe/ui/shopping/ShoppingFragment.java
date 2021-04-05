package com.erin.Everdrobe.ui.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.erin.Everdrobe.MainActivity;
import com.erin.Everdrobe.R;
import com.erin.Everdrobe.ui.Item;
import com.erin.Everdrobe.ui.ItemListAdapter;

import java.util.ArrayList;
import java.util.List;



public class ShoppingFragment extends Fragment {
    //1ここから
    /*private List<Item> listItem;
    public ShoppingFragment () {

    }*/
    //1ここまで

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_shopping, container, false);


        return root;
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

// ListViewをセット

        ListView listView = (ListView) view.findViewById(R.id.list_view);


        Item Item1 = new Item("Earring", "Unused.", "drawable://" + R.drawable.item1);
        Item Item2 = new Item("Jean Jacket", "Almost new!!", "drawable://" + R.drawable.item2);
        Item Item3 = new Item("Pants", "It's a little old, but it looks like secondhand clothes and is very cute.", "drawable://" + R.drawable.item3);
        Item Item4 = new Item("Top&Bottom set", "The thread is fraying a little bit, but no worries about wearing.", "drawable://" + R.drawable.item4);
        Item Item5 = new Item("Skirt", "Unused.", "drawable://" + R.drawable.item5);
        Item Item6 = new Item("Dress", "Nearly Unused.", "drawable://" + R.drawable.item6);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(Item1);
        itemList.add(Item2);
        itemList.add(Item3);
        itemList.add(Item4);
        itemList.add(Item5);
        itemList.add(Item6);
        itemList.add(Item1);
        itemList.add(Item2);
        itemList.add(Item3);
        itemList.add(Item4);
        itemList.add(Item5);
        itemList.add(Item6);
        itemList.add(Item1);
        itemList.add(Item2);
        itemList.add(Item3);
        itemList.add(Item4);
        itemList.add(Item5);
        itemList.add(Item6);


        ItemListAdapter adapter = new ItemListAdapter(this.getContext(), R.layout.list_item_layout, itemList);

     listView.setAdapter(adapter);




        // セルを選択されたら詳細画面フラグメント呼び出す
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // 詳細画面へ値を渡す
                //２ここから
               /* Item model = itemList.get(position);*/
                //２ここまで
                DetailFragment fragment = new DetailFragment();
                Bundle bundle = new Bundle();
                //３ここから
              /*  bundle.putParcelable("Item", model);*/
                //３ここまで
                fragment.setArguments(bundle);

                // 詳細画面を呼び出す
                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, new DetailFragment());
                // 戻るボタンで戻ってこれるように
                fr.addToBackStack(null);
                fr.commit();

            }
        });
    }
}


