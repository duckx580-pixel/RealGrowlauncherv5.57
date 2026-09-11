package androidx.compose.foundation.layout;

import a1.m;
import q2.e;
import v1.o0;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1176b;

    public UnspecifiedConstraintsElement(float f9, float f10) {
        this.f1175a = f9;
        this.f1176b = f10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f1175a, unspecifiedConstraintsElement.f1175a) && e.a(this.f1176b, unspecifiedConstraintsElement.f1176b);
    }

    @Override // v1.o0
    public final int hashCode() {
        return Float.hashCode(this.f1176b) + (Float.hashCode(this.f1175a) * 31);
    }

    @Override // v1.o0
    public final m m() {
        v0 v0Var = new v0();
        v0Var.D = this.f1175a;
        v0Var.E = this.f1176b;
        return v0Var;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        v0 v0Var = (v0) mVar;
        v0Var.D = this.f1175a;
        v0Var.E = this.f1176b;
    }
}
