package org.lineageos.settings.vibrator;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class VibratorSettingsActivity extends PreferenceActivity {

    private static final String TAG = "VibratorSettingsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new VibratorSettings(), TAG).commit();
    }
}
