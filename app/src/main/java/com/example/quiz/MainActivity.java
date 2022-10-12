package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//соединяем объекты с их id

        /*//кнопка quiz
        Button btnQuiz = findViewById(R.id.quiz);
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //кнопка result
        Button btnResult = findViewById(R.id.result);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });*/
        }




    //нажатие кнопки Quiz
    public void btnClickQuiz(View view){
        //переход на другую страницу с помощтю класса Intent
        Intent intent = new Intent(this,QuizActivity.class);
        startActivity(intent);
    }
    //нажатие кнопки Result
    public void btnClickResult(View view){

    }
    /*/
    private void showInfo(String text){
        //всплывающее окно

        Toast.makeText(this,text,Toast.LENGTH_LONG).show();

    }*/
}