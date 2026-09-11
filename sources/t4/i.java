package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public rh.y f16515i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.x f16516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ rh.y f16518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16519u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rh.y yVar, ug.c cVar) {
        super(cVar);
        this.f16518t = yVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16517s = obj;
        this.f16519u |= Integer.MIN_VALUE;
        return this.f16518t.emit(null, this);
    }
}
