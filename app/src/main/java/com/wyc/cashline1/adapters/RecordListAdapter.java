package com.wyc.cashline1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wyc.cashline1.Entities.Record;
import com.wyc.cashline1.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecordListAdapter extends BaseAdapter {

    private List<Record> recordsList;
    private LayoutInflater inflater;

    public RecordListAdapter(List<Record> recordsList, Context context) {
        this.recordsList = recordsList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return recordsList == null ? 0: recordsList.size();
    }

    @Override
    public Record getItem(int position) {
        return recordsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
           convertView = inflater.inflate(R.layout.list_item_record, parent, false);
           viewHolder = new ViewHolder(convertView);
           convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Record record = getItem(position);
        viewHolder.amount.setText(record.getAmount()+"");
        viewHolder.date.setText(record.getDate()+"");
        // viewHolder.image1.setImageResource(record.getFromAccount().getImageResId());
        // viewHolder.image2.setImageResource(record.getToAccount().getImageResId());

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.list_item_record_image1)
        ImageView image1;
        @BindView(R.id.list_item_record_image2)
        ImageView image2;
        @BindView(R.id.list_item_record_date)
        TextView date;
        @BindView(R.id.list_item_record_amount)
        TextView amount;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
