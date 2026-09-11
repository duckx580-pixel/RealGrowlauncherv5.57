package sh;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d[] f15794i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0 f15797t;

    public final d c() {
        d dVarE;
        a0 a0Var;
        synchronized (this) {
            try {
                d[] dVarArrF = this.f15794i;
                if (dVarArrF == null) {
                    dVarArrF = f();
                    this.f15794i = dVarArrF;
                } else if (this.f15795r >= dVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrF, dVarArrF.length * 2);
                    kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
                    this.f15794i = (d[]) objArrCopyOf;
                    dVarArrF = (d[]) objArrCopyOf;
                }
                int i10 = this.f15796s;
                do {
                    dVarE = dVarArrF[i10];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrF[i10] = dVarE;
                    }
                    i10++;
                    if (i10 >= dVarArrF.length) {
                        i10 = 0;
                    }
                } while (!dVarE.a(this));
                this.f15796s = i10;
                this.f15795r++;
                a0Var = this.f15797t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (a0Var != null) {
            a0Var.v(1);
        }
        return dVarE;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        a0 a0Var;
        int i10;
        ug.c[] cVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f15795r - 1;
                this.f15795r = i11;
                a0Var = this.f15797t;
                if (i11 == 0) {
                    this.f15796s = 0;
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>", dVar);
                cVarArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (ug.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(qg.o.f13926a);
            }
        }
        if (a0Var != null) {
            a0Var.v(-1);
        }
    }

    public final a0 h() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.f15797t;
            if (a0Var == null) {
                int i10 = this.f15795r;
                a0Var = new a0(1, Integer.MAX_VALUE, 2);
                a0Var.d(Integer.valueOf(i10));
                this.f15797t = a0Var;
            }
        }
        return a0Var;
    }
}
