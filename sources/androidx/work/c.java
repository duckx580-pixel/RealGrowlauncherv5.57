package androidx.work;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f2324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2325b;

    public c(boolean z3, Uri uri) {
        this.f2324a = uri;
        this.f2325b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger", obj);
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.f2324a, cVar.f2324a) && this.f2325b == cVar.f2325b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2325b) + (this.f2324a.hashCode() * 31);
    }
}
