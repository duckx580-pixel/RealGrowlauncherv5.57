package t0;

import k1.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0 f16261t;

    public n(f0 f0Var) {
        this.f16261t = f0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f16259s;
        this.f16259s = i10 + 2;
        Object[] objArr = this.f16257i;
        return new b(this.f16261t, objArr[i10], objArr[i10 + 1]);
    }
}
