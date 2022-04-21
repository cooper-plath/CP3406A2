package au.edu.jcu.a2educationappquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    RadioGroup questionRadioGroup;
    Button submitBtn;
    TextView highscoreTextView;
    TextView questionTextView;
    TextView questionTimer;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questionRadioGroup = findViewById(R.id.questionRadioGroup);
        submitBtn = findViewById(R.id.submitBtn);
        highscoreTextView = findViewById(R.id.highscore);
        questionTextView = findViewById(R.id.questionView);
        questionTimer = findViewById(R.id.questionTimer);


        getSupportActionBar().setTitle("Quiz Me Mobile App");
        String category = getIntent().getStringExtra("category");

    }

    public void submitPressed(View view) {
    }
}