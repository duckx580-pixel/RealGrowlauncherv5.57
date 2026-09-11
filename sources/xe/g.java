package xe;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f19637a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19638b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf.a f19641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f19642f;

    public g(o oVar, ArrayList arrayList, int i10, rf.a aVar) {
        this.f19642f = oVar;
        this.f19639c = arrayList;
        this.f19640d = i10;
        this.f19641e = aVar;
    }

    @Override // xe.m
    public final boolean a(ArrayList arrayList, boolean z3, af.f fVar) {
        int i10;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xf.k kVar = (xf.k) it.next();
            kVar.getClass();
            float[] fArrA = tf.i.a(kVar.f19730b - kVar.f19729a);
            int i11 = kVar.f19729a;
            int i12 = kVar.f19730b;
            boolean z10 = kVar.f19731c;
            o oVar = this.f19642f;
            char[] cArr = oVar.f19674d.f13400i;
            float f9 = oVar.j.f19684a * oVar.f19680k.f19621a;
            int i13 = i11;
            int i14 = i13;
            float fA = 0.0f;
            while (i13 <= i12) {
                if (i13 == i12 || cArr[i13] == '\t') {
                    if (i13 > i14) {
                        int i15 = i13;
                        i10 = i15;
                        fA += oVar.f19680k.a(cArr, i14, i15 - i14, i11, i12 - i11, z10, fArrA, i14 - i11);
                    } else {
                        i10 = i13;
                    }
                    if (i10 < i12) {
                        fA += f9;
                        fArrA[i10 - i11] = f9;
                    }
                    i14 = i10 + 1;
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            float f10 = this.f19638b;
            float f11 = f10 + fA;
            float f12 = this.f19640d;
            if (f11 < f12) {
                n nVar = this.f19637a;
                boolean z11 = nVar.f19666a;
                if (z11) {
                    int i16 = kVar.f19729a;
                    int i17 = kVar.f19730b;
                    nVar.f19666a = false;
                    nVar.f19667b = i16;
                    nVar.f19668c = i17;
                } else {
                    int i18 = kVar.f19730b;
                    if (z11) {
                        throw new IllegalStateException();
                    }
                    nVar.f19668c = i18;
                }
                this.f19638b = f10 + fA;
                tf.i.b(fArrA);
            } else {
                int i19 = kVar.f19730b - kVar.f19729a;
                int i20 = 0;
                while (i20 < i19) {
                    int i21 = (int) (f12 - this.f19638b);
                    float f13 = 0.0f;
                    int i22 = i20;
                    while (i22 < i19) {
                        float f14 = fArrA[i22];
                        if (f14 != 0.0f) {
                            f13 += f14;
                            if (f13 > i21) {
                                break;
                            }
                        }
                        i22++;
                    }
                    if (i22 == i20) {
                        if (this.f19637a.f19666a) {
                            i22++;
                        } else {
                            b();
                        }
                    }
                    int i23 = kVar.f19729a;
                    int iK = this.f19641e.k(i23 + i20, i23 + i22) - kVar.f19729a;
                    float f15 = 0.0f;
                    for (int i24 = i20; i24 < iK; i24++) {
                        f15 += fArrA[i24];
                    }
                    n nVar2 = this.f19637a;
                    boolean z12 = nVar2.f19666a;
                    if (z12) {
                        int i25 = kVar.f19729a;
                        nVar2.f19666a = false;
                        nVar2.f19667b = i20 + i25;
                        nVar2.f19668c = i25 + iK;
                    } else {
                        int i26 = kVar.f19729a + iK;
                        if (z12) {
                            throw new IllegalStateException();
                        }
                        nVar2.f19668c = i26;
                    }
                    this.f19638b += f15;
                    if (i22 != iK) {
                        b();
                    }
                    i20 = iK;
                }
                tf.i.b(fArrA);
            }
        }
        return true;
    }

    public final void b() {
        n nVar = this.f19637a;
        nVar.f19669d = this.f19638b;
        this.f19639c.add(nVar);
        this.f19638b = 0.0f;
        this.f19637a = new n();
    }
}
