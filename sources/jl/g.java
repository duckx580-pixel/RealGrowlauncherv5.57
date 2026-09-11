package jl;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yk.c f8959e;

    public g(String str, boolean z3, yk.c cVar, Optional optional, Optional optional2) {
        super(optional, optional2);
        Objects.requireNonNull(str);
        this.f8957c = str;
        this.f8958d = z3;
        Objects.requireNonNull(cVar);
        this.f8959e = cVar;
    }

    @Override // jl.k
    public final int a() {
        return 16;
    }

    @Override // jl.k
    public final String toString() {
        return "<scalar> plain=" + this.f8958d + " style=" + this.f8959e + " value=" + this.f8957c;
    }
}
