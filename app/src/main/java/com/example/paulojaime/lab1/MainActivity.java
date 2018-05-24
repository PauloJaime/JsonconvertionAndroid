package com.example.paulojaime.lab1;

/*
 * Copyright 2018 Paulo Jaime,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Purpose: Example classes conversion to/from json
 * This example shows the use of Android's
 * org.json package in creating json string of a Java object.
 *
 * Ser423 Mobile Applications
 * see http://pooh.poly.asu.edu/Mobile
 * @author Paulo Jaime Paulo.Jaime@asu.edu
 * @version January 2018
 */


//importing all the libraries needed for this LAB
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

//Begin of the class MainActivity that extends from AppCompactActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating names associated with each individual IDs
        EditText name = (EditText) findViewById(R.id.name);
        EditText description = (EditText) findViewById(R.id.descrip);
        EditText category = (EditText) findViewById(R.id.category);
        EditText addressTitle = (EditText) findViewById(R.id.addressTitle);
        EditText addressStreet = (EditText) findViewById(R.id.addressStreet);
        EditText elevation = (EditText) findViewById(R.id.elevation);
        EditText latitude = (EditText) findViewById(R.id.latitude);
        EditText longitude = (EditText) findViewById(R.id.longitude);

        //creating an object of the class PlaceDescription with the jsonStr as paramenter
        PlaceDescription obj = new PlaceDescription( "{\"name\":\"ASU-Poly\",\"description\":\"Home of ASU's Software Engineering Programs\",\"category\":\"School\",\"addressTitle\":\"ASU Software Engineering\",\"addressStreet\":\"7171 E Sonoran Arroyo Mall Peralta Hall 230 Mesa AZ 85212\",\"elevation\":\"1300.0\",\"latitude\":\"33.306388\",\"longitude\":\"-111.679121\"}");

        //calling the toJsonString method from the PlaceDescription class. Setting the text of all the TextFields to the correpoing string from the Json object
        obj.toJsonString();
        name.setText(obj.name);
        description.setText(obj.description);
        category.setText(obj.category);
        addressTitle.setText(obj.addressTitle);
        addressStreet.setText(obj.addressStreet);
        elevation.setText(obj.elevation);
        latitude.setText(obj.latitude);
        longitude.setText(obj.longitude);

    }

    //end of the class MainActivity
}
