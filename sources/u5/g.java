package u5;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17664c;

    public g(String str, int i10, int i11) {
        kotlin.jvm.internal.l.f("workSpecId", str);
        this.f17662a = str;
        this.f17663b = i10;
        this.f17664c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.l.a(this.f17662a, gVar.f17662a) && this.f17663b == gVar.f17663b && this.f17664c == gVar.f17664c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17664c) + android.support.v4.media.session.a.z(this.f17663b, this.f17662a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f17662a);
        sb2.append(", generation=");
        sb2.append(this.f17663b);
        sb2.append(", systemId=");
        return h0.g(sb2, this.f17664c, ')');
    }
}
