package y;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f19993a = new s();

    public static a1.n a() {
        if (1.0f > 0.0d) {
            return new LayoutWeightElement(1.0f, true);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
    }
}
