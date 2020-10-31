package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("p1KyQaoOJF0Itk2baEheRoxpquaDkrAjXlhrxXIG")
                .clientKey("jRjEiVTPs8T5nIB9z3nE0I6Jc8lKSPYaZyO8IJi0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
