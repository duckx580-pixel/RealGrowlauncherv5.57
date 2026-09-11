package ui;

import androidx.work.v;
import oh.w;
import rh.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18016i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f18017r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f18016i = i10;
        this.f18017r = gVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18016i) {
            case 0:
                return new c(this.f18017r, cVar, 0);
            case 1:
                return new c(this.f18017r, cVar, 1);
            default:
                return new c(this.f18017r, cVar, 2);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18016i) {
            case 0:
                c cVar2 = (c) create(wVar, cVar);
                qg.o oVar = qg.o.f13926a;
                cVar2.invokeSuspend(oVar);
                return oVar;
            case 1:
                c cVar3 = (c) create(wVar, cVar);
                qg.o oVar2 = qg.o.f13926a;
                cVar3.invokeSuspend(oVar2);
                return oVar2;
            default:
                c cVar4 = (c) create(wVar, cVar);
                qg.o oVar3 = qg.o.f13926a;
                cVar4.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f18016i;
        qg.o oVar = qg.o.f13926a;
        g gVar = this.f18017r;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                v.B(obj);
                h1 h1Var = gVar.f18031c;
                k2.u uVar = new k2.u(6, 0L, gVar.f18039l);
                h1Var.getClass();
                h1Var.k(null, uVar);
                h1 h1Var2 = gVar.f18033e;
                Boolean bool = Boolean.FALSE;
                h1Var2.getClass();
                h1Var2.k(null, bool);
                break;
            case 1:
                vg.a aVar2 = vg.a.f18663i;
                v.B(obj);
                h1 h1Var3 = gVar.f18031c;
                k2.u uVar2 = new k2.u(6, 0L, "-- Permission Denied or File Not Found");
                h1Var3.getClass();
                h1Var3.k(null, uVar2);
                h1 h1Var4 = gVar.f18033e;
                Boolean bool2 = Boolean.FALSE;
                h1Var4.getClass();
                h1Var4.k(null, bool2);
                break;
            default:
                vg.a aVar3 = vg.a.f18663i;
                v.B(obj);
                h1 h1Var5 = gVar.f18033e;
                Boolean bool3 = Boolean.FALSE;
                h1Var5.getClass();
                h1Var5.k(null, bool3);
                break;
        }
        return oVar;
    }
}
