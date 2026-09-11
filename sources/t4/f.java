package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16481i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a4.u f16483s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a4.u uVar, ug.c cVar) {
        super(cVar);
        this.f16483s = uVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16481i = obj;
        this.f16482r |= Integer.MIN_VALUE;
        return this.f16483s.emit(null, this);
    }
}
