package com.usercentrics.sdk;

import android.os.Looper;
import eh.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AssertionsKt {
    /* JADX INFO: renamed from: assert, reason: not valid java name */
    public static final void m22assert(boolean z3, a aVar) {
        l.f("lazyMessage", aVar);
    }

    public static final void assertNotUIThread() {
        if (isUnitTest()) {
            return;
        }
        isUIThread();
    }

    public static final void assertUIThread() {
        if (isUnitTest()) {
            return;
        }
        isUIThread();
    }

    private static final boolean isUIThread() {
        Looper mainLooper = Looper.getMainLooper();
        return l.a(mainLooper != null ? mainLooper.getThread() : null, Thread.currentThread());
    }

    private static final boolean isUnitTest() {
        return Looper.getMainLooper() == null;
    }
}
