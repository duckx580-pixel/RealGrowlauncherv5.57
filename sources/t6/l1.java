package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f16907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(String str, Integer num) {
        super(str);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str);
        this.f16908d = str;
        this.f16907c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return kotlin.jvm.internal.l.a(this.f16908d, l1Var.f16908d) && kotlin.jvm.internal.l.a(this.f16907c, l1Var.f16907c);
    }

    public final int hashCode() {
        int iHashCode = this.f16908d.hashCode();
        Integer num = this.f16907c;
        return (iHashCode * 961) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PredefinedInAppEvent(name=" + this.f16908d + ", eventRevenue=null, eventCounter=" + this.f16907c + ")";
    }
}
