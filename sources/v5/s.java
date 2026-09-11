package v5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f18613i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u5.j f18614r;

    public s(t tVar, u5.j jVar) {
        this.f18613i = tVar;
        this.f18614r = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18613i.f18619d) {
            try {
                if (((s) this.f18613i.f18617b.remove(this.f18614r)) != null) {
                    r rVar = (r) this.f18613i.f18618c.remove(this.f18614r);
                    if (rVar != null) {
                        u5.j jVar = this.f18614r;
                        o5.g gVar = (o5.g) rVar;
                        androidx.work.p.d().a(o5.g.C, "Exceeded time limits on execution for " + jVar);
                        gVar.f12684x.execute(new o5.f(gVar, 0));
                    }
                } else {
                    androidx.work.p.d().a("WrkTimerRunnable", "Timer with " + this.f18614r + " is already marked as complete.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
