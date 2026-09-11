package w2;

import t1.r;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f19051i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eh.c f19052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f19053s;

    public j(f fVar, eh.c cVar) {
        kotlin.jvm.internal.l.f("ref", fVar);
        kotlin.jvm.internal.l.f("constrain", cVar);
        this.f19051i = fVar;
        this.f19052r = cVar;
        this.f19053s = fVar.f19039a;
    }

    @Override // t1.r
    public final Object v() {
        return this.f19053s;
    }
}
