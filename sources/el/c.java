package el;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Optional f5559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f5560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Optional f5562d;

    public c(g gVar, Optional optional) {
        Objects.requireNonNull(gVar, "tag in a Node is required.");
        this.f5560b = gVar;
        this.f5559a = optional;
        this.f5561c = false;
        this.f5562d = Optional.empty();
    }

    public abstract int a();
}
