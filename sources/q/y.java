package q;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Cloneable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f13629i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int[] f13630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object[] f13631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f13632t;

    public y(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f13630r = new int[i14];
        this.f13631s = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f13632t;
        if (i11 != 0 && i10 <= this.f13630r[i11 - 1]) {
            e(i10, obj);
            return;
        }
        if (this.f13629i && i11 >= this.f13630r.length) {
            k.a(this);
        }
        int i12 = this.f13632t;
        if (i12 >= this.f13630r.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f13630r, i16);
            kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
            this.f13630r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13631s, i16);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            this.f13631s = objArrCopyOf;
        }
        this.f13630r[i12] = i10;
        this.f13631s[i12] = obj;
        this.f13632t = i12 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", objClone);
        y yVar = (y) objClone;
        yVar.f13630r = (int[]) this.f13630r.clone();
        yVar.f13631s = (Object[]) this.f13631s.clone();
        return yVar;
    }

    public final Object c(int i10) {
        Object obj;
        int iA = r.a.a(this.f13632t, i10, this.f13630r);
        if (iA < 0 || (obj = this.f13631s[iA]) == k.f13578b) {
            return null;
        }
        return obj;
    }

    public final int d(int i10) {
        if (this.f13629i) {
            k.a(this);
        }
        return this.f13630r[i10];
    }

    public final void e(int i10, Object obj) {
        int iA = r.a.a(this.f13632t, i10, this.f13630r);
        if (iA >= 0) {
            this.f13631s[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f13632t;
        if (i11 < i12) {
            Object[] objArr = this.f13631s;
            if (objArr[i11] == k.f13578b) {
                this.f13630r[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f13629i && i12 >= this.f13630r.length) {
            k.a(this);
            i11 = ~r.a.a(this.f13632t, i10, this.f13630r);
        }
        int i13 = this.f13632t;
        if (i13 >= this.f13630r.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f13630r, i17);
            kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
            this.f13630r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13631s, i17);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            this.f13631s = objArrCopyOf;
        }
        int i18 = this.f13632t;
        if (i18 - i11 != 0) {
            int[] iArr = this.f13630r;
            int i19 = i11 + 1;
            rg.k.r0(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f13631s;
            rg.k.t0(objArr2, objArr2, i19, i11, this.f13632t);
        }
        this.f13630r[i11] = i10;
        this.f13631s[i11] = obj;
        this.f13632t++;
    }

    public final int f() {
        if (this.f13629i) {
            k.a(this);
        }
        return this.f13632t;
    }

    public final Object g(int i10) {
        if (this.f13629i) {
            k.a(this);
        }
        Object[] objArr = this.f13631s;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13632t * 28);
        sb2.append('{');
        int i10 = this.f13632t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i11));
            sb2.append('=');
            Object objG = g(i11);
            if (objG != this) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return string;
    }
}
