package id;

/* JADX INFO: loaded from: classes.dex */
public final class j extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f8277i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f8280t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, wg.c cVar) {
        super(cVar);
        this.f8280t = kVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f8279s = obj;
        this.f8278r |= Integer.MIN_VALUE;
        return this.f8280t.a(null, null, this);
    }
}
