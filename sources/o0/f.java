package o0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements o0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a4.v f12409i;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Throwable f12411s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f12410r = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f12412t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f12413u = new ArrayList();

    public f(a4.v vVar) {
        this.f12409i = vVar;
    }

    public final void b(long j) {
        Object objI;
        synchronized (this.f12410r) {
            try {
                ArrayList arrayList = this.f12412t;
                this.f12412t = this.f12413u;
                this.f12413u = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar = (e) arrayList.get(i10);
                    oh.f fVar = eVar.f12405b;
                    try {
                        objI = eVar.f12404a.invoke(Long.valueOf(j));
                    } catch (Throwable th2) {
                        objI = androidx.work.v.i(th2);
                    }
                    fVar.resumeWith(objI);
                }
                arrayList.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ug.h
    public final ug.h e(ug.h hVar) {
        return android.support.v4.media.session.b.s(this, hVar);
    }

    @Override // o0.o0
    public final Object f(eh.c cVar, ug.c cVar2) {
        oh.f fVar = new oh.f(1, qd.a.j(cVar2));
        fVar.r();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        synchronized (this.f12410r) {
            Throwable th2 = this.f12411s;
            if (th2 != null) {
                fVar.resumeWith(androidx.work.v.i(th2));
            } else {
                xVar.f9667i = new e(cVar, fVar);
                boolean zIsEmpty = this.f12412t.isEmpty();
                ArrayList arrayList = this.f12412t;
                Object obj = xVar.f9667i;
                if (obj == null) {
                    kotlin.jvm.internal.l.l("awaiter");
                    throw null;
                }
                arrayList.add((e) obj);
                fVar.t(new a0.u(17, this, xVar));
                if (zIsEmpty) {
                    try {
                        this.f12409i.invoke();
                    } catch (Throwable th3) {
                        synchronized (this.f12410r) {
                            try {
                                if (this.f12411s == null) {
                                    this.f12411s = th3;
                                    ArrayList arrayList2 = this.f12412t;
                                    int size = arrayList2.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((e) arrayList2.get(i10)).f12405b.resumeWith(androidx.work.v.i(th3));
                                    }
                                    this.f12412t.clear();
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
            }
        }
        Object objQ = fVar.q();
        vg.a aVar = vg.a.f18663i;
        return objQ;
    }

    @Override // ug.h
    public final ug.f i(ug.g gVar) {
        return android.support.v4.media.session.b.i(this, gVar);
    }

    @Override // ug.h
    public final Object n(Object obj, eh.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ug.h
    public final ug.h u(ug.g gVar) {
        return android.support.v4.media.session.b.r(this, gVar);
    }
}
