package r1;

import a0.x;
import rg.k;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f14442a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f14443b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14444c = f1.c.f5973b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14445d;

    public final void a(long j, long j10) {
        this.f14442a.b(j, f1.c.d(j10));
        this.f14443b.b(j, f1.c.e(j10));
    }

    public final void b() {
        x xVar = this.f14442a;
        a[] aVarArr = (a[]) xVar.f162c;
        k.y0(0, aVarArr.length, null, aVarArr);
        xVar.f161b = 0;
        x xVar2 = this.f14443b;
        a[] aVarArr2 = (a[]) xVar2.f162c;
        k.y0(0, aVarArr2.length, null, aVarArr2);
        xVar2.f161b = 0;
        this.f14445d = 0L;
    }
}
