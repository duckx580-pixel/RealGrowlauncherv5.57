package sk;

import java.util.ArrayList;
import java.util.List;
import t4.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15927f;

    public n(int i10) {
        switch (i10) {
            case 1:
                this.f15925d = new rg.j();
                this.f15926e = new n7.e(11);
                break;
            default:
                this.f15925d = new j();
                this.f15926e = new j();
                this.f15927f = new byte[24];
                break;
        }
    }

    public void a(z zVar) {
        rg.j jVar = (rg.j) this.f15925d;
        n7.e eVar = (n7.e) this.f15926e;
        kotlin.jvm.internal.l.f("event", zVar);
        this.f15924c = true;
        if (!(zVar instanceof t4.x)) {
            if (zVar instanceof t4.w) {
                eVar.H(null, t4.r.f16616c);
                throw null;
            }
            if (zVar instanceof t4.y) {
                t4.y yVar = (t4.y) zVar;
                eVar.G(yVar.f16670a);
                this.f15927f = yVar.f16671b;
                return;
            }
            return;
        }
        t4.x xVar = (t4.x) zVar;
        t4.t tVar = xVar.f16660e;
        int i10 = xVar.f16658c;
        int i11 = xVar.f16659d;
        List list = xVar.f16657b;
        eVar.G(tVar);
        this.f15927f = xVar.f16661f;
        int iOrdinal = xVar.f16656a.ordinal();
        if (iOrdinal == 0) {
            jVar.clear();
            this.f15923b = i11;
            this.f15922a = i10;
            jVar.addAll(list);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            this.f15923b = i11;
            jVar.addAll(list);
            return;
        }
        this.f15922a = i10;
        int size = list.size() - 1;
        kh.c cVar = new kh.c(size, jj.d.t(size, 0, -1), -1);
        while (cVar.f9626s) {
            jVar.addFirst(list.get(cVar.nextInt()));
        }
    }

    public void b(n nVar, m mVar) {
        j jVar = (j) this.f15926e;
        byte[] bArr = (byte[]) this.f15927f;
        int i10 = nVar.f15923b;
        byte[] bArr2 = (byte[]) nVar.f15927f;
        if (i10 == 0 || this.f15923b == 0) {
            c();
            return;
        }
        j jVar2 = (j) this.f15925d;
        j jVar3 = (j) nVar.f15925d;
        if (jVar2.f15908a != jVar3.f15908a || jVar2.f15909b != jVar3.f15909b) {
            c();
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = this.f15923b;
            if (i11 >= i12 || i11 >= nVar.f15923b || bArr[i11] != bArr2[i11]) {
                break;
            }
            int iS = ((lk.a) mVar.f15920d).s(bArr, i11, i12);
            int i13 = 1;
            while (i13 < iS) {
                int i14 = i11 + i13;
                if (bArr[i14] != bArr2[i14]) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < iS) {
                break;
            } else {
                i11 += iS;
            }
        }
        if (!nVar.f15924c || i11 < nVar.f15923b || i11 < this.f15923b) {
            this.f15924c = false;
        }
        this.f15923b = i11;
        int i15 = this.f15922a;
        if (i15 < 0) {
            this.f15922a = nVar.f15922a;
        } else {
            int i16 = nVar.f15922a;
            if (i16 >= 0) {
                this.f15922a = i15 | i16;
            }
        }
        jVar.b((j) nVar.f15926e);
        if (this.f15924c) {
            return;
        }
        jVar.f15909b = 0;
    }

    public void c() {
        j jVar = (j) this.f15925d;
        jVar.f15909b = 0;
        jVar.f15908a = 0;
        j jVar2 = (j) this.f15926e;
        jVar2.f15909b = 0;
        jVar2.f15908a = 0;
        this.f15924c = false;
        this.f15922a = -1;
        this.f15923b = 0;
    }

    public void d(n nVar, lk.a aVar) {
        j jVar = (j) this.f15926e;
        int i10 = this.f15922a;
        if (i10 < 0) {
            this.f15922a = nVar.f15922a;
        } else if (i10 != nVar.f15922a) {
            return;
        }
        int i11 = nVar.f15923b;
        byte[] bArr = (byte[]) nVar.f15927f;
        int i12 = this.f15923b;
        int i13 = 0;
        while (i13 < i11) {
            int iS = aVar.s(bArr, i13, i11);
            if (i12 + iS > 24) {
                break;
            }
            int i14 = 0;
            while (i14 < iS && i13 < i11) {
                ((byte[]) this.f15927f)[i12] = bArr[i13];
                i14++;
                i12++;
                i13++;
            }
        }
        this.f15923b = i12;
        boolean z3 = i13 == i11 && nVar.f15924c;
        this.f15924c = z3;
        j jVar2 = (j) nVar.f15926e;
        int i15 = jVar.f15908a;
        int i16 = z3 ? jVar2.f15909b | (jVar.f15909b & 2048) : 0;
        jVar.f15908a = i15;
        jVar.f15909b = i16;
    }

    public void e(int i10, int i11, lk.a aVar, byte[] bArr) {
        int i12 = this.f15923b;
        while (i10 < i11 && i12 < 24) {
            int iS = aVar.s(bArr, i10, i11);
            if (i12 + iS > 24) {
                break;
            }
            int i13 = 0;
            while (i13 < iS && i10 < i11) {
                ((byte[]) this.f15927f)[i12] = bArr[i10];
                i13++;
                i12++;
                i10++;
            }
        }
        this.f15923b = i12;
    }

    public void f(n nVar) {
        j jVar = (j) this.f15925d;
        j jVar2 = (j) nVar.f15925d;
        jVar.f15908a = jVar2.f15908a;
        jVar.f15909b = jVar2.f15909b;
        j jVar3 = (j) this.f15926e;
        j jVar4 = (j) nVar.f15926e;
        jVar3.f15908a = jVar4.f15908a;
        jVar3.f15909b = jVar4.f15909b;
        this.f15924c = nVar.f15924c;
        this.f15922a = nVar.f15922a;
        this.f15923b = nVar.f15923b;
        System.arraycopy((byte[]) nVar.f15927f, 0, (byte[]) this.f15927f, 0, 24);
    }

    public List g() {
        rg.j jVar = (rg.j) this.f15925d;
        if (!this.f15924c) {
            return rg.s.f14664i;
        }
        ArrayList arrayList = new ArrayList();
        t4.t tVarI = ((n7.e) this.f15926e).I();
        if (jVar.isEmpty()) {
            arrayList.add(new t4.y(tVarI, (t4.t) this.f15927f));
            return arrayList;
        }
        t4.x xVar = t4.x.f16655g;
        arrayList.add(new t4.x(t4.u.f16637i, rg.l.x0(jVar), this.f15922a, this.f15923b, tVarI, (t4.t) this.f15927f));
        return arrayList;
    }

    public void h(n nVar, lk.a aVar) {
        int i10 = this.f15923b;
        int i11 = nVar.f15923b;
        if (i11 == 0) {
            return;
        }
        if (i10 == 0) {
            f(nVar);
            return;
        }
        if (i10 <= 2 && i11 <= 2) {
            int iG = o.g(((byte[]) this.f15927f)[0] & 255, aVar);
            int iG2 = o.g(((byte[]) nVar.f15927f)[0] & 255, aVar);
            if (this.f15923b > 1) {
                iG2 += 5;
            }
            i11 = nVar.f15923b > 1 ? iG + 5 : iG;
            i10 = iG2;
        }
        if (this.f15922a <= 0) {
            i10 *= 2;
        }
        if (nVar.f15922a <= 0) {
            i11 *= 2;
        }
        if (((j) this.f15925d).d((j) nVar.f15925d, i10, i11) > 0) {
            f(nVar);
        }
    }
}
