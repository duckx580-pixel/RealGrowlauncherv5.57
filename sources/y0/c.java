package y0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class c extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f20038n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eh.c f20039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eh.c f20040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0.b f20042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f20043i;
    public k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f20044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20046m;

    public c(int i10, k kVar, eh.c cVar, eh.c cVar2) {
        super(i10, kVar);
        this.f20039e = cVar;
        this.f20040f = cVar2;
        this.j = k.f20069u;
        this.f20044k = f20038n;
        this.f20045l = 1;
    }

    public c A(eh.c cVar, eh.c cVar2) throws Throwable {
        int i10;
        k kVarE;
        if (this.f20061c) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
        if (this.f20046m && this.f20062d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        y(d());
        Object obj = m.f20078b;
        synchronized (obj) {
            try {
                i10 = m.f20080d;
                m.f20080d = i10 + 1;
                m.f20079c = m.f20079c.n(i10);
                kVarE = e();
                r(kVarE.n(i10));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                d dVar = new d(i10, m.e(kVarE, d() + 1, i10), m.k(cVar, this.f20039e, true), m.b(cVar2, this.f20040f), this);
                if (this.f20046m || this.f20061c) {
                    return dVar;
                }
                int iD = d();
                synchronized (obj) {
                    int i11 = m.f20080d;
                    m.f20080d = i11 + 1;
                    q(i11);
                    m.f20079c = m.f20079c.n(d());
                }
                r(m.e(e(), iD + 1, d()));
                return dVar;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // y0.g
    public final void b() {
        m.f20079c = m.f20079c.j(d()).b(this.j);
    }

    @Override // y0.g
    public void c() {
        if (this.f20061c) {
            return;
        }
        this.f20061c = true;
        synchronized (m.f20078b) {
            int i10 = this.f20062d;
            if (i10 >= 0) {
                m.t(i10);
                this.f20062d = -1;
            }
        }
        l();
    }

    @Override // y0.g
    public final eh.c f() {
        return this.f20039e;
    }

    @Override // y0.g
    public boolean g() {
        return false;
    }

    @Override // y0.g
    public int h() {
        return this.f20041g;
    }

    @Override // y0.g
    public final eh.c i() {
        return this.f20040f;
    }

    @Override // y0.g
    public void k() {
        this.f20045l++;
    }

    @Override // y0.g
    public void l() {
        int i10 = this.f20045l;
        if (i10 <= 0) {
            throw new IllegalArgumentException("no pending nested snapshots");
        }
        int i11 = i10 - 1;
        this.f20045l = i11;
        if (i11 != 0 || this.f20046m) {
            return;
        }
        q0.b bVarW = w();
        if (bVarW != null) {
            if (this.f20046m) {
                throw new IllegalStateException("Unsupported operation on a snapshot that has been applied");
            }
            z(null);
            int iD = d();
            Object[] objArr = bVarW.f13637r;
            int i12 = bVarW.f13636i;
            for (int i13 = 0; i13 < i12; i13++) {
                Object obj = objArr[i13];
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
                for (a0 a0VarB = ((y) obj).b(); a0VarB != null; a0VarB = a0VarB.f20033b) {
                    int i14 = a0VarB.f20032a;
                    if (i14 == iD || rg.l.Y(this.j, Integer.valueOf(i14))) {
                        a0VarB.f20032a = 0;
                    }
                }
            }
        }
        a();
    }

    @Override // y0.g
    public void m() {
        if (this.f20046m || this.f20061c) {
            return;
        }
        u();
    }

    @Override // y0.g
    public void n(y yVar) {
        q0.b bVarW = w();
        if (bVarW == null) {
            bVarW = new q0.b();
            z(bVarW);
        }
        bVarW.add(yVar);
    }

    @Override // y0.g
    public final void o() {
        int length = this.f20044k.length;
        for (int i10 = 0; i10 < length; i10++) {
            m.t(this.f20044k[i10]);
        }
        int i11 = this.f20062d;
        if (i11 >= 0) {
            m.t(i11);
            this.f20062d = -1;
        }
    }

    @Override // y0.g
    public void s(int i10) {
        this.f20041g = i10;
    }

    @Override // y0.g
    public g t(eh.c cVar) {
        e eVar;
        if (this.f20061c) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
        if (this.f20046m && this.f20062d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        int iD = d();
        y(d());
        Object obj = m.f20078b;
        synchronized (obj) {
            int i10 = m.f20080d;
            m.f20080d = i10 + 1;
            m.f20079c = m.f20079c.n(i10);
            eVar = new e(i10, m.e(e(), iD + 1, i10), cVar, this);
        }
        if (this.f20046m || this.f20061c) {
            return eVar;
        }
        int iD2 = d();
        synchronized (obj) {
            int i11 = m.f20080d;
            m.f20080d = i11 + 1;
            q(i11);
            m.f20079c = m.f20079c.n(d());
        }
        r(m.e(e(), iD2 + 1, d()));
        return eVar;
    }

    public final void u() {
        y(d());
        if (this.f20046m || this.f20061c) {
            return;
        }
        int iD = d();
        synchronized (m.f20078b) {
            int i10 = m.f20080d;
            m.f20080d = i10 + 1;
            q(i10);
            m.f20079c = m.f20079c.n(d());
        }
        r(m.e(e(), iD + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public r v() {
        HashMap mapC;
        q0.b bVar;
        ?? r32;
        q0.b bVarW = w();
        if (bVarW != null) {
            AtomicReference atomicReference = m.f20085i;
            mapC = m.c((c) atomicReference.get(), this, m.f20079c.j(((b) atomicReference.get()).f20060b));
        } else {
            mapC = null;
        }
        rg.s sVar = rg.s.f14664i;
        synchronized (m.f20078b) {
            try {
                m.d(this);
                if (bVarW == null || bVarW.f13636i == 0) {
                    b();
                    b bVar2 = (b) m.f20085i.get();
                    m.u(bVar2, l.f20075s);
                    bVar = bVar2.f20042h;
                    if (bVar == null || bVar.isEmpty()) {
                        bVar = null;
                        r32 = sVar;
                    } else {
                        r32 = m.f20083g;
                    }
                } else {
                    b bVar3 = (b) m.f20085i.get();
                    r rVarX = x(m.f20080d, mapC, m.f20079c.j(bVar3.f20060b));
                    if (!rVarX.equals(i.f20063c)) {
                        return rVarX;
                    }
                    b();
                    m.u(bVar3, l.f20075s);
                    bVar = bVar3.f20042h;
                    z(null);
                    bVar3.f20042h = null;
                    r32 = m.f20083g;
                }
                this.f20046m = true;
                if (bVar != null && !bVar.isEmpty()) {
                    int size = r32.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((eh.e) r32.get(i10)).invoke(bVar, this);
                    }
                }
                if (bVarW != null && !bVarW.isEmpty()) {
                    int size2 = r32.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((eh.e) r32.get(i11)).invoke(bVarW, this);
                    }
                }
                synchronized (m.f20078b) {
                    try {
                        o();
                        m.g();
                        if (bVar != null) {
                            Object[] objArr = bVar.f13637r;
                            int i12 = bVar.f13636i;
                            for (int i13 = 0; i13 < i12; i13++) {
                                Object obj = objArr[i13];
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
                                m.p((y) obj);
                            }
                        }
                        if (bVarW != null) {
                            Object[] objArr2 = bVarW.f13637r;
                            int i14 = bVarW.f13636i;
                            for (int i15 = 0; i15 < i14; i15++) {
                                Object obj2 = objArr2[i15];
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj2);
                                m.p((y) obj2);
                            }
                        }
                        ArrayList arrayList = this.f20043i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i16 = 0; i16 < size3; i16++) {
                                m.p((y) arrayList.get(i16));
                            }
                        }
                        this.f20043i = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return i.f20063c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public q0.b w() {
        return this.f20042h;
    }

    public final r x(int i10, HashMap map, k kVar) {
        a0 a0VarR;
        k kVar2;
        a0 a0VarK;
        k kVarL = e().n(d()).l(this.j);
        q0.b bVarW = w();
        kotlin.jvm.internal.l.c(bVarW);
        Object[] objArr = bVarW.f13637r;
        int i11 = bVarW.f13636i;
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayListO0 = null;
        while (i12 < i11) {
            Object obj = objArr[i12];
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
            y yVar = (y) obj;
            a0 a0VarB = yVar.b();
            a0 a0VarR2 = m.r(a0VarB, i10, kVar);
            if (a0VarR2 == null || (a0VarR = m.r(a0VarB, d(), kVarL)) == null || a0VarR2.equals(a0VarR)) {
                kVar2 = kVarL;
            } else {
                kVar2 = kVarL;
                a0 a0VarR3 = m.r(a0VarB, d(), e());
                if (a0VarR3 == null) {
                    m.q();
                    throw null;
                }
                if (map == null || (a0VarK = (a0) map.get(a0VarR2)) == null) {
                    a0VarK = yVar.k(a0VarR, a0VarR2, a0VarR3);
                }
                if (a0VarK == null) {
                    return new h();
                }
                if (!a0VarK.equals(a0VarR3)) {
                    if (a0VarK.equals(a0VarR2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new qg.g(yVar, a0VarR2.b()));
                        if (arrayListO0 == null) {
                            arrayListO0 = new ArrayList();
                        }
                        arrayListO0.add(yVar);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!a0VarK.equals(a0VarR) ? new qg.g(yVar, a0VarK) : new qg.g(yVar, a0VarR.b()));
                    }
                }
            }
            i12++;
            kVarL = kVar2;
        }
        if (arrayList != null) {
            u();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                qg.g gVar = (qg.g) arrayList.get(i13);
                y yVar2 = (y) gVar.f13911i;
                a0 a0Var = (a0) gVar.f13912r;
                a0Var.f20032a = d();
                synchronized (m.f20078b) {
                    a0Var.f20033b = yVar2.b();
                    yVar2.j(a0Var);
                }
            }
        }
        if (arrayListO0 != null) {
            int size2 = arrayListO0.size();
            for (int i14 = 0; i14 < size2; i14++) {
                bVarW.remove((y) arrayListO0.get(i14));
            }
            ArrayList arrayList2 = this.f20043i;
            if (arrayList2 != null) {
                arrayListO0 = rg.l.o0(arrayList2, arrayListO0);
            }
            this.f20043i = arrayListO0;
        }
        return i.f20063c;
    }

    public final void y(int i10) {
        synchronized (m.f20078b) {
            this.j = this.j.n(i10);
        }
    }

    public void z(q0.b bVar) {
        this.f20042h = bVar;
    }
}
