package com.example.administrator.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv = (CalendarView)findViewById(R.id.calendarView);
       cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           @Override
           public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
               Toast.makeText(MainActivity.this,"your birthday is "+year+"year"+month+"month"+dayOfMonth+"day",Toast.LENGTH_SHORT).show();
           }
       });
    }
}
