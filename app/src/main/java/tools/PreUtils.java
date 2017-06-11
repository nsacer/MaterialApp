package tools;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2017/3/4.
 */

public class PreUtils {

    private static final String PREFERENCE_NAME = "MaterialAppPre";
    private static final String PRE_THEME_MODE = "theme_mode";


    public static SharedPreferences getPreference(){
        return MaterialApp.getContext().getSharedPreferences(PREFERENCE_NAME,
                Context.MODE_PRIVATE);
    }

    public static boolean getIsDarkMode() {

        return getPreference().getBoolean(PRE_THEME_MODE, false);
    }

    public static void setDarkMode(boolean mode) {

        getPreference().edit().putBoolean(PRE_THEME_MODE, mode).apply();
    }
}
