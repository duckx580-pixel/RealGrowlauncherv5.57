package a8;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends z7.k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z7.g f527r;

    public o0(z7.g gVar) {
        this.f527r = gVar;
    }

    @Override // z7.k
    public final void a() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // z7.k
    public final d b(d dVar) {
        dVar.B();
        z7.g gVar = this.f527r;
        f fVar = gVar.j;
        fVar.getClass();
        z0 z0Var = new z0(dVar);
        com.google.android.gms.internal.measurement.f0 f0Var = fVar.f444n;
        f0Var.sendMessage(f0Var.obtainMessage(4, new u0(z0Var, fVar.f440i.get(), gVar)));
        return dVar;
    }

    @Override // z7.k
    public final Looper c() {
        return this.f527r.f20654f;
    }
}
