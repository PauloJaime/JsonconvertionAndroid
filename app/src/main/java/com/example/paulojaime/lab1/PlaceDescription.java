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

//importing all the libraries needed for the project.
import android.icu.util.ULocale;
import org.json.JSONObject;
import java.util.Locale;


public class PlaceDescription {

    //declaring all the varibales using in the the class PlaceDescription
    public String name;
    public String description;
    public String category;
    public String addressTitle;
    public String addressStreet;
    public String elevation;
    public String latitude;
    public String longitude;

    //constructor of the class PlaceDescription
    PlaceDescription(String jsonStr){
        try{
            //create a JSONObject named jo with jsonStr as paramenter
            JSONObject jo = new JSONObject(jsonStr);

            //set all the variables equal to all the respective keys from the jsonStr
            name = jo.getString("name");
            description = jo.getString("description");
            category = jo.getString("category");
            addressTitle = jo.getString("addressTitle");
            addressStreet = jo.getString("addressStreet");
            elevation = jo.getString("elevation");
            latitude = jo.getString("latitude");
            longitude = jo.getString("longitude");

            //catching exceptions
        }catch (Exception ex){
            android.util.Log.w(this.getClass().getSimpleName(),
                    "error converting to/from json");
        }
    }

    //Method toJsonString
    public String toJsonString(){
        String ret = "";
        try{
            //creating a JSONObject object called jo
            JSONObject jo = new JSONObject();

            //put all the values on the respective keys
            jo.put("name",name);
            jo.put("description", description);
            jo.put("category", category);
            jo.put("addressTitle", addressTitle);
            jo.put("addressStreet", addressStreet);
            jo.put("elevation", elevation);
            jo.put("latitude", latitude);
            jo.put("longitude", longitude);
            ret = jo.toString();

            //catching exceptions
        }catch (Exception ex){
            android.util.Log.w(this.getClass().getSimpleName(),
                    "error converting to/from json");
        }
        return ret;
        //ne dof the method toJsonString
    }
    //end of the class PlaceDescription
}
