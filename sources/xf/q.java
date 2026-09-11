package xf;

import a0.x;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ka.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ArrayList f19748x;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f19750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f19751v;
    public List w;

    static {
        ArrayList arrayList = new ArrayList();
        f19748x = arrayList;
        arrayList.add(a1.z(qd.a.k(0, true, true), 0));
    }

    public q(uf.c cVar, pf.h hVar, boolean z3, q qVar, boolean z10) {
        super(cVar, hVar);
        this.f19751v = z3;
        List arrayList = qVar != null ? qVar.w : new ArrayList();
        this.w = arrayList;
        if (z10) {
            arrayList.clear();
        }
        float fX = (cVar.getNonPrintablePaintingFlags() & 128) != 0 ? cVar.getRenderer().x() : 0.0f;
        this.f19750u = fX;
        this.f19749t = (cVar.getWidth() - ((int) (cVar.getTextPaint().measureText("a") + cVar.U()))) - (((int) fX) * 2);
        int iMin = Math.min(8, (int) Math.ceil(this.f19706r.f13391i.size() / 3000.0f));
        int size = this.f19706r.f13391i.size() / iMin;
        c cVar2 = new c(iMin, new com.google.gson.internal.b(22, this));
        this.f19705i.setLayoutBusy(true);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= iMin) {
                return;
            }
            i10 = i11 + 1;
            d.f19704s.submit(new o(this, cVar2, i11, size * i11, (i10 == iMin ? this.f19706r.f13391i.size() : size * i10) - 1));
        }
    }

    @Override // xf.e
    public final int a() {
        return this.w.isEmpty() ? this.f19706r.f13391i.size() : this.w.size();
    }

    @Override // xf.e
    public final long b(float f9, float f10) {
        if (this.w.isEmpty()) {
            int iMin = Math.min(this.f19706r.f13391i.size() - 1, Math.max((int) (f10 / this.f19705i.getRowHeight()), 0));
            return tf.h.e(iMin, this.f19705i.getRenderer().d(iMin).g(f9));
        }
        int iMax = Math.max(0, Math.min((int) (f10 / this.f19705i.getRowHeight()), this.w.size() - 1));
        n nVar = (n) this.w.get(iMax);
        if (nVar.f19736a != 0) {
            f9 -= this.f19750u;
        }
        return tf.h.e(nVar.f19739d, this.f19705i.getRenderer().d(iMax).g(f9 - nVar.a(this.f19749t)));
    }

    @Override // xf.e
    public final int c() {
        int size;
        int rowHeight;
        if (this.w.isEmpty()) {
            size = this.f19705i.getRowHeight();
            rowHeight = this.f19706r.f13391i.size();
        } else {
            size = this.w.size();
            rowHeight = this.f19705i.getRowHeight();
        }
        return rowHeight * size;
    }

    @Override // xf.e
    public final float[] d(int i10, int i11, float[] fArr) {
        int i12;
        if (fArr == null || fArr.length < 2) {
            fArr = new float[2];
        }
        if (this.w.isEmpty()) {
            fArr[0] = this.f19705i.L(i10);
            fArr[1] = this.f19705i.getRenderer().d(i10).f(i11);
            return fArr;
        }
        int iW = w(i10);
        if (iW >= this.w.size()) {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            return fArr;
        }
        n nVar = (n) this.w.get(iW);
        if (nVar.f19739d != i10) {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            return fArr;
        }
        while (nVar.f19736a < i11 && (i12 = iW + 1) < this.w.size()) {
            nVar = (n) this.w.get(i12);
            if (nVar.f19739d != i10 || nVar.f19736a > i11) {
                nVar = (n) this.w.get(iW);
                break;
            }
            iW = i12;
        }
        fArr[0] = this.f19705i.L(iW);
        float f9 = this.f19705i.getRenderer().d(iW).f(i11);
        fArr[1] = f9;
        if (nVar.f19736a != 0) {
            fArr[1] = f9 + this.f19750u;
        }
        fArr[1] = nVar.a(this.f19749t) + fArr[1];
        return fArr;
    }

    @Override // xf.e
    public final void f(mf.a aVar) {
        int i10;
        int i11;
        int[] iArr = (int[]) aVar.f11698r;
        int size = this.f19706r.f13391i.size() - 1;
        int i12 = 0;
        while (true) {
            if (!(i12 < iArr.length)) {
                return;
            }
            if (i12 < iArr.length) {
                i10 = i12 + 1;
                i11 = iArr[i12];
                if (i11 > size) {
                }
                v(i11, i11);
                i12 = i10;
            } else {
                i10 = i12;
            }
            i11 = size;
            v(i11, i11);
            i12 = i10;
        }
    }

    @Override // xf.e
    public final l g(int i10, SparseArray sparseArray) {
        return this.w.isEmpty() ? new x(this, this.f19706r, i10, sparseArray) : new f2.b(this, i10);
    }

    @Override // xf.e
    public final long h(int i10, int i11) {
        if (this.w.isEmpty()) {
            int i12 = i10 + 1;
            if (i12 >= this.f19706r.f13391i.size()) {
                return tf.h.e(i10, this.f19706r.o(i10).f13401r);
            }
            int i13 = this.f19706r.o(i12).f13401r;
            if (i11 > i13) {
                i11 = i13;
            }
            return tf.h.e(i12, i11);
        }
        int iX = x(i10, i11);
        int i14 = iX + 1;
        if (i14 >= this.w.size()) {
            return tf.h.e(i10, this.f19706r.o(i10).f13401r);
        }
        int i15 = i11 - ((n) this.w.get(iX)).f19736a;
        n nVar = (n) this.w.get(i14);
        int i16 = nVar.f19737b;
        int i17 = nVar.f19736a;
        return tf.h.e(nVar.f19739d, i17 + Math.min(i15, i16 - i17));
    }

    @Override // pf.j
    public final void i(pf.h hVar, int i10, int i11, int i12, int i13, StringBuilder sb2) {
        int i14;
        int i15 = i12 - i10;
        if (i15 != 0) {
            int iW = w(i10);
            while (iW < this.w.size() && (i14 = ((n) this.w.get(iW)).f19739d) >= i10 && i14 <= i12) {
                this.w.remove(iW);
            }
            for (int iW2 = w(i12 + 1); iW2 < this.w.size(); iW2++) {
                n nVar = (n) this.w.get(iW2);
                int i16 = nVar.f19739d;
                if (i16 >= i12) {
                    nVar.f19739d = i16 - i15;
                }
            }
        }
        v(i10, i10);
    }

    @Override // xf.e
    public final int j(int i10) {
        if (this.w.isEmpty()) {
            return 1;
        }
        int i11 = 0;
        for (int iW = w(i10); iW < this.w.size() && ((n) this.w.get(iW)).f19739d == i10; iW++) {
            i11++;
        }
        return i11;
    }

    @Override // xf.e
    public final int l(int i10) {
        int i11;
        pf.c cVarA = this.f19705i.getText().n().A(i10);
        int i12 = cVarA.f13384b;
        if (this.w.isEmpty()) {
            return i12;
        }
        int i13 = cVarA.f13385c;
        int iW = w(i12);
        if (iW >= this.w.size()) {
            return 0;
        }
        n nVar = (n) this.w.get(iW);
        if (nVar.f19739d != i12) {
            return 0;
        }
        while (nVar.f19736a < i13 && (i11 = iW + 1) < this.w.size()) {
            n nVar2 = (n) this.w.get(i11);
            if (nVar2.f19739d != i12 || nVar2.f19736a > i13) {
                break;
            }
            iW = i11;
            nVar = nVar2;
        }
        return iW;
    }

    @Override // pf.j
    public final void m(pf.h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        int i14 = i12 - i10;
        if (i14 != 0) {
            for (int iW = w(i10 + 1); iW < this.w.size(); iW++) {
                ((n) this.w.get(iW)).f19739d += i14;
            }
        }
        v(i10, i12);
    }

    @Override // xf.e
    public final void n() {
        this.f19705i = null;
        this.f19706r = null;
        this.w = null;
    }

    @Override // xf.e
    public final long o(int i10, int i11) {
        long jE = tf.h.e(0, 0);
        if (this.w.isEmpty()) {
            int i12 = i10 - 1;
            if (i12 < 0) {
                return jE;
            }
            int i13 = this.f19706r.o(i12).f13401r;
            if (i11 > i13) {
                i11 = i13;
            }
            return tf.h.e(i12, i11);
        }
        int iX = x(i10, i11);
        if (iX <= 0) {
            return jE;
        }
        int i14 = i11 - ((n) this.w.get(iX)).f19736a;
        n nVar = (n) this.w.get(iX - 1);
        int i15 = nVar.f19737b;
        int i16 = nVar.f19736a;
        return tf.h.e(nVar.f19739d, i16 + Math.min(i14, i15 - i16));
    }

    @Override // xf.e
    public final int p(int i10) {
        if (this.w.isEmpty()) {
            return Math.max(0, Math.min(i10, this.f19706r.f13391i.size() - 1));
        }
        if (i10 < this.w.size()) {
            return ((n) this.w.get(i10)).f19739d;
        }
        return ((n) this.w.get(r2.size() - 1)).f19739d;
    }

    @Override // xf.e
    public final j q(int i10) {
        if (this.w.isEmpty()) {
            j jVar = new j();
            jVar.f19725d = 0;
            jVar.f19726e = this.f19706r.o(i10).f13401r;
            jVar.f19723b = true;
            jVar.f19724c = true;
            jVar.f19722a = i10;
            t();
            jVar.f19727f = Collections.EMPTY_LIST;
            return jVar;
        }
        n nVar = (n) this.w.get(i10);
        boolean z3 = i10 <= 0 || ((n) this.w.get(i10 + (-1))).f19739d != nVar.f19739d;
        int i11 = i10 + 1;
        boolean z10 = i11 >= this.w.size() || ((n) this.w.get(i11)).f19739d != nVar.f19739d;
        n nVar2 = (n) this.w.get(i10);
        float f9 = this.f19749t;
        nVar2.getClass();
        j jVar2 = new j();
        jVar2.f19723b = z3;
        jVar2.f19724c = z10;
        jVar2.f19725d = nVar2.f19736a;
        jVar2.f19726e = nVar2.f19737b;
        jVar2.f19722a = nVar2.f19739d;
        List list = nVar2.f19738c;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        jVar2.f19727f = list;
        jVar2.f19728g = nVar2.a(f9);
        return jVar2;
    }

    @Override // xf.e
    public final int s() {
        return 0;
    }

    public final ArrayList u(int i10, pf.i iVar, xe.c cVar) {
        if (cVar == null) {
            cVar = new xe.c(this.f19705i.f17848z0);
            cVar.set(this.f19705i.getTextPaint());
        }
        xe.o oVar = new xe.o();
        qf.b bVarP = this.f19706r.p(i10);
        int i11 = iVar.f13401r;
        t();
        oVar.n(iVar, 0, i11, f19748x, Collections.EMPTY_LIST, bVarP, cVar, null, this.f19705i.getRenderer().e());
        ArrayList<xe.n> arrayList = new ArrayList();
        xe.g gVar = new xe.g(oVar, arrayList, this.f19749t, this.f19751v ? new x7.h(oVar.f19674d) : rf.b.f14652i);
        oVar.l(gVar, false);
        if (arrayList.isEmpty()) {
            xe.n nVar = gVar.f19637a;
            if (nVar.f19666a) {
                nVar.f19666a = false;
                nVar.f19667b = oVar.f19676f;
                nVar.f19668c = oVar.f19677g;
            }
        }
        if (!gVar.f19637a.f19666a) {
            gVar.b();
        }
        ArrayList arrayList2 = new ArrayList();
        for (xe.n nVar2 : arrayList) {
            arrayList2.add(new n(i10, nVar2.f19667b, nVar2.f19668c, null, nVar2.f19669d, false));
        }
        return arrayList2;
    }

    public final void v(int i10, int i11) {
        int i12;
        int i13 = 0;
        while (i13 < this.w.size() && ((n) this.w.get(i13)).f19739d < i10) {
            i13++;
        }
        while (i13 < this.w.size() && (i12 = ((n) this.w.get(i13)).f19739d) >= i10 && i12 <= i11) {
            this.w.remove(i13);
        }
        ArrayList arrayList = new ArrayList();
        while (i10 <= i11) {
            arrayList.addAll(u(i10, this.f19706r.o(i10), null));
            i10++;
        }
        this.w.addAll(i13, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r2 = java.lang.Math.max(0, java.lang.Math.min(r5.w.size() - 1, r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w(int r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.w
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 > r0) goto L40
            int r3 = r2 + r0
            int r3 = r3 / 2
            if (r3 < 0) goto L30
            java.util.List r4 = r5.w
            int r4 = r4.size()
            if (r3 < r4) goto L19
            goto L30
        L19:
            java.util.List r4 = r5.w
            java.lang.Object r4 = r4.get(r3)
            xf.n r4 = (xf.n) r4
            int r4 = r4.f19739d
            if (r4 >= r6) goto L28
            int r2 = r3 + 1
            goto L8
        L28:
            if (r4 <= r6) goto L2e
            int r3 = r3 + (-1)
            r0 = r3
            goto L8
        L2e:
            r2 = r3
            goto L40
        L30:
            java.util.List r6 = r5.w
            int r6 = r6.size()
            int r6 = r6 + (-1)
            int r6 = java.lang.Math.min(r6, r3)
            int r2 = java.lang.Math.max(r1, r6)
        L40:
            if (r2 <= 0) goto L51
            java.util.List r6 = r5.w
            java.lang.Object r6 = r6.get(r2)
            xf.n r6 = (xf.n) r6
            int r6 = r6.f19736a
            if (r6 <= 0) goto L51
            int r2 = r2 + (-1)
            goto L40
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xf.q.w(int):int");
    }

    public final int x(int i10, int i11) {
        int i12;
        int iW = w(i10);
        while (((n) this.w.get(iW)).f19737b <= i11 && (i12 = iW + 1) < this.w.size() && ((n) this.w.get(i12)).f19739d == i10) {
            iW = i12;
        }
        return iW;
    }

    @Override // pf.j
    public final void e(pf.h hVar) {
    }
}
