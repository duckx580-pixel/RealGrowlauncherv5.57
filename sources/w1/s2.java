package w1;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2 f18934a = new s2();

    public final void a(t tVar) {
        ViewParent parent = tVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(tVar, tVar);
        }
    }
}
