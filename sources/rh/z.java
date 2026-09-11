package rh;

import m0.t2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14858i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t2 f14860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0.a0 f14861t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t2 t2Var, ug.c cVar) {
        super(cVar);
        this.f14860s = t2Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14858i = obj;
        this.f14859r |= Integer.MIN_VALUE;
        return this.f14860s.collect(null, this);
    }
}
