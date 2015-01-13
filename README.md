Dynamic Calendar
================

DynamicCalendar library generates a custom calendar icon based on the date you provide. You can also change the background template of the generated date icon.

You can specify the font's typeface, size, position, color and the empty calendar icon.

!!! There may be some issues with different screen resolutions. Please let me know if you face any such problems

Features Included
-----------------
- Specify the background empty calendar icon
- Change the typeface of both date and month 
- Change the size of the date and month fonts independently
- Provision for saving the generated image to external storage

Change Log
----------
- **12 Jan 2015**: First release

Screen Shots
------------
![Basic Icon Generated][1]
![Typeface and color changed][2]

Adding the library to your project
----------------------------------
Add this to your `build.gradle` of your project

```groovy
dependencies {
    ...
    Will update shortly
    ...
}
```
    
Usage
-----
## Mandatory Java Code
```java
// Create an object of ImageGenerator class in your activity and pass context as the parameter
ImageGenerator mImageGenerator = new ImageGenerator(this);

// Set the icon size to the generated in dip. 
mImageGenerator.setIconSize(50, 50);

// Set the size of the date and month font in dip.
mImageGenerator.setDateSize(30);
mImageGenerator.setMonthSize(10);

// Set the position of the date and month in dip.
mImageGenerator.setDatePosition(42);
mImageGenerator.setMonthPosition(14);

// Set the color of the font to be generated
mImageGenerator.setDateColor(Color.parseColor("#3c6eaf"));
mImageGenerator.setMonthColor(Color.WHITE);
```

## Optional Features 
```java
// To store the generated image to external storage
// The images are stored in ../sdcard/CalendarImageGenerated/
mImageGenerator.setStorageToSDCard(true);

// Set the typeface of the font
// You have to place the fonts in assets/fonts (Create the folders if they do not exist)
// You have to add the complete name with extension (The extension should be in lower case)
mImageGenerator.setDateTypeFace("Roboto-Light.ttf");
mImageGenerator.setMonthTypeFace("Ubuntu-R.ttf");
```

Sample App
----------
A sample app using this library is available in Android Play Store.

<a href="https://play.google.com/store/apps/details?id=">
  <img alt="Android app on Google Play"
       src="https://developer.android.com/images/brand/en_app_rgb_wo_60.png" />
</a>

Author
------
[Dinesh Prasanth](https://github.com/SilleBille)

License
-------

        Copyright (c) 2015. DineshPrasanth
    
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

           http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.

 [1]: https://raw.github.com/SilleBille/DynamicCalendar/master/sample-images/BasicActivity.png
 [2]: https://raw.github.com/SilleBille/DynamicCalendar/master/sample-images/TypeFaceActivity.png
