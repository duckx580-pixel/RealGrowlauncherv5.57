package xf;

import a0.x;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f19719t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public tf.c f19720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public tf.c f19721v;
    public xe.d w;

    public i(uf.c cVar, pf.h hVar) {
        super(cVar, hVar);
        this.f19719t = new AtomicInteger(0);
        xe.d dVar = new xe.d(cVar.getTabWidth());
        this.w = dVar;
        dVar.f19627e = cVar.f17848z0;
        this.f19720u = new tf.c();
        tf.c cVar2 = new tf.c();
        this.f19721v = cVar2;
        u(this.f19720u, cVar2);
    }

    public static int v() {
        Iterator it = Collections.EMPTY_LIST.iterator();
        if (!it.hasNext()) {
            return (int) 0.0f;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // xf.e
    public final int a() {
        return this.f19706r.f13391i.size();
    }

    @Override // xf.e
    public final long b(float f9, float f10) {
        int iMin = Math.min(this.f19706r.f13391i.size() - 1, Math.max((int) (f10 / this.f19705i.getRowHeight()), 0));
        return tf.h.e(iMin, this.f19705i.getRenderer().d(iMin).g(f9));
    }

    @Override // xf.e
    public final int c() {
        return this.f19705i.getRowHeight() * this.f19706r.f13391i.size();
    }

    @Override // xf.e
    public final float[] d(int i10, int i11, float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            fArr = new float[2];
        }
        fArr[0] = this.f19705i.L(i10);
        fArr[1] = this.f19705i.getRenderer().d(i10).f(i11);
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
                this.f19720u.e(i11, w(i11, false));
                i12 = i10;
            } else {
                i10 = i12;
            }
            i11 = size;
            this.f19720u.e(i11, w(i11, false));
            i12 = i10;
        }
    }

    @Override // xf.e
    public final l g(int i10, SparseArray sparseArray) {
        return new x(this, this.f19706r, i10, sparseArray);
    }

    @Override // xf.e
    public final long h(int i10, int i11) {
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

    @Override // pf.j
    public final void i(pf.h hVar, int i10, int i11, int i12, int i13, StringBuilder sb2) {
        if (i10 < i12) {
            int i14 = i10 + 1;
            int i15 = i12 + 1;
            this.f19720u.d(i14, i15);
            this.f19721v.d(i14, i15);
        }
        if (i10 != i12) {
            this.f19720u.e(i10, w(i10, false));
            return;
        }
        int iC = this.f19721v.c(i10);
        t();
        List list = Collections.EMPTY_LIST;
        this.f19705i.getTextPaint();
        int iV = v();
        this.f19721v.e(i10, iV);
        tf.c cVar = this.f19720u;
        cVar.e(i10, (iV - iC) + (cVar.c(i10) - ((int) this.w.b(sb2, 0, i13 - i11, this.f19705i.getTextPaint()))));
    }

    @Override // xf.e
    public final int j(int i10) {
        return 1;
    }

    @Override // xf.e
    public final int l(int i10) {
        return this.f19705i.getText().n().A(i10).f13384b;
    }

    @Override // pf.j
    public final void m(pf.h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        for (int i14 = i10; i14 <= i12; i14++) {
            if (i14 != i10) {
                this.f19720u.a(i14, w(i14, true));
            } else if (i12 == i10) {
                int iC = this.f19721v.c(i14);
                t();
                List list = Collections.EMPTY_LIST;
                this.f19705i.getTextPaint();
                int iV = v();
                this.f19721v.e(i14, iV);
                tf.c cVar = this.f19720u;
                int i15 = iV - iC;
                cVar.e(i14, i15 + cVar.c(i14) + ((int) this.w.b(this.f19706r.o(i14), i11, i13, this.f19705i.getTextPaint())));
            } else {
                this.f19720u.e(i14, w(i14, false));
            }
        }
    }

    @Override // xf.e
    public final void n() {
        this.f19705i = null;
        this.f19706r = null;
        this.f19720u = null;
        this.f19721v = null;
    }

    @Override // xf.e
    public final long o(int i10, int i11) {
        int i12 = i10 - 1;
        if (i12 < 0) {
            return tf.h.e(0, 0);
        }
        int i13 = this.f19706r.o(i12).f13401r;
        if (i11 > i13) {
            i11 = i13;
        }
        return tf.h.e(i12, i11);
    }

    @Override // xf.e
    public final int p(int i10) {
        return Math.max(0, Math.min(i10, this.f19706r.f13391i.size() - 1));
    }

    @Override // xf.e
    public final j q(int i10) {
        j jVar = new j();
        jVar.f19722a = i10;
        jVar.f19725d = 0;
        jVar.f19723b = true;
        jVar.f19724c = true;
        jVar.f19726e = this.f19706r.o(i10).f13401r;
        t();
        jVar.f19727f = Collections.EMPTY_LIST;
        return jVar;
    }

    @Override // xf.e
    public final int s() {
        tf.c cVar = this.f19720u;
        if (cVar.f17172e == 0) {
            return 214748364;
        }
        int i10 = cVar.f17173f;
        if (i10 != cVar.j) {
            cVar.j = i10;
        }
        cVar.f17177k = 0;
        for (tf.a aVar = cVar.f17174g; aVar != null; aVar = aVar.f17164d) {
            cVar.f17177k = Math.max(cVar.f17177k, aVar.f17163c);
        }
        return cVar.f17177k;
    }

    public final void u(tf.c cVar, tf.c cVar2) {
        if (this.f19706r == null) {
            return;
        }
        xe.c cVar3 = new xe.c(this.f19705i.f17848z0);
        cVar3.set(this.f19705i.getTextPaint());
        cVar3.b();
        final int i10 = this.f19719t.get();
        h hVar = new h(this, new c(1, new b() { // from class: xf.f
            @Override // xf.b
            public final void b(int i11, Object[] objArr) {
                i iVar = this.f19707i;
                uf.c cVar4 = iVar.f19705i;
                if (cVar4 == null || i11 > 0) {
                    return;
                }
                cVar4.b0(new v4.a(iVar, cVar4, i10));
            }
        }), cVar, this.w, cVar3, cVar2, i10);
        this.f19705i.setLayoutBusy(true);
        d.f19704s.submit(hVar);
    }

    public final int w(int i10, boolean z3) {
        pf.i iVarO = this.f19706r.o(i10);
        t();
        List list = Collections.EMPTY_LIST;
        this.f19705i.getTextPaint();
        int iV = v();
        if (z3) {
            this.f19721v.a(i10, iV);
        } else {
            this.f19721v.e(i10, iV);
        }
        return ((int) this.w.b(iVarO, 0, iVarO.f13401r, this.f19705i.getTextPaint())) + iV;
    }

    @Override // pf.j
    public final void e(pf.h hVar) {
    }
}
