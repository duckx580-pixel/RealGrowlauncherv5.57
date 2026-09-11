package s3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f15125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k3.c[] f15126b;

    public x1() {
        this(new f2());
    }

    public final void a() {
        k3.c[] cVarArr = this.f15126b;
        if (cVarArr != null) {
            k3.c cVarF = cVarArr[0];
            k3.c cVarF2 = cVarArr[1];
            f2 f2Var = this.f15125a;
            if (cVarF2 == null) {
                cVarF2 = f2Var.f15063a.f(2);
            }
            if (cVarF == null) {
                cVarF = f2Var.f15063a.f(1);
            }
            g(k3.c.a(cVarF, cVarF2));
            k3.c cVar = this.f15126b[androidx.work.v.n(16)];
            if (cVar != null) {
                f(cVar);
            }
            k3.c cVar2 = this.f15126b[androidx.work.v.n(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            k3.c cVar3 = this.f15126b[androidx.work.v.n(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract f2 b();

    public void c(int i10, k3.c cVar) {
        if (this.f15126b == null) {
            this.f15126b = new k3.c[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f15126b[androidx.work.v.n(i11)] = cVar;
            }
        }
    }

    public abstract void e(k3.c cVar);

    public abstract void g(k3.c cVar);

    public x1(f2 f2Var) {
        this.f15125a = f2Var;
    }

    public void d(k3.c cVar) {
    }

    public void f(k3.c cVar) {
    }

    public void h(k3.c cVar) {
    }
}
