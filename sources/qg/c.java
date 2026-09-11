package qg;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f13906r = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13907i = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        kotlin.jvm.internal.l.f("other", cVar);
        return this.f13907i - cVar.f13907i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && this.f13907i == cVar.f13907i;
    }

    public final int hashCode() {
        return this.f13907i;
    }

    public final String toString() {
        return "2.2.21";
    }
}
