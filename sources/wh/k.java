package wh;

import java.util.concurrent.atomic.AtomicReferenceArray;
import th.r;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicReferenceArray f19280u;

    public k(long j, k kVar, int i10) {
        super(j, kVar, i10);
        this.f19280u = new AtomicReferenceArray(j.f19279f);
    }

    @Override // th.r
    public final int f() {
        return j.f19279f;
    }

    @Override // th.r
    public final void g(int i10, ug.h hVar) {
        this.f19280u.set(i10, j.f19278e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f17228s + ", hashCode=" + hashCode() + ']';
    }
}
