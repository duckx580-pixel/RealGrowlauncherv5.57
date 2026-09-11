package a4;

import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f256i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FileInputStream f257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g0 f259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f260u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, wg.c cVar) {
        super(cVar);
        this.f259t = g0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f258s = obj;
        this.f260u |= Integer.MIN_VALUE;
        return this.f259t.g(this);
    }
}
