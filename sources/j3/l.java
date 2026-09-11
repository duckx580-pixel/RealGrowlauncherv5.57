package j3;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f8758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f8759b;

    public l(Resources resources, Resources.Theme theme) {
        this.f8758a = resources;
        this.f8759b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f8758a.equals(lVar.f8758a) && r3.b.a(this.f8759b, lVar.f8759b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r3.b.b(this.f8758a, this.f8759b);
    }
}
