package t3;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16428a;

    public i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f16428a = collectionItemInfo;
    }

    public static i a(int i10, int i11, int i12, int i13, boolean z3) {
        return new i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z3));
    }
}
