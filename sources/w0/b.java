package w0;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18731a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f18731a);
        sb2.append(")@");
        int iHashCode = hashCode();
        te.a.j(16);
        String string = Integer.toString(iHashCode, 16);
        l.e("toString(this, checkRadix(radix))", string);
        sb2.append(string);
        return sb2.toString();
    }
}
