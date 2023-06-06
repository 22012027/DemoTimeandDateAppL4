package sg.edu.rp.c346.id22012027.demotimeanddateappl4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TimePicker timePicker;
    Button buttonDisplayDate;
    Button buttonDisplayTime;
    TextView textview;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker=findViewById(R.id.timePicker);
        buttonDisplayDate=findViewById(R.id.buttonDisplayDate);
        buttonDisplayTime=findViewById(R.id.buttonDisplayTime);
        textview= findViewById(R.id.textView);
        reset= findViewById(R.id.resetButton);

        buttonDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            textview.setText("time is " + timePicker.getHour() + ":" + timePicker.getMinute());

            }
        });

        buttonDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            textview.setText("date is " + datePicker.getDayOfMonth() + "/" + (datePicker.getMonth() + 1) + "/" + datePicker.getYear());

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.updateDate(2020, 0, 1);
                timePicker.setHour(12);
                timePicker.setMinute(0);

            }
        });

    }
}