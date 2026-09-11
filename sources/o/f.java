package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f12371i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f12372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakHashMap f12373s = new WeakHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12374t = 0;

    public c b(Object obj) {
        c cVar = this.f12371i;
        while (cVar != null && !cVar.f12364i.equals(obj)) {
            cVar = cVar.f12366s;
        }
        return cVar;
    }

    public Object d(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f12374t--;
        WeakHashMap weakHashMap = this.f12373s;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f12367t;
        if (cVar != null) {
            cVar.f12366s = cVarB.f12366s;
        } else {
            this.f12371i = cVarB.f12366s;
        }
        c cVar2 = cVarB.f12366s;
        if (cVar2 != null) {
            cVar2.f12367t = cVar;
        } else {
            this.f12372r = cVar;
        }
        cVarB.f12366s = null;
        cVarB.f12367t = null;
        return cVarB.f12365r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((o.b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof o.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o.f r7 = (o.f) r7
            int r1 = r6.f12374t
            int r3 = r7.f12374t
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            o.b r3 = (o.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            o.b r4 = (o.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            o.b r7 = (o.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f12371i, this.f12372r, 0);
        this.f12373s.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
