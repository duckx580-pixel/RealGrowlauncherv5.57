package t0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f16245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f16246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16247v;
    public int w;

    public f(e eVar, l[] lVarArr) {
        super(eVar.f16241s, lVarArr);
        this.f16245t = eVar;
        this.w = eVar.f16243u;
    }

    public final void c(int i10, k kVar, Object obj, int i11) {
        int i12 = i11 * 5;
        l[] lVarArr = this.f16236i;
        if (i12 <= 30) {
            int iW = 1 << t6.k.w(i10, i12);
            if (kVar.h(iW)) {
                lVarArr[i11].a(kVar.f16256d, Integer.bitCount(kVar.f16253a) * 2, kVar.f(iW));
                this.f16237r = i11;
                return;
            } else {
                int iT = kVar.t(iW);
                k kVarS = kVar.s(iT);
                lVarArr[i11].a(kVar.f16256d, Integer.bitCount(kVar.f16253a) * 2, iT);
                c(i10, kVarS, obj, i11 + 1);
                return;
            }
        }
        l lVar = lVarArr[i11];
        Object[] objArr = kVar.f16256d;
        lVar.a(objArr, objArr.length, 0);
        while (true) {
            l lVar2 = lVarArr[i11];
            if (kotlin.jvm.internal.l.a(lVar2.f16257i[lVar2.f16259s], obj)) {
                this.f16237r = i11;
                return;
            } else {
                lVarArr[i11].f16259s += 2;
            }
        }
    }

    @Override // t0.d, java.util.Iterator
    public final Object next() {
        if (this.f16245t.f16243u != this.w) {
            throw new ConcurrentModificationException();
        }
        if (!this.f16238s) {
            throw new NoSuchElementException();
        }
        l lVar = this.f16236i[this.f16237r];
        this.f16246u = lVar.f16257i[lVar.f16259s];
        this.f16247v = true;
        return super.next();
    }

    @Override // t0.d, java.util.Iterator
    public final void remove() {
        if (!this.f16247v) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f16238s;
        e eVar = this.f16245t;
        if (!z3) {
            a0.b(eVar).remove(this.f16246u);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            l lVar = this.f16236i[this.f16237r];
            Object obj = lVar.f16257i[lVar.f16259s];
            a0.b(eVar).remove(this.f16246u);
            c(obj != null ? obj.hashCode() : 0, eVar.f16241s, obj, 0);
        }
        this.f16246u = null;
        this.f16247v = false;
        this.w = eVar.f16243u;
    }
}
