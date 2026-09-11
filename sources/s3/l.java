package s3;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f15076a;

    public l(DisplayCutout displayCutout) {
        this.f15076a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return r3.b.a(this.f15076a, ((l) obj).f15076a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f15076a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f15076a + "}";
    }
}
