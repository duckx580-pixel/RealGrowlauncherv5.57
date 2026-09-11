package oi;

import java.util.List;
import launcher.powerkuy.growlauncher.api.model.Script;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12971i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qg.a f12975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12976v;
    public final /* synthetic */ Object w;

    public /* synthetic */ h(String str, String str2, String str3, k1.f fVar, int i10, eh.c cVar, int i11) {
        this.f12972r = str;
        this.f12973s = str2;
        this.f12976v = str3;
        this.w = fVar;
        this.f12974t = i10;
        this.f12975u = cVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12971i) {
            case 0:
                ((Integer) obj2).getClass();
                int iS = o0.p.S(1);
                c.i((String) this.f12972r, (List) this.f12976v, this.f12974t, (eh.c) this.f12975u, (String) this.f12973s, (eh.a) this.w, (o0.o) obj, iS);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iS2 = o0.p.S(1);
                c.o((String) this.f12972r, (String) this.f12973s, (String) this.f12976v, (k1.f) this.w, this.f12974t, (eh.c) this.f12975u, (o0.o) obj, iS2);
                break;
            default:
                ((Integer) obj2).getClass();
                xi.b.l((Script) this.f12972r, (eh.a) this.w, (eh.a) this.f12973s, (eh.a) this.f12976v, (eh.a) this.f12975u, (o0.o) obj, o0.p.S(this.f12974t | 1));
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ h(String str, List list, int i10, eh.c cVar, String str2, eh.a aVar, int i11) {
        this.f12972r = str;
        this.f12976v = list;
        this.f12974t = i10;
        this.f12975u = cVar;
        this.f12973s = str2;
        this.w = aVar;
    }

    public /* synthetic */ h(Script script, eh.a aVar, eh.a aVar2, eh.a aVar3, eh.a aVar4, int i10) {
        this.f12972r = script;
        this.w = aVar;
        this.f12973s = aVar2;
        this.f12976v = aVar3;
        this.f12975u = aVar4;
        this.f12974t = i10;
    }
}
