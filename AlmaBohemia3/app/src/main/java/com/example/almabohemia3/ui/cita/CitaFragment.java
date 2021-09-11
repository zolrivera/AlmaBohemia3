package com.example.almabohemia3.ui.cita;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.almabohemia3.MainActivity;
import com.example.almabohemia3.R;

public class CitaFragment extends Fragment {

    private CitaViewModel mViewModel;

    public static CitaFragment newInstance() {
        return new CitaFragment();
    }

    @Override
    public  View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cita, container, false);
        View root;
        Button b1 = root.findViewById(R.id.button7);
        b1.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), MainActivity.class));
        });
        return root;



    }
}