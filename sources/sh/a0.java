package sh;

import rh.f1;
import rh.v0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends v0 implements f1 {
    @Override // rh.f1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f14834x;
            kotlin.jvm.internal.l.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f14835y + ((long) ((int) ((o() + ((long) this.A)) - this.f14835y)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void v(int i10) {
        synchronized (this) {
            Object[] objArr = this.f14834x;
            kotlin.jvm.internal.l.c(objArr);
            d(Integer.valueOf(((Number) objArr[((int) ((this.f14835y + ((long) ((int) ((o() + ((long) this.A)) - this.f14835y)))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
