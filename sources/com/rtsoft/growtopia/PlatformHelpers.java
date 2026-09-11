package com.rtsoft.growtopia;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class PlatformHelpers {
    public static int GetDeviceDPI() {
        return Main.mainApp.getResources().getDisplayMetrics().densityDpi;
    }

    public static float GetDeviceScaleFactor() {
        return Main.mainApp.getResources().getDisplayMetrics().scaledDensity;
    }

    public static float[] GetInsets() {
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static void HideNativeKeyboard() {
        Main.mainApp.toggle_keyboard(false);
    }
}
