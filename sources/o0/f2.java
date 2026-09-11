package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements d2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f12418i;

    public f2(Object obj) {
        this.f12418i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2) && kotlin.jvm.internal.l.a(this.f12418i, ((f2) obj).f12418i);
    }

    @Override // o0.d2
    public final Object getValue() {
        return this.f12418i;
    }

    public final int hashCode() {
        Object obj = this.f12418i;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f12418i + ')';
    }
}
