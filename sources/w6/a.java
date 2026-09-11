package w6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Map;
import k0.g;
import rg.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19098a;

    public a() {
        g.s(1, PredefinedUICustomizationFont.defaultFamily);
        this.f19098a = t.f14665i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f19098a.equals(((a) obj).f19098a);
    }

    public final int hashCode() {
        return this.f19098a.hashCode() + (((t.g.c(1) * 31) + 1589970213) * 31);
    }

    public final String toString() {
        return "PluginInfo(plugin=NATIVE, version=6.17.5, additionalParams=" + this.f19098a + ")";
    }
}
