package oi;

import a0.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f13047i;

    public x(float f9) {
        this.f13047i = f9;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        w2.e eVar = (w2.e) obj;
        kotlin.jvm.internal.l.f("$this$constrainAs", eVar);
        af.a aVar = eVar.f19035d;
        w2.f fVar = eVar.f19034c;
        w2.h hVar = fVar.f19040b;
        aVar.getClass();
        kotlin.jvm.internal.l.f("anchor", hVar);
        ((w2.e) aVar.f598d).f19033b.add(new f0.c(aVar, hVar, this.f13047i));
        f0.n(eVar.f19036e, fVar.f19041c);
        af.a aVar2 = eVar.f19037f;
        w2.h hVar2 = fVar.f19042d;
        aVar2.getClass();
        kotlin.jvm.internal.l.f("anchor", hVar2);
        ((w2.e) aVar2.f598d).f19033b.add(new f0.c(aVar2, hVar2, 0));
        eVar.f19033b.add(new w2.d(eVar, new kb.c((eh.c) w2.m.f19060i), 1));
        return qg.o.f13926a;
    }
}
