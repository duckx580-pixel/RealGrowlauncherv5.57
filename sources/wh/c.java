package wh;

import com.usercentrics.sdk.errors.UsercentricsTimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lc.n;
import oh.x1;
import qg.o;
import th.r;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements oh.e, x1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oh.f f19261i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f19262r;

    public c(d dVar, oh.f fVar) {
        this.f19262r = dVar;
        this.f19261i = fVar;
    }

    @Override // oh.x1
    public final void a(r rVar, int i10) {
        this.f19261i.a(rVar, i10);
    }

    @Override // oh.e
    public final void b(Object obj, eh.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f19263h;
        d dVar = this.f19262r;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f19261i.b(o.f13926a, new b(dVar, this, 0));
    }

    @Override // ug.c
    public final ug.h getContext() {
        return this.f19261i.f12868u;
    }

    @Override // oh.e
    public final n k(Object obj, eh.c cVar) {
        d dVar = this.f19262r;
        b bVar = new b(dVar, this, 1);
        n nVarF = this.f19261i.F((o) obj, bVar);
        if (nVarF != null) {
            d.f19263h.set(dVar, null);
        }
        return nVarF;
    }

    @Override // oh.e
    public final boolean o(Throwable th2) {
        return this.f19261i.o(th2);
    }

    @Override // ug.c
    public final void resumeWith(Object obj) {
        this.f19261i.resumeWith(obj);
    }

    @Override // oh.e
    public final n v(UsercentricsTimeoutException usercentricsTimeoutException) {
        return this.f19261i.v(usercentricsTimeoutException);
    }

    @Override // oh.e
    public final void w(Object obj) {
        this.f19261i.w(obj);
    }
}
