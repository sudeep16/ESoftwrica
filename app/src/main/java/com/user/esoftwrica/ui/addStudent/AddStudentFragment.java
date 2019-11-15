package com.user.esoftwrica.ui.addStudent;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.user.esoftwrica.R;
import com.user.esoftwrica.model.StudentDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddStudentFragment extends Fragment implements View.OnClickListener {
    String name, address, age, gender;
    EditText stuName, stuAddress, stuAge;
    RadioGroup rdoGrp;
    RadioButton rdoMale, rdoFemale;
    Button btnsave;
    List<StudentDetail> studentDetailList = new ArrayList<>();

    public AddStudentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_student, container, false);

        stuName = view.findViewById(R.id.name);
        stuAddress = view.findViewById(R.id.address);
        stuAge = view.findViewById(R.id.age);
        rdoMale = view.findViewById(R.id.rdoMale);
        rdoFemale = view.findViewById(R.id.rdoFemale);
        rdoGrp = view.findViewById(R.id.rdoGrp);
        btnsave = view.findViewById(R.id.btnSave);
        btnsave.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSave:
                name = stuName.getText().toString();
                address = stuAddress.getText().toString();
                age = stuAge.getText().toString();

                if (TextUtils.isEmpty(name)) {
                    stuName.setError("Enter Username");
                    return;
                }
                if (TextUtils.isEmpty(address)) {
                    stuAge.setError("Enter Age");
                    return;
                }
                if (TextUtils.isEmpty(age)) {
                    stuAge.setError("Enter Address");
                    return;
                }

                if (rdoMale.isChecked()) {
                    gender = "Male";
                }
                if (rdoFemale.isChecked()) {
                    gender = "Female";
                }

                StudentDetail studentDetail = new StudentDetail(name, address, gender, Integer.parseInt(age));
                studentDetailList = studentDetail.getStudentDetailList();
                studentDetailList.add(studentDetail);
                studentDetail.setStudentDetailList(studentDetailList);

                Toast.makeText(getActivity(), "Student Successfully Added", Toast.LENGTH_SHORT).show();

                stuName.setText("");
                stuAddress.setText("");
                stuAge.setText("");
                rdoMale.setChecked(false);
                rdoFemale.setChecked(false);


                break;
        }


    }
}
