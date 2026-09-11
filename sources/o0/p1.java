package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12546a;

    public /* synthetic */ p1(o oVar) {
        this.f12546a = oVar;
    }

    public static final /* synthetic */ p1 a(o oVar) {
        return new p1(oVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            return kotlin.jvm.internal.l.a(this.f12546a, ((p1) obj).f12546a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12546a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f12546a + ')';
    }
}
