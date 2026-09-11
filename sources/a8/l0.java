package a8;

import com.google.android.gms.internal.measurement.j3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7.c f508b;

    public /* synthetic */ l0(a aVar, y7.c cVar) {
        this.f507a = aVar;
        this.f508b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l0)) {
            l0 l0Var = (l0) obj;
            if (b8.a0.k(this.f507a, l0Var.f507a) && b8.a0.k(this.f508b, l0Var.f508b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f507a, this.f508b});
    }

    public final String toString() {
        j3 j3Var = new j3(this);
        j3Var.d("key", this.f507a);
        j3Var.d("feature", this.f508b);
        return j3Var.toString();
    }
}
