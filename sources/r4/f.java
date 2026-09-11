package r4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f14501a;

    public f(g0 g0Var) {
        this.f14501a = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f.class.equals(obj.getClass()) && this.f14501a.equals(((f) obj).f14501a);
    }

    public final int hashCode() {
        return this.f14501a.hashCode() * 29791;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append(" Type: " + this.f14501a);
        sb2.append(" Nullable: false");
        String string = sb2.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
