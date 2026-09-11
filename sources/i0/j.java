package i0;

import m0.f2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7953i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j1.b f7954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f7955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1.n f7956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f7957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7958v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(j1.b bVar, String str, a1.n nVar, long j, int i10, int i11) {
        super(2);
        this.f7953i = i11;
        this.f7954r = bVar;
        this.f7955s = str;
        this.f7956t = nVar;
        this.f7957u = j;
        this.f7958v = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7953i) {
            case 0:
                ((Number) obj2).intValue();
                k.a(this.f7954r, this.f7955s, this.f7956t, this.f7957u, (o0.o) obj, o0.p.S(this.f7958v | 1));
                break;
            default:
                ((Number) obj2).intValue();
                f2.a(this.f7954r, this.f7955s, this.f7956t, this.f7957u, (o0.o) obj, o0.p.S(this.f7958v | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
