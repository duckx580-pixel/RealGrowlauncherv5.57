package da;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements za.b, za.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5008a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f5009b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f5010c;

    public k(Executor executor) {
        this.f5010c = executor;
    }

    public final synchronized void a() {
        y9.c cVar = y9.c.f20221i;
        y9.d dVar = y9.d.f20222a;
        synchronized (this) {
            try {
                if (!this.f5008a.containsKey(w9.a.class)) {
                    this.f5008a.put(w9.a.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f5008a.get(w9.a.class)).put(dVar, cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
