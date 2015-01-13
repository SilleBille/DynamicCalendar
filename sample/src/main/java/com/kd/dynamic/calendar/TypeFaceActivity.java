/*
 * Copyright (c) 2015. DineshPrasanth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kd.dynamic.calendar;

import android.app.DatePickerDialog;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import com.kd.dynamic.calendar.generator.ImageGenerator;

import java.util.Calendar;


public class TypeFaceActivity extends ActionBarActivity {

    ImageGenerator mImageGenerator;
    EditText mDateEditText;
    Calendar mCurrentDate;
    Bitmap mGeneratedDateIcon;
    View.OnClickListener setDate = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mCurrentDate = Calendar.getInstance();
            int mYear = mCurrentDate.get(Calendar.YEAR);
            int mMonth = mCurrentDate.get(Calendar.MONTH);
            int mDay = mCurrentDate.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog mDatePicker = new DatePickerDialog(TypeFaceActivity.this, new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker datepicker, int selectedYear, int selectedMonth, int selectedDay) {
                    // Update the editText to display the selected date
                    mDateEditText.setText(selectedDay + "-" + (selectedMonth + 1) + "-" + selectedYear);

                    // Set the mCurrentDate to the selected date-month-year
                    mCurrentDate.set(selectedYear, selectedMonth, selectedDay);
                    mGeneratedDateIcon = mImageGenerator.generateDateImage(mCurrentDate, R.drawable.empty_calendar);
                    mDisplayGeneratedImage.setImageBitmap(mGeneratedDateIcon);

                }
            }, mYear, mMonth, mDay);
            mDatePicker.show();
        }
    };
    ImageView mDisplayGeneratedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_face);
        mImageGenerator = new ImageGenerator(this);
        mDateEditText = (EditText) findViewById(R.id.txtDateEntered);
        mDisplayGeneratedImage = (ImageView) findViewById(R.id.imgGenerated);

        mImageGenerator.setIconSize(50, 50);
        mImageGenerator.setDateSize(30);
        mImageGenerator.setMonthSize(10);

        mImageGenerator.setDatePosition(42);
        mImageGenerator.setMonthPosition(14);

        mImageGenerator.setDateColor(Color.parseColor("#009688"));
        mImageGenerator.setMonthColor(Color.WHITE);

        mImageGenerator.setStorageToSDCard(true);

        mImageGenerator.setDateTypeFace("Roboto-Light.ttf");
        mImageGenerator.setMonthTypeFace("Ubuntu-R.ttf");

        // Pop up Date picker on pressing the editText
        mDateEditText.setOnClickListener(setDate);


    }
}
