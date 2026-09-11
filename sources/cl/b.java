package cl;

import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yk.a f3597d;

    public b(Optional optional, Optional optional2, Optional optional3) {
        super(optional, optional2, optional3);
        this.f3597d = (yk.a) optional.orElseThrow(new a(0));
    }

    @Override // cl.g
    public final int a() {
        return 1;
    }

    public final String toString() {
        return "=ALI *" + this.f3597d;
    }
}
