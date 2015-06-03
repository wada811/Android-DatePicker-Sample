package com.wada811.android_datepicker_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import butterknife.ButterKnife;
import butterknife.InjectView;
import static com.wada811.android_datepicker_sample.MainActivity.*;

public class DatePickerInAppCompatActivity extends AppCompatActivity {

    @InjectView(R.id.datePicker) DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setTheme(extras.getInt(ACTIVITY_THEME));
        setContentView(extras.getInt(DATE_PICKER_MODE_LAYOUT));
        ButterKnife.inject(this);
        datePicker.setCalendarViewShown(extras.getBoolean(CALENDAR_VIEW_SHOWN));
        datePicker.setSpinnersShown(extras.getBoolean(SPINNERS_SHOWN));
    }
}
