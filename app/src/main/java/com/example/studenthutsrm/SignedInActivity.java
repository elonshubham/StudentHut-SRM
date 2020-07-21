package com.example.studenthutsrm;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignedInActivity extends AppCompatActivity {

    ImageView mques;
    ImageView mcgpa;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.examplecard);

    }
}
