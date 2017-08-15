package aliyun.wind.onesdk.push;

import android.content.Intent;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangduo on 16/3/2.
 */
public class AliPushPackage implements ReactPackage {
    AliPushModule aliPushModule;
    public static Intent initIntent = null;

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
//        return null;
        List<NativeModule> list = new ArrayList<NativeModule>();
        aliPushModule = new AliPushModule(reactContext);

        list.add(aliPushModule);
        return list;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

}
