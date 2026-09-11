package k6;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f9257i;

    public c(Context context) {
        this.f9257i = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a(this.f9257i, ((c) obj).f9257i);
        }
        return false;
    }

    @Override // k6.g
    public final Object h(z5.f fVar) {
        DisplayMetrics displayMetrics = this.f9257i.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new f(aVar, aVar);
    }

    public final int hashCode() {
        return this.f9257i.hashCode();
    }
}
