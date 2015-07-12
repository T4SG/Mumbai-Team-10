package com.phoenix.happyheartsfund.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.phoenix.happyheartsfund.R;
import com.phoenix.happyheartsfund.adapter.PhotosListAdapter;
import com.phoenix.happyheartsfund.models.DataSource;
import com.phoenix.happyheartsfund.models.ImagePost;

public class MainFragmentTab2 extends Fragment {

    ListView mListView;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_main_tab2,container,false);
        DataSource.mainFragmentTab2 = this;
        view = v;
        return v;
    }

    public void InitializeListView() {
        mListView = (ListView) view.findViewById(R.id.photos_list);
        PhotosListAdapter adapter = new PhotosListAdapter(getActivity(), R.layout.fragment_main_tab2_listview_item, new ImagePost[DataSource.photoPosts.size()]);
        mListView.setAdapter(adapter);
    }
}
