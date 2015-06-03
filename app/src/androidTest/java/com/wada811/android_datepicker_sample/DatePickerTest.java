package com.wada811.android_datepicker_sample;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.view.View;
import com.wada811.android_datepicker_sample.MainActivity.ActivityTheme;
import com.wada811.android_datepicker_sample.MainActivity.DatePickerMode;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class DatePickerTest {

    @Rule public final ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    private String dirPath;

    @Test
    public void launchMultipleActivities(){
        dirPath = Environment.getExternalStorageDirectory() + "/" + activityTestRule.getActivity()
            .getPackageName() + "/";
        File file = new File(dirPath);
        if(!file.exists()){
            file.mkdir();
        }
        List<ActivityTheme> activityThemeList = new ArrayList<>();
        activityThemeList.add(ActivityTheme.Theme_Black);
        activityThemeList.add(ActivityTheme.Theme_Holo);
        activityThemeList.add(ActivityTheme.Theme_AppCompat);
        launchDatePickerInFragmentActivity(activityThemeList, DatePickerInFragmentActivity.class);
        launchDatePickerInAppCompatActivity(activityThemeList, DatePickerInAppCompatActivity.class);
    }

    private void launchDatePickerInFragmentActivity(List<ActivityTheme> activityThemeList, final Class<DatePickerInFragmentActivity> clazz){
        for(DatePickerMode datePickerMode : DatePickerMode.values()){
            for(int i = 0; i < 2; i++){
                boolean isCalendarViewShown = i == 0;
                for(int j = 0; j < 2; j++){
                    boolean isSpinnersShown = j == 0;
                    for(ActivityTheme activityTheme : activityThemeList){
                        if(datePickerMode == DatePickerMode.Calendar && activityTheme == ActivityTheme.Theme_Black){
                            continue;
                        }
                        final Intent intent = MainActivity.createIntent(activityTestRule.getActivity(),
                            clazz,
                            datePickerMode.layout,
                            isCalendarViewShown,
                            isSpinnersShown,
                            activityTheme.theme);
                        ActivityTestRule<DatePickerInFragmentActivity> rule = new ActivityTestRule<>(clazz, false);
                        String fileName = String.format("%s_%s_%s_%s_%s_%s_%s.png",
                            clazz.getSimpleName(),
                            datePickerMode.name(),
                            "isCalendarViewShown",
                            isCalendarViewShown,
                            "isSpinnersShown",
                            isSpinnersShown,
                            activityTheme.name());
                        Log.d(clazz.getSimpleName(), fileName);
                        rule.launchActivity(intent);
                        takeScreenshot(rule.getActivity(), fileName);
                    }
                }
            }
        }
    }

    private void launchDatePickerInAppCompatActivity(List<ActivityTheme> activityThemeList, final Class<DatePickerInAppCompatActivity> clazz){
        for(DatePickerMode datePickerMode : DatePickerMode.values()){
            for(int i = 0; i < 2; i++){
                boolean isCalendarViewShown = i == 0;
                for(int j = 0; j < 2; j++){
                    boolean isSpinnersShown = j == 0;
                    for(ActivityTheme activityTheme : activityThemeList){
                        if(datePickerMode == DatePickerMode.Calendar && activityTheme == ActivityTheme.Theme_Black){
                            continue;
                        }
                        final Intent intent = MainActivity.createIntent(activityTestRule.getActivity(),
                            clazz,
                            datePickerMode.layout,
                            isCalendarViewShown,
                            isSpinnersShown,
                            activityTheme.theme);
                        ActivityTestRule<DatePickerInAppCompatActivity> rule = new ActivityTestRule<>(clazz, false);
                        String fileName = String.format("%s_%s_%s_%s_%s_%s_%s.png",
                            clazz.getSimpleName(),
                            datePickerMode.name(),
                            "isCalendarViewShown",
                            isCalendarViewShown,
                            "isSpinnersShown",
                            isSpinnersShown,
                            activityTheme.name());
                        Log.d(clazz.getSimpleName(), fileName);
                        rule.launchActivity(intent);
                        takeScreenshot(rule.getActivity(), fileName);
                    }
                }
            }
        }
    }

    private void takeScreenshot(final Activity activity, final String fileName){
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run(){
                takeScreenShot(activity, fileName);
            }
        });

    }

    private void takeScreenShot(Activity activity, String fileName){
        final View view = activity.getWindow().getDecorView();
        final Bitmap bitmap = getViewBitmap(view);
        OutputStream fos = null;
        try{
            final File file = new File(dirPath, fileName);
            fos = new BufferedOutputStream(new FileOutputStream(file));
            bitmap.compress(Bitmap.CompressFormat.PNG, 50, fos);
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(fos != null){
                try{
                    fos.close();
                }catch(IOException ignored){
                }
            }
            if(bitmap != null && !bitmap.isRecycled()){
                bitmap.recycle();
            }
        }
    }

    private Bitmap getViewBitmap(View view){
        view.setDrawingCacheEnabled(true);
        Bitmap cache = view.getDrawingCache();
        if(cache == null){
            return null;
        }
        Bitmap bitmap = Bitmap.createScaledBitmap(cache.copy(cache.getConfig(), true),
            cache.getWidth() / 4,
            cache.getHeight() / 4,
            true);
//        Bitmap bitmap = Bitmap.createBitmap(cache);
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }
}
