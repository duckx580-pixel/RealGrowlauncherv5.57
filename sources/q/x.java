package q;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f13626i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f13627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13628s;

    public x(int i10) {
        this.f13626i = i10 == 0 ? r.a.f14432a : new int[i10];
        this.f13627r = i10 == 0 ? r.a.f14434c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f13628s * 2;
        Object[] objArr = this.f13627r;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f13628s;
        int[] iArr = this.f13626i;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
            this.f13626i = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13627r, i10 * 2);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            this.f13627r = objArrCopyOf;
        }
        if (this.f13628s != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f13628s;
        if (i11 == 0) {
            return -1;
        }
        int iA = r.a.a(i11, i10, this.f13626i);
        if (iA < 0 || kotlin.jvm.internal.l.a(obj, this.f13627r[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f13626i[i12] == i10) {
            if (kotlin.jvm.internal.l.a(obj, this.f13627r[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f13626i[i13] == i10; i13--) {
            if (kotlin.jvm.internal.l.a(obj, this.f13627r[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f13628s > 0) {
            this.f13626i = r.a.f14432a;
            this.f13627r = r.a.f14434c;
            this.f13628s = 0;
        }
        if (this.f13628s > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int e(Object obj) {
        return obj == null ? f() : c(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof x) {
                int i10 = this.f13628s;
                if (i10 != ((x) obj).f13628s) {
                    return false;
                }
                x xVar = (x) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objJ = j(i11);
                    Object obj2 = xVar.get(objG);
                    if (objJ == null) {
                        if (obj2 != null || !xVar.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f13628s != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f13628s;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objG2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i10 = this.f13628s;
        if (i10 == 0) {
            return -1;
        }
        int iA = r.a.a(i10, 0, this.f13626i);
        if (iA < 0 || this.f13627r[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f13626i[i11] == 0) {
            if (this.f13627r[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f13626i[i12] == 0; i12--) {
            if (this.f13627r[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object g(int i10) {
        boolean z3 = false;
        if (i10 >= 0 && i10 < this.f13628s) {
            z3 = true;
        }
        if (z3) {
            return this.f13627r[i10 << 1];
        }
        r.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f13627r[(iE << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f13627r[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13628s)) {
            r.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f13627r;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f13626i;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                rg.k.r0(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f13627r;
                rg.k.t0(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f13627r;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
            this.f13626i = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13627r, i16 << 1);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            this.f13627r = objArrCopyOf;
            if (i11 != this.f13628s) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                rg.k.r0(0, 0, i10, iArr, this.f13626i);
                rg.k.t0(objArr, this.f13627r, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                rg.k.r0(i10, i17, i11, iArr, this.f13626i);
                rg.k.t0(objArr, this.f13627r, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f13628s) {
            throw new ConcurrentModificationException();
        }
        this.f13628s = i13;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f13626i;
        Object[] objArr = this.f13627r;
        int i10 = this.f13628s;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10, Object obj) {
        boolean z3 = false;
        if (i10 >= 0 && i10 < this.f13628s) {
            z3 = true;
        }
        if (!z3) {
            r.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f13627r;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f13628s <= 0;
    }

    public final Object j(int i10) {
        boolean z3 = false;
        if (i10 >= 0 && i10 < this.f13628s) {
            z3 = true;
        }
        if (z3) {
            return this.f13627r[(i10 << 1) + 1];
        }
        r.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f13628s;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : f();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f13627r;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f13626i;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
            this.f13626i = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13627r, i13 << 1);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            this.f13627r = objArrCopyOf;
            if (i10 != this.f13628s) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f13626i;
            int i14 = i12 + 1;
            rg.k.r0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f13627r;
            rg.k.t0(objArr2, objArr2, i14 << 1, i12 << 1, this.f13628s << 1);
        }
        int i15 = this.f13628s;
        if (i10 == i15) {
            int[] iArr3 = this.f13626i;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f13627r;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f13628s = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return h(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f13628s;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13628s * 28);
        sb2.append('{');
        int i10 = this.f13628s;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objG = g(i11);
            if (objG != sb2) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i11);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !kotlin.jvm.internal.l.a(obj2, j(iE))) {
            return false;
        }
        h(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !kotlin.jvm.internal.l.a(obj2, j(iE))) {
            return false;
        }
        i(iE, obj3);
        return true;
    }
}
