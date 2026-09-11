package w1;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f18887a = new p1();

    public final boolean a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = motionEvent.getRawY(i10);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
