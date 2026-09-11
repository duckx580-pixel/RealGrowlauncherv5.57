package vh;

import oh.s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f18706s = new k();

    @Override // oh.s
    public final void C(ug.h hVar, Runnable runnable) {
        d dVar = d.f18692t;
        dVar.f18694s.c(runnable, j.f18705h, false);
    }

    @Override // oh.s
    public final void F(ug.h hVar, Runnable runnable) {
        d dVar = d.f18692t;
        dVar.f18694s.c(runnable, j.f18705h, true);
    }

    @Override // oh.s
    public final s W(int i10) {
        th.a.a(i10);
        return i10 >= j.f18701d ? this : super.W(i10);
    }
}
