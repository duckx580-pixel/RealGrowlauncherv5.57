package androidx.compose.foundation;

import a1.m;
import u.s0;
import v1.o0;
import x.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f1126a;

    public HoverableElement(l lVar) {
        this.f1126a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && kotlin.jvm.internal.l.a(((HoverableElement) obj).f1126a, this.f1126a);
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1126a.hashCode() * 31;
    }

    @Override // v1.o0
    public final m m() {
        s0 s0Var = new s0();
        s0Var.D = this.f1126a;
        return s0Var;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        s0 s0Var = (s0) mVar;
        l lVar = s0Var.D;
        l lVar2 = this.f1126a;
        if (kotlin.jvm.internal.l.a(lVar, lVar2)) {
            return;
        }
        s0Var.I0();
        s0Var.D = lVar2;
    }
}
