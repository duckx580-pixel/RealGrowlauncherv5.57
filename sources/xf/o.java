package xf;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f19744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final xe.c f19745v;
    public final /* synthetic */ q w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, c cVar, int i10, int i11, int i12) {
        super(qVar, cVar);
        this.w = qVar;
        this.f19742s = i11;
        this.f19744u = i10;
        this.f19743t = i12;
        xe.c cVar2 = new xe.c(qVar.f19705i.f17848z0);
        this.f19745v = cVar2;
        cVar2.set(qVar.f19705i.getTextPaint());
        cVar2.b();
    }

    @Override // xf.a
    public final Object a() {
        ArrayList arrayList = new ArrayList();
        this.w.f19706r.x(this.f19742s, this.f19743t, new da.o(9, this, arrayList));
        p pVar = new p();
        pVar.f19746i = this.f19744u;
        pVar.f19747r = arrayList;
        return pVar;
    }
}
