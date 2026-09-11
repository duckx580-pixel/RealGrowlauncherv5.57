package jl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Optional f8956d;

    public f(String str, Optional optional, Optional optional2, Optional optional3) {
        super(optional2, optional3);
        this.f8955c = str;
        Objects.requireNonNull(optional);
        if (optional.isPresent() && ((List) optional.get()).size() != 2) {
            throw new dl.f(k0.g.d(((List) optional.get()).size(), "Two strings/integers must be provided instead of "));
        }
        this.f8956d = optional;
    }

    @Override // jl.k
    public final int a() {
        return 7;
    }
}
