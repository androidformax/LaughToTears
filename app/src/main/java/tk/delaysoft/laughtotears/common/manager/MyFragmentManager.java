package tk.delaysoft.laughtotears.common.manager;

import android.app.FragmentTransaction;

import java.util.Stack;

import tk.delaysoft.laughtotears.ui.fragment.BaseFragment;

/**
 * Created by andro on 16.09.2017.
 */

public class MyFragmentManager {
    private static final int EMPTY_FRAGMENT_STACK_SIZE = 1;
    private Stack<BaseFragment> mFragmentStack = new Stack();
    private BaseFragment mCurrentFragment;

    private FragmentTransaction createAddTransaction()
}
