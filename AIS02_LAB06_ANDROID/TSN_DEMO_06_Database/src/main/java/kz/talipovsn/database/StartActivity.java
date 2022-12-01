package kz.talipovsn.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void onNextPayIde(View view) {
        // Создание второго окна
        Intent intent = new Intent(StartActivity.this, ActivityPaySoftware.class);
        startActivity(intent);
    }
    public void onNextFreeIde(View v) {
        Intent intent = new Intent(StartActivity.this, ActivityFreeSoftware.class);
        startActivity(intent);
    }
}