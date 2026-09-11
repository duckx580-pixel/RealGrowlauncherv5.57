package androidx.compose.foundation.layout;

import a1.m;
import t.g;
import v1.o0;
import y.d0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1159a;

    public IntrinsicHeightElement(int i10) {
        this.f1159a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f1159a == intrinsicHeightElement.f1159a;
    }

    @Override // v1.o0
    public final int hashCode() {
        return Boolean.hashCode(true) + (g.c(this.f1159a) * 31);
    }

    @Override // v1.o0
    public final m m() {
        d0 d0Var = new d0();
        d0Var.D = this.f1159a;
        d0Var.E = true;
        return d0Var;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        d0 d0Var = (d0) mVar;
        d0Var.D = this.f1159a;
        d0Var.E = true;
    }
}
