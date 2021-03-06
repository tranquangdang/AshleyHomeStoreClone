package com.example.ashleyhomestoreclone.Bean.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ashleyhomestoreclone.Bean.gvBeanShop;
import com.example.ashleyhomestoreclone.Bean.lvBeanHome;
import com.example.ashleyhomestoreclone.R;

import java.util.List;

public class gvAdapterShop extends ArrayAdapter<gvBeanShop> {

    public gvAdapterShop(@NonNull Context context, int resource, @NonNull List<gvBeanShop> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v202 = convertView;

        if(null == v202){
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v202 = inflater.inflate(R.layout.layout_gv_adapter_shop, null);
        }
        gvBeanShop mListView202 = getItem(position);
        ImageView img202 = v202.findViewById(R.id.img_gv_shop);
        TextView title202 = v202.findViewById(R.id.cate_gv_shop);

        img202.setImageResource(mListView202.getImg());
        title202.setText(mListView202.getCate());

        return v202;
    }
}
