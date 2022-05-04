package au.edu.jcu.a2educationappquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LeaderboardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboards);
        getSupportActionBar().setTitle("Test your Knowledge Mobile App");
    }
}