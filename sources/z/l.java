package z;

import java.util.List;
import java.util.Map;
import t1.i0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f20517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20525i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0 f20526k;

    public l(m mVar, int i10, boolean z3, float f9, i0 i0Var, float f10, boolean z10, List list, int i11, int i12, int i13) {
        this.f20517a = mVar;
        this.f20518b = i10;
        this.f20519c = z3;
        this.f20520d = f9;
        this.f20521e = f10;
        this.f20522f = z10;
        this.f20523g = list;
        this.f20524h = i11;
        this.f20525i = i12;
        this.j = i13;
        this.f20526k = i0Var;
    }

    @Override // t1.i0
    public final int a() {
        return this.f20526k.a();
    }

    @Override // t1.i0
    public final int b() {
        return this.f20526k.b();
    }

    @Override // t1.i0
    public final Map c() {
        return this.f20526k.c();
    }

    @Override // t1.i0
    public final void d() {
        this.f20526k.d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean e(int i10, boolean z3) {
        m mVar;
        if (!this.f20522f) {
            ?? r02 = this.f20523g;
            if (!r02.isEmpty() && (mVar = this.f20517a) != null) {
                int i11 = mVar.f20539n;
                int i12 = this.f20518b - i10;
                if (i12 >= 0 && i12 < i11) {
                    m mVar2 = (m) rg.l.c0(r02);
                    m mVar3 = (m) rg.l.k0(r02);
                    if (!mVar2.f20541p && !mVar3.f20541p) {
                        int i13 = this.f20525i;
                        int i14 = this.f20524h;
                        if (i10 >= 0 ? Math.min(i14 - mVar2.f20537l, i13 - mVar3.f20537l) > i10 : Math.min((mVar2.f20537l + mVar2.f20539n) - i14, (mVar3.f20537l + mVar3.f20539n) - i13) > (-i10)) {
                            this.f20518b -= i10;
                            int size = r02.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                m mVar4 = (m) r02.get(i15);
                                int[] iArr = mVar4.f20543r;
                                boolean z10 = mVar4.f20529c;
                                if (!mVar4.f20541p) {
                                    mVar4.f20537l += i10;
                                    int length = iArr.length;
                                    for (int i16 = 0; i16 < length; i16++) {
                                        if ((z10 && i16 % 2 == 1) || (!z10 && i16 % 2 == 0)) {
                                            iArr[i16] = iArr[i16] + i10;
                                        }
                                    }
                                    if (z3) {
                                        int size2 = mVar4.f20528b.size();
                                        for (int i17 = 0; i17 < size2; i17++) {
                                        }
                                    }
                                }
                            }
                            this.f20520d = i10;
                            if (!this.f20519c && i10 > 0) {
                                this.f20519c = true;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
