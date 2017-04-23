package com.example.xpc.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/4/23 0023.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
