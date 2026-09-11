package c5;

import a4.v;
import android.content.Context;
import kotlin.jvm.internal.l;
import qg.k;
import qg.n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b5.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f3364i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final af.a f3366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f3369v;
    public boolean w;

    public g(Context context, String str, af.a aVar, boolean z3, boolean z10) {
        l.f("callback", aVar);
        this.f3364i = context;
        this.f3365r = str;
        this.f3366s = aVar;
        this.f3367t = z3;
        this.f3368u = z10;
        this.f3369v = android.support.v4.media.session.b.q(new v(8, this));
    }

    @Override // b5.c
    public final c E() {
        return ((f) this.f3369v.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3369v.f13919r != n.f13925a) {
            ((f) this.f3369v.getValue()).close();
        }
    }

    @Override // b5.c
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        if (this.f3369v.f13919r != n.f13925a) {
            f fVar = (f) this.f3369v.getValue();
            l.f("sQLiteOpenHelper", fVar);
            fVar.setWriteAheadLoggingEnabled(z3);
        }
        this.w = z3;
    }
}
