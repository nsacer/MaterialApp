package tools;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/3/4.
 */

public class MaterialApp extends Application {

    public static Context mContext;

    public static Context getContext(){
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}
