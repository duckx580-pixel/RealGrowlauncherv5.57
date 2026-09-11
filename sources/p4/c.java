package p4;

import androidx.fragment.app.m0;
import androidx.lifecycle.v0;
import q.y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class c extends v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f13316d = new m0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f13317b = new y(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13318c = false;

    @Override // androidx.lifecycle.v0
    public final void d() {
        y yVar = this.f13317b;
        int iF = yVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            b bVar = (b) yVar.g(i10);
            x7.c cVar = bVar.f13313l;
            cVar.a();
            cVar.f19475c = true;
            b9.b bVar2 = bVar.f13315n;
            if (bVar2 != null) {
                bVar.h(bVar2);
            }
            b bVar3 = cVar.f19473a;
            if (bVar3 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (bVar3 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            cVar.f19473a = null;
            if (bVar2 != null) {
                boolean z3 = bVar2.f2879r;
            }
            cVar.f19476d = true;
            cVar.f19474b = false;
            cVar.f19475c = false;
            cVar.f19477e = false;
        }
        int i11 = yVar.f13632t;
        Object[] objArr = yVar.f13631s;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        yVar.f13632t = 0;
        yVar.f13629i = false;
    }
}
