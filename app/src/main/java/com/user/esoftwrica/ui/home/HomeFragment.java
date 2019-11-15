package com.user.esoftwrica.ui.home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.user.esoftwrica.R;
import com.user.esoftwrica.adapter.StudentDetailAdapter;
import com.user.esoftwrica.model.StudentDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    static List<StudentDetail> studentDetailList = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
            recyclerView = view.findViewById(R.id.recyclerView);

            StudentDetail studentDetail = new StudentDetail("Sudeep Shakya", "Kathmandu", "Male", 25);
            if (studentDetailList.isEmpty()){
                studentDetailList.add(new StudentDetail("Sudeep", "Kathmandu", "Male", 25));
                studentDetailList.add(new StudentDetail("Nisha", "Patan", "Female", 22));
                studentDetail.setStudentDetailList(studentDetailList);
            }

            StudentDetailAdapter studentDetailAdapter = new StudentDetailAdapter(getActivity(), studentDetailList);
            recyclerView.setAdapter(studentDetailAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

}
