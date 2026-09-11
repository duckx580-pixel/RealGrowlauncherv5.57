package g1;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f6904a = new s();

    public final void a(Canvas canvas, boolean z3) {
        if (z3) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
