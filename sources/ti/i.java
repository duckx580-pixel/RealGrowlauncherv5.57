package ti;

import f0.z1;
import java.util.List;
import li.s;
import o0.d2;
import o0.s0;
import xi.v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17286i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f17287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f17288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d2 f17289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2 f17290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17291v;
    public final /* synthetic */ Object w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d2 f17292x;

    public /* synthetic */ i(s0 s0Var, s0 s0Var2, s0 s0Var3, s0 s0Var4, s0 s0Var5, s0 s0Var6, s0 s0Var7) {
        this.f17287r = s0Var;
        this.f17288s = s0Var2;
        this.f17289t = s0Var3;
        this.f17290u = s0Var4;
        this.f17291v = s0Var5;
        this.w = s0Var6;
        this.f17292x = s0Var7;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f17286i) {
            case 0:
                s0 s0Var = (s0) this.f17289t;
                s0 s0Var2 = (s0) this.f17290u;
                s0 s0Var3 = (s0) this.f17291v;
                s0 s0Var4 = (s0) this.w;
                s0 s0Var5 = (s0) this.f17292x;
                z.e eVar = (z.e) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", eVar);
                List list = (List) this.f17287r.getValue();
                eVar.K(list.size(), null, new z1(9, list), new w0.a(-632812321, new p(list, this.f17288s, s0Var, s0Var2, s0Var3, s0Var4, s0Var5), true));
                break;
            default:
                eh.c cVar = (eh.c) this.f17291v;
                s sVar = (s) this.w;
                z.e eVar2 = (z.e) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", eVar2);
                z.e.J(eVar2, new w0.a(961317624, new xi.i(this.f17289t, 0), true));
                d2 d2Var = this.f17290u;
                if (((List) d2Var.getValue()).isEmpty()) {
                    z.e.J(eVar2, xi.b.f19777t);
                } else {
                    List list2 = (List) d2Var.getValue();
                    eVar2.K(list2.size(), null, new z1(12, list2), new w0.a(-632812321, new v(list2, cVar, sVar, this.f17287r, this.f17288s), true));
                }
                if (((Boolean) this.f17292x.getValue()).booleanValue()) {
                    z.e.J(eVar2, xi.b.f19778u);
                }
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ i(d2 d2Var, d2 d2Var2, eh.c cVar, s sVar, s0 s0Var, s0 s0Var2, d2 d2Var3) {
        this.f17289t = d2Var;
        this.f17290u = d2Var2;
        this.f17291v = cVar;
        this.w = sVar;
        this.f17287r = s0Var;
        this.f17288s = s0Var2;
        this.f17292x = d2Var3;
    }
}
