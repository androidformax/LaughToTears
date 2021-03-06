package tk.delaysoft.laughtotears;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKSdk;

/**
 * Created by andro on 12.09.2017.
 */

public class CurrentUser {
    public static String getAccessToken(){
        if(VKAccessToken.currentToken() ==null){
            return  null;
        }
        return VKAccessToken.currentToken().accessToken;
    }
    public static String getId(){
        if(VKAccessToken.currentToken() ==null){
            return  null;
        }
        return VKAccessToken.currentToken().userId;
    }

    public static boolean isAutorized(){
        return VKSdk.isLoggedIn()
                && VKAccessToken.currentToken()!=null
                && VKAccessToken.currentToken().isExpired();

    }
}
