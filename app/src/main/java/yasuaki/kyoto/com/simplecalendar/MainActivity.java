package yasuaki.kyoto.com.simplecalendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView mTxtDate1;
    TextView mTxtDate2;
    TextView mTxtDate3;
    TextView mTxtDate4;
    TextView mTxtDate5;

    private Date mDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDate = new Date();

        mTxtDate1 = (TextView) findViewById(R.id.date1);
        mTxtDate2 = (TextView) findViewById(R.id.date2);
        mTxtDate3 = (TextView) findViewById(R.id.date3);
        mTxtDate4 = (TextView) findViewById(R.id.date4);
        mTxtDate5 = (TextView) findViewById(R.id.time);

        java.text.DateFormat dateFormat1 = android.text.format.DateFormat.getDateFormat(this);
        java.text.DateFormat dateFormat2 = android.text.format.DateFormat.getMediumDateFormat(this);
        java.text.DateFormat dateFormat3 = android.text.format.DateFormat.getLongDateFormat(this);
        java.text.DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this);

        String date1 = "shortFormat  " + dateFormat1.format(mDate);
        String date2 = "mediumFormat  " + dateFormat2.format(mDate);
        String date3 = "longFormat  " + dateFormat3.format(mDate);
        String date4 = "customFormat  " + (DateFormat.format("EEE, MMM dd yyyy", mDate)).toString();
        String time = "timeFormat  " + timeFormat.format(mDate);

        mTxtDate1.setText(date1);
        mTxtDate2.setText(date2);
        mTxtDate3.setText(date3);
        mTxtDate4.setText(date4);
        mTxtDate5.setText(time);

    }
}
