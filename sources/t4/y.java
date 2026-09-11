package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f16670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16671b;

    public y(t tVar, t tVar2) {
        this.f16670a = tVar;
        this.f16671b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.l.a(this.f16670a, yVar.f16670a) && kotlin.jvm.internal.l.a(this.f16671b, yVar.f16671b);
    }

    public final int hashCode() {
        int iHashCode = this.f16670a.hashCode() * 31;
        t tVar = this.f16671b;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f16670a + "\n                    ";
        t tVar = this.f16671b;
        if (tVar != null) {
            str = str + "|   mediatorLoadStates: " + tVar + '\n';
        }
        return nh.i.B(str + "|)");
    }
}
