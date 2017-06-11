package tools;

import android.app.Activity;
import android.util.Log;

import com.example.administrator.materialapp.R;

/**
 * Created by Administrator on 2017/3/4.
 */

public class ThemeTool {

    public static void changeTheme(Activity activity) {

        Log.i("====", PreUtils.getIsDarkMode() + "===changeThme");
        if(PreUtils.getIsDarkMode()) {
            activity.setTheme(R.style.AppThemeDark);
        }
    }
}
