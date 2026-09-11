package k2;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {
    @Override // k2.i
    public final void a(j jVar) {
        jVar.d(0, jVar.f9172a.b(), PredefinedUICustomizationFont.defaultFamily);
    }

    public final boolean equals(Object obj) {
        return obj instanceof f;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.y.a(f.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
