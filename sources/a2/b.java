package a2;

import android.content.res.Resources;
import kotlin.jvm.internal.l;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210b;

    public b(Resources.Theme theme, int i10) {
        this.f209a = theme;
        this.f210b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f209a, bVar.f209a) && this.f210b == bVar.f210b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210b) + (this.f209a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f209a);
        sb2.append(", id=");
        return h0.g(sb2, this.f210b, ')');
    }
}
