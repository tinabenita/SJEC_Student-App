package com.example.sjecstudent.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.sjecstudent.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {
//    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp,"Computer Science", "The Depa"));
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical ", "The Department of Mechanical Engineering was established in the year 2002 with the vision of nurturing technically competent and socially responsible Engineering Professionals."));

        adapter = new BranchAdapter(getContext(), list);
//        viewPager = view.findViewById(R.id.viewPager);
//        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        Glide.with(getContext()).load("https://www.sjec.ac.in/img/home-stats-students.png").into(imageView);

        return view;
    }
}
