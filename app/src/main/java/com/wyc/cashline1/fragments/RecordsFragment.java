package com.wyc.cashline1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.wyc.cashline1.Entities.Record;
import com.wyc.cashline1.R;
import com.wyc.cashline1.adapters.RecordListAdapter;
import com.wyc.cashline1.adapters.SectionsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecordsFragment extends Fragment {

    @BindView(R.id.fab_add)
    FloatingActionButton fabAdd;
    @BindView(R.id.record_list)
    ListView recordListView;

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
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        recordList.add(new Record(null, null, 100.15, "title1", "date1"));
        RecordListAdapter recordListAdapter = new RecordListAdapter(recordList, getContext());
        recordListView.setAdapter(recordListAdapter);


        return root;
    }
}
