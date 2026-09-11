package v5;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f18594t = androidx.work.p.f("StopWorkRunnable");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m5.p f18595i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m5.k f18596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f18597s;

    public l(m5.p pVar, m5.k kVar, boolean z3) {
        this.f18595i = pVar;
        this.f18596r = kVar;
        this.f18597s = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        m5.q qVar;
        if (this.f18597s) {
            m5.g gVar = this.f18595i.f11614f;
            m5.k kVar = this.f18596r;
            gVar.getClass();
            String str = kVar.f11596a.f17670a;
            synchronized (gVar.B) {
                try {
                    androidx.work.p.d().a(m5.g.C, "Processor stopping foreground work " + str);
                    qVar = (m5.q) gVar.f11589v.remove(str);
                    if (qVar != null) {
                        gVar.f11590x.remove(str);
                    }
                } finally {
                }
            }
            zC = m5.g.c(str, qVar);
        } else {
            m5.g gVar2 = this.f18595i.f11614f;
            m5.k kVar2 = this.f18596r;
            gVar2.getClass();
            String str2 = kVar2.f11596a.f17670a;
            synchronized (gVar2.B) {
                try {
                    m5.q qVar2 = (m5.q) gVar2.w.remove(str2);
                    if (qVar2 == null) {
                        androidx.work.p.d().a(m5.g.C, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) gVar2.f11590x.get(str2);
                        if (set != null && set.contains(kVar2)) {
                            androidx.work.p.d().a(m5.g.C, "Processor stopping background work " + str2);
                            gVar2.f11590x.remove(str2);
                            zC = m5.g.c(str2, qVar2);
                        }
                    }
                    zC = false;
                } finally {
                }
            }
        }
        androidx.work.p.d().a(f18594t, "StopWorkRunnable for " + this.f18596r.f11596a.f17670a + "; Processor.stopWork = " + zC);
    }
}
