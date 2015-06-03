package com.wada811.android_datepicker_sample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    final MainActivity self = this;

    public static final String DATE_PICKER_MODE_LAYOUT = "DATE_PICKER_MODE_LAYOUT";
    public static final String CALENDAR_VIEW_SHOWN = "CALENDAR_VIEW_SHOWN";
    public static final String SPINNERS_SHOWN = "SPINNERS_SHOWN";
    public static final String ACTIVITY_THEME = "ACTIVITY_THEME";

    @InjectView(R.id.calendarViewShown) CheckBox calendarViewShown;
    @InjectView(R.id.spinnersShown) CheckBox spinnersShown;
    @InjectView(R.id.datePickerMode) Spinner datePickerMode;
    @InjectView(R.id.activityClass) Spinner activityClass;
    @InjectView(R.id.activityTheme) Spinner activityTheme;
    @InjectView(R.id.showDatePickerButton) Button showDatePickerButton;

    private boolean isCalendarViewShown = false;
    private boolean isSpinnersShown = false;
    private int selectedDatePickerModeLayout;
    private Class<? extends Activity> selectedActivityClass;
    private int selectedActivityTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        calendarViewShown.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                isCalendarViewShown = isChecked;
            }
        });
        spinnersShown.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                isSpinnersShown = isChecked;
            }
        });
        datePickerMode.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                selectedDatePickerModeLayout = DatePickerMode.values()[position].layout;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        activityClass.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                selectedActivityClass = ActivityKind.values()[position].activityClass;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        activityTheme.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                selectedActivityTheme = ActivityTheme.values()[position].theme;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
        showDatePickerButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(createIntent(self,
                    selectedActivityClass,
                    selectedDatePickerModeLayout,
                    isCalendarViewShown,
                    isSpinnersShown,
                    selectedActivityTheme));
            }
        });
    }

    public static Intent createIntent(Context context, Class<? extends Activity> clazz, int datePickerModeLayout, boolean isCalendarViewShown, boolean isSpinnersShown, int activityTheme){
        Intent intent = new Intent(context, clazz);
        intent.putExtra(DATE_PICKER_MODE_LAYOUT, datePickerModeLayout);
        intent.putExtra(CALENDAR_VIEW_SHOWN, isCalendarViewShown);
        intent.putExtra(SPINNERS_SHOWN, isSpinnersShown);
        intent.putExtra(ACTIVITY_THEME, activityTheme);
        return intent;
    }

    public enum DatePickerMode {
        Spinner(R.layout.activity_spinner_datepicker_in_appcompat),
        Calendar(R.layout.activity_calendar_datepicker_in_appcompat),;

        public int layout;

        DatePickerMode(int layout){
            this.layout = layout;
        }
    }

    public enum ActivityKind {
        FragmentActivity(DatePickerInFragmentActivity.class),
        AppCompatActivity(DatePickerInAppCompatActivity.class),;

        public Class<? extends Activity> activityClass;

        ActivityKind(Class<? extends Activity> activityClass){
            this.activityClass = activityClass;
        }
    }

    public enum ActivityTheme {
        None(-1),
        Theme_Black(R.style.Theme_Black),
        Theme_Light(R.style.Theme_Light),
        Theme_Holo(R.style.Theme_Holo),
        Theme_Holo_Light(R.style.Theme_Holo_Light),
        Theme_AppCompat(R.style.Theme_AppCompat),
        Theme_AppCompat_Light(R.style.Theme_AppCompat_Light),;

        public int theme;

        ActivityTheme(int theme){
            this.theme = theme;
        }
    }
}
