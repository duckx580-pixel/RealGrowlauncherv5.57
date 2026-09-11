package vi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f18712i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f18714s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ug.c cVar) {
        super(cVar);
        this.f18714s = bVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18712i = obj;
        this.f18713r |= Integer.MIN_VALUE;
        return this.f18714s.emit(null, this);
    }
}
