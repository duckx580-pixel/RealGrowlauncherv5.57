package o5;

import androidx.work.p;
import u5.j;
import v5.s;
import v5.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12676i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f12677r;

    public /* synthetic */ f(g gVar, int i10) {
        this.f12676i = i10;
        this.f12677r = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12676i) {
            case 0:
                g.a(this.f12677r);
                return;
            default:
                g gVar = this.f12677r;
                if (gVar.w != 0) {
                    p.d().a(g.C, "Already started work for " + gVar.f12680s);
                    return;
                }
                gVar.w = 1;
                p.d().a(g.C, "onAllConstraintsMet for " + gVar.f12680s);
                if (!gVar.f12681t.f12693t.h(gVar.B, null)) {
                    gVar.b();
                    return;
                }
                t tVar = gVar.f12681t.f12692s;
                j jVar = gVar.f12680s;
                synchronized (tVar.f18619d) {
                    p.d().a(t.f18615e, "Starting timer for " + jVar);
                    tVar.a(jVar);
                    s sVar = new s(tVar, jVar);
                    tVar.f18617b.put(jVar, sVar);
                    tVar.f18618c.put(jVar, gVar);
                    tVar.f18616a.f11571i.postDelayed(sVar, 600000L);
                    break;
                }
                return;
        }
    }
}
