package k2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9171b;

    public h(int i10, int i11) {
        this.f9170a = i10;
        this.f9171b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // k2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(k2.j r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r7.f9170a
            if (r1 >= r3) goto L32
            int r3 = r2 + 1
            int r4 = r8.f9173b
            if (r4 <= r3) goto L2a
            int r4 = r4 - r3
            int r4 = r4 + (-1)
            char r4 = r8.b(r4)
            int r5 = r8.f9173b
            int r5 = r5 - r3
            char r5 = r8.b(r5)
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L2a
            boolean r4 = java.lang.Character.isLowSurrogate(r5)
            if (r4 == 0) goto L2a
            int r2 = r2 + 2
            goto L2b
        L2a:
            r2 = r3
        L2b:
            int r3 = r8.f9173b
            if (r2 == r3) goto L32
            int r1 = r1 + 1
            goto L3
        L32:
            r1 = r0
        L33:
            int r3 = r7.f9171b
            if (r0 >= r3) goto L70
            int r3 = r1 + 1
            int r4 = r8.f9174c
            f2.b r5 = r8.f9172a
            int r4 = r4 + r3
            int r6 = r5.b()
            if (r4 >= r6) goto L63
            int r4 = r8.f9174c
            int r4 = r4 + r3
            int r4 = r4 + (-1)
            char r4 = r8.b(r4)
            int r6 = r8.f9174c
            int r6 = r6 + r3
            char r6 = r8.b(r6)
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L63
            boolean r4 = java.lang.Character.isLowSurrogate(r6)
            if (r4 == 0) goto L63
            int r1 = r1 + 2
            goto L64
        L63:
            r1 = r3
        L64:
            int r3 = r8.f9174c
            int r3 = r3 + r1
            int r4 = r5.b()
            if (r3 == r4) goto L70
            int r0 = r0 + 1
            goto L33
        L70:
            int r0 = r8.f9174c
            int r1 = r1 + r0
            r8.a(r0, r1)
            int r0 = r8.f9173b
            int r1 = r0 - r2
            r8.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.h.a(k2.j):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f9170a == hVar.f9170a && this.f9171b == hVar.f9171b;
    }

    public final int hashCode() {
        return (this.f9170a * 31) + this.f9171b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f9170a);
        sb2.append(", lengthAfterCursor=");
        return h0.g(sb2, this.f9171b, ')');
    }
}
