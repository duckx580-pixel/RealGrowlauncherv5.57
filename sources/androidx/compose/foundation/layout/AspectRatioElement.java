package androidx.compose.foundation.layout;

import a1.m;
import v1.o0;
import y.j;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends o0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null) == null) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    @Override // v1.o0
    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(1.0f) * 31);
    }

    @Override // v1.o0
    public final m m() {
        j jVar = new j();
        jVar.D = 1.0f;
        return jVar;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        ((j) mVar).D = 1.0f;
    }
}
