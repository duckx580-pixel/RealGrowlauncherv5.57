package androidx.compose.ui.input.nestedscroll;

import a1.m;
import p1.d;
import p1.g;
import p1.h;
import t2.j;
import v1.o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1233a;

    public NestedScrollElement(d dVar) {
        this.f1233a = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        Object obj2 = j.f16389a;
        return obj2.equals(obj2) && nestedScrollElement.f1233a.equals(this.f1233a);
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1233a.hashCode() + (j.f16389a.hashCode() * 31);
    }

    @Override // v1.o0
    public final m m() {
        return new h(j.f16389a, this.f1233a);
    }

    @Override // v1.o0
    public final void n(m mVar) {
        h hVar = (h) mVar;
        hVar.D = j.f16389a;
        d dVar = hVar.E;
        if (dVar.f13240a == hVar) {
            dVar.f13240a = null;
        }
        d dVar2 = this.f1233a;
        if (!dVar2.equals(dVar)) {
            hVar.E = dVar2;
        }
        if (hVar.C) {
            d dVar3 = hVar.E;
            dVar3.f13240a = hVar;
            dVar3.f13241b = new g(0, hVar);
            dVar3.f13242c = hVar.v0();
        }
    }
}
