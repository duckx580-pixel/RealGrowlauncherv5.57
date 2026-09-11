package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.h f18204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oh.f f18205b;

    public j(c0.h hVar, oh.f fVar) {
        this.f18204a = hVar;
        this.f18205b = fVar;
    }

    public final String toString() {
        String strF;
        oh.f fVar = this.f18205b;
        oh.v vVar = (oh.v) fVar.f12868u.i(oh.v.f12924s);
        String str = vVar != null ? vVar.f12925r : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        te.a.j(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.l.e("toString(this, checkRadix(radix))", string);
        sb2.append(string);
        if (str == null || (strF = s.h0.f("[", str, "](")) == null) {
            strF = "(";
        }
        sb2.append(strF);
        sb2.append("currentBounds()=");
        sb2.append(this.f18204a.invoke());
        sb2.append(", continuation=");
        sb2.append(fVar);
        sb2.append(')');
        return sb2.toString();
    }
}
