package com.example.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BuyBookAdapter extends ArrayAdapter<BuyBookBean> {
    private int ID;

    public BuyBookAdapter(@NonNull Context context, int resource, @NonNull List<BuyBookBean> objects) {
        super(context, resource, objects);
        ID = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BuyBookBean buyBookBean = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(ID, parent, false);
        TextView textView = (TextView)view.findViewById(R.id.text);
        textView.setText(buyBookBean.getName() + buyBookBean.getAge());
        return view;
    }
}
