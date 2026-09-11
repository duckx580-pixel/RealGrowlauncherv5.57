package com.google.firebase.crashlytics.ndk;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class CrashpadMain {
    public static native void crashpadMain(String[] strArr);

    public static void main(String[] strArr) {
        try {
            String str = strArr[1];
            Log.d("FirebaseCrashlytics", "Path to shared objects is " + str);
            System.load(str + "libcrashlytics-handler.so");
            crashpadMain(strArr);
        } catch (UnsatisfiedLinkError e8) {
            throw new RuntimeException(e8);
        }
    }
}
