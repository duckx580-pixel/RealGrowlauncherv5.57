package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements f1, h, sh.r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h1 f14808i;

    public r0(h1 h1Var) {
        this.f14808i = h1Var;
    }

    @Override // sh.r
    public final h b(ug.h hVar, int i10, int i11) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || i11 != 2) ? w0.o(this, hVar, i10, i11) : this;
    }

    @Override // rh.h
    public final Object collect(i iVar, ug.c cVar) throws Throwable {
        this.f14808i.collect(iVar, cVar);
        return vg.a.f18663i;
    }

    @Override // rh.f1
    public final Object getValue() {
        return this.f14808i.getValue();
    }
}
