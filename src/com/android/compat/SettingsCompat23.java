package com.android.compat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;

public class SettingsCompat23 {

	@SuppressLint("NewApi")
	public static boolean canDrawOverlays(Context context) {
		return Settings.canDrawOverlays(context);
	}
}
