package v5;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18615e = androidx.work.p.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.c f18616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18617b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18618c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18619d = new Object();

    public t(m5.c cVar) {
        this.f18616a = cVar;
    }

    public final void a(u5.j jVar) {
        synchronized (this.f18619d) {
            try {
                if (((s) this.f18617b.remove(jVar)) != null) {
                    androidx.work.p.d().a(f18615e, "Stopping timer for " + jVar);
                    this.f18618c.remove(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
