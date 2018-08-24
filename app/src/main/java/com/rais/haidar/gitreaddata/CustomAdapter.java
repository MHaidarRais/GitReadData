package com.rais.haidar.gitreaddata;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rais.haidar.gitreaddata.ResponseServer.DataItem;

import java.util.List;

/**
 * Created by Hoidar on 8/24/18.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context context;
    List<DataItem> data;
    public static final String WebUrl = "http://192.168.20.64/crudrs/";

    public CustomAdapter(Context context, List<DataItem> dataItems) {
        this.context = context;
        this.data = dataItems;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item , parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.txtIndo.setText(data.get(position).getDeskripsi().toString());
        holder.txtInggris.setText(data.get(position).getInggris().toString());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtInggris,txtIndo;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtInggris = itemView.findViewById(R.id.txtViewInggris);
            txtIndo = itemView.findViewById(R.id.txtViewIndo);
        }
    }
}
