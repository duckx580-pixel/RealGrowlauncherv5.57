package l0;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9741d;

    public e(float f9, float f10, float f11, float f12) {
        this.f9738a = f9;
        this.f9739b = f10;
        this.f9740c = f11;
        this.f9741d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9738a == eVar.f9738a && this.f9739b == eVar.f9739b && this.f9740c == eVar.f9740c && this.f9741d == eVar.f9741d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9741d) + h0.a(h0.a(Float.hashCode(this.f9738a) * 31, this.f9739b, 31), this.f9740c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f9738a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f9739b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f9740c);
        sb2.append(", pressedAlpha=");
        return k0.g.h(sb2, this.f9741d, ')');
    }
}
