package com.phoenix.happyheartsfund.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.phoenix.happyheartsfund.R;
import com.phoenix.happyheartsfund.adapter.MessageListAdapter;
import com.phoenix.happyheartsfund.models.DataSource;
import com.phoenix.happyheartsfund.models.MessagePost;

import java.util.ArrayList;

public class MainFragmentTab1 extends Fragment {

    ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_main_tab1,container,false);
        mListView = (ListView) v.findViewById(R.id.message_list);
        MessagePost[] messagePosts = new MessagePost[DataSource.experiencePosts.size()];
        MessageListAdapter messageListAdapter = new MessageListAdapter(getActivity(), R.layout.fragment_main_tab1_listview_item, new MessagePost[DataSource.experiencePosts.size()]);
        mListView.setAdapter(messageListAdapter);

        return v;
    }
}
