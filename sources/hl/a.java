package hl;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Optional f7721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7722b;

    public a(String str, Optional optional) {
        Objects.requireNonNull(optional);
        this.f7721a = optional;
        Objects.requireNonNull(str);
        this.f7722b = str;
    }

    public a(int i10, String str, Optional optional) {
        this.f7722b = str;
        this.f7721a = optional;
    }
}
