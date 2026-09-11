package i2;

import a0.k0;
import com.usercentrics.sdk.extensions.TimeExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5.c f8042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f8043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t6.u f8044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f8045f;

    public p(b bVar, c cVar) {
        u5.c cVar2 = q.f8046a;
        t tVar = new t(q.f8047b);
        t6.u uVar = new t6.u(12);
        this.f8040a = bVar;
        this.f8041b = cVar;
        this.f8042c = cVar2;
        this.f8043d = tVar;
        this.f8044e = uVar;
        this.f8045f = new k0(15, this);
    }

    public final j0 a(g0 g0Var) {
        u5.c cVar = this.f8042c;
        a0.u uVar = new a0.u(13, this, g0Var);
        synchronized (((hd.d0) cVar.f17648r)) {
            j0 j0Var = (j0) ((e4.r) cVar.f17649s).a(g0Var);
            if (j0Var != null) {
                if (j0Var.a()) {
                    return j0Var;
                }
            }
            try {
                j0 j0Var2 = (j0) uVar.invoke(new a0.u(14, cVar, g0Var));
                synchronized (((hd.d0) cVar.f17648r)) {
                    if (((e4.r) cVar.f17649s).a(g0Var) == null && j0Var2.a()) {
                        ((e4.r) cVar.f17649s).b(g0Var, j0Var2);
                    }
                }
                return j0Var2;
            } catch (Exception e8) {
                throw new IllegalStateException("Could not load font", e8);
            }
        }
    }

    public final j0 b(o oVar, x xVar, int i10, int i11) {
        c cVar = this.f8041b;
        cVar.getClass();
        int i12 = cVar.f7999i;
        x xVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? xVar : new x(gh.a.e(xVar.f8062i + i12, 1, TimeExtensionsKt.MILLIS_PER_SECOND));
        this.f8040a.getClass();
        return a(new g0(oVar, xVar2, i10, i11, null));
    }
}
