package com.rtsoft.growtopia;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
class WrapSharedMultiTouchInput {
    private SharedMultiTouchInput mInstance;

    public static boolean OnInput(MotionEvent motionEvent) {
        return SharedMultiTouchInput.OnInput(motionEvent);
    }

    public static void checkAvailable(SharedActivity sharedActivity) {
        SharedMultiTouchInput.init(sharedActivity);
    }
}
