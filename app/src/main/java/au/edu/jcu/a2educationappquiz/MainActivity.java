package au.edu.jcu.a2educationappquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    RadioGroup categoryGroup;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Quiz Me Mobile App");

        categoryGroup = findViewById(R.id.categoryGroup);


    }

    public void beginPressed(View view) {
        int radioId = categoryGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("category", radioButton.getText().toString());
        startActivity(intent);
    }

    public void leaderboardsPressed(View view) {
        Intent intent = new Intent(this, LeaderboardsActivity.class);
        startActivity(intent);
    }

    public void settingsPressed(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void checkButton(View view) {
        int radioId = categoryGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        Toast.makeText(this, "Category Selected: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

}