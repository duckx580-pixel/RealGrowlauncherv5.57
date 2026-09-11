package u;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1.n f17454a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        a1.n nVarB = a1.k.f196a;
        if (i10 >= 31) {
            nVarB = androidx.compose.ui.layout.a.b(androidx.compose.ui.layout.a.b(nVarB, h.f17449r), h.f17450s);
        }
        f17454a = nVarB;
    }
}
