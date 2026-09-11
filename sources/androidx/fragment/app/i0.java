package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f1696b;

    public i0(j0 j0Var, int i10) {
        this.f1696b = j0Var;
        this.f1695a = i10;
    }

    @Override // androidx.fragment.app.h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        j0 j0Var = this.f1696b;
        r rVar = j0Var.w;
        int i10 = this.f1695a;
        if (rVar == null || i10 >= 0 || !rVar.g().O(-1, 0)) {
            return j0Var.P(arrayList, arrayList2, i10, 1);
        }
        return false;
    }
}
