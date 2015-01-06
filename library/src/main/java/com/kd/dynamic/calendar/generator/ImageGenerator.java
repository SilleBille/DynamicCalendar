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

package com.kd.dynamic.calendar.generator;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImageGenerator {

    private Context mContext;
    private float mMonthSize = 9f;
    private float mDateSize = 32f;
    private int mColor = Color.WHITE;
    private Typeface mTypeFace;

    private String mDate;
    private String mMonth;

    private Bitmap mSource;
    private Bitmap mDestination;

    /**
     * Get the context of the activity
     *
     * @param context The context in which image is to be placed
     */
    public ImageGenerator(Context context) {
        mContext = context;
    }

    /**
     * Set the size of the month font to be generated.
     *
     * @param monthSize The size of the date font
     */
    public void setMonthSize(float monthSize) {
        mMonthSize = monthSize;
    }

    /**
     * Set the size of the date font to be generated.
     *
     * @param dateSize The size of the date font
     */
    public void setDateSize(float dateSize) {
        mDateSize = dateSize;
    }

    /**
     * Apply the specified color to the font
     *
     * @param color The color of the font
     */
    public void setColor(int color) {
        mColor = color;
    }

    /**
     * Apply the specified TypeFace to the font
     *
     * @param typeFace Typeface of the font to be generated
     */
    public void setTypeFace(Typeface typeFace) {
        mTypeFace = typeFace;
    }


    public Bitmap generateDateImage(Date dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        mDate = dateFormat.format(dateString);
        mMonth = monthFormat.format(dateString);

        System.out.print(mDate + ":" + mMonth);
        return null;

    }

   /* public Bitmap generateImage(Context context, String month, String date) {
       Bitmap src = BitmapFactory.decodeResource(context.getResources(), R.drawable.calendar_empty); // the original file yourimage.jpg i added in resources
        Bitmap dest = Bitmap.createBitmap(src.getWidth(), src.getHeight(), Bitmap.Config.ARGB_8888);


        Canvas cs = new Canvas(dest);
        Paint tPaint = new Paint();
        tPaint.setTextSize(spToPixels(context, 9f));
        tPaint.setColor(Color.WHITE);
        cs.drawBitmap(src, 0f, 0f, null);
        float height = tPaint.measureText("yY");
        float width_month = tPaint.measureText(month);
        float x_month = (src.getWidth() - width_month) / 2;
        cs.drawText(month, x_month, height + spToPixels(context, 1.5f), tPaint); // 15f is to put space between top edge and the text, if you want to change it, you can


        tPaint.setTextSize(spToPixels(context, 32f));
        int APP_THEME = MyFunctions.getAppTheme(context);
        TypedArray ar = context.getResources().obtainTypedArray(APP_THEME);
        int APPLY_NATIVE_COLOR = ar.getResourceId(2, 0);
        ar.recycle();

        tPaint.setColor(context.getResources().getColor(APPLY_NATIVE_COLOR)); // Change color based on Theme
        height = tPaint.measureText("yY");
        float width_date = tPaint.measureText(date);
        float x_date = (src.getWidth() - width_date) / 2;
        cs.drawText(date, x_date, height + spToPixels(context, 7f), tPaint);
        try {
            File dirMake = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/.RemindMeBuddy/");
            dirMake.mkdirs();

            dest.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(dirMake, "GeneratedCalendar.png")));
            // dest is Bitmap, if you want to preview the final image, you can display it on screen also before saving
            return dest;

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }*/
}
