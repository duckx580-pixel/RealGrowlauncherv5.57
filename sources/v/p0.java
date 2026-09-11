package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends a1.m implements u1.d {
    public boolean D;
    public final u1.h E;

    public p0(boolean z3) {
        this.D = z3;
        u1.g gVar = androidx.compose.foundation.gestures.a.f1152c;
        Boolean bool = Boolean.TRUE;
        u1.h hVar = new u1.h(gVar);
        hVar.f17561h.setValue(bool);
        this.E = hVar;
    }

    @Override // u1.d
    public final u5.f O() {
        return this.D ? this.E : u1.b.f17552g;
    }
}
