package au.edu.jcu.a2educationappquiz;

import android.provider.BaseColumns;

public class QuizContract {


    public static class QuestionTable implements BaseColumns {
        public static final String TABLE_NAME = "Test_your_Knowledge_questions";
//        public static final String COLUMN_SUBJECT_ID = "subjectID";
        public static final String COLUMN_QUESTION = "questions";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_ANSWER_NR = "answer_nr";
    }

    public static class SubjectTable implements BaseColumns {
        public static final String TABLE_NAME = "Subject_Categories";
        public static final String COLUMN_NAME = "name";
    }
}
