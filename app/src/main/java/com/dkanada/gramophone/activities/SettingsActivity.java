package com.dkanada.gramophone.activities;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;
import androidx.preference.TwoStatePreference;

import com.dkanada.gramophone.databinding.ActivitySettingsBinding;
import com.dkanada.gramophone.R;
import com.dkanada.gramophone.views.shortcuts.DynamicShortcutManager;
import com.dkanada.gramophone.dialogs.preferences.CategoryPreferenceDialog;
import com.dkanada.gramophone.dialogs.preferences.NowPlayingPreferenceDialog;
import com.dkanada.gramophone.activities.base.AbsBaseActivity;
import com.dkanada.gramophone.util.PreferenceUtil;

public class SettingsActivity extends AbsBaseActivity {
    private ActivitySettingsBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbar.setBackgroundColor(PreferenceUtil.getInstance(this).getPrimaryColor());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new SettingsFragment()).commit();
        } else {
            SettingsFragment fragment = (SettingsFragment) getSupportFragmentManager().findFragmentById(R.id.content_frame);
            if (fragment != null) fragment.invalidateSettings();
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat implements SharedPreferences.OnSharedPreferenceChangeListener {
        @Override
        public void onCreatePreferences(Bundle bundle, String s) {
            addPreferencesFromResource(R.xml.pref_library);
            addPreferencesFromResource(R.xml.pref_interface);
            addPreferencesFromResource(R.xml.pref_notification);
            addPreferencesFromResource(R.xml.pref_now_playing);
            addPreferencesFromResource(R.xml.pref_lock_screen);
            addPreferencesFromResource(R.xml.pref_playback);
            addPreferencesFromResource(R.xml.pref_cache);
        }

        @Override
        public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            getListView().setPadding(0, 0, 0, 0);
            setDivider(null);
            invalidateSettings();
            PreferenceUtil.getInstance(getActivity()).registerOnSharedPreferenceChangedListener(this);
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            PreferenceUtil.getInstance(getActivity()).unregisterOnSharedPreferenceChangedListener(this);
        }

        @SuppressWarnings("ConstantConditions")
        private void invalidateSettings() {
            final TwoStatePreference classicNotification = findPreference(PreferenceUtil.CLASSIC_NOTIFICATION);
            final TwoStatePreference coloredNotification = findPreference(PreferenceUtil.COLORED_NOTIFICATION);
            final TwoStatePreference colorAppShortcuts = findPreference(PreferenceUtil.COLORED_SHORTCUTS);
            final Preference categoryPreference = findPreference(PreferenceUtil.CATEGORIES);
            final Preference nowPlayingPreference = findPreference(PreferenceUtil.NOW_PLAYING_SCREEN);
            final Preference downloadLocationPreference = findPreference(PreferenceUtil.LOCATION_DOWNLOAD);
            final Preference showAlbumCoverPreference = findPreference(PreferenceUtil.SHOW_ALBUM_COVER);
            final Preference blurAlbumCoverPreference = findPreference(PreferenceUtil.BLUR_ALBUM_COVER);

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
                classicNotification.setEnabled(false);
            }

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
                coloredNotification.setEnabled(false);
                colorAppShortcuts.setEnabled(false);
            }

            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.P) {
                blurAlbumCoverPreference.setEnabled(false);
            }

            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
                downloadLocationPreference.setEnabled(false);

                // stock Android 11 removed the album cover on lock screens
                // supported on LineageOS so we might want to add a check at some point
                showAlbumCoverPreference.setEnabled(false);
            }

            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.R) {
                // custom notification layouts were removed entirely in Android 12
                classicNotification.setEnabled(false);
                coloredNotification.setEnabled(false);
            }

            categoryPreference.setOnPreferenceClickListener(preference -> {
                CategoryPreferenceDialog.create().show(getParentFragmentManager(), CategoryPreferenceDialog.TAG);
                return false;
            });

            nowPlayingPreference.setOnPreferenceClickListener(preference -> {
                NowPlayingPreferenceDialog.create().show(getParentFragmentManager(), NowPlayingPreferenceDialog.TAG);
                return false;
            });

            // use this to set default state for playback screen and notification style
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(requireContext());

            onSharedPreferenceChanged(preferences, PreferenceUtil.NOW_PLAYING_SCREEN);
            onSharedPreferenceChanged(preferences, PreferenceUtil.CLASSIC_NOTIFICATION);
        }

        @Override
        @SuppressWarnings("ConstantConditions")
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
            switch (key) {
                case PreferenceUtil.COLORED_SHORTCUTS:
                    new DynamicShortcutManager(requireContext()).updateDynamicShortcuts();
                    break;
                case PreferenceUtil.PRIMARY_COLOR:
                case PreferenceUtil.ACCENT_COLOR:
                case PreferenceUtil.GENERAL_THEME:
                    // apply theme before reloading shortcuts to apply the new icon colors
                    requireActivity().setTheme(PreferenceUtil.getInstance(getContext()).getTheme().style);
                    new DynamicShortcutManager(requireContext()).updateDynamicShortcuts();

                    requireActivity().recreate();
                    break;
                case PreferenceUtil.NOW_PLAYING_SCREEN:
                    Preference preference = findPreference(PreferenceUtil.NOW_PLAYING_SCREEN);

                    preference.setSummary(PreferenceUtil.getInstance(getActivity()).getNowPlayingScreen().titleRes);
                    break;
                case PreferenceUtil.CLASSIC_NOTIFICATION:
                    TwoStatePreference colorNotification = findPreference(PreferenceUtil.COLORED_NOTIFICATION);

                    colorNotification.setEnabled(sharedPreferences.getBoolean(key, false));
                    colorNotification.setChecked(colorNotification.isEnabled());
                    break;
            }
        }
    }
}
