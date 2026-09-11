package androidx.compose.foundation.relocation;

import a1.m;
import c0.f;
import c0.g;
import kotlin.jvm.internal.l;
import v1.o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1191a;

    public BringIntoViewRequesterElement(f fVar) {
        this.f1191a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return l.a(this.f1191a, ((BringIntoViewRequesterElement) obj).f1191a);
        }
        return false;
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1191a.hashCode();
    }

    @Override // v1.o0
    public final m m() {
        return new g(this.f1191a);
    }

    @Override // v1.o0
    public final void n(m mVar) {
        g gVar = (g) mVar;
        f fVar = gVar.F;
        if (fVar != null) {
            fVar.f3268a.n(gVar);
        }
        f fVar2 = this.f1191a;
        if (fVar2 != null) {
            fVar2.f3268a.b(gVar);
        }
        gVar.F = fVar2;
    }
}
