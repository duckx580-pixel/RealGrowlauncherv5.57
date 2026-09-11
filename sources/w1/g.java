package w1;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f18816a;

    public g(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        this.f18816a = (AccessibilityManager) systemService;
    }
}
