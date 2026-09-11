package s8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public long A;
    public String B;
    public boolean C;
    public long D;
    public long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f15368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15376i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f15379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f15383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f15384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f15385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f15386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f15387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f15388v;
    public long w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f15390y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f15391z;

    public h1(y0 y0Var, String str) {
        b8.a0.h(y0Var);
        b8.a0.e(str);
        this.f15368a = y0Var;
        this.f15369b = str;
        x0 x0Var = y0Var.f15666z;
        y0.k(x0Var);
        x0Var.t();
    }

    public final boolean A() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15382p;
    }

    public final long B() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15377k;
    }

    public final long C() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15385s;
    }

    public final String D() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15383q;
    }

    public final String E() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        String str = this.B;
        t(null);
        return str;
    }

    public final String F() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15369b;
    }

    public final String G() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15370c;
    }

    public final String H() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.j;
    }

    public final String I() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15373f;
    }

    public final String J() {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        return this.f15371d;
    }

    public final void a() {
        y0 y0Var = this.f15368a;
        x0 x0Var = y0Var.f15666z;
        y0.k(x0Var);
        x0Var.t();
        long j = this.f15374g + 1;
        if (j > 2147483647L) {
            i0 i0Var = y0Var.f15665y;
            y0.k(i0Var);
            i0Var.f15413z.c("Bundle index overflow. appId", i0.A(this.f15369b));
            j = 0;
        }
        this.C = true;
        this.f15374g = j;
    }

    public final void b(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ f1.d(this.f15383q, str);
        this.f15383q = str;
    }

    public final void c(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= !f1.d(this.f15370c, str);
        this.f15370c = str;
    }

    public final void d(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= !f1.d(this.f15378l, str);
        this.f15378l = str;
    }

    public final void e(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= !f1.d(this.j, str);
        this.j = str;
    }

    public final void f(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15377k != j;
        this.f15377k = j;
    }

    public final void g(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.D != j;
        this.D = j;
    }

    public final void h(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15390y != j;
        this.f15390y = j;
    }

    public final void i(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15391z != j;
        this.f15391z = j;
    }

    public final void j(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15389x != j;
        this.f15389x = j;
    }

    public final void k(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.w != j;
        this.w = j;
    }

    public final void l(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.A != j;
        this.A = j;
    }

    public final void m(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15388v != j;
        this.f15388v = j;
    }

    public final void n(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15380n != j;
        this.f15380n = j;
    }

    public final void o(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15385s != j;
        this.f15385s = j;
    }

    public final void p(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.E != j;
        this.E = j;
    }

    public final void q(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= !f1.d(this.f15373f, str);
        this.f15373f = str;
    }

    public final void r(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ f1.d(this.f15371d, str);
        this.f15371d = str;
    }

    public final void s(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15379m != j;
        this.f15379m = j;
    }

    public final void t(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= !f1.d(this.B, str);
        this.B = str;
    }

    public final void u(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15376i != j;
        this.f15376i = j;
    }

    public final void v(long j) {
        b8.a0.b(j >= 0);
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15374g != j;
        this.f15374g = j;
    }

    public final void w(long j) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15375h != j;
        this.f15375h = j;
    }

    public final void x(boolean z3) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= this.f15381o != z3;
        this.f15381o = z3;
    }

    public final void y(String str) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        this.C |= !f1.d(this.f15372e, str);
        this.f15372e = str;
    }

    public final void z(List list) {
        x0 x0Var = this.f15368a.f15666z;
        y0.k(x0Var);
        x0Var.t();
        if (f1.d(this.f15386t, list)) {
            return;
        }
        this.C = true;
        this.f15386t = list != null ? new ArrayList(list) : null;
    }
}
