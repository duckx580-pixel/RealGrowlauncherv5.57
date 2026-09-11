package i0;

import g1.t;
import o0.n0;
import o0.z0;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f7922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f7923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f7924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f7925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0 f7926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0 f7927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f7928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f7929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0 f7930i;
    public final z0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z0 f7931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z0 f7932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z0 f7933m;

    public a(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        t tVar = new t(j);
        n0 n0Var = n0.f12510u;
        this.f7922a = o0.p.I(tVar, n0Var);
        this.f7923b = gb.e.d(j10, n0Var);
        this.f7924c = gb.e.d(j11, n0Var);
        this.f7925d = gb.e.d(j12, n0Var);
        this.f7926e = gb.e.d(j13, n0Var);
        this.f7927f = gb.e.d(j14, n0Var);
        this.f7928g = gb.e.d(j15, n0Var);
        this.f7929h = gb.e.d(j16, n0Var);
        this.f7930i = gb.e.d(j17, n0Var);
        this.j = gb.e.d(j18, n0Var);
        this.f7931k = gb.e.d(j19, n0Var);
        this.f7932l = gb.e.d(j20, n0Var);
        this.f7933m = o0.p.I(Boolean.TRUE, n0Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Colors(primary=");
        h0.j(((t) this.f7922a.getValue()).f6918a, ", primaryVariant=", sb2);
        h0.j(((t) this.f7923b.getValue()).f6918a, ", secondary=", sb2);
        h0.j(((t) this.f7924c.getValue()).f6918a, ", secondaryVariant=", sb2);
        h0.j(((t) this.f7925d.getValue()).f6918a, ", background=", sb2);
        h0.j(((t) this.f7926e.getValue()).f6918a, ", surface=", sb2);
        h0.j(((t) this.f7927f.getValue()).f6918a, ", error=", sb2);
        h0.j(((t) this.f7928g.getValue()).f6918a, ", onPrimary=", sb2);
        h0.j(((t) this.f7929h.getValue()).f6918a, ", onSecondary=", sb2);
        h0.j(((t) this.f7930i.getValue()).f6918a, ", onBackground=", sb2);
        h0.j(((t) this.j.getValue()).f6918a, ", onSurface=", sb2);
        h0.j(((t) this.f7931k.getValue()).f6918a, ", onError=", sb2);
        h0.j(((t) this.f7932l.getValue()).f6918a, ", isLight=", sb2);
        sb2.append(((Boolean) this.f7933m.getValue()).booleanValue());
        sb2.append(')');
        return sb2.toString();
    }
}
