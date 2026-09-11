package androidx.compose.ui.focus;

import a1.m;
import e1.j;
import kotlin.jvm.internal.l;
import v1.o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1219a;

    public FocusRequesterElement(j jVar) {
        this.f1219a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && l.a(this.f1219a, ((FocusRequesterElement) obj).f1219a);
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1219a.hashCode();
    }

    @Override // v1.o0
    public final m m() {
        e1.l lVar = new e1.l();
        lVar.D = this.f1219a;
        return lVar;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        e1.l lVar = (e1.l) mVar;
        lVar.D.f5210a.n(lVar);
        j jVar = this.f1219a;
        lVar.D = jVar;
        jVar.f5210a.b(lVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f1219a + ')';
    }
}
