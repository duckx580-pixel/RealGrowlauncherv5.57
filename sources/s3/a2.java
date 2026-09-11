package s3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends z1 {
    public a2(f2 f2Var, WindowInsets windowInsets) {
        super(f2Var, windowInsets);
    }

    @Override // s3.d2
    public f2 a() {
        return f2.g(null, this.f15135c.consumeDisplayCutout());
    }

    @Override // s3.d2
    public l e() {
        DisplayCutout displayCutout = this.f15135c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new l(displayCutout);
    }

    @Override // s3.y1, s3.d2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Objects.equals(this.f15135c, a2Var.f15135c) && Objects.equals(this.f15139g, a2Var.f15139g);
    }

    @Override // s3.d2
    public int hashCode() {
        return this.f15135c.hashCode();
    }
}
