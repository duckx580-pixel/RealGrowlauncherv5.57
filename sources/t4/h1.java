package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements oh.w, qh.u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh.d f16513i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ oh.w f16514r;

    public h1(oh.w wVar, qh.d dVar) {
        kotlin.jvm.internal.l.f("scope", wVar);
        this.f16513i = dVar;
        this.f16514r = wVar;
    }

    @Override // oh.w
    public final ug.h h() {
        return this.f16514r.h();
    }

    @Override // qh.u
    public final Object l(Object obj) {
        return this.f16513i.l(obj);
    }

    @Override // qh.u
    public final Object p(Object obj, ug.c cVar) {
        return this.f16513i.p(obj, cVar);
    }
}
