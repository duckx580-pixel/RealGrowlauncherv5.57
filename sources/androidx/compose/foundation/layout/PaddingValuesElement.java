package androidx.compose.foundation.layout;

import a1.m;
import kotlin.jvm.internal.l;
import v1.o0;
import y.m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f1169a;

    public PaddingValuesElement(m0 m0Var) {
        this.f1169a = m0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return l.a(this.f1169a, paddingValuesElement.f1169a);
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1169a.hashCode();
    }

    @Override // v1.o0
    public final m m() {
        y.o0 o0Var = new y.o0();
        o0Var.D = this.f1169a;
        return o0Var;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        ((y.o0) mVar).D = this.f1169a;
    }
}
