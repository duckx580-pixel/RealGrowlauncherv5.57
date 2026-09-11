package r4;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f14562i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f14563r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f14564s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14565t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14566u;

    public u(v vVar, Bundle bundle, boolean z3, int i10, boolean z10) {
        this.f14562i = vVar;
        this.f14563r = bundle;
        this.f14564s = z3;
        this.f14565t = i10;
        this.f14566u = z10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        kotlin.jvm.internal.l.f("other", uVar);
        boolean z3 = uVar.f14566u;
        boolean z10 = uVar.f14564s;
        Bundle bundle = uVar.f14563r;
        boolean z11 = this.f14564s;
        if (z11 && !z10) {
            return 1;
        }
        if (!z11 && z10) {
            return -1;
        }
        int i10 = this.f14565t - uVar.f14565t;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f14563r;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.l.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z12 = this.f14566u;
        if (!z12 || z3) {
            return (z12 || !z3) ? 0 : -1;
        }
        return 1;
    }
}
