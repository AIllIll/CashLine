package com.wyc.cashline1.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wyc.cashline1.Entities.Account;

import java.util.List;

public class AccountListAdapter extends RecyclerView.Adapter {

    class AccountViewHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public AccountViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = (TextView)itemView;
        }

        private TextView getTv() {
            return tv;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AccountViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        AccountViewHolder viewHolder = (AccountViewHolder) holder;
        viewHolder.getTv().setText("test"+Integer.toString(position));
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
