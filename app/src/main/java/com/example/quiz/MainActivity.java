package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //соединяем объекты с их id
        /*final LinearLayout quiz = findViewById(R.id.quiz);
        final LinearLayout results = findViewById(R.id.result);*/

        /*//поведение при нажатии
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
    }
/*    protected void startQuizActivity(View v){//переход на страницу с викториной
        //записали в onclick и класс intent работает с активити
        Intent intent = new Intent(this,QuizActivity.class);
        startActivity(intent);
    }*/
}