package com.amikom.simpleapplication;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.jar.Attributes;
import java.util.prefs.Preferences;

/**
 * Created by amikom on 28/09/2018.
 */

public class PreferencesHelper { private static PreferencesHelper INSTANCE;
   private SharedPreferences sharedPreferences;

    private PreferencesHelper(context context){
        sharedPreferences = Context
               .getApplicationContext()
                .getSharedPreferences("Simple.android.app", Context.MODE_PRIVATE);
    }

    public static PreferencesHelper getInstance(Context Context) {
        if (INSTANCE == null){
            INSTANCE = new PreferencesHelper(context);

        }
        return INSTANCE;
    }
    public SharedPreferences Pref(){
        return SharedPreferences;
    }
    public Boolean isLogin(){
        return SharedPreferences.getBoolean("isLogin", false);


    }
    public void setLogin(boolean isCall){
        sharedPreferences.edit().putBoolean("isLogin", isCall).apply();
    }
    public void setName(String isName){
        sharedPreferences.edit().putString("isName", isName).apply();
    }
    public String getName(){
        return sharedPreferences.getString("isName", false);
    }
}
