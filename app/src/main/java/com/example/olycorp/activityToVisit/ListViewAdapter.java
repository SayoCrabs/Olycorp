package com.example.olycorp.activityToVisit;


import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.olycorp.R;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<Card> {
    public ListViewAdapter(@NonNull Context context, ArrayList<Card> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.card, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Card currentItem = getItem(position);
        TextView name = listItem.findViewById(R.id.name_card);
        name.setText(currentItem.nameCard);

        LinearLayout layout = listItem.findViewById(R.id.layoutImage);
        layout.setBackgroundResource(currentItem.imageA);

        return listItem;
    }

}
