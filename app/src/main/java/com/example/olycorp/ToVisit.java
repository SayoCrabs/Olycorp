package com.example.olycorp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import com.example.olycorp.activityToVisit.Card;
import com.example.olycorp.activityToVisit.ListViewAdapter;

import java.util.ArrayList;

public class ToVisit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_visit);

        ArrayList<Card> items = new ArrayList<>();
        items.add(new Card("Mars", R.drawable.mars));
        items.add(new Card("Nilosyrtis Mensae", R.drawable.mars_quatre));
        items.add(new Card("Gros Cratère", R.drawable.big_c));
        items.add(new Card("Cratere de gale", R.drawable.mars_trois));

        ListViewAdapter adapter = new ListViewAdapter(this, items);
        ListView listView = findViewById(R.id.listViewImage);

        listView.setAdapter(adapter);
    }
}