package com.user.esoftwrica.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.user.esoftwrica.R;
import com.user.esoftwrica.model.StudentDetail;

import java.util.List;

public class StudentDetailAdapter extends RecyclerView.Adapter<StudentDetailAdapter.StudentDetailViewHolder>{
    Context context;
    List<StudentDetail> studentDetailList;
    int image;

    public StudentDetailAdapter(Context context, List<StudentDetail> studentDetailList) {
        this.context = context;
        this.studentDetailList = studentDetailList;
    }

    @NonNull
    @Override
    public StudentDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_layout, parent, false);
        return new StudentDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentDetailViewHolder holder, final int position) {
        final StudentDetail studentDetail = studentDetailList.get(position);

        String gender = studentDetail.getGender();
        if(gender.equals("Male")){
            image = R.drawable.male;
        }
        else if (gender.equals("Female")){
            image = R.drawable.female;
        }

        holder.imageView.setImageResource(image);
        holder.name.setText(studentDetail.getName());
        holder.address.setText(studentDetail.getAddress());
        holder.age.setText(String.valueOf(studentDetail.getAge()));
        holder.gender.setText(studentDetail.getGender());
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentDetailList.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentDetailList.size();
    }

    public class StudentDetailViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView, btnDelete;
        TextView name, address, age, gender;

        public StudentDetailViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);
            age = itemView.findViewById(R.id.age);
            gender = itemView.findViewById(R.id.gender);
            btnDelete = itemView.findViewById(R.id.delete);

        }
    }
}
