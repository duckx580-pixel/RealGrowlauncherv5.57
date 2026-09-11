package m0;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 implements x.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f11322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2 f11323c;

    public u2(x.l lVar, long j) {
        kotlin.jvm.internal.l.f("underlyingInteractionSource", lVar);
        this.f11321a = j;
        this.f11322b = new LinkedHashMap();
        this.f11323c = new t2(lVar.f19332a, this, 0);
    }

    @Override // x.k
    public final rh.h a() {
        return this.f11323c;
    }
}
