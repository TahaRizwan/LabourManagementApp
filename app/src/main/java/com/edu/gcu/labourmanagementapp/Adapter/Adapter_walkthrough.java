package com.edu.gcu.labourmanagementapp.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.edu.gcu.labourmanagementapp.Fragment.FirstWalkthroughFragment;
import com.edu.gcu.labourmanagementapp.Fragment.SecondWalkthroughFragment;
import com.edu.gcu.labourmanagementapp.Fragment.ThirdWalkthroughFragment;
public class Adapter_walkthrough extends FragmentStatePagerAdapter {
    public Adapter_walkthrough(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FirstWalkthroughFragment tab1 = new FirstWalkthroughFragment();
                return tab1;
            case 1:
                SecondWalkthroughFragment tab2 = new SecondWalkthroughFragment();
                return tab2;
            case 2:
                ThirdWalkthroughFragment tab3 = new ThirdWalkthroughFragment();
                return tab3;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
}