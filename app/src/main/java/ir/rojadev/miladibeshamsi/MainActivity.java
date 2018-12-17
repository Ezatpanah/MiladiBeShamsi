package ir.rojadev.miladibeshamsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView miladi;
    TextView shamsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miladi=(TextView)findViewById(R.id.miladiDate);
        shamsi=(TextView)findViewById(R.id.shamsiDate);

        // Miladi calender

        Calendar cal=Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH)+1;
        int day=cal.get(Calendar.DAY_OF_MONTH);
        String date=year+"/"+month+"/"+day;
        miladi.setText("Miladi Calendar "+ date);


        // Convert Miladi be Shamsi

        JalaliCalendar.gDate miladi_date= new JalaliCalendar.gDate(year,month-1,day);
        JalaliCalendar.gDate jalaldi_date= JalaliCalendar.MiladiToJalali(miladi_date);

        shamsi.setText("Shamsi Calendar "+ jalaldi_date.toString());


    }
}
