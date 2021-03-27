package com.erin.Everdrobe.ui.shopping;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.erin.Everdrobe.R;

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
        final ArrayList<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        items.add("Item3");
        items.add("Item4");
        items.add("Item5");
        items.add("Item6");



// ListViewをセット
        final ArrayAdapter adapter = new ArrayAdapter(this.getContext(), R.layout.support_simple_spinner_dropdown_item, items);
        ListView listView = (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        // セルを選択されたら詳細画面フラグメント呼び出す
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
        });
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
