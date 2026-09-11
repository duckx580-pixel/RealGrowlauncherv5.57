package ti;

import androidx.work.v;
import o0.s0;
import oh.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q2.b f17293i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f17294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f17295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f17296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s0 f17297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s0 f17298v;
    public final /* synthetic */ s0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q2.b bVar, eh.c cVar, eh.e eVar, float f9, s0 s0Var, s0 s0Var2, s0 s0Var3, ug.c cVar2) {
        super(2, cVar2);
        this.f17293i = bVar;
        this.f17294r = cVar;
        this.f17295s = eVar;
        this.f17296t = f9;
        this.f17297u = s0Var;
        this.f17298v = s0Var2;
        this.w = s0Var3;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new j(this.f17293i, this.f17294r, this.f17295s, this.f17296t, this.f17297u, this.f17298v, this.w, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((w) obj, (ug.c) obj2);
        qg.o oVar = qg.o.f13926a;
        jVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        v.B(obj);
        boolean zBooleanValue = ((Boolean) this.f17297u.getValue()).booleanValue();
        q2.b bVar = this.f17293i;
        eh.c cVar = this.f17294r;
        eh.e eVar = this.f17295s;
        if (zBooleanValue) {
            cVar.invoke(Boolean.FALSE);
            float f9 = this.f17296t;
            eVar.invoke(new Integer(bVar.e0(f9)), new Integer(bVar.e0(f9)));
        } else {
            cVar.invoke(Boolean.TRUE);
            eVar.invoke(new Integer(bVar.e0(((q2.e) this.f17298v.getValue()).f13735i)), new Integer(bVar.e0(((q2.e) this.w.getValue()).f13735i)));
        }
        return qg.o.f13926a;
    }
}
