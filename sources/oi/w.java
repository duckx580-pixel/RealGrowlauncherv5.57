package oi;

import a0.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13045i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f13046r;

    public /* synthetic */ w() {
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f13045i) {
            case 0:
                w2.e eVar = (w2.e) obj;
                kotlin.jvm.internal.l.f("$this$constrainAs", eVar);
                f0 f0Var = eVar.f19036e;
                w2.f fVar = (w2.f) this.f13046r;
                f0.n(f0Var, fVar.f19041c);
                f0.n(eVar.f19038g, fVar.f19043e);
                af.a aVar = eVar.f19035d;
                w2.h hVar = eVar.f19034c.f19040b;
                aVar.getClass();
                kotlin.jvm.internal.l.f("anchor", hVar);
                ((w2.e) aVar.f598d).f19033b.add(new f0.c(aVar, hVar, 0));
                eVar.f19033b.add(new w2.d(eVar, new kb.c((eh.c) w2.m.f19060i), 0));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                q1.u uVar = (q1.u) this.f13046r;
                if (uVar != null) {
                    uVar.f13713c = zBooleanValue;
                }
                break;
        }
        return qg.o.f13926a;
    }

    public w(w2.f fVar) {
        this.f13046r = fVar;
    }
}
