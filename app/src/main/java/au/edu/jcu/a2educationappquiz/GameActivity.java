package au.edu.jcu.a2educationappquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class GameActivity extends AppCompatActivity {
    private RadioGroup questionRadioGroup;
    private RadioButton option1;
    private RadioButton option2;
    private RadioButton option3;
    private RadioButton option4;

    private Button submitBtn;
    private TextView highscoreTextView;
    private TextView questionTextView;
    private TextView questionTimer;
    private CountDownTimer countDownTimer;

    private List<Question> questionList;
    private int questionTotal;
    private int questionCount;
    private Question question;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questionRadioGroup = findViewById(R.id.questionRadioGroup);
        submitBtn = findViewById(R.id.submitBtn);
        highscoreTextView = findViewById(R.id.highscore);
        questionTextView = findViewById(R.id.questionView);
        questionTimer = findViewById(R.id.questionTimer);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        QuestionDB questionDB = new QuestionDB(this);
        questionList = questionDB.totalQuestionsInDB();
        questionTotal = questionList.size();
        System.out.println(questionTotal);


        getSupportActionBar().setTitle("Test your Knowledge Mobile App");
//        String subject = getIntent().getStringExtra("subject");

//        QuizDbHelper dbHelper = new QuizDbHelper(this);

        nextQuestion();

    }
    private void nextQuestion() {
        if (questionCount < questionTotal) {
            question = questionList.get(questionCount);

            questionTextView.setText(question.getQuestion());
            option1.setText(question.getOption1());
            option2.setText(question.getOption2());
            option3.setText(question.getOption3());
            option4.setText(question.getOption4());
            questionCount += 1;
        } else {
            endQuiz();
        }
    }

    private void endQuiz() {
        finish();
    }

    public void submitPressed(View view) {
    }
}