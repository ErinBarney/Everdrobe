package com.erin.Everdrobe.ui.shopping;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.erin.Everdrobe.R;
import com.erin.Everdrobe.ui.Item;
import com.erin.Everdrobe.ui.ItemListAdapter;

import java.util.ArrayList;
import java.util.List;



public class ShoppingFragment extends Fragment {

    private List<Item> listItem;
    public ShoppingFragment () {

    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_shopping, container, false);


        return root;
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

// ListViewをセット

        ListView listView = (ListView) view.findViewById(R.id.list_view);


        Item Item1 = new Item("Earring", "Unused.",  + R.drawable.item1, "Normal", "Aoi_0407");
        Item Item2 = new Item("Jean Jacket", "Almost new!!",  + R.drawable.item2, "S", "May:)");
        Item Item3 = new Item("Dress", "It's a little old, but it looks like secondhand clothes and is very cute.",  + R.drawable.item3, "M", "KaitoM");
        Item Item4 = new Item("Pants", "The thread is fraying a little bit, but no worries about wearing.",  + R.drawable.item4, "XS", "Kate0831");
        Item Item5 = new Item("Top&Bottom set", "Unused.",  + R.drawable.item5, "L", "Anrinrin");
        Item Item6 = new Item("Skirt", "Nearly Unused.", + R.drawable.item6, "S", "Hinata");

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

                Item chosenItem = itemList.get(position);
                DetailFragment fragment = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("Item", chosenItem);
                fragment.setArguments(bundle);

                // 詳細画面を呼び出す
                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, fragment);
                // 戻るボタンで戻ってこれるように
                fr.addToBackStack(null);
                fr.commit();

            }
        });
    }
}


