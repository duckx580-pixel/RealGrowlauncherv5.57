package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q.e f3938a = new q.e(0);

    public static synchronized void a() {
        q.e eVar = f3938a;
        Iterator it = ((q.d) eVar.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        eVar.clear();
    }
}
