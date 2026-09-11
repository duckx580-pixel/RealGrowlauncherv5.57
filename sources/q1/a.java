package q1;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13647b;

    public a(int i10) {
        this.f13647b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType", obj);
        return this.f13647b == ((a) obj).f13647b;
    }

    public final int hashCode() {
        return this.f13647b;
    }

    public final String toString() {
        return h0.g(new StringBuilder("AndroidPointerIcon(type="), this.f13647b, ')');
    }
}
