package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends ug.a implements ug.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f12914r = new r(ug.d.f17988i, q.f12906i);

    public s() {
        super(ug.d.f17988i);
    }

    public abstract void C(ug.h hVar, Runnable runnable);

    public void F(ug.h hVar, Runnable runnable) {
        C(hVar, runnable);
    }

    public boolean K() {
        return !(this instanceof u1);
    }

    public s W(int i10) {
        th.a.a(i10);
        return new th.h(this, i10);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // ug.a, ug.h
    public final ug.f i(ug.g gVar) {
        ug.f fVar;
        kotlin.jvm.internal.l.f("key", gVar);
        if (gVar instanceof r) {
            r rVar = (r) gVar;
            ug.g gVar2 = this.f17985i;
            if ((gVar2 == rVar || rVar.f12911r == gVar2) && (fVar = (ug.f) rVar.f12910i.invoke(this)) != null) {
                return fVar;
            }
        } else if (ug.d.f17988i == gVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + x.l(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((ug.f) r3.f12910i.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (ug.d.f17988i == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return ug.i.f17989i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // ug.a, ug.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ug.h u(ug.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.l.f(r0, r3)
            boolean r0 = r3 instanceof oh.r
            if (r0 == 0) goto L20
            oh.r r3 = (oh.r) r3
            ug.g r0 = r2.f17985i
            if (r0 == r3) goto L15
            ug.g r1 = r3.f12911r
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            kotlin.jvm.internal.m r3 = r3.f12910i
            java.lang.Object r3 = r3.invoke(r2)
            ug.f r3 = (ug.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            ug.d r0 = ug.d.f17988i
            if (r0 != r3) goto L27
        L24:
            ug.i r3 = ug.i.f17989i
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.s.u(ug.g):ug.h");
    }
}
