package oj;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f13054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f13055g;

    public a0() {
        this.f13049a = new byte[8192];
        this.f13053e = true;
        this.f13052d = false;
    }

    public final a0 a() {
        a0 a0Var = this.f13054f;
        if (a0Var == this) {
            a0Var = null;
        }
        a0 a0Var2 = this.f13055g;
        kotlin.jvm.internal.l.c(a0Var2);
        a0Var2.f13054f = this.f13054f;
        a0 a0Var3 = this.f13054f;
        kotlin.jvm.internal.l.c(a0Var3);
        a0Var3.f13055g = this.f13055g;
        this.f13054f = null;
        this.f13055g = null;
        return a0Var;
    }

    public final void b(a0 a0Var) {
        kotlin.jvm.internal.l.f("segment", a0Var);
        a0Var.f13055g = this;
        a0Var.f13054f = this.f13054f;
        a0 a0Var2 = this.f13054f;
        kotlin.jvm.internal.l.c(a0Var2);
        a0Var2.f13055g = a0Var;
        this.f13054f = a0Var;
    }

    public final a0 c() {
        this.f13052d = true;
        return new a0(this.f13049a, this.f13050b, this.f13051c, true);
    }

    public final void d(a0 a0Var, int i10) {
        kotlin.jvm.internal.l.f("sink", a0Var);
        byte[] bArr = a0Var.f13049a;
        if (!a0Var.f13053e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = a0Var.f13051c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (a0Var.f13052d) {
                throw new IllegalArgumentException();
            }
            int i13 = a0Var.f13050b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            rg.k.q0(0, i13, i11, bArr, bArr);
            a0Var.f13051c -= a0Var.f13050b;
            a0Var.f13050b = 0;
        }
        int i14 = a0Var.f13051c;
        int i15 = this.f13050b;
        rg.k.q0(i14, i15, i15 + i10, this.f13049a, bArr);
        a0Var.f13051c += i10;
        this.f13050b += i10;
    }

    public a0(byte[] bArr, int i10, int i11, boolean z3) {
        kotlin.jvm.internal.l.f("data", bArr);
        this.f13049a = bArr;
        this.f13050b = i10;
        this.f13051c = i11;
        this.f13052d = z3;
        this.f13053e = false;
    }
}
