package li;

import androidx.lifecycle.p0;
import androidx.lifecycle.v0;
import launcher.powerkuy.growlauncher.api.service.ApiService;
import rh.h1;
import rh.r0;
import rh.w0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends v0 {
    public final h1 A;
    public final r0 B;
    public int C;
    public int D;
    public final h1 E;
    public final r0 F;
    public final h1 G;
    public final r0 H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApiService f10033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f10034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f10035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f10036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f10037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1 f10038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f10039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f10040i;
    public final r0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h1 f10041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0 f10042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1 f10045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f10046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f10047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f10048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f10049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f10050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1 f10051u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r0 f10052v;
    public final h1 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r0 f10053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h1 f10054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r0 f10055z;

    public s() {
        ApiService.Companion.getClass();
        this.f10033b = ji.a.a();
        rg.s sVar = rg.s.f14664i;
        h1 h1VarC = w0.c(sVar);
        this.f10034c = h1VarC;
        this.f10035d = new r0(h1VarC);
        h1 h1VarC2 = w0.c(sVar);
        this.f10036e = h1VarC2;
        this.f10037f = new r0(h1VarC2);
        Boolean bool = Boolean.FALSE;
        h1 h1VarC3 = w0.c(bool);
        this.f10038g = h1VarC3;
        this.f10039h = new r0(h1VarC3);
        h1 h1VarC4 = w0.c(null);
        this.f10040i = h1VarC4;
        this.j = new r0(h1VarC4);
        h1 h1VarC5 = w0.c(bool);
        this.f10041k = h1VarC5;
        this.f10042l = new r0(h1VarC5);
        w0.c(bool);
        this.f10043m = 1;
        this.f10044n = 1;
        h1 h1VarC6 = w0.c(sVar);
        this.f10045o = h1VarC6;
        this.f10046p = new r0(h1VarC6);
        h1 h1VarC7 = w0.c(null);
        this.f10047q = h1VarC7;
        this.f10048r = new r0(h1VarC7);
        h1 h1VarC8 = w0.c(null);
        this.f10049s = h1VarC8;
        this.f10050t = new r0(h1VarC8);
        h1 h1VarC9 = w0.c(null);
        this.f10051u = h1VarC9;
        this.f10052v = new r0(h1VarC9);
        h1 h1VarC10 = w0.c(null);
        this.w = h1VarC10;
        this.f10053x = new r0(h1VarC10);
        oh.x.s(p0.j(this), null, 0, new p(this, (ug.c) null, 2), 3);
        h1 h1VarC11 = w0.c(sVar);
        this.f10054y = h1VarC11;
        this.f10055z = new r0(h1VarC11);
        h1 h1VarC12 = w0.c(bool);
        this.A = h1VarC12;
        this.B = new r0(h1VarC12);
        this.C = 1;
        this.D = 1;
        h1 h1VarC13 = w0.c(bool);
        this.E = h1VarC13;
        this.F = new r0(h1VarC13);
        h1 h1VarC14 = w0.c(null);
        this.G = h1VarC14;
        this.H = new r0(h1VarC14);
    }

    public static void f(s sVar, String str, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        boolean z3 = (i10 & 4) == 0;
        if (!z3 || (sVar.f10043m < sVar.f10044n && !((Boolean) sVar.f10041k.getValue()).booleanValue())) {
            oh.x.s(p0.j(sVar), null, 0, new q(z3, sVar, str, (ug.c) null), 3);
        }
    }

    public final void e(int i10, boolean z3) {
        if (!z3 || (this.C < this.D && !((Boolean) this.A.getValue()).booleanValue())) {
            oh.x.s(p0.j(this), null, 0, new o(z3, this, i10, null), 3);
        }
    }

    public final void g() {
        oh.x.s(p0.j(this), null, 0, new p(this, (ug.c) null, 1), 3);
    }

    public final void h(long j) {
        oh.x.s(p0.j(this), null, 0, new de.l(this, j, null), 3);
    }
}
