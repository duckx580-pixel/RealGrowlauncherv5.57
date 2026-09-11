package y;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f19994a = new s0();

    public static a1.n a(s0 s0Var, a1.n nVar, float f9) {
        s0Var.getClass();
        if (f9 > 0.0d) {
            if (f9 > Float.MAX_VALUE) {
                f9 = Float.MAX_VALUE;
            }
            return nVar.j(new LayoutWeightElement(f9, true));
        }
        throw new IllegalArgumentException(("invalid weight " + f9 + "; must be greater than zero").toString());
    }
}
