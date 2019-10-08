package com.wyc.cashline1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.wyc.cashline1.Entities.Account;
import com.wyc.cashline1.Entities.Record;
import com.wyc.cashline1.R;
import com.wyc.cashline1.adapters.RecordListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecordsFragment extends Fragment {

    @BindView(R.id.fab_add)
    FloatingActionButton fabAdd;
    @BindView(R.id.record_list)
    ListView recordListView;
//    @BindView(R.id.account_selector)
//    RecyclerView accountSelector;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_records, container, false);
        ButterKnife.bind(this, root);

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        List<Record> recordList = new ArrayList<>();
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        RecordListAdapter recordListAdapter = new RecordListAdapter(recordList, getContext());
        recordListView.setAdapter(recordListAdapter);

        final List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(0, R.mipmap.ic_launcher));
        accountList.add(new Account(1, R.mipmap.ic_launcher));
        accountList.add(new Account(2, R.mipmap.ic_launcher));
        accountList.add(new Account(3, R.mipmap.ic_launcher));
        accountList.add(new Account(4, R.mipmap.ic_launcher));
        accountList.add(new Account(5, R.mipmap.ic_launcher));
        accountList.add(new Account(6, R.mipmap.ic_launcher));

        /*accountSelector.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        accountSelector.setAdapter(new RecyclerView.Adapter() {
            class ViewHolder extends RecyclerView.ViewHolder{
                private TextView imageView;
                public ViewHolder(@NonNull View itemView) {
                    super(itemView);
                    imageView = (TextView) itemView;
                }
                public TextView getImageView() {
                    return imageView;
                }
            }

            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new ViewHolder(new ImageView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                ViewHolder viewHolder =  (ViewHolder)holder;
                viewHolder.getImageView().setText(Float.toString(accountList.get(position).getBalance()));
            }

            @Override
            public int getItemCount() {
                return accountList.size();
            }
        });*/

        return root;
    }
}
