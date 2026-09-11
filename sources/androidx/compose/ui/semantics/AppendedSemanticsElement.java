package androidx.compose.ui.semantics;

import a1.m;
import b2.j;
import b2.k;
import eh.c;
import kotlin.jvm.internal.l;
import v1.o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends o0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1255b;

    public AppendedSemanticsElement(c cVar, boolean z3) {
        this.f1254a = z3;
        this.f1255b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f1254a == appendedSemanticsElement.f1254a && l.a(this.f1255b, appendedSemanticsElement.f1255b);
    }

    @Override // v1.o0
    public final int hashCode() {
        return this.f1255b.hashCode() + (Boolean.hashCode(this.f1254a) * 31);
    }

    @Override // b2.k
    public final j l() {
        j jVar = new j();
        jVar.f2570r = this.f1254a;
        this.f1255b.invoke(jVar);
        return jVar;
    }

    @Override // v1.o0
    public final m m() {
        return new b2.c(this.f1254a, false, this.f1255b);
    }

    @Override // v1.o0
    public final void n(m mVar) {
        b2.c cVar = (b2.c) mVar;
        cVar.D = this.f1254a;
        cVar.F = this.f1255b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f1254a + ", properties=" + this.f1255b + ')';
    }
}
