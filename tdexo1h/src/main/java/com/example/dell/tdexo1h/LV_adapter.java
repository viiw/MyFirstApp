package com.example.dell.tdexo1h;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Dell on 29/02/2016.
 */
public class LV_adapter extends BaseAdapter {

    Context context;
    ArrayList<Book> listBook;

    public LV_adapter(Context context, ArrayList<Book> listBook) {
        this.context = context;
        this.listBook = listBook;
    }

    @Override
    public int getCount() {
        return listBook.size();
    }

    @Override
    public Object getItem(int position) {
        return listBook.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {




        return null;
    }
}
