package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16611d;

    public p1(int i10, int i11, int i12, int i13) {
        this.f16608a = i10;
        this.f16609b = i11;
        this.f16610c = i12;
        this.f16611d = i13;
    }

    public final int a(u uVar) {
        kotlin.jvm.internal.l.f("loadType", uVar);
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.f16608a;
        }
        if (iOrdinal == 2) {
            return this.f16609b;
        }
        throw new a2.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f16608a == p1Var.f16608a && this.f16609b == p1Var.f16609b && this.f16610c == p1Var.f16610c && this.f16611d == p1Var.f16611d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f16611d) + Integer.hashCode(this.f16610c) + Integer.hashCode(this.f16609b) + Integer.hashCode(this.f16608a);
    }
}
