package com.erin.Everdrobe.ui.shopping;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_shopping, container, false);


        return root;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
// ListViewに表示するデータ






// ListViewをセット

        ListView listView = (ListView) view.findViewById(R.id.list_view);

        //表示するデータ
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

     ItemListAdapter adapter = new ItemListAdapter(this.getContext(), R.layout.list_item_layout, itemList);
     listView.setAdapter(adapter);

        // セルを選択されたら詳細画面フラグメント呼び出す
       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // 詳細画面へ値を渡す
                DetailFragment fragment = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("selected", position);
                fragment.setArguments(bundle);
                // 詳細画面を呼び出す
                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, new DetailFragment());
                // 戻るボタンで戻ってこれるように
                fr.addToBackStack(null);
                fr.commit();

            }
        });*/
    }
}




    /*private static final String[] scenes = {
            "Item1",
            "Item2",
            "Item3",
            "Item4",
            "Item5",
            "Item6"
    };

    // ちょっと冗長的ですが分かり易くするために
    private static final int[] photos = {
            R.drawable.item1,
            R.drawable.item2,
            R.drawable.item3,
            R.drawable.item4,
            R.drawable.item5,
            R.drawable.item6
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ListViewのインスタンスを生成
        ListView listView = findViewById(R.id.list_view);

        // BaseAdapter を継承したadapterのインスタンスを生成
        // レイアウトファイル list.xml を activity_main.xml に
        // inflate するためにadapterに引数として渡す
        BaseAdapter adapter = new ListViewAdapter(this.getContext(),
                R.layout.custom_cell, scenes, photos);

        // ListViewにadapterをセット
        listView.setAdapter(adapter);

    }


}*/






/*

    static List<String> items = new ArrayList<String>();
    static ArrayAdapter<String> adapter;

    ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView1 = (ListView)findViewById(R.id.list_view);

        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");

        adapter =
                new ArrayAdapter<String>(this, R.layout.layout_item1, R.id.row_textview1, items);

        listView1.setAdapter(adapter);
    }

*/
