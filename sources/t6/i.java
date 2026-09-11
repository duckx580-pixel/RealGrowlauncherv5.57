package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16851b;

    public i(int i10, String str) {
        this.f16851b = i10;
        this.f16850a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f16851b == iVar.f16851b && kotlin.jvm.internal.l.a(this.f16850a, iVar.f16850a);
    }

    public final int hashCode() {
        return this.f16850a.hashCode() + (Integer.hashCode(this.f16851b) * 31);
    }

    public final String toString() {
        return "AppSetIdModel(scope=" + this.f16851b + ", id=" + this.f16850a + ")";
    }
}
