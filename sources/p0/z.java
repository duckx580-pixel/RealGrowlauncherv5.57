package p0;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13233b;

    public z(int i10, int i11) {
        this.f13232a = i10;
        this.f13233b = i11;
    }

    public abstract void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar);

    public String b(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String c(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public final String toString() {
        String strB = kotlin.jvm.internal.y.a(getClass()).b();
        return strB == null ? PredefinedUICustomizationFont.defaultFamily : strB;
    }

    public /* synthetic */ z(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
