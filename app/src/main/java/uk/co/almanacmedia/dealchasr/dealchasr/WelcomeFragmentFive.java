package uk.co.almanacmedia.dealchasr.dealchasr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.co.almanacmedia.dealchasr.dealspotr.R;

/**
 * Created by Sam on 21/02/2018.
 */

public class WelcomeFragmentFive extends Fragment {

    public static final String PREFS_NAME = "DealSpotr.Data";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.welcome_slide_five, container, false);

        return rootView;
    }
}
