package androidx.compose.foundation.layout;

import a1.m;
import v1.o0;
import y.x0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1.c f1177a;

    public VerticalAlignElement(a1.c cVar) {
        this.f1177a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return this.f1177a.equals(verticalAlignElement.f1177a);
    }

    @Override // v1.o0
    public final int hashCode() {
        return Float.hashCode(this.f1177a.f186a);
    }

    @Override // v1.o0
    public final m m() {
        x0 x0Var = new x0();
        x0Var.D = this.f1177a;
        return x0Var;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        ((x0) mVar).D = this.f1177a;
    }
}
