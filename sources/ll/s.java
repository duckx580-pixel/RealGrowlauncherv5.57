package ll;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j0 f10196i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object[] f10197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bj.d f10198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f10199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f10200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public fj.j f10201v;
    public Throwable w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10202x;

    public s(j0 j0Var, Object[] objArr, bj.d dVar, j jVar) {
        this.f10196i = j0Var;
        this.f10197r = objArr;
        this.f10198s = dVar;
        this.f10199t = jVar;
    }

    @Override // ll.c
    public final boolean F() {
        boolean z3 = true;
        if (this.f10200u) {
            return true;
        }
        synchronized (this) {
            try {
                fj.j jVar = this.f10201v;
                if (jVar == null || !jVar.A) {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // ll.c
    public final synchronized al.h W() {
        try {
        } catch (IOException e8) {
            throw new RuntimeException("Unable to create request.", e8);
        }
        return b().E;
    }

    public final fj.j a() {
        bj.q qVarA;
        j0 j0Var = this.f10196i;
        r0[] r0VarArr = j0Var.j;
        Object[] objArr = this.f10197r;
        int length = objArr.length;
        if (length != r0VarArr.length) {
            throw new IllegalArgumentException(k0.g.i(android.support.v4.media.session.a.n(length, "Argument count (", ") doesn't match expected count ("), r0VarArr.length, ")"));
        }
        h0 h0Var = new h0(j0Var.f10155c, j0Var.f10154b, j0Var.f10156d, j0Var.f10157e, j0Var.f10158f, j0Var.f10159g, j0Var.f10160h, j0Var.f10161i);
        if (j0Var.f10162k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            r0VarArr[i10].a(h0Var, objArr[i10]);
        }
        bj.p pVar = h0Var.f10123d;
        if (pVar != null) {
            qVarA = pVar.a();
        } else {
            String str = h0Var.f10122c;
            bj.q qVar = h0Var.f10121b;
            qVar.getClass();
            kotlin.jvm.internal.l.f("link", str);
            bj.p pVarF = qVar.f(str);
            qVarA = pVarF != null ? pVarF.a() : null;
            if (qVarA == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + qVar + ", Relative: " + h0Var.f10122c);
            }
        }
        bj.a0 yVar = h0Var.f10129k;
        if (yVar == null) {
            u5.s sVar = h0Var.j;
            if (sVar != null) {
                yVar = new bj.l((ArrayList) sVar.f17712i, (ArrayList) sVar.f17713r);
            } else {
                mf.e eVar = h0Var.f10128i;
                if (eVar != null) {
                    ArrayList arrayList2 = (ArrayList) eVar.f11709r;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    yVar = new bj.u((oj.j) eVar.f11710s, (bj.s) eVar.f11711t, cj.a.v(arrayList2));
                } else if (h0Var.f10127h) {
                    long j = 0;
                    cj.a.c(j, j, j);
                    yVar = new bj.z(new byte[0], null, 0);
                }
            }
        }
        bj.s sVar2 = h0Var.f10126g;
        bj.n nVar = h0Var.f10125f;
        if (sVar2 != null) {
            if (yVar != null) {
                yVar = new bj.y(yVar, sVar2, 2);
            } else {
                nVar.a("Content-Type", sVar2.f3188a);
            }
        }
        mf.c cVar = h0Var.f10124e;
        cVar.getClass();
        cVar.f11702r = qVarA;
        cVar.f11704t = nVar.f().k();
        cVar.t(h0Var.f10120a, yVar);
        cVar.y(n.class, new n(j0Var.f10153a, arrayList));
        return ((bj.w) this.f10198s).a(cVar.g());
    }

    public final fj.j b() throws IOException {
        fj.j jVar = this.f10201v;
        if (jVar != null) {
            return jVar;
        }
        Throwable th2 = this.w;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            fj.j jVarA = a();
            this.f10201v = jVarA;
            return jVarA;
        } catch (IOException | Error | RuntimeException e8) {
            r0.o(e8);
            this.w = e8;
            throw e8;
        }
    }

    public final k0 c(bj.c0 c0Var) throws IOException {
        bj.f0 f0Var = c0Var.f3094x;
        bj.b0 b0VarE = c0Var.e();
        b0VarE.f3068g = new r(f0Var.e(), f0Var.c());
        bj.c0 c0VarA = b0VarE.a();
        int i10 = c0VarA.f3092u;
        if (i10 < 200 || i10 >= 300) {
            try {
                oj.g gVar = new oj.g();
                f0Var.g().N(gVar);
                bj.e0 e0Var = new bj.e0(gVar, f0Var.e(), f0Var.c());
                if (c0VarA.c()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new k0(c0VarA, null, e0Var);
            } finally {
                f0Var.close();
            }
        }
        if (i10 == 204 || i10 == 205) {
            f0Var.close();
            if (c0VarA.c()) {
                return new k0(c0VarA, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        q qVar = new q(f0Var);
        try {
            Object objB = this.f10199t.b(qVar);
            if (c0VarA.c()) {
                return new k0(c0VarA, objB, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e8) {
            IOException iOException = qVar.f10190t;
            if (iOException == null) {
                throw e8;
            }
            throw iOException;
        }
    }

    @Override // ll.c
    public final void cancel() {
        fj.j jVar;
        this.f10200u = true;
        synchronized (this) {
            jVar = this.f10201v;
        }
        if (jVar != null) {
            jVar.cancel();
        }
    }

    public final Object clone() {
        return new s(this.f10196i, this.f10197r, this.f10198s, this.f10199t);
    }

    @Override // ll.c
    public final void n(f fVar) {
        fj.j jVar;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.f10202x) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f10202x = true;
                jVar = this.f10201v;
                th2 = this.w;
                if (jVar == null && th2 == null) {
                    try {
                        fj.j jVarA = a();
                        this.f10201v = jVarA;
                        jVar = jVarA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        r0.o(th2);
                        this.w = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            fVar.h(this, th2);
            return;
        }
        if (this.f10200u) {
            jVar.cancel();
        }
        jVar.d(new u5.c(14, this, fVar, false));
    }

    @Override // ll.c
    /* JADX INFO: renamed from: clone */
    public final c mo111clone() {
        return new s(this.f10196i, this.f10197r, this.f10198s, this.f10199t);
    }
}
