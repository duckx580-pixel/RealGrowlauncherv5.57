package androidx.compose.foundation.layout;

import a1.m;
import t.g;
import v1.o0;
import y.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1157b;

    public FillElement(float f9, int i10) {
        this.f1156a = i10;
        this.f1157b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f1156a == fillElement.f1156a && this.f1157b == fillElement.f1157b;
    }

    @Override // v1.o0
    public final int hashCode() {
        return Float.hashCode(this.f1157b) + (g.c(this.f1156a) * 31);
    }

    @Override // v1.o0
    public final m m() {
        w wVar = new w();
        wVar.D = this.f1156a;
        wVar.E = this.f1157b;
        return wVar;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        w wVar = (w) mVar;
        wVar.D = this.f1156a;
        wVar.E = this.f1157b;
    }
}
