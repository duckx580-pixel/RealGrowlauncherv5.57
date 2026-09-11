package a4;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f335i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Serializable f337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z f339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Iterator f340v;
    public /* synthetic */ Object w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g0 f341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f342y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, wg.c cVar) {
        super(cVar);
        this.f341x = g0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.f342y |= Integer.MIN_VALUE;
        return this.f341x.d(this);
    }
}
