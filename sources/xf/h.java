package xf;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ tf.c f19714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ xe.d f19715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ xe.c f19716u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ tf.c f19717v;
    public final /* synthetic */ int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f19718x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, c cVar, tf.c cVar2, xe.d dVar, xe.c cVar3, tf.c cVar4, int i10) {
        super(iVar, cVar);
        this.f19718x = iVar;
        this.f19714s = cVar2;
        this.f19715t = dVar;
        this.f19716u = cVar3;
        this.f19717v = cVar4;
        this.w = i10;
    }

    @Override // xf.a
    public final Object a() {
        ReentrantLock reentrantLock = this.f19714s.f17168a;
        reentrantLock.lock();
        try {
            pf.h hVar = this.f19718x.f19706r;
            int size = hVar.f13391i.size() - 1;
            final xe.d dVar = this.f19715t;
            final xe.c cVar = this.f19716u;
            final tf.c cVar2 = this.f19714s;
            final tf.c cVar3 = this.f19717v;
            hVar.x(0, size, new pf.f() { // from class: xf.g
                @Override // pf.f
                public final void b(int i10, pf.i iVar, n6.i iVar2) {
                    int iB = (int) dVar.b(iVar, 0, iVar.f13401r, cVar);
                    h hVar2 = this.f19709i;
                    hVar2.f19718x.t();
                    List list = Collections.EMPTY_LIST;
                    int iV = i.v();
                    if (!hVar2.b()) {
                        iVar2.f12147a = true;
                        return;
                    }
                    tf.c cVar4 = cVar2;
                    cVar4.a(cVar4.f17172e, iB + iV);
                    tf.c cVar5 = cVar3;
                    cVar5.a(cVar5.f17172e, iV);
                }
            });
            reentrantLock.unlock();
            return null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // xf.a
    public final boolean b() {
        return super.b() && this.f19718x.f19719t.get() == this.w;
    }
}
