package u;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f17426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1.c f17427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EdgeEffect f17428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EdgeEffect f17429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f17430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f17431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f17432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EdgeEffect f17433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EdgeEffect f17434i;
    public final EdgeEffect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EdgeEffect f17435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0.w0 f17437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f17438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f17440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q1.p f17441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a1.n f17442r;

    public f(Context context, h1 h1Var) {
        this.f17426a = h1Var;
        EdgeEffect edgeEffectN = sb.c.n(context);
        this.f17428c = edgeEffectN;
        EdgeEffect edgeEffectN2 = sb.c.n(context);
        this.f17429d = edgeEffectN2;
        EdgeEffect edgeEffectN3 = sb.c.n(context);
        this.f17430e = edgeEffectN3;
        EdgeEffect edgeEffectN4 = sb.c.n(context);
        this.f17431f = edgeEffectN4;
        List listD = sb.c.D(edgeEffectN3, edgeEffectN, edgeEffectN4, edgeEffectN2);
        this.f17432g = listD;
        this.f17433h = sb.c.n(context);
        this.f17434i = sb.c.n(context);
        this.j = sb.c.n(context);
        this.f17435k = sb.c.n(context);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((EdgeEffect) listD.get(i10)).setColor(g1.f0.p(this.f17426a.f17452a));
        }
        this.f17436l = -1;
        this.f17437m = o0.p.H(0);
        this.f17438n = true;
        this.f17440p = f1.f.f5991b;
        this.f17442r = q1.x.a(i.f17454a, qg.o.f13926a, new t.d1(8, this, (ug.c) null)).j(new t1.m0(new t.q0(7, this))).j(new e0(this));
    }

    @Override // u.j1
    public final a1.n a() {
        return this.f17442r;
    }

    @Override // u.j1
    public final boolean b() {
        List list = this.f17432g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((Build.VERSION.SDK_INT >= 31 ? j.f17456a.b((EdgeEffect) list.get(i10)) : 0.0f) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0163  */
    @Override // u.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r18, v.p1 r20, ug.c r21) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.f.c(long, v.p1, ug.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    @Override // u.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(long r23, int r25, f0.i1 r26) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.f.d(long, int, f0.i1):long");
    }

    public final void e() {
        List list = this.f17432g;
        int size = list.size();
        boolean z3 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i10);
            edgeEffect.onRelease();
            z3 = edgeEffect.isFinished() || z3;
        }
        if (z3) {
            i();
        }
    }

    public final boolean f(v1.e0 e0Var, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-f1.f.d(this.f17440p), (-f1.f.b(this.f17440p)) + e0Var.W(this.f17426a.f17453b.f19972d));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean g(v1.e0 e0Var, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-f1.f.b(this.f17440p), e0Var.W(this.f17426a.f17453b.b(e0Var.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean h(v1.e0 e0Var, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iZ = gh.a.z(f1.f.d(this.f17440p));
        float fD = this.f17426a.f17453b.d(e0Var.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, e0Var.W(fD) + (-iZ));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void i() {
        if (this.f17438n) {
            int i10 = this.f17436l;
            o0.w0 w0Var = this.f17437m;
            if (i10 == w0Var.f()) {
                w0Var.g(w0Var.f() + 1);
            }
        }
    }

    public final float j(long j, long j10) {
        float fD = f1.c.d(j10) / f1.f.d(this.f17440p);
        float fC = -(f1.c.e(j) / f1.f.b(this.f17440p));
        float f9 = 1 - fD;
        int i10 = Build.VERSION.SDK_INT;
        j jVar = j.f17456a;
        EdgeEffect edgeEffect = this.f17429d;
        if (i10 >= 31) {
            fC = jVar.c(edgeEffect, fC, f9);
        } else {
            edgeEffect.onPull(fC, f9);
        }
        return (Build.VERSION.SDK_INT >= 31 ? jVar.b(edgeEffect) : 0.0f) == 0.0f ? f1.f.b(this.f17440p) * (-fC) : f1.c.e(j);
    }

    public final float k(long j, long j10) {
        float fE = f1.c.e(j10) / f1.f.b(this.f17440p);
        float fD = f1.c.d(j) / f1.f.d(this.f17440p);
        float f9 = 1 - fE;
        int i10 = Build.VERSION.SDK_INT;
        j jVar = j.f17456a;
        EdgeEffect edgeEffect = this.f17430e;
        if (i10 >= 31) {
            fD = jVar.c(edgeEffect, fD, f9);
        } else {
            edgeEffect.onPull(fD, f9);
        }
        return (Build.VERSION.SDK_INT >= 31 ? jVar.b(edgeEffect) : 0.0f) == 0.0f ? f1.f.d(this.f17440p) * fD : f1.c.d(j);
    }

    public final float l(long j, long j10) {
        float fE = f1.c.e(j10) / f1.f.b(this.f17440p);
        float fC = -(f1.c.d(j) / f1.f.d(this.f17440p));
        int i10 = Build.VERSION.SDK_INT;
        j jVar = j.f17456a;
        EdgeEffect edgeEffect = this.f17431f;
        if (i10 >= 31) {
            fC = jVar.c(edgeEffect, fC, fE);
        } else {
            edgeEffect.onPull(fC, fE);
        }
        return (Build.VERSION.SDK_INT >= 31 ? jVar.b(edgeEffect) : 0.0f) == 0.0f ? f1.f.d(this.f17440p) * (-fC) : f1.c.d(j);
    }

    public final float m(long j, long j10) {
        float fD = f1.c.d(j10) / f1.f.d(this.f17440p);
        float fE = f1.c.e(j) / f1.f.b(this.f17440p);
        int i10 = Build.VERSION.SDK_INT;
        j jVar = j.f17456a;
        EdgeEffect edgeEffect = this.f17428c;
        if (i10 >= 31) {
            fE = jVar.c(edgeEffect, fE, fD);
        } else {
            edgeEffect.onPull(fE, fD);
        }
        return (Build.VERSION.SDK_INT >= 31 ? jVar.b(edgeEffect) : 0.0f) == 0.0f ? f1.f.b(this.f17440p) * fE : f1.c.e(j);
    }
}
