package u5;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17671b;

    public j(String str, int i10) {
        kotlin.jvm.internal.l.f("workSpecId", str);
        this.f17670a = str;
        this.f17671b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(this.f17670a, jVar.f17670a) && this.f17671b == jVar.f17671b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17671b) + (this.f17670a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f17670a);
        sb2.append(", generation=");
        return h0.g(sb2, this.f17671b, ')');
    }
}
