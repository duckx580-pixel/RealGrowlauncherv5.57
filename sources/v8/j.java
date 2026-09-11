package v8;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e, d, b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f18625i = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f18627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18630v;
    public Exception w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18631x;

    public j(int i10, l lVar) {
        this.f18626r = i10;
        this.f18627s = lVar;
    }

    public final void a() {
        int i10 = this.f18628t + this.f18629u + this.f18630v;
        int i11 = this.f18626r;
        if (i10 == i11) {
            Exception exc = this.w;
            l lVar = this.f18627s;
            if (exc == null) {
                if (this.f18631x) {
                    lVar.k();
                    return;
                } else {
                    lVar.j(null);
                    return;
                }
            }
            int i12 = this.f18629u;
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append(i12);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            lVar.i(new ExecutionException(sb2.toString(), this.w));
        }
    }

    @Override // v8.e
    public final void f(Object obj) {
        synchronized (this.f18625i) {
            this.f18628t++;
            a();
        }
    }

    @Override // v8.b
    public final void r() {
        synchronized (this.f18625i) {
            this.f18630v++;
            this.f18631x = true;
            a();
        }
    }

    @Override // v8.d
    public final void y(Exception exc) {
        synchronized (this.f18625i) {
            this.f18629u++;
            this.w = exc;
            a();
        }
    }
}
