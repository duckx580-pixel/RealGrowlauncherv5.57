package z4;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f20608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f20609d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        l.f("foreignKeys", abstractSet);
        this.f20606a = str;
        this.f20607b = map;
        this.f20608c = abstractSet;
        this.f20609d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01de, code lost:
    
        r9 = te.a.g(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e2, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final z4.e a(c5.c r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.e.a(c5.c, java.lang.String):z4.e");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f20606a.equals(eVar.f20606a) || !this.f20607b.equals(eVar.f20607b) || !l.a(this.f20608c, eVar.f20608c)) {
            return false;
        }
        Set set2 = this.f20609d;
        if (set2 == null || (set = eVar.f20609d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f20608c.hashCode() + ((this.f20607b.hashCode() + (this.f20606a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f20606a + "', columns=" + this.f20607b + ", foreignKeys=" + this.f20608c + ", indices=" + this.f20609d + '}';
    }
}
