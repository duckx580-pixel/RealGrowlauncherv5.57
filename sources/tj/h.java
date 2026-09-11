package tj;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af.a f17362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17363b;

    public h(af.a aVar, int i10) {
        this.f17362a = aVar;
        this.f17363b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17363b == hVar.f17363b && Objects.equals(this.f17362a, hVar.f17362a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17362a) + (this.f17363b * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f17362a, Integer.valueOf(this.f17363b)};
        String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            sb2.append(strArrSplit[i10]);
            sb2.append("=");
            sb2.append(objArr[i10]);
            if (i10 != strArrSplit.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
