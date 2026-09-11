package cl;

import java.util.Objects;
import java.util.Optional;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3604d;

    public e(int i10, String str, Optional optional, Optional optional2) {
        super(optional, optional2);
        if (i10 == 0) {
            throw null;
        }
        this.f3603c = i10;
        Objects.requireNonNull(str);
        this.f3604d = str;
    }

    @Override // cl.g
    public final int a() {
        return 2;
    }

    public final String toString() {
        return "=COM " + h0.m(this.f3603c) + " " + this.f3604d;
    }
}
