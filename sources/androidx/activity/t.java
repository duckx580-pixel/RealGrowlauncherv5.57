package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f714a = new t();

    public final OnBackInvokedCallback a(eh.a aVar) {
        kotlin.jvm.internal.l.f("onBackInvoked", aVar);
        return new s(0, aVar);
    }

    public final void b(Object obj, int i10, Object obj2) {
        kotlin.jvm.internal.l.f("dispatcher", obj);
        kotlin.jvm.internal.l.f("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        kotlin.jvm.internal.l.f("dispatcher", obj);
        kotlin.jvm.internal.l.f("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
