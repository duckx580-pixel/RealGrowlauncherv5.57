package w2;

import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19027i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f19028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kb.c f19029s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, kb.c cVar, int i10) {
        super(1);
        this.f19027i = i10;
        this.f19028r = eVar;
        this.f19029s = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eh.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f19027i) {
            case 0:
                n nVar = (n) obj;
                kotlin.jvm.internal.l.f("state", nVar);
                nVar.a(this.f19028r.f19032a).A = (a3.c) ((kotlin.jvm.internal.m) this.f19029s.f9562i).invoke(nVar);
                break;
            default:
                n nVar2 = (n) obj;
                kotlin.jvm.internal.l.f("state", nVar2);
                nVar2.a(this.f19028r.f19032a).f236z = (a3.c) ((kotlin.jvm.internal.m) this.f19029s.f9562i).invoke(nVar2);
                break;
        }
        return o.f13926a;
    }
}
