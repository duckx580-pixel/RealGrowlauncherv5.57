package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17120f;

    public x3(long j, float f9, List list, int i10, String str, String str2) {
        this.f17120f = j;
        this.f17118d = f9;
        this.f17115a = list;
        this.f17119e = i10;
        this.f17117c = str;
        this.f17116b = str2;
    }

    public final boolean a() {
        return TimeUnit.SECONDS.toMillis(this.f17120f) > f.M().I().p().f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d(PredefinedUICustomizationFont.defaultFamily, obj);
        x3 x3Var = (x3) obj;
        return this.f17120f == x3Var.f17120f && this.f17118d == x3Var.f17118d && this.f17115a.equals(x3Var.f17115a) && this.f17119e == x3Var.f17119e && this.f17117c.equals(x3Var.f17117c) && this.f17116b.equals(x3Var.f17116b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f17120f);
        int iHashCode2 = Float.hashCode(this.f17118d);
        int iHashCode3 = this.f17115a.hashCode();
        return this.f17116b.hashCode() + (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.f17119e) * 31) + this.f17117c.hashCode()) * 31);
    }
}
