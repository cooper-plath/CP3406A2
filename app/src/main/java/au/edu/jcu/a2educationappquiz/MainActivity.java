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

    RadioGroup subjectGroup;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Test your Knowledge Mobile App");

        subjectGroup = findViewById(R.id.subjectGroup);


    }

    public void beginPressed(View view) {
        int radioId = subjectGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Intent intent = new Intent(this, GameActivity.class);
//        intent.putExtra("subject", radioButton.getText().toString());
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
        int radioId = subjectGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        Toast.makeText(this, "Subject Selected: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

}