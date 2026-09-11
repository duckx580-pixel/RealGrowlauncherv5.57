package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1952a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1952a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((v0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
