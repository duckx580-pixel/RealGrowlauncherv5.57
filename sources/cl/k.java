package cl;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Optional f3613c;

    public k(Optional optional, Optional optional2, Optional optional3) {
        super(optional2, optional3);
        Objects.requireNonNull(optional);
        this.f3613c = optional;
    }
}
