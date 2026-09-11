package c0;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {
    public f F;

    public g(f fVar) {
        this.F = fVar;
    }

    @Override // a1.m
    public final void A0() {
        f fVar = this.F;
        if (fVar != null) {
            l.d("null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", fVar);
            fVar.f3268a.n(this);
        }
    }

    @Override // a1.m
    public final void z0() {
        f fVar = this.F;
        if (fVar != null) {
            fVar.f3268a.n(this);
        }
        if (fVar != null) {
            fVar.f3268a.b(this);
        }
        this.F = fVar;
    }
}
