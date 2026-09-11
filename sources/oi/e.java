package oi;

import launcher.powerkuy.growlauncher.api.model.Creator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12962i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f12963r;

    public /* synthetic */ e(eh.c cVar, int i10) {
        this.f12962i = i10;
        this.f12963r = cVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f12962i) {
            case 0:
                z.e eVar = (z.e) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", eVar);
                this.f12963r.invoke(eVar);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f12963r.invoke(bool);
                break;
            case 2:
                e1.m mVar = (e1.m) obj;
                kotlin.jvm.internal.l.f("it", mVar);
                this.f12963r.invoke(Boolean.valueOf(mVar.a()));
                break;
            case 3:
                e1.m mVar2 = (e1.m) obj;
                kotlin.jvm.internal.l.f("it", mVar2);
                this.f12963r.invoke(Boolean.valueOf(mVar2.a()));
                break;
            case 4:
                Creator creator = (Creator) obj;
                kotlin.jvm.internal.l.f("creator", creator);
                this.f12963r.invoke(Integer.valueOf(creator.getId()));
                break;
            default:
                Creator creator2 = (Creator) obj;
                kotlin.jvm.internal.l.f("creator", creator2);
                this.f12963r.invoke(Integer.valueOf(creator2.getId()));
                break;
        }
        return qg.o.f13926a;
    }
}
