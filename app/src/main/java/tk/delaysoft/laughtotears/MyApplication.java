package tk.delaysoft.laughtotears;

import android.app.Application;

import com.vk.sdk.VKSdk;

/**
 * Created by andro on 09.09.2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);

    }
}
