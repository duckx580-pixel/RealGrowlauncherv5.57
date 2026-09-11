package ui;

import pf.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements we.q, pf.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18068i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f18069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f18070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18071t;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f18068i = obj;
        this.f18069r = obj2;
        this.f18070s = obj3;
        this.f18071t = obj4;
    }

    @Override // pf.g
    public void a(int i10, pf.i iVar, qf.b bVar) {
        xe.d dVar = (xe.d) this.f18068i;
        xe.c cVar = (xe.c) this.f18069r;
        tf.f fVar = (tf.f) this.f18070s;
        int[] iArr = (int[]) this.f18071t;
        char[] cArr = iVar.f13400i;
        int iCeil = (int) Math.ceil(dVar.b(new pf.b(cArr, cArr.length), 0, iVar.f13401r, cVar));
        if (iCeil > fVar.f17181a) {
            fVar.f17181a = iCeil;
        }
        if (iArr != null) {
            iArr[i10] = iCeil;
        }
    }

    @Override // we.q
    public void c(com.google.protobuf.j jVar, n6.i iVar) {
        k2.u uVar = (k2.u) this.f18068i;
        eh.c cVar = (eh.c) this.f18069r;
        uf.c cVar2 = (uf.c) this.f18070s;
        eh.e eVar = (eh.e) this.f18071t;
        we.d dVar = (we.d) jVar;
        kotlin.jvm.internal.l.f("event", dVar);
        String string = ((uf.c) dVar.f4612b).getText().toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        if (!string.equals(uVar.f9196a.f4836i)) {
            cVar.invoke(new k2.u(4, t6.k.c(cVar2.getCursor().f13408d.f13385c, cVar2.getCursor().f13408d.f13384b), string));
        }
        x xVar = cVar2.I0.f13398y;
        boolean z3 = false;
        Boolean boolValueOf = Boolean.valueOf(xVar.f13448r && xVar.f13452v > 0);
        x xVar2 = cVar2.I0.f13398y;
        if (xVar2.f13448r && xVar2.f13452v < xVar2.f13447i.size()) {
            z3 = true;
        }
        eVar.invoke(boolValueOf, Boolean.valueOf(z3));
    }
}
