package kh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9620b;

    public a(float f9, float f10) {
        this.f9619a = f9;
        this.f9620b = f10;
    }

    public static boolean a(Float f9, Float f10) {
        return f9.floatValue() <= f10.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f9 = this.f9619a;
        float f10 = this.f9620b;
        if (f9 > f10) {
            a aVar = (a) obj;
            if (aVar.f9619a > aVar.f9620b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f9 == aVar2.f9619a && f10 == aVar2.f9620b;
    }

    public final int hashCode() {
        float f9 = this.f9619a;
        float f10 = this.f9620b;
        if (f9 > f10) {
            return -1;
        }
        return Float.hashCode(f10) + (Float.hashCode(f9) * 31);
    }

    public final String toString() {
        return this.f9619a + ".." + this.f9620b;
    }
}
