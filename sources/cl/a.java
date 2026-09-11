package cl;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3596a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f3596a) {
            case 0:
                return new NullPointerException("Anchor is required in AliasEvent");
            case 1:
                return new NoSuchElementException("No more Events found.");
            default:
                return new HashSet();
        }
    }
}
