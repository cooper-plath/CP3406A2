package au.edu.jcu.a2educationappquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView categoryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        categoryView = findViewById(R.id.categoryTest);
        getSupportActionBar().setTitle("Quiz Me Mobile App");
        String category = getIntent().getStringExtra("category");
        categoryView.setText(category);
        System.out.println(category);
    }
}