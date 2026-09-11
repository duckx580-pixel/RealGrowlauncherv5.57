package md;

import kotlin.jvm.internal.v;
import ue.p2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends wg.c {
    public Object A;
    public final b B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11642i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f11644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f11645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p2 f11646u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f11647v;
    public fd.c w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v f11648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f11649y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11650z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, wg.c cVar) {
        super(cVar);
        this.B = bVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.f11650z |= Integer.MIN_VALUE;
        return this.B.a(null, null, null, null, this);
    }
}
