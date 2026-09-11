package o1;

import android.view.KeyEvent;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f12644a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f12644a, ((b) obj).f12644a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12644a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f12644a + ')';
    }
}
