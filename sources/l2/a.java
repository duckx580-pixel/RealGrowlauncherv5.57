package l2;

import java.util.Locale;
import kotlin.jvm.internal.l;
import t6.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f9795a;

    public a(u uVar) {
        this.f9795a = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.a(((Locale) this.f9795a.f17063i).toLanguageTag(), ((Locale) ((a) obj).f9795a.f17063i).toLanguageTag());
    }

    public final int hashCode() {
        return ((Locale) this.f9795a.f17063i).toLanguageTag().hashCode();
    }

    public final String toString() {
        return ((Locale) this.f9795a.f17063i).toLanguageTag();
    }
}
