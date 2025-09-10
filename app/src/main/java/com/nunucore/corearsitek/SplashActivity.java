package com.nunucore.corearsitek;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Langsung pindah ke MainActivity setelah splash
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
