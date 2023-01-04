package com.rifki.a2001010052_profil_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanjut(View view) {
        setContentView(R.layout.page_2);
    }

    public void balik(View view) {setContentView(R.layout.activity_main);
    }

    public void balik2(View view) {setContentView(R.layout.page_2);
    }

    public void go(View view) {setContentView(R.layout.page_3);
    }

    public void go2(View view) {setContentView(R.layout.activity_main);
    }
}