package com.example.madproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;



public class UserFragment extends Fragment {

    private ImageView imageView;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText txt;
    private Button update;
    private ImageView plusv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_user_profile,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = view.findViewById(R.id.science);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(),SetsActivity.class);

                startActivity(intent);
            }
        });

        (view.findViewById(R.id.plusbutton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(),UserAddCategory.class);
                startActivity(intent);

            }
        });


        (view.findViewById(R.id.sciencex)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                delQuiz();

            }
        });



    }


    public void delQuiz(){

        dialogBuilder = new AlertDialog.Builder(getActivity());
        final View quizpopup = getLayoutInflater().inflate(R.layout.activity_discard_popup,null);
        dialogBuilder.setView(quizpopup);
        dialog = dialogBuilder.create();
        dialog.show();

        ImageButton xpop = quizpopup.findViewById(R.id.button2);

        xpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }





}
