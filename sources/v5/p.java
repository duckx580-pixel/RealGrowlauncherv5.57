package v5;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.a f18607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5.a f18608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5.q f18609c;

    static {
        androidx.work.p.f("WMFgUpdater");
    }

    public p(WorkDatabase workDatabase, m5.g gVar, n7.e eVar) {
        this.f18608b = gVar;
        this.f18607a = eVar;
        this.f18609c = workDatabase.t();
    }
}
