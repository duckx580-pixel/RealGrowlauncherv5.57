package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements t, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1903i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0 f1904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1905s;

    public n0(String str, m0 m0Var) {
        this.f1903i = str;
        this.f1904r = m0Var;
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, n nVar) {
        if (nVar == n.ON_DESTROY) {
            this.f1905s = false;
            vVar.getLifecycle().c(this);
        }
    }

    public final void h(a5.f fVar, p pVar) {
        kotlin.jvm.internal.l.f("registry", fVar);
        kotlin.jvm.internal.l.f("lifecycle", pVar);
        if (this.f1905s) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1905s = true;
        pVar.a(this);
        fVar.c(this.f1903i, this.f1904r.f1902e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
