package yk;

import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    f20467r(Optional.of('\"')),
    f20468s(Optional.of('\'')),
    f20469t(Optional.of('|')),
    f20470u(Optional.of('>')),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(Optional.of('J')),
    f20471v(Optional.empty());


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Optional f20472i;

    c(Optional optional) {
        this.f20472i = optional;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f20472i.orElse(':'));
    }
}
