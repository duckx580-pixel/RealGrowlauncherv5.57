package oj;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f13095i;

    public m(d0 d0Var) {
        kotlin.jvm.internal.l.f("delegate", d0Var);
        this.f13095i = d0Var;
    }

    @Override // oj.d0
    public void P(g gVar, long j) {
        this.f13095i.P(gVar, j);
    }

    @Override // oj.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13095i.close();
    }

    @Override // oj.d0
    public final h0 d() {
        return this.f13095i.d();
    }

    @Override // oj.d0, java.io.Flushable
    public void flush() {
        this.f13095i.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f13095i + ')';
    }
}
