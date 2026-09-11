package xk;

import cl.e;
import java.util.Objects;
import java.util.Optional;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Optional f19906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19908c;

    public b(e eVar) {
        Optional optional = eVar.f3607a;
        Optional optional2 = eVar.f3608b;
        String str = eVar.f3604d;
        int i10 = eVar.f3603c;
        Objects.requireNonNull(optional);
        this.f19906a = optional;
        Objects.requireNonNull(optional2);
        Objects.requireNonNull(str);
        this.f19907b = str;
        if (i10 == 0) {
            throw null;
        }
        this.f19908c = i10;
    }

    public final String toString() {
        StringBuilder sbP = android.support.v4.media.session.a.p("<", b.class.getName(), " (type=");
        sbP.append(h0.m(this.f19908c));
        sbP.append(", value=");
        sbP.append(this.f19907b);
        sbP.append(")>");
        return sbP.toString();
    }
}
