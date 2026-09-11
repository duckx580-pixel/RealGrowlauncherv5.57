package bk;

import io.github.rosemoe.oniguruma.OnigNative;
import java.util.List;
import java.util.stream.Collectors;
import yj.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f3253a;

    public e(List list) {
        this.f3253a = ((List) list.stream().map(new ak.c(1)).collect(Collectors.toList())).stream().mapToLong(new d()).toArray();
    }

    public final c a(g gVar, int i10) {
        int iA = gVar.a(i10);
        int[] iArrRegexSearchBatch = OnigNative.regexSearchBatch(this.f3253a, gVar.f20453d, gVar.f20452c, iA, gVar.f20451b);
        if (iArrRegexSearchBatch == null) {
            return null;
        }
        return new c(iArrRegexSearchBatch, true);
    }
}
