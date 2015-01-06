package com.kd.dynamic.calendar.generator;

/**
 * Created by DineshPrasanth on 06-01-2015.
 */
public class ImageGenerator {

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
