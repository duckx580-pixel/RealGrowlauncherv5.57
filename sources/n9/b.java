package n9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12181b;

    public b(float f9, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f12180a;
            f9 += ((b) cVar).f12181b;
        }
        this.f12180a = cVar;
        this.f12181b = f9;
    }

    @Override // n9.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f12180a.a(rectF) + this.f12181b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12180a.equals(bVar.f12180a) && this.f12181b == bVar.f12181b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12180a, Float.valueOf(this.f12181b)});
    }
}
