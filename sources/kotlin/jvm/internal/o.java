package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f9660i;

    public o(Class cls) {
        l.f("jClass", cls);
        this.f9660i = cls;
    }

    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f9660i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return l.a(this.f9660i, ((o) obj).f9660i);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9660i.hashCode();
    }

    public final String toString() {
        return this.f9660i.toString() + " (Kotlin reflection is not available)";
    }
}
