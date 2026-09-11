package androidx.compose.ui.draw;

import a1.m;
import d1.d;
import eh.c;
import kotlin.jvm.internal.l;
import v1.o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1209a;

    public DrawBehindElement(c cVar) {
        this.f1209a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && l.a(this.f1209a, ((DrawBehindElement) obj).f1209a);
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1209a.hashCode();
    }

    @Override // v1.o0
    public final m m() {
        d dVar = new d();
        dVar.D = this.f1209a;
        return dVar;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        ((d) mVar).D = this.f1209a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f1209a + ')';
    }
}
