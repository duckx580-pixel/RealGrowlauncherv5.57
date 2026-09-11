package o0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements m1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final eh.e f12473i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final th.d f12474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public oh.m1 f12475s;

    public l0(ug.h hVar, eh.e eVar) {
        this.f12473i = eVar;
        this.f12474r = oh.x.a(hVar);
    }

    @Override // o0.m1
    public final void a() {
        oh.m1 m1Var = this.f12475s;
        if (m1Var != null) {
            m1Var.A(new a1.o());
        }
        this.f12475s = null;
    }

    @Override // o0.m1
    public final void d() {
        oh.m1 m1Var = this.f12475s;
        if (m1Var != null) {
            m1Var.A(new a1.o());
        }
        this.f12475s = null;
    }

    @Override // o0.m1
    public final void h() {
        oh.m1 m1Var = this.f12475s;
        if (m1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            m1Var.c(cancellationException);
        }
        this.f12475s = oh.x.s(this.f12474r, null, 0, this.f12473i, 3);
    }
}
