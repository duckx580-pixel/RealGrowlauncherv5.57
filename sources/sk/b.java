package sk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15857a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15858b = new b();

    public void a(int i10, int[] iArr, int i11, mf.c cVar) {
        boolean zG;
        int i12;
        r rVar = (r) cVar.f11702r;
        lk.a aVar = rVar.f15960c;
        org.joni.ast.d dVar = (org.joni.ast.d) cVar.f11701i;
        org.joni.ast.d dVar2 = (org.joni.ast.d) cVar.f11703s;
        d dVar3 = dVar.f13146b;
        if (dVar2 == null) {
            zG = false;
        } else if (lk.a.i(i10) == lk.a.i(iArr[0])) {
            zG = true;
        } else {
            zG = dVar2.g(i10, aVar);
            if (dVar2.h()) {
                zG = !zG;
            }
        }
        if (i11 != 1) {
            if (dVar.g(i10, aVar)) {
                if (g.f15877l && dVar.h()) {
                    return;
                }
                org.joni.ast.m mVar = null;
                for (int i13 = 0; i13 < i11; i13++) {
                    if (i13 == 0) {
                        mVar = new org.joni.ast.m();
                        mVar.f13179d |= 2;
                    }
                    mVar.b(iArr[i13], aVar);
                }
                org.joni.ast.h hVarB = org.joni.ast.h.b(null, mVar);
                org.joni.ast.h hVar = (org.joni.ast.h) cVar.f11705u;
                if (hVar == null) {
                    cVar.f11704t = hVarB;
                } else {
                    hVar.f13167b = hVarB;
                }
                cVar.f11705u = hVarB;
                return;
            }
            return;
        }
        boolean zG2 = dVar.g(i10, aVar);
        int i14 = aVar.f10072i;
        if (g.f15877l) {
            if (((!zG2 || dVar.h()) && (zG2 || !dVar.h())) || !zG) {
                return;
            }
            if (i14 <= 1 && (i12 = iArr[0]) < 256 && aVar.g(i12) <= 1) {
                dVar3.g(iArr[0]);
                return;
            } else {
                int i15 = iArr[0];
                dVar.d(rVar, i15, i15, false);
                return;
            }
        }
        if (zG2 && zG) {
            if (i14 <= 1 && iArr[0] < 256) {
                if (dVar.h()) {
                    dVar3.b(iArr[0]);
                    return;
                } else {
                    dVar3.g(iArr[0]);
                    return;
                }
            }
            if (dVar.h() && dVar.h()) {
                dVar3.c();
                if (!aVar.f10074s) {
                    dVar.f13147c = bk.c.g(rVar, dVar.f13147c);
                }
                dVar.f13145a &= -2;
            }
            int i16 = iArr[0];
            dVar.d(rVar, i16, i16, false);
        }
    }
}
