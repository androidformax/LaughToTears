package tk.delaysoft.laughtotears.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import tk.delaysoft.laughtotears.CurrentUser;
import tk.delaysoft.laughtotears.mvp.view.MainView;

/**
 * Created by andro on 12.09.2017.
 */

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
    public void checkAuth(){
        if (!CurrentUser.isAutorized()){
            getViewState().startSignIn();

        }else{
            getViewState().signedId();
        }
    }
}
