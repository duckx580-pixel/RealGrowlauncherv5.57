package androidx.compose.ui.layout;

import a1.m;
import eh.f;
import kotlin.jvm.internal.l;
import t1.u;
import v1.o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1238a;

    public LayoutElement(f fVar) {
        this.f1238a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && l.a(this.f1238a, ((LayoutElement) obj).f1238a);
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1238a.hashCode();
    }

    @Override // v1.o0
    public final m m() {
        u uVar = new u();
        uVar.D = this.f1238a;
        return uVar;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        ((u) mVar).D = this.f1238a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f1238a + ')';
    }
}
