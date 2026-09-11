package z;

import a0.d0;
import a0.h0;
import androidx.appcompat.widget.w3;
import b0.b0;
import b0.c0;
import com.google.android.gms.internal.measurement.j3;
import java.util.Collection;
import o0.n0;
import o0.s0;
import o0.z0;
import oh.x;
import t.q0;
import v.k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements k1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j3 f20554z = ud.a.o(n.f20544i, k.f20515t);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f20556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f20557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f20558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.l f20559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f20560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q2.b f20561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v.p f20562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20563i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f20564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.compose.ui.node.a f20566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f20567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.b f20568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w3 f20569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0.j f20570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f20572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z0 f20573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0 f20574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s0 f20575v;
    public final u5.l w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public th.d f20576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t.j f20577y;

    public q(int i10, int i11) {
        this.f20557c = new d0(i10, i11, 1);
        l lVar = s.f20579b;
        n0 n0Var = n0.f12508s;
        this.f20558d = o0.p.I(lVar, n0Var);
        this.f20559e = new x.l();
        this.f20561g = new q2.c(1.0f, 1.0f);
        this.f20562h = new v.p(new q0(23, this));
        this.f20563i = true;
        this.j = -1;
        this.f20567n = new h0(this, 1);
        this.f20568o = new b0.b();
        this.f20569p = new w3(9);
        this.f20570q = new b0.j(0);
        this.f20571r = rk.a.G(0, 0, 15);
        this.f20572s = new b0();
        Boolean bool = Boolean.FALSE;
        n0 n0Var2 = n0.f12510u;
        this.f20573t = o0.p.I(bool, n0Var2);
        this.f20574u = o0.p.I(bool, n0Var2);
        this.f20575v = o0.p.I(qg.o.f13926a, n0Var);
        this.w = new u5.l();
        this.f20577y = new t.j(t.k1.f16126a, Float.valueOf(0.0f), new t.k(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // v.k1
    public final boolean a() {
        return ((Boolean) this.f20573t.getValue()).booleanValue();
    }

    @Override // v.k1
    public final boolean b() {
        return this.f20562h.b();
    }

    @Override // v.k1
    public final boolean c() {
        return ((Boolean) this.f20574u.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.d(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(u.b1 r6, eh.e r7, wg.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z.o
            if (r0 == 0) goto L13
            r0 = r8
            z.o r0 = (z.o) r0
            int r1 = r0.f20550v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20550v = r1
            goto L18
        L13:
            z.o r0 = new z.o
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f20548t
            vg.a r1 = vg.a.f18663i
            int r2 = r0.f20550v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            androidx.work.v.B(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            wg.i r6 = r0.f20547s
            r7 = r6
            eh.e r7 = (eh.e) r7
            u.b1 r6 = r0.f20546r
            z.q r2 = r0.f20545i
            androidx.work.v.B(r8)
            goto L57
        L3f:
            androidx.work.v.B(r8)
            r0.f20545i = r5
            r0.f20546r = r6
            r8 = r7
            wg.i r8 = (wg.i) r8
            r0.f20547s = r8
            r0.f20550v = r4
            b0.b r8 = r5.f20568o
            java.lang.Object r8 = r8.m(r0)
            if (r8 != r1) goto L56
            goto L68
        L56:
            r2 = r5
        L57:
            v.p r8 = r2.f20562h
            r2 = 0
            r0.f20545i = r2
            r0.f20546r = r2
            r0.f20547s = r2
            r0.f20550v = r3
            java.lang.Object r6 = r8.d(r6, r7, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            qg.o r6 = qg.o.f13926a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.q.d(u.b1, eh.e, wg.c):java.lang.Object");
    }

    @Override // v.k1
    public final float e(float f9) {
        return this.f20562h.e(f9);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    public final void f(l lVar, boolean z3, boolean z10) {
        m mVar = lVar.f20517a;
        if (!z3 && this.f20555a) {
            this.f20556b = lVar;
            return;
        }
        boolean z11 = true;
        if (z3) {
            this.f20555a = true;
        }
        d0 d0Var = this.f20557c;
        ug.c cVar = null;
        if (z10) {
            int i10 = lVar.f20518b;
            if (i10 < 0.0f) {
                d0Var.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
            }
            d0Var.f43c.g(i10);
        } else {
            d0Var.getClass();
            ?? r10 = lVar.f20523g;
            d0Var.f45e = mVar != null ? mVar.f20535i : null;
            if (d0Var.f44d || lVar.j > 0) {
                d0Var.f44d = true;
                int i11 = lVar.f20518b;
                if (i11 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i11 + ')').toString());
                }
                d0Var.a(mVar != null ? mVar.f20527a : 0, i11);
            }
            if (this.j != -1 && !((Collection) r10).isEmpty()) {
                if (this.j != (this.f20565l ? ((m) rg.l.k0(r10)).f20527a + 1 : ((m) rg.l.c0(r10)).f20527a - 1)) {
                    this.j = -1;
                    c0 c0Var = this.f20564k;
                    if (c0Var != null) {
                        c0Var.cancel();
                    }
                    this.f20564k = null;
                }
            }
        }
        if ((mVar != null ? mVar.f20527a : 0) == 0 && lVar.f20518b == 0) {
            z11 = false;
        }
        this.f20574u.setValue(Boolean.valueOf(z11));
        this.f20573t.setValue(Boolean.valueOf(lVar.f20519c));
        this.f20560f -= lVar.f20520d;
        this.f20558d.setValue(lVar);
        if (z3) {
            float f9 = lVar.f20521e;
            if (f9 <= this.f20561g.W(s.f20578a)) {
                return;
            }
            y0.g gVarH = y0.m.h((y0.g) y0.m.f20077a.get(), null, false);
            try {
                y0.g gVarJ = gVarH.j();
                try {
                    float fFloatValue = ((Number) this.f20577y.f16114r.getValue()).floatValue();
                    t.j jVar = this.f20577y;
                    boolean z12 = jVar.f16118v;
                    if (z12) {
                        this.f20577y = new t.j(jVar.f16113i, Float.valueOf(fFloatValue - f9), new t.k(((t.k) jVar.f16115s).f16122a), jVar.f16116t, jVar.f16117u, z12);
                        th.d dVar = this.f20576x;
                        if (dVar != null) {
                            x.s(dVar, null, 0, new p(this, cVar, 1), 3);
                        }
                    } else {
                        this.f20577y = new t.j(t.k1.f16126a, Float.valueOf(-f9), null, 60);
                        th.d dVar2 = this.f20576x;
                        if (dVar2 != null) {
                            x.s(dVar2, null, 0, new p(this, cVar, 2), 3);
                        }
                    }
                    y0.g.p(gVarJ);
                } catch (Throwable th2) {
                    y0.g.p(gVarJ);
                    throw th2;
                }
            } finally {
                gVarH.c();
            }
        }
    }

    public final l g() {
        return (l) this.f20558d.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    public final void h(float f9, l lVar) {
        c0 c0Var;
        if (this.f20563i && !((Collection) lVar.f20523g).isEmpty()) {
            boolean z3 = f9 < 0.0f;
            int i10 = z3 ? ((m) rg.l.k0(lVar.f20523g)).f20527a + 1 : ((m) rg.l.c0(lVar.f20523g)).f20527a - 1;
            if (i10 == this.j || i10 < 0 || i10 >= lVar.j) {
                return;
            }
            if (this.f20565l != z3 && (c0Var = this.f20564k) != null) {
                c0Var.cancel();
            }
            this.f20565l = z3;
            this.j = i10;
            this.f20564k = this.w.y(this.f20571r, i10);
        }
    }
}
