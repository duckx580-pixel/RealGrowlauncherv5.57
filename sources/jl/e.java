package jl;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8954d;

    public e(int i10, String str, Optional optional, Optional optional2) {
        super(optional, optional2);
        if (i10 == 0) {
            throw null;
        }
        this.f8953c = i10;
        Objects.requireNonNull(str);
        this.f8954d = str;
    }

    @Override // jl.k
    public final int a() {
        return 20;
    }
}
