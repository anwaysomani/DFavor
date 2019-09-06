package com.anway.dfavor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemClass extends ArrayAdapter<Item> {
    private Activity context;
    private List<Item> itemList;

    public ItemClass(Activity context, List<Item> itemList) {
        super(context, R.layout.list_item, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView item_title = (TextView) listViewItem.findViewById(R.id.title_item);
        TextView item_desc = (TextView) listViewItem.findViewById(R.id.desc_item);

        Item item = itemList.get(position);

        item_title.setText(item.getItemTitle());
        item_desc.setText(item.getItemDesc());

        return listViewItem;
    }
}
