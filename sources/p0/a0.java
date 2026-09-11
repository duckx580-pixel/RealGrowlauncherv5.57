package p0;

import java.util.Arrays;
import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13197b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13199d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13203h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z[] f13196a = new z[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13198c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f13200e = new Object[16];

    public static final int a(a0 a0Var, int i10) {
        a0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    public final void b() {
        this.f13197b = 0;
        this.f13199d = 0;
        rg.k.y0(0, this.f13201f, null, this.f13200e);
        this.f13201f = 0;
    }

    public final void c(n7.e eVar, u1 u1Var, mf.c cVar) {
        int i10;
        if (e()) {
            androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(this);
            a0 a0Var = (a0) iVar.f1546e;
            do {
                z zVar = a0Var.f13196a[iVar.f1543b];
                kotlin.jvm.internal.l.c(zVar);
                zVar.a(iVar, eVar, u1Var, cVar);
                int i11 = iVar.f1543b;
                if (i11 >= a0Var.f13197b) {
                    break;
                }
                z zVar2 = a0Var.f13196a[i11];
                kotlin.jvm.internal.l.c(zVar2);
                iVar.f1544c += zVar2.f13232a;
                iVar.f1545d += zVar2.f13233b;
                i10 = iVar.f1543b + 1;
                iVar.f1543b = i10;
            } while (i10 < a0Var.f13197b);
        }
        b();
    }

    public final boolean d() {
        return this.f13197b == 0;
    }

    public final boolean e() {
        return this.f13197b != 0;
    }

    public final z f() {
        z zVar = this.f13196a[this.f13197b - 1];
        kotlin.jvm.internal.l.c(zVar);
        return zVar;
    }

    public final void g(z zVar) {
        int i10 = zVar.f13232a;
        int i11 = zVar.f13233b;
        if (i10 == 0 && i11 == 0) {
            h(zVar);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + zVar + " without arguments because it expects " + i10 + " ints and " + i11 + " objects.").toString());
    }

    public final void h(z zVar) {
        this.f13202g = 0;
        this.f13203h = 0;
        int i10 = this.f13197b;
        z[] zVarArr = this.f13196a;
        if (i10 == zVarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(zVarArr, i10 + (i10 > 1024 ? 1024 : i10));
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f13196a = (z[]) objArrCopyOf;
        }
        int i11 = this.f13199d;
        int i12 = zVar.f13232a;
        int i13 = zVar.f13233b;
        int i14 = i11 + i12;
        int[] iArr = this.f13198c;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = length + (length > 1024 ? 1024 : length);
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.f13198c = iArrCopyOf;
        }
        int i16 = this.f13201f + i13;
        Object[] objArr = this.f13200e;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i16);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf2);
            this.f13200e = objArrCopyOf2;
        }
        z[] zVarArr2 = this.f13196a;
        int i18 = this.f13197b;
        this.f13197b = i18 + 1;
        zVarArr2[i18] = zVar;
        this.f13199d += zVar.f13232a;
        this.f13201f += i13;
    }
}
