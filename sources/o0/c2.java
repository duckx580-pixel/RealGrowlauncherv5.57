package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12402i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q.t f12403r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(q.t tVar, int i10) {
        super(1);
        this.f12402i = i10;
        this.f12403r = tVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f12402i) {
            case 0:
                if (obj instanceof y0.z) {
                    ((y0.z) obj).e(4);
                }
                this.f12403r.a(obj);
                return qg.o.f13926a;
            default:
                return obj == this.f12403r ? "(this)" : String.valueOf(obj);
        }
    }
}
